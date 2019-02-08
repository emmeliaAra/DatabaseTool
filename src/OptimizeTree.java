import java.util.*;

public class OptimizeTree {

    private HashMap<String,LinkedList<String>> optimizedWhere,newTablesFromCanonical;
    private LinkedList<String> associatedRelations;
    private TreeStructure<String> canonicalTree;
    private Vector<String> whereClause;
    private MyHelper myHelper;
    private Schema schema;

    private static final int RELATION_NODE_STATUS = 0;
    private static final int CARTESIAN_NODE_STATUS = 1;
    private static final int WHERE_NODE_STATUS = 2;
    private static final int OPT_COND_NODE_STATUS = 4;
    private static final int JOIN_NODE_STATUS = 5;

    public OptimizeTree(TreeStructure<String> canonicalTree1, Schema schema, Vector<String> whereClause,HashMap<String, LinkedList<String>> newTablesFromCanonical, HashMap<String,LinkedList<String>> optimizedWhere) {
        this.canonicalTree = canonicalTree1;
        this.whereClause = whereClause;
        this.schema = schema;
        this.newTablesFromCanonical = newTablesFromCanonical;
        this.optimizedWhere = optimizedWhere;
        myHelper = new MyHelper();
        associatedRelations = new LinkedList<>();
    }

    public TreeStructure<String> optimiseTree() throws IllegalAccessException {

        canonicalTree.createStack(canonicalTree.getRootNode());
        TreeStructure.Node<String> popNode;
        TreeStructure.Node<String> whereNodeToDelete = null;
        Stack<TreeStructure.Node<String>> stack = canonicalTree.getStack();
        Stack<TreeStructure.Node<String>> optimizationStack = new Stack<>();

        boolean conditionAlready;
        while (!stack.empty()) {
            popNode = stack.pop();
            switch (popNode.getNodeStatus()) {
                case RELATION_NODE_STATUS:{
                    conditionAlready = false;
                    /*if there is a condition associated with that relation then call the method. and set set conditionAlready to TRue so that
                    if a node is associated with more than one conditions all the associated conditions will be added to it's parent node.
                    after every iteration of the loop the popNode is becoming the node that holds the condition if any so need to make pop node to hold the
                    relation node again (if node has a child node-> avoid exception)
                    So that i will remember how it works!!!*/
                    while(optimizedWhere.containsValue(new LinkedList<>(Collections.singleton(popNode.getData())))) {
                        conditionAlready = relationNodeAction(popNode, conditionAlready);
                        if(popNode.getChildren().size() == 1) popNode = popNode.getChildren().get(0);
                    }
                    associatedRelations = new LinkedList<>();
                    break;
                }
                case CARTESIAN_NODE_STATUS: {

                    cartesianNodeAction(popNode,(Stack<TreeStructure.Node<String>>) optimizationStack.clone());
                    cartesianNodesIncludeCond(popNode, associatedRelations);
                    associatedRelations = new LinkedList<>();
                }
                case WHERE_NODE_STATUS:{
                    whereNodeToDelete = popNode;
                    break;
                }
            }
            optimizationStack.push(popNode);
        }
        //Delete node that holds the condition if any from the initial tree
        if(whereNodeToDelete!=null){
            whereNodeToDelete.getChildren().get(0).setParentNode(whereNodeToDelete.getParentNode());
            canonicalTree.deleteNode(whereNodeToDelete);
        }
        convertCartesianToJoin();

        return canonicalTree;
    }

