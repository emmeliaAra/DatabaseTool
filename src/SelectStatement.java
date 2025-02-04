import java.util.Vector;

/**
 * This method is used to build the tree for the
 * select statement
 * @author Emmeleia Arakleitou
 */
public class SelectStatement {

    private Vector<String> selectFieldName, fromRelationNames, whereClause;
    private static final int RELATION_NODE_STATUS = 0;
    private static final int CARTESIAN_NODE_STATUS = 1;
    private static final int WHERE_NODE_STATUS = 2;
    private static final int ACTION_NODE_STATUS = 3;
    private static final int NODE_INITIAL_ID = -1;

    /**
     * Constructor of the selectStatement class
     * @param selectFieldName elements in the select clause
     * @param fromRelationNames elements in the from clause
     * @param whereClause the condition
     */
    public SelectStatement(Vector<String> selectFieldName, Vector<String> fromRelationNames, Vector<String> whereClause) {
        this.selectFieldName = selectFieldName;
        this.fromRelationNames = fromRelationNames;
        this.whereClause = whereClause;
    }

    /**
     * This method is used to build the canonical tree from the SQL statement.
     * @return
     * @throws IllegalAccessException
     */
    public TreeStructure<String> buildSelectTree() throws IllegalAccessException {

        //Create the Tree and the root node.
        TreeStructure<String> c = new TreeStructure<>();
        c.addRootNode("π" + selectFieldName, ACTION_NODE_STATUS,NODE_INITIAL_ID,-1);
        TreeStructure.Node<String> rootNode = c.getRootNode();
        TreeStructure.Node<String> tempNode = c.getRootNode();

        //if there is a condition then set the tempNode to the condition node so that every other node will be added to this one
        if (whereClause.size() != 0)
            tempNode = c.addChildNode(rootNode, "σ" + whereClause, WHERE_NODE_STATUS, NODE_INITIAL_ID,-1);

        int level = 0;
        //Add all the relation nodes to the tempNode
        for(String relation: fromRelationNames)
            c.addChildNode(tempNode, relation, RELATION_NODE_STATUS, NODE_INITIAL_ID, level);

        level ++;
        int i=0;
        /*if there are more than one relation ( the temp node has more than one child)
          go through all the children of temp node replace 2 nodes with one.
          Add the new node to temp.
         */
        while (tempNode.getChildren().size() >1 && fromRelationNames.size() != 1 )
        {
            if(!(i+1 < tempNode.getChildren().size())) {
                i = 0;
                level++;
            }

            TreeStructure.Node<String> tempC1 = tempNode.getChildren().get(i);
            TreeStructure.Node<String> tempC2 = tempNode.getChildren().get(i+1);

            tempNode.getChildren().remove(i);
            tempNode.getChildren().remove(i);
            c.addChildNodeWithIndex(tempNode,"X",CARTESIAN_NODE_STATUS,NODE_INITIAL_ID,i,level);
            tempC1.setParentNode(tempNode.getChildren().get(i));
            tempC2.setParentNode(tempNode.getChildren().get(i));

            i=i+1;

        }
        /*If there is a relational node in the tree set rootlevel = level +2 and set the level of the conditional node to level +1.
          IF only one relation in the tree set the level of the root to be 1 greater than the level of the single node
          otherwise set root level to level +1 */
        if (rootNode.getChildren().getFirst().getNodeStatus() == WHERE_NODE_STATUS) {
            rootNode.setNodeLevel(level +2);
            rootNode.getChildren().getFirst().setNodeLevel(level+1);
        }else if(fromRelationNames.size() == 1 ) //if there is only one relation then the root is one level above the relationNode
            rootNode.setNodeLevel(rootNode.getChildren().get(0).getNodeStatus()+1);
        else
            rootNode.setNodeLevel(level+1);
        return c;
    }

}