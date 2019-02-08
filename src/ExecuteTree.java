import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ExecuteTree {

    private LinkedList<String> relationInOrder = new LinkedList<>();
    private LinkedList<String> nodeIdInOrder = new LinkedList<>();
    private LinkedList<TreeStructure.Node<String>> holdNodes;
    private HashMap<String,LinkedList<String>> newTablesCreated;
    private Vector<String> selectFieldName,whereClause;
    private TreeStructure<String> canonicalTree;
    private MySQLite mySQLite;
    private MyHelper myHelper;
    private String finalTable,canonicalCondition;

    private static final int RELATION_NODE_STATUS = 0;
    private static final int CARTESIAN_NODE_STATUS = 1;
    private static final int WHERE_NODE_STATUS = 2;
    private static final int ACTION_NODE_STATUS = 3;
    private static final int OPT_COND_NODE_STATUS = 4;
    private static final int JOIN_NODE_STATUS = 5;
    private static final int IS_ZERO_METHOD_NUM = 0;
    private static final int IS_ONE_METHOD_NUM= 1;
    private static final int IS_TWO_METHOD_NUM= 2;
    private static final int NODE_INITIAL_ID = -1;
    private static final int RESULTING_RELATION_NODE_STATUS = -2;

    public ExecuteTree(TreeStructure<String> canonicalTree,Vector<String> selectFieldName,Vector<String> whereClause, MySQLite mySQLite) {
        this.canonicalTree = canonicalTree;
        this.selectFieldName = selectFieldName;
        this.whereClause = whereClause;
        this.mySQLite = mySQLite;

        newTablesCreated = new HashMap<>();
        myHelper = new MyHelper();
    }

    public void execute(Stack<TreeStructure.Node<String>> stack) throws IllegalAccessException {

        TreeStructure.Node<String> popNode;
        holdNodes = new LinkedList<>();

        //pops the nodes from the stack
        while (!stack.empty() )
        {
            popNode = stack.pop();
            switch (popNode.getNodeStatus()){
                //if a relation node then hold that node
                case RELATION_NODE_STATUS: {
                    holdNodes.addFirst(popNode);
                    if(popNode.getNodeID() == NODE_INITIAL_ID) {
                        popNode.setNodeID(nodeIdInOrder.size());
                        //if a relation node then add the node to the list so that it can be visualized when that node is clicked
                        nodeIdInOrder.add(popNode.getData());
                    }
                    break;
                }
                //if a helper node -> 'X' invoke method
                case CARTESIAN_NODE_STATUS: {
                    isCartesian(popNode);
                    break;
                }
                case WHERE_NODE_STATUS :{
                    isWhereClause(popNode);
                    break;
                }
                case ACTION_NODE_STATUS: {
                    isAction(popNode);
                    break;
                }
                case OPT_COND_NODE_STATUS: {
                    isWhereClause(popNode);
                    break;
                }
                case JOIN_NODE_STATUS:{
                    isJoinCond(popNode);
                    break;
                }
            }
        }

        if(canonicalTree.getRootNode()!= null) {
            canonicalTree.createStack(canonicalTree.getRootNode());
            execute(canonicalTree.getStack());
        }
    }

    public void isCartesian(TreeStructure.Node<String> popNode) throws IllegalAccessException {

        LinkedList<String> tempSelect = new LinkedList<>();
        LinkedList<String> tempFrom = new LinkedList<>();
        StringBuilder fromF ,selectF;
        String tableName;

        if(holdNodes.size() ==2 || holdNodes.size() == 3 )
        {
            popNode.setNodeID(nodeIdInOrder.size());
            //if there are 2 nodes on hold -> produce cartesian product on those relations.
            if(holdNodes.size() == 2) {
                //create a name for the table that will be create temporarily for the cartesian product of those relations.
                tableName = holdNodes.getFirst().getData() + "_" + holdNodes.getLast().getData();
                tempFrom.addFirst(holdNodes.getFirst().getData());
                tempFrom.addFirst(holdNodes.getLast().getData());
            }
            //if there are 2 nodes on hold -> produce cartesian product with first and second and add the other one back to the three.
            else {
                tableName = holdNodes.getFirst().getData() + "_" + holdNodes.get(1).getData();
                tempFrom.addFirst(holdNodes.getFirst().getData());
                tempFrom.addFirst(holdNodes.get(1).getData());
            }

            tempSelect.addFirst("*");

            fromF = myHelper.getFields(tempFrom);
            selectF = myHelper.getSelectFields(tempSelect);

            //execute the statement.
            mySQLite.simpleSelect(selectF,fromF );
            createNewRelation(popNode,selectF,tempFrom,fromF,tableName,null,IS_ONE_METHOD_NUM);

            //clear the list that holds the relations.
            holdNodes = new LinkedList<>();
        }
    }

    public void isAction(TreeStructure.Node<String> popNode) throws IllegalAccessException {
        //execute the project operation on the final resulting relation
        if(holdNodes.size() == 1) {

            MyHelper myHelper = new MyHelper();
            LinkedList<String> temp = new LinkedList<>() ;
            LinkedList<String> selectFields;
            StringBuilder fromF ,selectF;

            /*If there are no new relations created means that the condition will be applied to the one relation in the query
            If new relations are created then the getRightSelect method is called*/
            //getRelationsInOrder(holdNodes.getFirst().getData());
           // if(!relationInOrder.isEmpty()){
            if(!newTablesCreated.isEmpty()){
                getRelationsInOrder(holdNodes.getFirst().getData());
                //call helper method to make the list into one String so that it can be split later when ever "," appears
                selectF = myHelper.getSelectFields(new LinkedList<>(selectFieldName));
                selectFields  = getRightSelect(selectF.toString());
            }
            else
                selectFields = new LinkedList<>(selectFieldName);

            temp.add(holdNodes.getFirst().getData());

            fromF = myHelper.getFields(temp);
            selectF = myHelper.getSelectFields(selectFields);
            String tableName = "action" + fromF;

            mySQLite.simpleSelect(selectF,fromF);

            //Create a relation holding the final result but do not create a relation node. Also add the relation name to the list.
            mySQLite.createAsStatement(fromF,selectF,tableName);
            newTablesCreated.put(tableName,temp);
            nodeIdInOrder.add(tableName);
            finalTable = tableName;
            canonicalTree.deleteNode(popNode);
        }
    }

    public void isWhereClause(TreeStructure.Node<String> popNode) throws IllegalAccessException
    {
        //execute the where condition on the resulting relation from the cartesian products and create a new relation
        //so that will be used to execute the project operation!
        if((holdNodes.size() == 1 && popNode.getNodeStatus() == WHERE_NODE_STATUS ) || popNode.getNodeStatus() == OPT_COND_NODE_STATUS) {

            StringBuilder fromF,selectF,whereC;
            LinkedList<String> tempSelect = new LinkedList<>();
            LinkedList<String> tempFrom = new LinkedList<>();
            LinkedList<String> where = new LinkedList<>();
            String tableName = "where" + holdNodes.getFirst().getData();

            //Add the name of the new node created to the list so that when the condition or the cartesian product used to create that node is clicked the results will be presented
            popNode.setNodeID(nodeIdInOrder.size());

            //If is a where node then add the initial condition else add the optional condition which is held as data in the popped node!
            if(popNode.getNodeStatus() == WHERE_NODE_STATUS)
                where = new LinkedList<>(whereClause);
            else
                where.add(popNode.getData());

            tempSelect.addFirst("*");
            tempFrom.addFirst(holdNodes.getFirst().getData());

            fromF = myHelper.getFields(tempFrom);
            selectF = myHelper.getSelectFields(tempSelect);
            whereC = myHelper.getWhereFields(where);
            whereC = whereException(whereC.toString(), fromF.toString());
            mySQLite.whereSelect(selectF,fromF,whereC);
            canonicalCondition = whereC.toString();

            //If where node then create the new relation and remove the nodes from the holdNodes if not then replace the new relation with the onw that the condition is applied to.
            if(popNode.getNodeStatus() == WHERE_NODE_STATUS){
                createNewRelation(popNode,selectF,tempFrom,fromF,tableName,whereC,IS_ZERO_METHOD_NUM);
               holdNodes = new LinkedList<>();
            }else{
                TreeStructure.Node<String> newNode = createNewRelation(popNode,selectF,tempFrom,fromF,tableName,whereC,IS_ZERO_METHOD_NUM);
                holdNodes.set(holdNodes.indexOf(holdNodes.getFirst()),newNode);
            }
        }
    }

    private void isJoinCond(TreeStructure.Node<String> popNode) throws IllegalAccessException {
        LinkedList<String> tempSelect = new LinkedList<>();
        LinkedList<String> tempFrom = new LinkedList<>();
        LinkedList<String> tempOnClause = new LinkedList<>();

        if(holdNodes.size() == 2 || holdNodes.size() == 3)
        {
            popNode.setNodeID(nodeIdInOrder.size());
            tempFrom.addFirst(holdNodes.getFirst().getData());
            String secondName;
            if(holdNodes.size() == 2){
                tempFrom.addFirst(holdNodes.getLast().getData());
                secondName = holdNodes.getLast().getData();
            }
            else {
                tempFrom.addFirst(holdNodes.get(1).getData());
                secondName = holdNodes.get(1).getData();
            }
            String tableName = "Join" + holdNodes.getFirst().getData() + "_" + secondName;
            tempSelect.addFirst("*");

            //To remove the join symbol
            tempOnClause.addFirst(popNode.getData().substring(1));

            StringBuilder selectF = myHelper.getSelectFields(tempSelect);
            StringBuilder onClause = myHelper.getWhereFields(tempOnClause);
            onClause = mySQLite.joinException(onClause.toString(),tempFrom.get(0), tempFrom.get(1));

            mySQLite.joinStatement(selectF,tempFrom,onClause);
            createNewRelation(popNode,selectF,tempFrom,null,tableName,onClause,IS_TWO_METHOD_NUM);
            holdNodes = new LinkedList<>();
        }
    }

    public TreeStructure.Node<String> createNewRelation(TreeStructure.Node<String> popNode, StringBuilder selectF, LinkedList<String> listFrom, StringBuilder fromF, String tableName ,StringBuilder where, int numOfMethod) throws IllegalAccessException {

        //Get the parentNode of the current node.
        //Delete the current Node from the tree and add a new node to the tree representing the relation created by the cartesian product.
        TreeStructure.Node<String> parentNode = popNode.getParentNode();
        popNode.getHostingTree().deleteNode(popNode);

        //To see what method will be called!
        //And create new relation for the cartesian product.
        if(numOfMethod == IS_ZERO_METHOD_NUM)
            mySQLite.createAsStatementWhere(selectF,fromF,tableName,where);
        else if(numOfMethod == IS_ONE_METHOD_NUM)
            mySQLite.createAsStatement(fromF,selectF,tableName);
        else
            mySQLite.createJoinStatement(selectF,listFrom,tableName,where);

        LinkedList<String> temp = new LinkedList<>();
        temp.addFirst(listFrom.get(0));
        if(listFrom.size() == 2)
            temp.add(listFrom.get(1));
        newTablesCreated.put(tableName,temp);

        //Add the node to the tree and return it because its needed for isOptCond method!
        TreeStructure.Node<String> newNode = canonicalTree.addChildNode(parentNode,tableName,RELATION_NODE_STATUS,RESULTING_RELATION_NODE_STATUS,popNode.getNodeLevel());
        nodeIdInOrder.add(newNode.getData());
        return newNode;
    }

    //need to fix this in case that the same fields appears three times to get the right one.
    public StringBuilder whereException(String query,String fromTable) {

        //(?i) -> use embedded flag in the regex to ignore case! Split string but keep And + or to be added to the condition
        String[] whereParts = query.split("(?<=(?i)and)|(?=(?i)and) |(?<=(?i)or)|(?=(?i)or) ");
        StringBuilder myNewWhere = new StringBuilder();
        getRelationsInOrder(fromTable);
        for(int i=0; i<whereParts.length; i++) {

            String symbol = myHelper.getSymbol(whereParts[i]);
            String[] equationParts;
            String condition;

            if(whereParts[i].toLowerCase().contains("and")) {
                whereParts[i] = whereParts[i].substring(0,whereParts[i].toLowerCase().indexOf("and"));
                condition = " and ";
            } else if(whereParts[i].toLowerCase().contains("or")) {
                whereParts[i] = whereParts[i].substring(0,whereParts[i].toLowerCase().indexOf("or"));
                condition = " or ";
            }
            else condition = null;

            if(symbol!=null) {
                equationParts = whereParts[i].split(symbol);
                for(int j=0; j<equationParts.length; j++)
                    if (equationParts[j].contains(".")) {
                        // Get the relation name from the equation part and remove the white spaces. Remove the referencing table and any white spaces
                        String relationName = (equationParts[j].substring(0, equationParts[j].indexOf("."))).replaceAll("\\s", "");
                        equationParts[j] = (equationParts[j].substring(equationParts[j].indexOf(".") + 1)).replaceAll("\\s", "");
                        int index = relationInOrder.indexOf(relationName);
                        if (index > 0) {
                            int counter = 0;
                            for (int k = 0; k < index; k++) {
                                //Get all the relations from relationInorder up to index
                                MyRelation relation = mySQLite.getSchema().getRelationOnName(relationInOrder.get(k));
                                if (relation.getFieldOnName(equationParts[j]) != null)
                                    counter++;
                            }
                            if (counter != 0)
                                equationParts[j] = "\"" + equationParts[j] + ":" + counter + "\"";
                        }
                    }
                    whereParts[i] = equationParts[0] +" " + symbol + " " + equationParts[1];
            }
            if(i != whereParts.length-1)
                myNewWhere.append(whereParts[i] + condition);
            else
                myNewWhere.append(whereParts[i]);

        }
        return  myNewWhere;
    }

    /* When a cartesian product of 2 relations that have the same field name the first one is the same and the second one has the format
    "fieldNAme:1" and the number changes according to how many times the same field name appears.
    This function is used to set the right select field because the initial one ex.courses.c_id is wrong because the final relation may have a different name.
     */
    public LinkedList<String> getRightSelect( String selectString) {

        LinkedList<String> newSelectList = new LinkedList<>();
        String[] selectStringParts = selectString.split(",");

        for (int i = 0; i < selectStringParts.length; i++)
            // if there is a referencing table it must be removed because this is not the one in the from list anymore.
            if (selectStringParts[i].contains(".")) {
                String[] fullStopParts = selectStringParts[i].split("\\.");
                /*get the position of the referencing table in the relationInOrder.
                -> if index ==0 then in the initial statement this relation is the first one appeared in the from list*/
                int index = relationInOrder.indexOf(fullStopParts[0]);
                //if index -> zero then their is no need to add :1
                if (index == 0)
                    newSelectList.add(fullStopParts[1]);
                /*if index >0 check if the same field name appears in one of the previous relations in the relationInOrder list
                If yes add :count to the field if not the field name is added as it is to the  newSelectList
                 */
                else if (index > 0) {
                    int count = 0;
                    for (int j = 0; j < index; j++) {
                        String relationName = relationInOrder.get(j);
                        MyRelation relation = mySQLite.getSchema().getRelationOnName(relationName);
                        if (relation.getFieldOnName(fullStopParts[1]) != null)
                            count++;
                    }
                    if(count !=0)
                        newSelectList.add("\"" + fullStopParts[1] + ":" + count + "\"");
                    else
                        newSelectList.add(fullStopParts[1]);
                }
            } else
                //if there is no referencing table the statement stays the same!
                newSelectList.add(selectStringParts[i]);
        return newSelectList;
    }

    /*Checks if the tableName passed as argument is an element of the newTablesCreated if not then it means that it is an existing table
    If the table is a part of newTablesCreated it will check the values of that element in the hashMap and if the value is an existing table
    it will be added to the relationInOrder. If the value is also an new table it will recursively call that method until there are no new tables
    stored in the value element of the HashMap!
     */
    public void  getRelationsInOrder(String tableName)
    {
        if(newTablesCreated.containsKey(tableName))
        {
            LinkedList temp = newTablesCreated.get(tableName);
            for(Object var: temp)
                if(!newTablesCreated.containsKey(var))
                    relationInOrder.add(var.toString());
                else
                    getRelationsInOrder(var.toString());
        }
    }

    public LinkedList<String> getNodeIdInOrder()
    {
        return nodeIdInOrder;
    }
    public String getFinalTable(){ return finalTable;}
    public String getCanonicalCondition(){ return canonicalCondition; }

    public HashMap<String, LinkedList<String>> getNewTablesCreated() {
        return newTablesCreated;
    }
}