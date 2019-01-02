import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.*;

public class TreeParser {

    private CharStream charStream;
    private Map<Integer, String> statement;
    private Vector<String> selectFieldName, fromRelationNames, whereClause;

    public TreeParser(CharStream charStream){
        this.charStream = charStream;
    }

    public void getStatementTokens() throws IllegalAccessException {

        sqliteLexer lexer = new sqliteLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream( lexer);
        sqliteParser parser = new sqliteParser(tokenStream);

        ParseTree myTree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();

        //create an instance of the inner class to call the methods.
        MyListener.MyInnerListener myListener = new MyListener.MyInnerListener(parser);
        walker.walk(myListener,myTree);
        statement = myListener.getMyStatement();
        getParts();

        MySQLite mySQLite = new MySQLite("University.db");
      //mySQLite.getSchema();

        TreeStructure<String> canonicalTree;
        TreeStructure<String> canonicalTreeForOpt;
        System.out.println("--------------------------------------");
        SelectStatement selectStatementToTree = new SelectStatement(selectFieldName, fromRelationNames, whereClause);
        SelectStatement selectStatementToTree1 = new SelectStatement(selectFieldName, fromRelationNames, whereClause);

        //creates the trees
        canonicalTree = selectStatementToTree.buildSelectTree();
        System.out.println("--------------------------------------");

        //keep a copy of the original tree so that can be optimised.
        canonicalTreeForOpt = selectStatementToTree1.buildSelectTree();

        ExecuteCanonicalTree executeCanonicalTree = new ExecuteCanonicalTree(canonicalTree,selectFieldName,whereClause);
        canonicalTree.createStack(canonicalTree.getRootNode());
        executeCanonicalTree.execute(canonicalTree.getStack());


        canonicalTreeForOpt.createStack(canonicalTreeForOpt.getRootNode());

        Stack<TreeStructure.Node<String>> stack = canonicalTreeForOpt.getStack();

        OptimizeTree optimizeTree = new OptimizeTree(canonicalTreeForOpt, mySQLite.getSchema(),selectFieldName,fromRelationNames,whereClause);
        optimizeTree.splitWhere();
        optimizeTree.optimiseTree();


        //canonicalTreeForOpt.inorderTreeTraverse(canonicalTreeForOpt.getRootNode());
        //canonicalTreeForOpt.getSubtrees(canonicalTreeForOpt.getRootNode());
    }

    public void getParts()
    {
        selectFieldName  = new Vector<>();
        fromRelationNames = new Vector<>();
        whereClause = new Vector<>();

        int selectKey =0;
        int fromKey =0;
        int whereKey =0;

        if (!statement.containsValue("where"))
            whereKey = -1;

        for(Map.Entry<Integer,String> myPair : statement.entrySet()) {
            if(myPair.getValue().equalsIgnoreCase("select"))
                selectKey = myPair.getKey();
            else if(myPair.getValue().equalsIgnoreCase("from"))
                fromKey = myPair.getKey();
            else if(myPair.getValue().equalsIgnoreCase("where"))
                whereKey = myPair.getKey();
        }

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
}
