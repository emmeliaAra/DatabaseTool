import org.antlr.v4.runtime.*;

/**
 * This is the Main class that is called from the GUI
 * and create an instance of the TreeParser to create and
 * execute the trees.
 * @author Emmeleia Arakleitou
 */
public class Main {

    /**
     * This method creates an instance of the TreeParser and calls the method to
     * process the input of the user
     * @param fieldString The user input
     * @param path the path of the file that the used loaded
     * @return an instance of the TreeParser.
     */
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
