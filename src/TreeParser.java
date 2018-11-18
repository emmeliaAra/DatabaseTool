import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;

public class TreeParser {

    private CharStream charStream;

    public TreeParser(CharStream charStream)
    {
        this.charStream = charStream;

    }

    public void getStatementTokens()
    {
        sqliteLexer lexer = new sqliteLexer( charStream);
        TokenStream tokenStream = new CommonTokenStream( lexer);
        sqliteParser parser = new sqliteParser(tokenStream);

        ParseTree myTree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();

        //create an instance of the inner class to call the methods.
        MyListener.MyInnerListener myListener = new MyListener.MyInnerListener(parser);

        walker.walk(myListener,myTree);
        //System.out.println("done" + myListener.getState() + "    :" + .getTokenStream().get(0).getText());
        System.out.println(myTree.toStringTree(parser));
        System.out.println(" My keywords "+myListener.getMyKeywords());
        System.out.println( "ColumnNames  " + myListener.getMyColumnNames());
        System.out.println( "myTable Names : " + myListener.getMyTableNames());
        System.out.println("myTable Alias " + myListener.getMyTableAlias());
        System.out.println("my databbase Names : " + myListener.getMyDatabaseNames() );

        //HashMap<Interval, String>  pair = new HashMap<>();
       // Interval in = new Interval(0,0);
       // Interval a = (Interval) myListener.getMyKeywords().

       // System.out.println(myListener.getMyKeywords().entrySet() + "555" + a + "hola");
    }


}
