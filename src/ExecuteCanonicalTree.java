import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ExecuteCanonicalTree {

    private TreeStructure<String> canonicalTree;
    private MySQLite mySQLite;
    private LinkedList<TreeStructure.Node<String>> holdNodes;
    private Vector<String> selectFieldName,whereClause;
    private static final int RELATION_NODE_STATUS = 0;
    private static final int CARTESIAN_NODE_STATUS = 1;
    private static final int WHERE_NODE_STATUS = 2;
    private static final int ACTION_NODE_STATUS = 3;

    public ExecuteCanonicalTree(TreeStructure<String> canonicalTree,Vector<String> selectFieldName,Vector<String> whereClause)
    {
        this.canonicalTree = canonicalTree;
        this.selectFieldName = selectFieldName;
        this.whereClause = whereClause;
        mySQLite = new MySQLite("University.db");
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

        //if there are 2 nodes on hold -> produce cartesian product on those relations.
        if(holdNodes.size() == 2) {

            LinkedList<String> tempSelect = new LinkedList<>();
            LinkedList<String> tempFrom = new LinkedList<>();
            tempFrom.addFirst(holdNodes.getFirst().getData());
            tempFrom.addFirst(holdNodes.getLast().getData());

            //create a name for the table that will be create temporarily for the cartesian product of those relations.
            String tableName = holdNodes.getFirst().getData() + "_" + holdNodes.getLast().getData();
            tempSelect.addFirst("*");
            //execute the statement.
            mySQLite.simpleSelect(tempSelect,tempFrom );

            //Get the parentNode of the current node.
            //Delete the current Node from the tree and add a new node to the tree representing the relation created by the cartesian product.
            TreeStructure.Node<String> newNode =popNode.getParentNode();
            popNode.getHostingTree().deleteNode(popNode);
            //create new relation for the cartesian product.
            mySQLite.createAsStatement(tempSelect,tempFrom,tableName);
            TreeStructure.Node<String> n = canonicalTree.addChildNode(newNode,tableName,RELATION_NODE_STATUS);
            //clear the list that holds the relations.
            holdNodes = new LinkedList<>();
        }
        //if there are 2 nodes on hold -> produce cartesian product with first and second and add the other one back to the three.
        else if(holdNodes.size() == 3)
        {
            int o = 1;
            LinkedList<String> tempSelect = new LinkedList<>();
            LinkedList<String> tempFrom = new LinkedList<>();
            String tableName = holdNodes.getFirst().getData() + "_" + holdNodes.get(1).getData();
            tempSelect.addFirst("*");
            tempFrom.addFirst(holdNodes.getFirst().getData());
            tempFrom.addFirst(holdNodes.get(1).getData());

            //execute the statement.
            mySQLite.simpleSelect(tempSelect,tempFrom );
            TreeStructure.Node<String> newNode =popNode.getParentNode();
            o++;
            popNode.getHostingTree().deleteNode(popNode);
            o++;
            mySQLite.createAsStatement(tempSelect,tempFrom,tableName);
            o++;
            TreeStructure.Node<String> n = canonicalTree.addChildNode(newNode,tableName ,RELATION_NODE_STATUS);
            o++;
            holdNodes = new LinkedList<>();
        }
    }

    public void isAction(TreeStructure.Node<String> popNode) throws IllegalAccessException {
        //execute the project operation on the final resulting relation
        if(holdNodes.size() == 1) {
            LinkedList<String> temp = new LinkedList<>() ;
            LinkedList<String> selectFields = new LinkedList<>(selectFieldName);

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

            TreeStructure.Node<String> newNode =popNode.getParentNode();
            popNode.getHostingTree().deleteNode(popNode);

            mySQLite.createAsStatementWhere(tempSelect,tempFrom,tableName, where);
            TreeStructure.Node<String> n = canonicalTree.addChildNode(newNode,tableName ,RELATION_NODE_STATUS);
            holdNodes = new LinkedList<>();
        }
    }
}