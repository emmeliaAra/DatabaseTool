import java.util.LinkedList;
import java.util.Vector;

public class SelectStatement {

    private Vector<String> selectFieldName, fromRelationNames, whereClause;
    private static final int RELATION_NODE_STATUS = 0;
    private static final int CARTESIAN_NODE_STATUS = 1;
    private static final int WHERE_NODE_STATUS = 2;
    private static final int ACTION_NODE_STATUS = 3;
    private static final int NODE_INITIAL_ID = -1;
    private int fieldNameNum = 0;

    public SelectStatement(Vector<String> selectFieldName, Vector<String> fromRelationNames, Vector<String> whereClause) {
        this.selectFieldName = selectFieldName;
        this.fromRelationNames = fromRelationNames;
        this.whereClause = whereClause;
    }


    public  TreeStructure<String> secondAttempt() throws IllegalAccessException {

        //Create the Tree and the root node.
        TreeStructure<String> c = new TreeStructure<>();
        c.addRootNode("π" + selectFieldName, ACTION_NODE_STATUS,NODE_INITIAL_ID);
        TreeStructure.Node<String> rootNode = c.getRootNode();
        TreeStructure.Node<String> tempNode = c.getRootNode();

        if (whereClause.size() != 0)
            tempNode = c.addChildNode(rootNode, "σ" + whereClause, WHERE_NODE_STATUS, NODE_INITIAL_ID);

        for(String relation: fromRelationNames)
            c.addChildNode(tempNode,relation,RELATION_NODE_STATUS,NODE_INITIAL_ID);

        int i=0;
        while (tempNode.getChildren().size() >1)
        {
            if(!(i+1 < tempNode.getChildren().size()))
                i=0;

            TreeStructure.Node<String> tempC1 = tempNode.getChildren().get(i);
            TreeStructure.Node<String> tempC2 = tempNode.getChildren().get(i+1);

            tempNode.getChildren().remove(i);
            tempNode.getChildren().remove(i);
            c.addChildNode1(tempNode,"X",CARTESIAN_NODE_STATUS,NODE_INITIAL_ID,i);
            tempC1.setParentNode(tempNode.getChildren().get(i));
            tempC2.setParentNode(tempNode.getChildren().get(i));

            i=i+1;
        }
        c.printTree(c.getRootNode(), " ");
        return c;
    }

