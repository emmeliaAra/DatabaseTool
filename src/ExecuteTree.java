import java.util.LinkedList;
import java.util.HashMap;
import java.util.Vector;
import java.util.Stack;

/**
 * This class is used to execute the trees,
 * Starting from the low levels and moving upwards
 * @author Emmeleia Arakleitou
 */
public class ExecuteTree {

    private LinkedList<String> relationInOrder = new LinkedList<>();
    private LinkedList<String> nodeIdInOrder = new LinkedList<>();
    private HashMap<String,LinkedList<String>> newTablesCreated;
    private LinkedList<TreeStructure.Node<String>> holdNodes;
    private Vector<String> selectFieldName,whereClause;
    private String finalTable,canonicalCondition;
    private TreeStructure<String> tree;
    private MySQLite mySQLite;
    private MyHelper myHelper;

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

    /**
     * Constructor of the class that initializes some of the variables
     * @param tree the tree to execute
     * @param selectFieldName vector holding field names in the select clause
     * @param whereClause vector holding the condition of the whereClause
     * @param mySQLite an instance to MySQLite class that provides the connection to the database and performs the operations on the database.
     */
    public ExecuteTree(TreeStructure<String> tree,Vector<String> selectFieldName,Vector<String> whereClause, MySQLite mySQLite) {
        this.tree = tree;
        this.selectFieldName = selectFieldName;
        this.whereClause = whereClause;
        this.mySQLite = mySQLite;

        newTablesCreated = new HashMap<>();
        myHelper = new MyHelper();
    }

