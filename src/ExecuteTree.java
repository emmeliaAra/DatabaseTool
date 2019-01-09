import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ExecuteTree {


    private LinkedList<String> relationInOrder = new LinkedList<>();
    private LinkedList<TreeStructure.Node<String>> holdNodes;
    private HashMap<String,LinkedList<String>> newTablesCreated;
    private Vector<String> selectFieldName,whereClause;
    private TreeStructure<String> canonicalTree;
    private MySQLite mySQLite;

    private static final int RELATION_NODE_STATUS = 0;
    private static final int CARTESIAN_NODE_STATUS = 1;
    private static final int WHERE_NODE_STATUS = 2;
    private static final int ACTION_NODE_STATUS = 3;
    private static final int OPT_COND_NODE_STATUS = 4;
    private static final int JOIN_NODE_STATUS = 5;
    private static final int IS_ZERO_METHOD_NUM = 0;
    private static final int IS_ONE_METHOD_NUM= 1;
    private static final int IS_TWO_METHOD_NUM= 2;

    public ExecuteTree(TreeStructure<String> canonicalTree,Vector<String> selectFieldName,Vector<String> whereClause, MySQLite mySQLite) {
        this.canonicalTree = canonicalTree;
        this.selectFieldName = selectFieldName;
        this.whereClause = whereClause;
        this.mySQLite = mySQLite;

        newTablesCreated = new HashMap<>();
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
                    isOptConditionNode(popNode);
                    break;
                }
                case JOIN_NODE_STATUS:{
                    isJoinCond(popNode);
                }
            }
        }

        if(canonicalTree.getRootNode()!= null) {
            canonicalTree.createStack(canonicalTree.getRootNode());
            execute(canonicalTree.getStack());
        }
        mySQLite.undoTables();
    }

    public void isCartesian(TreeStructure.Node<String> popNode) throws IllegalAccessException {


        LinkedList<String> tempSelect = new LinkedList<>();
        LinkedList<String> tempFrom = new LinkedList<>();

        //if there are 2 nodes on hold -> produce cartesian product on those relations.
        if(holdNodes.size() == 2) {

            tempFrom.addFirst(holdNodes.getFirst().getData());
            tempFrom.addFirst(holdNodes.getLast().getData());

            //create a name for the table that will be create temporarily for the cartesian product of those relations.
            String tableName = holdNodes.getFirst().getData() + "_" + holdNodes.getLast().getData();
            tempSelect.addFirst("*");

            //execute the statement.
            mySQLite.simpleSelect(tempSelect,tempFrom );
            createNewRelation(popNode,tempSelect,tempFrom,tableName,null,IS_ONE_METHOD_NUM);

            //clear the list that holds the relations.
            holdNodes = new LinkedList<>();
        }
        //if there are 2 nodes on hold -> produce cartesian product with first and second and add the other one back to the three.
        else if(holdNodes.size() == 3) {
            String tableName = holdNodes.getFirst().getData() + "_" + holdNodes.get(1).getData();
            tempSelect.addFirst("*");
            tempFrom.addFirst(holdNodes.getFirst().getData());
            tempFrom.addFirst(holdNodes.get(1).getData());

            //execute the statement.
            mySQLite.simpleSelect(tempSelect,tempFrom );
            createNewRelation(popNode,tempSelect,tempFrom,tableName,null,IS_ONE_METHOD_NUM);
            holdNodes = new LinkedList<>();
        }
    }

    public void isAction(TreeStructure.Node<String> popNode) throws IllegalAccessException {
        //execute the project operation on the final resulting relation
        if(holdNodes.size() == 1) {

            MyHelper myHelper = new MyHelper();
            LinkedList<String> temp = new LinkedList<>() ;
            LinkedList<String> selectFields;

            /*If there are no new relations created means that the condition will be applied to the one relation in the query
            If new relations are created then the getRightSelect method is called*/
            getRelationsInOrder(holdNodes.getFirst().getData());
            if(!relationInOrder.isEmpty()){
                //call helper method to make the list into one String so that it can be split later when ever "," appears
                StringBuilder selectF = myHelper.getSelectFields(new LinkedList<>(selectFieldName));
                selectFields  = getRightSelect(selectF.toString());
            }
            else
                selectFields = new LinkedList<>(selectFieldName);

            temp.add(holdNodes.getFirst().getData());
            mySQLite.simpleSelect(selectFields,temp);
            canonicalTree.deleteNode(popNode);
        }
    }

    public void isWhereClause(TreeStructure.Node<String> popNode) throws IllegalAccessException
    {
        //execute the where condition on the resulting relation from the cartesian products and create a new relation
        //so that will be used to execute the project operation!
        if(holdNodes.size() == 1)
        {
            LinkedList<String> tempSelect = new LinkedList<>();
            LinkedList<String> tempFrom = new LinkedList<>();
            LinkedList<String> where = new LinkedList<>(whereClause);
            String tableName = "where" + holdNodes.getFirst().getData();

            tempSelect.addFirst("*");
            tempFrom.addFirst(holdNodes.getFirst().getData());
            mySQLite.whereSelect(tempSelect,tempFrom,where);

            createNewRelation(popNode,tempSelect,tempFrom,tableName,where,IS_ZERO_METHOD_NUM);
            holdNodes = new LinkedList<>();
        }
    }

    public void isOptConditionNode(TreeStructure.Node<String> popNode) throws IllegalAccessException {

        //create the list and call where select and then createAsStatementWhere! to create the new one!
        LinkedList<String> tempSelect = new LinkedList<>();
        LinkedList<String> tempFrom = new LinkedList<>();
        LinkedList<String> where = new LinkedList<>();

        //get the First one because the last relation added last is the one that this condition will be applied to ! and when adding the nodes we add to the front !
        String tableName = "where" + holdNodes.getFirst().getData();
        tempSelect.add("*");
        tempFrom.add(holdNodes.getFirst().getData());
        where.add(popNode.getData());

        mySQLite.whereSelect(tempSelect,tempFrom,where);

        //Add the new node to the place that the node that the condition was applied to so that the next operation if any will be applied to that one !
        TreeStructure.Node<String> newNode = createNewRelation(popNode,tempSelect,tempFrom,tableName,where,IS_ZERO_METHOD_NUM);
        holdNodes.set(holdNodes.indexOf(holdNodes.getFirst()),newNode);
    }

    private void isJoinCond(TreeStructure.Node<String> popNode) throws IllegalAccessException {
        LinkedList<String> tempSelect = new LinkedList<>();
        LinkedList<String> tempFrom = new LinkedList<>();
        LinkedList<String> tempOnClause = new LinkedList<>();

        if(holdNodes.size() == 2 )
        {
            tempFrom.addFirst(holdNodes.getFirst().getData());
            tempFrom.addFirst(holdNodes.getLast().getData());

            String tableName = "Join" + holdNodes.getFirst().getData() + "_" + holdNodes.getLast().getData();
            tempSelect.addFirst("*");

            //To remove the join symbol
            tempOnClause.addFirst(popNode.getData().substring(1));

            mySQLite.joinStatement(tempSelect,tempFrom,tempOnClause);
            createNewRelation(popNode,tempSelect,tempFrom,tableName,tempOnClause,IS_TWO_METHOD_NUM);
        }
    }

    public TreeStructure.Node<String> createNewRelation(TreeStructure.Node<String> popNode, LinkedList<String> tempSelect, LinkedList<String> tempFrom, String tableName ,LinkedList<String> where, int numOfMethod) throws IllegalAccessException {

        //Get the parentNode of the current node.
        //Delete the current Node from the tree and add a new node to the tree representing the relation created by the cartesian product.
        TreeStructure.Node<String> parentNode = popNode.getParentNode();
        popNode.getHostingTree().deleteNode(popNode);

        //To see what method will be called!
        //And create new relation for the cartesian product.
        if(numOfMethod == 0)
            mySQLite.createAsStatementWhere(tempSelect,tempFrom,tableName,where);
        else if(numOfMethod == 1)
            mySQLite.createAsStatement(tempSelect,tempFrom,tableName);
        else
            mySQLite.createJoinStatement(tempSelect,tempFrom,tableName,where);

        LinkedList<String> temp = new LinkedList<>();
        temp.addFirst(tempFrom.get(0));
        if(tempFrom.size() == 2)
            temp.addFirst(tempFrom.get(1));
        newTablesCreated.put(tableName,temp);

        //Add the node to the tree and return it because its needed for isOptCond method!
        TreeStructure.Node<String> newNode = canonicalTree.addChildNode(parentNode,tableName,RELATION_NODE_STATUS);
        return newNode;
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
                -> if index ==0 then in the inital statement this relation is the first one appeared in the from list*/
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
    private void  getRelationsInOrder(String tableName)
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
}