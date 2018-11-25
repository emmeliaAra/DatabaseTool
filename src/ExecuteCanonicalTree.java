import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ExecuteCanonicalTree {

    private TreeStructure<String> canonicalTree;
    private MySQLite mySQLite;
    private LinkedList<TreeStructure.Node<String>> holdNodes;
    private Vector<String> selectFieldName;
    private static final int RELATION_NODE_STATUS = 0;
    private static final int CARTESIAN_NODE_STATUS = 1;
    private static final int ACTION_NODE_STATUS = 2;

    public ExecuteCanonicalTree(TreeStructure<String> canonicalTree,Vector<String> selectFieldName)
    {
        this.canonicalTree = canonicalTree;
        this.selectFieldName = selectFieldName;
        mySQLite = new MySQLite("University.db");
    }

    public void execute(Stack<TreeStructure.Node<String>> stack) throws IllegalAccessException {

        TreeStructure.Node<String> popNode;
        holdNodes = new LinkedList<>();
        while (!stack.empty() )
        {
            popNode = stack.pop();
            switch (popNode.getNodeStatus()){
                case RELATION_NODE_STATUS: {
                    holdNodes.addFirst(popNode);
                    break;
                }
                case CARTESIAN_NODE_STATUS: {
                    isCartesian(popNode);
                    break;
                }
                case ACTION_NODE_STATUS:
                {
                    isAction(popNode);
                    break;
                }
            }

        }

        if(canonicalTree.getRootNode()!= null) {
            canonicalTree.createStack(canonicalTree.getRootNode());
            execute(canonicalTree.getStack());
        }
        //select * from staff,work_on,department,projects,courses;
    }

    public void isCartesian(TreeStructure.Node<String> popNode) throws IllegalAccessException {

        if(holdNodes.size() == 2) {

            LinkedList<String> tempSelect = new LinkedList<>();
            LinkedList<String> tempFrom = new LinkedList<>();
            tempFrom.addFirst(holdNodes.getFirst().getData());
            tempFrom.addFirst(holdNodes.getLast().getData());

            String tableName = holdNodes.getFirst().getData() + "_" + holdNodes.getLast().getData();
            tempSelect.addFirst("*");
            //execute the statement.
            mySQLite.simpleSelect(tempSelect,tempFrom );

            //Get the parentNode of the current node.
            //Delete the current Node from the tree and add a new node to the tree representing the relation created by the cartesian product.
            TreeStructure.Node<String> newNode =popNode.getParentNode();
            popNode.getHostingTree().deleteNode(popNode);
            mySQLite.createAsStatement(tempSelect,tempFrom,tableName);
            TreeStructure.Node<String> n = canonicalTree.addChildNode(newNode,tableName,RELATION_NODE_STATUS);
            holdNodes = new LinkedList<>();
        }
        else if(holdNodes.size() == 3)
        {
            LinkedList<String> tempSelect = new LinkedList<>();
            LinkedList<String> tempFrom = new LinkedList<>();
            String tableName = holdNodes.getFirst().getData() + "_" + holdNodes.get(1).getData();
            tempSelect.addFirst("*");
            tempFrom.addFirst(holdNodes.getFirst().getData());
            tempFrom.addFirst(holdNodes.get(1).getData());

            //execute the statement.
            mySQLite.simpleSelect(tempSelect,tempFrom );


            TreeStructure.Node<String> newNode =popNode.getParentNode();
            popNode.getHostingTree().deleteNode(popNode);
            mySQLite.createAsStatement(tempSelect,tempFrom,tableName);
            TreeStructure.Node<String> n = canonicalTree.addChildNode(newNode,tableName ,RELATION_NODE_STATUS);
            holdNodes = new LinkedList<>();
        }
    }

    public void isAction(TreeStructure.Node<String> popNode) throws IllegalAccessException {
        if(holdNodes.size() == 1) {
            LinkedList<String> temp = new LinkedList<>() ;
            List<String> newList = new LinkedList<>(selectFieldName);

            temp.add(holdNodes.getFirst().getData());
            mySQLite.simpleSelect((LinkedList<String>) newList,temp);
            canonicalTree.deleteNode(popNode);
        }

    }
}
