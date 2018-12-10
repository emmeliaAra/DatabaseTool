import java.io.IOException;
import org.antlr.v4.runtime.*;

public class Main {

    public static void main(String[] args)  {

        try{
            CharStream charStream = CharStreams.fromStream(System.in);
            TreeParser myTreeParser = new TreeParser(charStream);
            myTreeParser.getStatementTokens();
        }catch (IOException ioE)
        {
            ioE.printStackTrace();
            System.out.println("OUPS sorryy!! Something went wrong!! :( ");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
