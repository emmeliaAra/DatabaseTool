import java.util.LinkedList;
import java.util.Vector;

public class SelectStatement {

    private Vector<String> selectFieldName, fromRelationNames, whereClause;
    private static int fieldNamenNum = 0;
    private boolean once = true;

    public SelectStatement(Vector<String> selectFieldName, Vector<String> fromRelationNames, Vector<String> whereClause) {
        this.selectFieldName = selectFieldName;
        this.fromRelationNames = fromRelationNames;
        this.whereClause = whereClause;
    }

    public TreeStructure<String> buildSelectTree() throws IllegalAccessException {

        //Create the tree and add the root node.
        TreeStructure<String> canonicalTree = new TreeStructure<>();
        int numOfExtra;
        int numOfRelations = fromRelationNames.size();

        canonicalTree.addRootNode("π" + selectFieldName, 1);
        TreeStructure.Node<String> rootNode = canonicalTree.getRootNode();
        TreeStructure.Node<String> tempNode = rootNode;

        if (whereClause.size() != 0) {
            TreeStructure.Node<String> whereClauseNode = canonicalTree.addChildNode(rootNode, "σ" + whereClause, 1);
            tempNode = whereClauseNode;
        }


        if (numOfRelations % 2 == 0)
            numOfExtra = numOfRelations - 1;
        else
            numOfExtra = numOfRelations;

        if (numOfRelations > 3) {
            TreeStructure.Node<String> nodeFrom1 = canonicalTree.addChildNode(tempNode, "X", 0);
            numOfExtra--;

            TreeStructure.Node<String> previouseleft = canonicalTree.addChildNode(nodeFrom1, "X", 0);
            TreeStructure.Node<String> previouseright = canonicalTree.addChildNode(nodeFrom1, "X", 0);
            numOfExtra -= 2;

            while (numOfExtra >= 2) {
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(previouseleft, "X", 0);
                numOfExtra--;
                TreeStructure.Node<String> newNode1 = canonicalTree.addChildNode(previouseright, "X", 0);
                numOfExtra -= 1;

                if (previouseleft.getChildren().size() == 2) {
                    if (previouseleft.getParentNode() == previouseright.getParentNode()) {
                        previouseleft = previouseleft.getChildren().getFirst();
                        previouseright = previouseright.getChildren().getFirst();
                    } else {
                        previouseleft = getPreviouse(previouseleft.getParentNode().getChildren());
                        previouseright = getPreviouse(previouseright.getParentNode().getChildren());
                    }
                }
            }
        } else if (numOfRelations == 3) {
            TreeStructure.Node<String> nodeFrom1 = canonicalTree.addChildNode(tempNode, "X", 0);
            TreeStructure.Node<String> nodeFrom2 = canonicalTree.addChildNode(nodeFrom1, "X", 0);
        } else if (numOfRelations == 2) {
            TreeStructure.Node<String> nodeFrom1 = canonicalTree.addChildNode(tempNode, "X", 0);
        }
        getLeafNodes(rootNode, canonicalTree);
        canonicalTree.printTree(rootNode, " ");
        //System.out.println(canonicalTree.getStack().toString() + "e,,,,,,,lds,l");
        return canonicalTree;
    }

    public TreeStructure.Node<String> getPreviouse(LinkedList<TreeStructure.Node<String>> children) {
        TreeStructure.Node<String> previouse = null;
        boolean foundit = false;
        for (int num = 0; num < children.size(); num++) {
            if (children.get(num).getChildren().size() < 2) {

                previouse = children.get(num);
                foundit = true;
                break;
            }
        }
        if (foundit == false) {
            for (int num = 0; num < children.size(); num++) {
                TreeStructure.Node<String> node = getPreviouse(children.get(num).getChildren());
                if (node != null) {
                    previouse = node;
                    break;
                }
            }
        }
        return previouse;
    }

    public void getLeafNodes(TreeStructure.Node<String> node, TreeStructure<String> canonicalTree) {

        if (node.getChildren().size() == 1 && fieldNamenNum < fromRelationNames.size() && node.getNodeStatus() == 0) {
            try {
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNamenNum), 1);
                fieldNamenNum++;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        else if (node.getChildren().size() == 0 && fieldNamenNum < fromRelationNames.size() && node.getNodeStatus() == 0) {
            try {
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNamenNum), 1);
                fieldNamenNum++;
                if(fieldNamenNum <fromRelationNames.size()) {
                    TreeStructure.Node<String> newNode1 = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNamenNum), 1);
                    fieldNamenNum++;
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        else if(fromRelationNames.size()==1 && node.getChildren().size()==0 && once)
            try {
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(node, fromRelationNames.get(fieldNamenNum), 1);
                once=false;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        node.getChildren().forEach(each -> getLeafNodes(each, canonicalTree));
    }
}
