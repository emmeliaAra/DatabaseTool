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
    private HashMap<String,LinkedList<String>> optimizedWhere;

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

        System.out.println("--------------------------------------");
        SelectStatement selectStatementToTree = new SelectStatement(selectFieldName, fromRelationNames, whereClause);

        //creates the trees
        TreeStructure<String> canonicalTree = selectStatementToTree.buildSelectTree();
        canonicalTree.printTree(canonicalTree.getRootNode(), " ");
        System.out.println("--------------------------------------");

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
            System.out.println("--------------------------------------");
            canonicalTreeForOpt.printTree(canonicalTreeForOpt.getRootNode(), " ");
            System.out.println("--------------------------------------");
        }

        ExecuteTree executeOptimizedTree = new ExecuteTree(canonicalTreeForOpt,selectFieldName,whereClause,mySQLite);
        canonicalTreeForOpt.createStack(canonicalTreeForOpt.getRootNode());
        executeOptimizedTree.execute(canonicalTreeForOpt.getStack());
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
        System.out.println("select fields: " + selectFieldName);
        System.out.println("from Relation: " + fromRelationNames);
        System.out.println("whereClause: " + whereClause);
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
        optimizeTree.splitWhere();
        try {
            optimizedTree = optimizeTree.optimiseTree();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return optimizedTree;
    }

}