    public boolean relationNodeAction(TreeStructure.Node<String> node,boolean conditionAlready){

        associatedRelations.addLast(node.getData());
        String condition = getCondition(RELATION_NODE_STATUS);
        if(condition != null) {
            if(!conditionAlready){
            /*hold the data of the current popped node and change this node to a optCond node
            and create an new child node of this node to hold the relation. */
            String tempData = node.getData();
            node.setNodeData(condition);
            node.setNodeStatus(OPT_COND_NODE_STATUS);
            try {
                TreeStructure.Node<String> newNode1 = canonicalTree.addChildNode(node, tempData, RELATION_NODE_STATUS,-1,node.getNodeLevel() +1);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            conditionAlready = true;
            }
            else{
                String tempNodeData = node.getParentNode().getData();
                node.getParentNode().setNodeData(tempNodeData + " AND " + condition);
            }
        }
        return conditionAlready;
    }

    public void cartesianNodeAction(TreeStructure.Node<String> node, Stack<TreeStructure.Node<String>> stack){

        /* When we reach a helper node -> check num of children and for we pop the numOfNodeChildren from the stack
           If the node popped is a relation node then add it to the associatedRelationList. if a relation is a helper node then do the same thing
           as for it's parent until we reach to a node with no child nodes or with all its nodes to be relations! */
        int numOfNodeChildren = node.getChildren().size();
        LinkedList<TreeStructure.Node<String>> poppedNodes = new LinkedList<>();

        if(!stack.empty()) {
          for(int i=0; i<numOfNodeChildren; i++)
              if (!stack.empty())
                  poppedNodes.addLast(stack.pop());
          for (int i = 0; i < poppedNodes.size(); i++)
              if (poppedNodes.get(i).getNodeStatus() == CARTESIAN_NODE_STATUS)
                  cartesianNodeAction(poppedNodes.get(i), stack);
              else
                  associatedRelations.addLast(poppedNodes.get(i).getData());
      }
    }

    public void cartesianNodesIncludeCond(TreeStructure.Node<String> nodeToAddCond, LinkedList<String> associatedRelations)
    {
        /* if condition returned is not null the make the cartesian node to hold a condition! but do not change the status so that it could
        * be used as a cartesian node id needed when dealing with other conditions*/
        String condition;
        condition = getCondition(nodeToAddCond.getNodeStatus());
        if(condition!= null)
            nodeToAddCond.setNodeData(nodeToAddCond.getData() + " " + condition);
    }

    public String getCondition(int nodeStatus) {

        String condition = null;
        /* if relation node then need to check only the conditions that are associated with only one relation */
        if (nodeStatus == RELATION_NODE_STATUS) {
            for (Map.Entry<String, LinkedList<String>> entry : optimizedWhere.entrySet())
                //If relation node then condition will be associated with only one node.
                if (entry.getValue().size() == 1)
                    if (associatedRelations.get(0).equalsIgnoreCase(entry.getValue().get(0))) {
                        condition = entry.getKey();
                        optimizedWhere.remove(entry.getKey());
                        return condition;
                    }
        }
        //if it's a cartesian node then for evert condition with 2 relations associated-> check if there is a match in the associatedRelations list
        else if (nodeStatus == CARTESIAN_NODE_STATUS)
           for(Map.Entry<String, LinkedList<String>> entry: optimizedWhere.entrySet())

               //If two relations are associated then only then do the check  if both relations are elements of the list if yes then return condition
               if (entry.getValue() != null && entry.getValue().size() == 2)
                   for (int i = 0; i < associatedRelations.size(); i++) {
                       //if we have a match with the association list we get the index of the second element in the entry list
                       if (entry.getValue() != null && entry.getValue().contains(associatedRelations.get(i))) {

                           int indexOfCurrent = entry.getValue().indexOf(associatedRelations.get(i));
                           int otherIndex;
                           if (indexOfCurrent == 1) otherIndex = 0;
                           else otherIndex = 1;
                           /*check if the second element of the entry list is a relation included in the associatedRelation list if yes then there is a condition
                           * if there is already a condition in that node then add AND Also set the entry value to null so that it won't be checked again*/ //-> cannot delete because get exception !!

                           if (associatedRelations.contains(entry.getValue().get(otherIndex))) {
                               if(condition == null) condition = entry.getKey();
                               else
                                   condition = condition + " AND " + entry.getKey();
                               entry.setValue(null);
                           }
                       }
        }
        return condition;
    }

    public void convertCartesianToJoin(){

        //Remove the nodes that are representing the cartesian products and a condition to a join operation
        canonicalTree.createStack(canonicalTree.getRootNode());
        Stack<TreeStructure.Node<String>> stack = canonicalTree.getStack();
        TreeStructure.Node<String> node;

        while (!stack.empty()) {
            node = stack.pop();
            //if the node is a cartesian product and it does not only hold "X" and then change it to join operation remove the "X" and add the condition!
            if(node.getNodeStatus() == CARTESIAN_NODE_STATUS && !node.getData().equalsIgnoreCase("X")){
                node.setNodeData("⨝" + node.getData().replace("X", " "));
                node.setNodeStatus(JOIN_NODE_STATUS);
            }
        }
    }

    public HashMap<String,LinkedList<String>>  splitWhere() {

        LinkedList<String> where = new LinkedList<>(whereClause);
        LinkedList<String> referencingRelations;
        LinkedList<MyRelation> relations;
        String temp;
        optimizedWhere = new HashMap<>();

        String whereString = new String(myHelper.getWhereFields(where));
        String[] whereParts = whereString.split("(?i)and");

        //Iterates through all the parts divided by "AND"
        for (int i=0; i<whereParts.length; i++) {

            referencingRelations = new LinkedList<>();
            String symbol = myHelper.getSymbol(whereParts[i]);

            if(symbol != null) {
                String[] equationParts = whereParts[i].split(symbol);
                String condition = null;

                //For every side of the "=" sing.
                for(int j=0; j<equationParts.length; j++) {
                    //Removes white spaces if any.
                    equationParts[j] = equationParts[j].replaceAll("\\s","");

                    //if there is a referencing table stores the table and and the field used is temporarily stored.
                    if(equationParts[j].contains(".")) {
                        referencingRelations.addLast(equationParts[j].substring(0, equationParts[j].indexOf(".")));
                        temp = equationParts[j].substring(equationParts[j].indexOf(".")+1);

                    }else {
                        //if no "."  p simeni en ksero se pio relation kamni reference enna to psaxo p to schema !!
                        relations = schema.getRelations();
                        String name = myHelper.getRelationNameOnField(equationParts[j],relations,newTablesFromCanonical);

                        //if name is a field name add the table name to the referencing
                        if(name != null) {
                            referencingRelations.addLast(name);
                            temp = equationParts[j];
                        }
                        else
                            temp = equationParts[j].substring(equationParts[j].indexOf(".")+1);
                    }
                    if(j!= equationParts.length-1)
                        condition = temp + symbol;
                    else condition = condition + temp;
                }
                optimizedWhere.put(condition,referencingRelations);
            }
        }
        return optimizedWhere;
    }

}

