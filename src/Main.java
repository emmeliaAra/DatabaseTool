import java.io.IOException;
import org.antlr.v4.runtime.*;

public class Main {

    public static void main(String[] args) throws IOException, IllegalAccessException {

        CharStream charStream = CharStreams.fromStream(System.in);
        TreeParser myTreeParser = new TreeParser(charStream);
        myTreeParser.getStatementTokens();

    }
}
