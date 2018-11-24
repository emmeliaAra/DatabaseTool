import java.util.Stack;

public class ExecuteCanonicalTree {

    private TreeStructure<String> canonicalTree;
    private MySQLite mySQLite;

    public ExecuteCanonicalTree(TreeStructure<String> canonicalTree)
    {
        this.canonicalTree = canonicalTree;
        mySQLite = new MySQLite("University.db");
    }

    public void execute() {
        Stack<TreeStructure.Node<String>> stack = canonicalTree.getStack();
        TreeStructure.Node<String> rootNode = canonicalTree.getRootNode();

        TreeStructure.Node<String> temp = stack.pop();

        while (!stack.empty())
        {
            stack.pop();
            //check if leaf nodes.
            if(temp.getChildren().size() == 0) {
                mySQLite.simpleSelect("*", temp.getData());
            }
           // else if()
        }




    }
}
