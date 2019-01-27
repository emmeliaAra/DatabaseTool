import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CharStream;
import java.util.*;

public class TreeParser {

    private CharStream charStream;
    private Map<Integer, String> statement;
    private Vector<String> selectFieldName, fromRelationNames, whereClause;
    private MySQLite mySQLite;
    private LinkedList<String> nodeIdInOrderCanonical = new LinkedList<>();
    private LinkedList<String> nodeIdInOrderOptimal = new LinkedList<>();
    private String finalTable;


    public TreeParser(CharStream charStream){
        this.charStream = charStream;
    }

    public void getStatementTokens(){

        sqliteLexer lexer = new sqliteLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        sqliteParser parser = new sqliteParser(tokenStream);

        ParseTree myTree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();

        //create an instance of the inner class to call the methods.
        MyListener.MyInnerListener myListener = new MyListener.MyInnerListener(parser);
        walker.walk(myListener,myTree);
        statement = myListener.getMyStatement();
        getParts();
    }

    public void operations()throws IllegalAccessException
    {
        //"University.db
        mySQLite = new MySQLite("University.db");
        SelectStatement selectStatementToTree = new SelectStatement(selectFieldName, fromRelationNames, whereClause);
        //creates and executes the trees to present the results.
        TreeStructure<String> canonicalTree = selectStatementToTree.buildSelectTree();
        ExecuteTree executeCanonicalTree = new ExecuteTree(canonicalTree,selectFieldName,whereClause,mySQLite);
        canonicalTree.createStack(canonicalTree.getRootNode());
        executeCanonicalTree.execute(canonicalTree.getStack());


        //keep a copy of the original tree so that can be optimised.
        SelectStatement selectStatementForOpt = new SelectStatement(selectFieldName, fromRelationNames, whereClause);
        TreeStructure<String> canonicalTreeForOpt = selectStatementForOpt.buildSelectTree();

        //if there is no where condition or only one the tree will be the same as the canonical.
        OptimizeTree optimizeTree = new OptimizeTree(canonicalTreeForOpt, mySQLite.getSchema(),whereClause);
        if(!optimizeTree.splitWhere().isEmpty()) {
            canonicalTreeForOpt = optimizeTree.optimiseTree();
            canonicalTreeForOpt.printTree(canonicalTreeForOpt.getRootNode(), " ");
        }

        ExecuteTree executeOptimizedTree = new ExecuteTree(canonicalTreeForOpt,selectFieldName,whereClause,mySQLite);
        canonicalTreeForOpt.createStack(canonicalTreeForOpt.getRootNode());
        executeOptimizedTree.execute(canonicalTreeForOpt.getStack());

        //Get the relations in the order they are executed.
        nodeIdInOrderCanonical = executeCanonicalTree.getNodeIdInOrder();
        nodeIdInOrderOptimal = executeOptimizedTree.getNodeIdInOrder();
        finalTable = executeCanonicalTree.getFinalTable();
    }

    public void getParts()
    {
        selectFieldName  = new Vector<>();
        fromRelationNames = new Vector<>();
        whereClause = new Vector<>();

        int selectKey =0;
        int fromKey =0;
        int whereKey =0;

        //If there is no where part set whereKey to -1
        if (!statement.containsValue("where"))
            whereKey = -1;

        //Get the stating point of each keyWord
        for(Map.Entry<Integer,String> myPair : statement.entrySet()) {
            if(myPair.getValue().equalsIgnoreCase("select"))
                selectKey = myPair.getKey();
            else if(myPair.getValue().equalsIgnoreCase("from"))
                fromKey = myPair.getKey();
            else if(myPair.getValue().equalsIgnoreCase("where"))
                whereKey = myPair.getKey();
        }

        //if the value is not "," or ";" then distribute the values to the correct vector according to the key ranges!
        for(Map.Entry<Integer,String> myPair : statement.entrySet()) {
            if(!myPair.getValue().equals(",") && !myPair.getValue().equals(";") ){

                if(myPair.getKey()> selectKey && myPair.getKey() < fromKey && selectKey!= -1 )
                    selectFieldName.add(myPair.getValue());
                else if(myPair.getKey() > fromKey && myPair.getKey() < whereKey )
                    fromRelationNames.add(myPair.getValue());
                else if(myPair.getKey()> whereKey && myPair.getKey() > fromKey  && whereKey != -1)
                    whereClause.add(myPair.getValue());
                else if(myPair.getKey() >fromKey && whereKey == -1 )
                    fromRelationNames.add(myPair.getValue());
            }
        }
    }

    public TreeStructure<String> getCanonicalTree()
    {
        SelectStatement selectStatement = new SelectStatement(selectFieldName, fromRelationNames, whereClause);
        TreeStructure<String> canonicalTree = null;
        try {
            canonicalTree = selectStatement.buildSelectTree();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return canonicalTree;
    }

    public TreeStructure<String> getOptimizedTree()
    {
        TreeStructure<String> optimizedTree = getCanonicalTree();
        OptimizeTree optimizeTree = new OptimizeTree(optimizedTree, mySQLite.getSchema(),whereClause);

        try {
            if(!optimizeTree.splitWhere().isEmpty())
                optimizedTree = optimizeTree.optimiseTree();
            else
                optimizedTree = getCanonicalTree();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        optimizedTree.printTree(optimizedTree.getRootNode(), " " );
        return optimizedTree;
    }

    //Set node id. The first one  popped has nodeId = 0 etc.
    public TreeStructure<String> setNodeID(TreeStructure<String> tree)
    {
        Stack<TreeStructure.Node<String>> stack;
        tree.createStack(tree.getRootNode());
        stack = tree.getStack();
        TreeStructure.Node popNode;
        int i =0;

        while(!stack.empty()) {
            popNode = stack.pop();
            popNode.setNodeID(i);
            i++;
        }
        return tree;
    }

    public LinkedList<String> getNodeIdInOrderCanonical() {
        return nodeIdInOrderCanonical;
    }

    public LinkedList<String> getNodeIdInOrderOptimal()
    {
        return nodeIdInOrderOptimal;
    }
    public MySQLite getMySQLite()
    {
        return mySQLite;
    }
    public String getFinalTable(){
        return finalTable;
    }
}