    public TreeStructure<String> buildSelectTree() throws IllegalAccessException {

        /*Create the tree and add the root node. If I have 7 relations 6 helper nodes will be needed.*/
        TreeStructure<String> canonicalTree = new TreeStructure<>();
        int numOfRelations = fromRelationNames.size();
        int  numOfExtra = numOfRelations-1;

        canonicalTree.addRootNode("π" + selectFieldName, ACTION_NODE_STATUS,NODE_INITIAL_ID);
        TreeStructure.Node<String> rootNode = canonicalTree.getRootNode();
        TreeStructure.Node<String> tempNode = rootNode;

        if (whereClause.size() != 0)
            tempNode = canonicalTree.addChildNode(rootNode, "σ" + whereClause, WHERE_NODE_STATUS, NODE_INITIAL_ID);


        //If there are more than 3 relations
        if (numOfRelations > 3) {
            //create the first helperNode
            TreeStructure.Node<String> nodeFrom1 = canonicalTree.addChildNode(tempNode, "X", CARTESIAN_NODE_STATUS,NODE_INITIAL_ID);
            numOfExtra--;

            //add to more one to the left and one to the right
            TreeStructure.Node<String> previousLeft = canonicalTree.addChildNode(nodeFrom1, "X", CARTESIAN_NODE_STATUS,NODE_INITIAL_ID);
            TreeStructure.Node<String> previousRight = canonicalTree.addChildNode(nodeFrom1, "X", CARTESIAN_NODE_STATUS,NODE_INITIAL_ID);
            numOfExtra -= 2;

            //if more helper nodes are needed
            while (numOfExtra >= 2) {
                //add a child node to the left and right helper node
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(previousLeft, "X", CARTESIAN_NODE_STATUS,NODE_INITIAL_ID);
                numOfExtra--;
                TreeStructure.Node<String> newNode1 = canonicalTree.addChildNode(previousRight, "X", CARTESIAN_NODE_STATUS,NODE_INITIAL_ID);
                numOfExtra -= 1;


                //if previous left and right have the same parent means that their first child will be the previous
                if (previousLeft.getChildren().size() == 2 && previousLeft.getParentNode() == previousRight.getParentNode()) {
                        previousLeft = previousLeft.getChildren().getFirst();
                        previousRight = previousRight.getChildren().getFirst();
                /*if previous left and right have 2 child then one of their child will be previous left and previous right
                  need to check if there is another node in that level with the same parent that does not have 2 child*/
                } else if (previousLeft.getChildren().size() ==2){
                        previousLeft = getPrevious(previousLeft.getParentNode().getChildren());
                        previousRight = getPrevious(previousRight.getParentNode().getChildren());
                }
            }

            if(numOfExtra ==1 ) {
                TreeStructure.Node<String> newNode1 = canonicalTree.addChildNode(previousLeft, "X", CARTESIAN_NODE_STATUS,NODE_INITIAL_ID);
                numOfExtra--;
            }
        //if only 3 relations add a 1 helper node and another helper node as its child
        } else if (numOfRelations == 3) {
            TreeStructure.Node<String> nodeFrom1 = canonicalTree.addChildNode(tempNode, "X", CARTESIAN_NODE_STATUS,NODE_INITIAL_ID);
            TreeStructure.Node<String> nodeFrom2 = canonicalTree.addChildNode(nodeFrom1, "X", CARTESIAN_NODE_STATUS,NODE_INITIAL_ID);
        //if only 2 then add 1 helper node after the project or select statement
        } else if (numOfRelations == 2) {
            TreeStructure.Node<String> nodeFrom1 = canonicalTree.addChildNode(tempNode, "X", CARTESIAN_NODE_STATUS,NODE_INITIAL_ID);
        }
        getLeafNodes(rootNode, canonicalTree);
        return canonicalTree;
    }

    public TreeStructure.Node<String> getPrevious(LinkedList<TreeStructure.Node<String>> children) {
        TreeStructure.Node<String> previous = null;
        boolean foundIt = false;
        //for all the child of the parent node check if they have 2 child if not set as previouse
        for (int num = 0; num < children.size(); num++) {
            if (children.get(num).getChildren().size() < 2) {

                previous = children.get(num);
                foundIt = true;
                break;
            }
        }
        //if the parent node has 2 child check if the child nodes have 2 child with recursive call of this method
        if (!foundIt ) {
            for (int num = 0; num < children.size(); num++) {
                TreeStructure.Node<String> node = getPrevious(children.get(num).getChildren());
                if (node != null) {
                    previous = node;
                    break;
                }
            }
        }
        return previous;
    }

    public void getLeafNodes(TreeStructure.Node<String> node, TreeStructure<String> canonicalTree) {

        //if the cartesian node has one child and there are more relations to add add a node to it/
        if (node.getChildren().size() == 1 && fieldNameNum < fromRelationNames.size() && node.getNodeStatus() == CARTESIAN_NODE_STATUS) {
            try {
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNameNum), RELATION_NODE_STATUS,NODE_INITIAL_ID);
                fieldNameNum++;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        //if there are no child nodes add 2 relation nodes to the cartesian node.
        else if (node.getChildren().size() == 0 && fieldNameNum < fromRelationNames.size() && node.getNodeStatus() == CARTESIAN_NODE_STATUS) {
            try {
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNameNum), RELATION_NODE_STATUS,NODE_INITIAL_ID);
                fieldNameNum++;
                if(fieldNameNum <fromRelationNames.size()) {
                    TreeStructure.Node<String> newNode1 = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNameNum), RELATION_NODE_STATUS,NODE_INITIAL_ID);
                    fieldNameNum++;
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        //if only one relation add that one and
        else if(fromRelationNames.size()==1 && node.getChildren().size()==0 && fromRelationNames.size() >fieldNameNum)
            try {
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNameNum), RELATION_NODE_STATUS,NODE_INITIAL_ID);
                fieldNameNum++;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        node.getChildren().forEach(each -> getLeafNodes(each, canonicalTree));
    }


}