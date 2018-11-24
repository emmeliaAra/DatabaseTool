import java.util.LinkedList;
import java.util.Vector;

public class SelectStatement {

    private LinkedList<TreeStructure.Node<String>> relationNamesNodes;

    private Vector<String> selectFieldName, fromRelationNames, whereClause;

    public SelectStatement(Vector<String> selectFieldName, Vector<String> fromRelationNames, Vector<String> whereClause)
    {
        this.selectFieldName = selectFieldName;
        this.fromRelationNames = fromRelationNames;
        this.whereClause = whereClause;
    }

    public TreeStructure<String> buildSelectTree() throws IllegalAccessException {

        //Create the tree and add the root node.
        TreeStructure<String> canonicalTree = new TreeStructure<>();
        canonicalTree.addRootNode("π" + selectFieldName);

        TreeStructure.Node<String> rootNode = canonicalTree.getRootNode();
        TreeStructure.Node<String> tempNode = rootNode;

        if(whereClause.size() != 0) {

            TreeStructure.Node<String> whereClauseNode = canonicalTree.addChildNode(rootNode, "σ" + whereClause);
            tempNode = whereClauseNode;
        }

        int numOfRelations = fromRelationNames.size();

        if(numOfRelations>2)
        {
            TreeStructure.Node<String> nodeFrom1 = canonicalTree.addChildNode(tempNode,"19");
            int numOfExtra = numOfRelations -2;
            System.out.println("numOf extra   " + numOfExtra);
            TreeStructure.Node<String> nodeFrom2 = canonicalTree.addChildNode(nodeFrom1,"18");
            TreeStructure.Node<String> nodeFrom3 = canonicalTree.addChildNode(nodeFrom1,"17");

            TreeStructure.Node<String> previouseleft = nodeFrom2;
            TreeStructure.Node<String> previouseright = nodeFrom3;
            numOfExtra -=2;
            System.out.println("numOf extra2222   " + numOfExtra);

            while (numOfExtra >= 2){
                TreeStructure.Node<String> newNode = canonicalTree.addChildNode(previouseleft, Integer.toString(numOfExtra));
                numOfExtra--;
                TreeStructure.Node<String> newNode1 = canonicalTree.addChildNode(previouseright, Integer.toString(numOfExtra));
                numOfExtra -=1;
                System.out.println("numOf exnnntra" + numOfExtra);

                if(previouseleft.getParentNode() == previouseright.getParentNode()){
                    previouseleft = previouseleft.getChildren().getFirst();
                    previouseright = previouseright.getChildren().getFirst();
                }else{
                    System.out.println("ena");
                    System.out.println(previouseleft.getParentNode().getData()+ " eee");
                    previouseleft = getPreviouse(previouseleft.getParentNode().getChildren());

                    System.out.println("dio");
                    System.out.println(previouseright.getParentNode().getData() + "ooo");
                    previouseright = getPreviouse(previouseright.getParentNode().getChildren());

                }
            }
          //  if (numOfExtra == 1) {
            //    if(previouseleft.getChildren().size() == 2)
           // }


        }




        //relationNamesNodes = new LinkedList<>();

        /*for (int i=0; i<numOfRelations; i++)
        {
            TreeStructure.Node<String> relationNameNode = canonicalTree.addChildNode(tempNode,fromRelationNames.elementAt(i));
           // relationNamesNodes.add(relationNameNode);
        }*/
        canonicalTree.printTree(rootNode, " ");
        return canonicalTree;
    }

    public TreeStructure.Node<String> getPreviouse(LinkedList<TreeStructure.Node<String>> children)
    {
        TreeStructure.Node<String> previouse = null;
        boolean foundit = false;
        for(int num=0; num<children.size(); num++)
        {
            System.out.println("emmelai");
            if(children.get(num).getChildren().size() < 2){
                System.out.println("eela ");
                previouse = children.get(num);
                foundit = true;
                break;
            }
        }
        if(foundit == false){
            for (int num =0; num<children.size(); num ++)
            {
                System.out.println("memem");
                TreeStructure.Node<String> node  =  getPreviouse(children.get(num).getChildren());
                if (node != null) {
                    previouse = node;
                    break;
                }
            }
        }
        //System.out.println(previouse.getParentNode().getData() + "jjjj");
        System.out.println((previouse== null) + "kala" + previouse.getData() );
        return previouse;
    }
}
