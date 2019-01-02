import java.util.*;

public class OptimizeTree {

    private Vector<String> selectFieldName, fromRelationNames, whereClause;
    private Vector<TreeStructure.Node<String>> holdLeaf,  holdHelper;
    private HashMap<String,LinkedList<String>> optimizedWhere;
    private TreeStructure<String> canonicalTree;
    private MyHelper myHelper;
    private Schema schema;
    private static final int RELATION_NODE_STATUS = 0;
    private static final int CARTESIAN_NODE_STATUS = 1;
    private static final int WHERE_NODE_STATUS = 2;
    private static final int ACTION_NODE_STATUS = 3;
    private static final int OPT_COND_NODE_STATUS = 4;

    public OptimizeTree(TreeStructure<String> canonicalTree1, Schema schema, Vector<String> selectFieldName, Vector<String> fromRelationNames, Vector<String> whereClause)
    {
        this.canonicalTree = canonicalTree1;
        this.selectFieldName = selectFieldName;
        this.fromRelationNames = fromRelationNames;
        this.whereClause = whereClause;
        this.schema = schema;


        holdLeaf = new Vector<>();
        holdHelper = new Vector<>();
        myHelper = new MyHelper();
    }

    public void splitWhere() {

        LinkedList<String> where = new LinkedList<>(whereClause);
        LinkedList<String> referencingRelations;
        LinkedList<MyRelation> relations;
        String temp = null;
        optimizedWhere = new HashMap<>();

        String whereString = new String(myHelper.getWhereFields(where));
        String[] whereParts = whereString.split("(?i)and");

        //Iterates through all the parts divided by "AND"
        for (int i=0; i<whereParts.length; i++) {
            referencingRelations = new LinkedList<>();
            if(whereParts[i].contains("=")) {
                String[] equationParts = whereParts[i].split("=");
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
                        String name = getRelationNameOnField(equationParts[j],relations);

                        //if name is a field name add the table name to the referencing
                        if(name != null) {
                            referencingRelations.addLast(name);
                            temp = equationParts[j];
                        }
                        else
                            temp = equationParts[j].substring(equationParts[j].indexOf(".")+1);
                    }
                    if(j!= equationParts.length-1) {
                        condition = temp + "=";
                    }
                    else
                        condition = condition + temp;

                }
                optimizedWhere.put(condition,referencingRelations);
            }
        }
        System.out.println("opritmized where  " + optimizedWhere);
    }

    public String getRelationNameOnField(String fieldName, LinkedList<MyRelation> relations)
    {
        String relationName = null;
        boolean found = false;
        //get the relation that the field is in !
        for (MyRelation tempRelation : relations) {
            LinkedList<MyField> tempField = tempRelation.getFields();
            for(MyField field : tempField) {
                if (field.getFieldName().equalsIgnoreCase(fieldName)) {
                    relationName = tempRelation.getRelationName();
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        return relationName;
    }

    public TreeStructure<String> optimiseTree()
    {
        TreeStructure<String> optTree = new TreeStructure<>();
        canonicalTree.createStack(canonicalTree.getRootNode());
        Stack<TreeStructure.Node<String>> stack = canonicalTree.getStack();
        TreeStructure.Node<String> popNode;

        int relationInRow =0;
        int helperInRow = 0;
        LinkedList<String> currentRelation = new LinkedList<>();
        while (!stack.empty())
        {
            popNode = stack.pop();
            switch (popNode.getNodeStatus())
            {
                case RELATION_NODE_STATUS:{
                    System.out.println(popNode.getData() + " .....");
                    currentRelation.addLast(popNode.getData());
                    relationInRow++;
                    relationNodeAction(popNode);
                    break;
                }
            }
        }
        canonicalTree.printTree(canonicalTree.getRootNode(), " ");

        return optTree;
    }

    public void relationNodeAction(TreeStructure.Node<String> node)
    {

        String condition = getCondition(node.getData(), RELATION_NODE_STATUS);
        if(condition != null) {

            /*hold the data of the current popped node and change this node to a optCond node
            and create an new child node of this node to hold the relation. */
            String tempData = node.getData();
            node.setNodeData(condition);
            node.setNodeStatus(OPT_COND_NODE_STATUS);
            try {
                TreeStructure.Node<String> newNode1 = canonicalTree.addChildNode(node, tempData, RELATION_NODE_STATUS);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public String getCondition(String relationName, int relationStatus)
    {
      //  String condition = null;

        for(Map.Entry<String , LinkedList<String>> entry : optimizedWhere.entrySet()) {
            LinkedList<String> associatedRelations = entry.getValue();

            //If relation node then condition will be associated with only one node.
            if(relationStatus == RELATION_NODE_STATUS && associatedRelations.size() == 1 )
            {
                if(relationName.equalsIgnoreCase(associatedRelations.get(0)))
                    return entry.getKey();
            }
        }

        return null;
    }
}
