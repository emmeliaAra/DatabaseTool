import org.antlr.v4.runtime.*;

public class Main {

    public TreeParser main(String fieldString, String path) {
        TreeParser myTreeParser = null;
        try{
            //create a charStream from the user input
            CharStream charStream = CharStreams.fromString(fieldString);
            myTreeParser = new TreeParser(charStream);
            myTreeParser.getStatementTokens();
            myTreeParser.operations(path);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return myTreeParser;
    }
}
