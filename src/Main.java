import org.antlr.v4.runtime.*;

public class Main {

    public TreeParser main(String fieldString, String path) {
        TreeParser myTreeParser;

        //create a charStream from the user input
        CharStream charStream = CharStreams.fromString(fieldString);
        myTreeParser = new TreeParser(charStream,path);
        try {
            myTreeParser.getStatementTokens();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return myTreeParser;
    }
}