    /**
     * Method that recursively calls it's self until all the nodes are removed from the tree after execution
     * @param stack The Stack that holds all the relations in the reverse order that they were visited
     * @throws IllegalAccessException
     */
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
        if(tree.getRootNode()!= null) {
            tree.createStack(tree.getRootNode());
            execute(tree.getStack());
        }
    }

    /**
     * This method is called when a node that represents a cartesian product 'X' is popped from the stack.
     * Replaces the 2 nodes used to produce the cartesian product with the new relation
     * @param popNode the node popped from the stack
     * @throws IllegalAccessException
     */
    public void isCartesian(TreeStructure.Node<String> popNode) throws IllegalAccessException {

        LinkedList<String> tempSelect = new LinkedList<>();
        LinkedList<String> tempFrom = new LinkedList<>();
        StringBuilder fromF ,selectF;
        String tableName;

        //If there are 2 or three nodes in the stack continue. If there is nothing the don't do anything
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

    /**
     * This method is called when the root node "π" is called.
     * @param popNode the node popped from the stack
     * @throws IllegalAccessException
     */
    public void isAction(TreeStructure.Node<String> popNode) throws IllegalAccessException {
        //execute the project operation on the final resulting relation
        if(holdNodes.size() == 1) {

            MyHelper myHelper = new MyHelper();
            LinkedList<String> temp = new LinkedList<>() ;
            LinkedList<String> selectFields;
            StringBuilder fromF ,selectF;

            /*If there are no new relations created means that the condition will be applied to the one relation in the query
             *If new relations are created then the getRightSelect method is called*/
            if(!newTablesCreated.isEmpty()){
                getRelationsInOrder(holdNodes.getFirst().getData());
                //call helper method to make the list into one String so that it can be split later whenever "," appears
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
            tree.deleteNode(popNode);
        }
    }

    /**
     * This method is called when a node with a condition is called. Executes the condition
     * and replace the 2 nodes used with a new relation
     * @param popNode the node popped from the stack
     * @throws IllegalAccessException
     */
    public void isWhereClause(TreeStructure.Node<String> popNode) throws IllegalAccessException
    {
        /*Execute the where condition on the resulting relation from the cartesian products and create a new relation
         *so that will be used to execute the project operation!*/
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

            /*If where node then create the new relation and remove the nodes from the holdNodes if not then replace
             *the new relation with the onw that the condition is applied to.*/
            if(popNode.getNodeStatus() == WHERE_NODE_STATUS){
                createNewRelation(popNode,selectF,tempFrom,fromF,tableName,whereC,IS_ZERO_METHOD_NUM);
               holdNodes = new LinkedList<>();
            }else{
                TreeStructure.Node<String> newNode = createNewRelation(popNode,selectF,tempFrom,fromF,tableName,whereC,IS_ZERO_METHOD_NUM);
                holdNodes.set(holdNodes.indexOf(holdNodes.getFirst()),newNode);
            }
        }
    }

    /**
     * This method is called only for the optimized tree, when a join condition  node is popped from the stack
     * Creates a new relation and replace the 2 nodes used in the join condition
     * @param popNode the node popped from the stack
     * @throws IllegalAccessException
     */
    private void isJoinCond(TreeStructure.Node<String> popNode) throws IllegalAccessException {
        LinkedList<String> tempSelect = new LinkedList<>();
        LinkedList<String> tempFrom = new LinkedList<>();
        LinkedList<String> tempOnClause = new LinkedList<>();

        //only operate if there is 2 or 3 relations. If more or less then return
        if(holdNodes.size() == 2 || holdNodes.size() == 3)
        {
            popNode.setNodeID(nodeIdInOrder.size());
            tempFrom.addFirst(holdNodes.getFirst().getData());
            String secondName;
            //Get the right relations from the list according to the list size.
            if(holdNodes.size() == 2){
                tempFrom.addFirst(holdNodes.getLast().getData());
                secondName = holdNodes.getLast().getData();
            }
            else {
                tempFrom.addFirst(holdNodes.get(1).getData());
                secondName = holdNodes.get(1).getData();
            }
            //Create the name of the new relation
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

    /**
     * Method that creates new relation when needed
     * @param popNode the node popped from the stack
     * @param selectF the contents of the select clause that will be used to create a new relation
     * @param listFrom the the content of the from clause as a list
     * @param fromF the contents of the from clause as a StringBuilder
     * @param tableName The name of the relation to be created
     * @param where the contents of the where caluse
     * @param numOfMethod the number of the method that this call came from.
     * @return The node that holds the new node created
     * @throws IllegalAccessException
     */
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
        TreeStructure.Node<String> newNode = tree.addChildNode(parentNode,tableName,RELATION_NODE_STATUS,RESULTING_RELATION_NODE_STATUS,popNode.getNodeLevel());
        nodeIdInOrder.add(newNode.getData());
        return newNode;
    }

    /**
     * This method adjust the where clause so that it will fit the field names of the new relation created.
     * Removes referenced tables and called the correct fields
     * @param query the string representing the where clause
     * @param fromTable the name of the relation that this query will be applied to.
     * @return a StringBuilder object holding the new where clause.
     */
    public StringBuilder whereException(String query,String fromTable) {

        //(?i) -> use embedded flag in the regex to ignore case! Split string but keep And + or to be added to the condition
        String[] whereParts = query.split("(?<=(?i) and)|(?=(?i) and) |(?<=(?i) or)|(?=(?i) or) ");
        StringBuilder myNewWhere = new StringBuilder();
        getRelationsInOrder(fromTable);

        for(int i=0; i<whereParts.length; i++) {
            //Get the symbo ie."==", "<="...
            String symbol = myHelper.getSymbol(whereParts[i]);
            String[] equationParts;
            String condition = null;

            //Split the statement into parts when an "And"/"Or" appears
            if(!whereParts[i].equalsIgnoreCase("and") && !whereParts[i].equalsIgnoreCase("or")) {
                if(i+1<whereParts.length)
                {
                    if (whereParts[i+1].equalsIgnoreCase("and"))
                        condition = " and ";
                    else if(whereParts[i+1].equalsIgnoreCase("or"))
                        condition = " or ";
                }else
                    condition = null;
            }else
                continue;

            if(symbol!=null) {
                equationParts = whereParts[i].split(symbol);
                for(int j=0; j<equationParts.length; j++){
                    equationParts[j] =  equationParts[j].replaceAll("\\s", "");
                    if (equationParts[j].contains(".") && !(equationParts[j].charAt(0)==('\"') && equationParts[j].charAt(0) ==('\"')) && !myHelper.isFloat(equationParts[j])) {
                        // Get the relation name from the equation part and remove the white spaces. Remove the referencing table and any white spaces
                        String relationName = (equationParts[j].substring(0, equationParts[j].indexOf("."))).replaceAll("\\s", "");
                        equationParts[j] = (equationParts[j].substring(equationParts[j].indexOf(".") + 1)).replaceAll("\\s", "");

                        /* If the same field appears in more than one relation then the second time appears in this
                         * format name:n where n the number of appearance. So we look if the field appears in the relations
                         * before that(relations in order) and increase the counter.*/
                        int index = relationInOrder.indexOf(relationName); //Only check if not the first relation because if it is the first then the field name will the normal one
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
                }
                whereParts[i] = equationParts[0] +" " + symbol + " " + equationParts[1];
            }
            //If not the last one add the condition (AND/OR).
            if(i != whereParts.length-1)
                myNewWhere.append(whereParts[i] + condition);
            else
                myNewWhere.append(whereParts[i]);
        }
        return  myNewWhere;
    }

    /**
     * When a cartesian product of 2 relations that have the same field name the first one is the same and the second
     * one has the format "fieldNAme:1" and the number changes according to how many times the same field name appears.
     * This function is used to set the right select field because the initial one ex.courses.c_id is wrong because the
     * final relation may have a different name.
     * @param selectString The string representing the select clause
     * @return the new select clause
     */
    public LinkedList<String> getRightSelect( String selectString) {

        LinkedList<String> newSelectList = new LinkedList<>();
        String[] selectStringParts = selectString.split(",");

        for (int i = 0; i < selectStringParts.length; i++)

            // if there is a referencing table it must be removed because this is not the one in the from list anymore.
            if (selectStringParts[i].contains(".")) {
                String[] fullStopParts = selectStringParts[i].split("\\.");
                /*get the position of the referencing table in the relationInOrder.if index ==0 then in the initial statement this
                 * relation is the first one appeared in the from list and we do not to add :counter */
                int index = relationInOrder.indexOf(fullStopParts[0]);
                if (index == 0)
                    newSelectList.add(fullStopParts[1]);
                /*if index >0 check if the same field name appears in one of the previous relations in the relationInOrder list
                If yes add :count to the field if not the field name is added as it is to the  newSelectList*/
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




    /**
     * Checks if the tableName passed as argument is an element of the newTablesCreated if not then it means that it is an existing table
     * If the table is a part of newTablesCreated it will check the values of that element in the hashMap and if the value is an existing table
     * it will be added to the relationInOrder. If the value is also an new table it will recursively call that method until there are no new tables
     * stored in the value element of the HashMap!
     * @param tableName name of the relation that will be used to crete the relations in order list
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

    /**
     * Accessor for the list that holds the node's ID.
     * (Order that they were popped from the stack)
     * @return LinkedList with the nodeNames in the order they were removed from the stack
     */
    public LinkedList<String> getNodeIdInOrder()
    {
        return nodeIdInOrder;
    }

    /**
     * Accessor for the name of the last relation created.
     * Used to present the final result in the GUI
     * @return the name of the last table created
     */
    public String getFinalTable(){ return finalTable;}

    /**
     * Accessor for the hashMap newTablesCreated that holds the name of the new table
     * and the table/tables used to create it.
     * @return
     */
    public HashMap<String, LinkedList<String>> getNewTablesCreated() {
        return newTablesCreated;
    }
}