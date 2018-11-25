import java.util.LinkedList;
import java.util.Vector;

public class SelectStatement {

    private Vector<String> selectFieldName, fromRelationNames, whereClause;
    private static int fieldNameNum = 0;
    private boolean once = true;
    private static final int RELATION_NODE_STATUS = 0;
    private static final int CARTESIAN_NODE_STATUS = 1;
    private static final int WHERE_NODE_STATUS = 2;
    private static final int ACTION_NODE_STATUS = 3;




    public SelectStatement(Vector<String> selectFieldName, Vector<String> fromRelationNames, Vector<String> whereClause) {
        this.selectFieldName = selectFieldName;
        this.fromRelationNames = fromRelationNames;
        this.whereClause = whereClause;
    }

    public TreeStructure<String> buildSelectTree() throws IllegalAccessException {

        //Create the tree and add the root node.
        TreeStructure<String> canonicalTree = new TreeStructure<>();
        int numOfRelations = fromRelationNames.size();
        int  numOfExtra = numOfRelations-1;

        canonicalTree.addRootNode("π" + selectFieldName, ACTION_NODE_STATUS);
        TreeStructure.Node<String> rootNode = canonicalTree.getRootNode();
        TreeStructure.Node<String> tempNode = rootNode;

        if (whereClause.size() != 0) {
            TreeStructure.Node<String> whereClauseNode = canonicalTree.addChildNode(rootNode, "σ" + whereClause, WHERE_NODE_STATUS);
            tempNode = whereClauseNode;
        }

        if (numOfRelations > 3) {
            TreeStructure.Node<String> nodeFrom1 = canonicalTree.addChildNode(tempNode, "X", CARTESIAN_NODE_STATUS);
            numOfExtra--;

            TreeStructure.Node<String> previouseLeft = canonicalTree.addChildNode(nodeFrom1, "X", CARTESIAN_NODE_STATUS);
            TreeStructure.Node<String> previouseRight = canonicalTree.addChildNode(nodeFrom1, "X", CARTESIAN_NODE_STATUS);
            numOfExtra -= 2;

            while (numOfExtra >= 2) {
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(previouseLeft, "X", CARTESIAN_NODE_STATUS);
                numOfExtra--;
                TreeStructure.Node<String> newNode1 = canonicalTree.addChildNode(previouseRight, "X", CARTESIAN_NODE_STATUS);
                numOfExtra -= 1;

                if (previouseLeft.getChildren().size() == 2 && previouseLeft.getParentNode() == previouseRight.getParentNode()) {
                        previouseLeft = previouseLeft.getChildren().getFirst();
                        previouseRight = previouseRight.getChildren().getFirst();
                } else if (previouseLeft.getChildren().size() ==2){
                        previouseLeft = getPrevious(previouseLeft.getParentNode().getChildren());
                        previouseRight = getPrevious(previouseRight.getParentNode().getChildren());
                }
            }

            if(numOfExtra ==1 ) {
                TreeStructure.Node<String> newNode1 = canonicalTree.addChildNode(previouseLeft, "X", CARTESIAN_NODE_STATUS);
                numOfExtra--;
            }
        } else if (numOfRelations == 3) {
            TreeStructure.Node<String> nodeFrom1 = canonicalTree.addChildNode(tempNode, "X", CARTESIAN_NODE_STATUS);
            TreeStructure.Node<String> nodeFrom2 = canonicalTree.addChildNode(nodeFrom1, "X", CARTESIAN_NODE_STATUS);
        } else if (numOfRelations == 2) {
            TreeStructure.Node<String> nodeFrom1 = canonicalTree.addChildNode(tempNode, "X", CARTESIAN_NODE_STATUS);
        }
        getLeafNodes(rootNode, canonicalTree);
        canonicalTree.printTree(rootNode, " ");
        return canonicalTree;
    }

    public TreeStructure.Node<String> getPrevious(LinkedList<TreeStructure.Node<String>> children) {
        TreeStructure.Node<String> previous = null;
        boolean foundIt = false;
        for (int num = 0; num < children.size(); num++) {
            if (children.get(num).getChildren().size() < 2) {

                previous = children.get(num);
                foundIt = true;
                break;
            }
        }
        if (foundIt == false) {
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

        if (node.getChildren().size() == 1 && fieldNameNum < fromRelationNames.size() && node.getNodeStatus() == CARTESIAN_NODE_STATUS) {
            try {
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNameNum), RELATION_NODE_STATUS);
                fieldNameNum++;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        else if (node.getChildren().size() == 0 && fieldNameNum < fromRelationNames.size() && node.getNodeStatus() == CARTESIAN_NODE_STATUS) {
            try {
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNameNum), RELATION_NODE_STATUS);
                fieldNameNum++;
                if(fieldNameNum <fromRelationNames.size()) {
                    TreeStructure.Node<String> newNode1 = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNameNum), RELATION_NODE_STATUS);
                    fieldNameNum++;
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        else if(fromRelationNames.size()==1 && node.getChildren().size()==0 && once)
            try {
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNameNum), RELATION_NODE_STATUS);
                once=false;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        node.getChildren().forEach(each -> getLeafNodes(each, canonicalTree));
    }
}
