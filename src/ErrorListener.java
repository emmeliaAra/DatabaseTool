import org.antlr.v4.runtime.*;
import java.util.*;

/**
 * This class is used to evaluate the error messages produced
 * by ANTLR and prevent the output.
 * Produce new messages to present to the user
 * @author Emmeleia Arakleitou
 */
public class ErrorListener  {

    public static class InnerErrorListener extends  BaseErrorListener{

        private  Vector<String> errorMessage;

        //This method will receive all the information about the location of the errors and the error message.
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine,
                                String msg,
                                RecognitionException e){
            errorMessage = new Vector<>();

            List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
            Collections.reverse(stack);
            System.err.println(msg);

            StringBuilder error ;

            if(msg.toLowerCase().contains("extraneous input") || msg.toLowerCase().contains("mismatched input"))
                error = new StringBuilder("Invalid input " + msg.toLowerCase().substring(msg.indexOf("'"), msg.indexOf("expecting")));
            else if(msg.toLowerCase().contains("no viable alternative at input"))
                error = new StringBuilder("Invalid input " + msg.toLowerCase().substring(msg.indexOf("'")));
            else if(msg.toLowerCase().contains("missing"))
            {
                String temp = msg.substring(msg.indexOf("'"), msg.toLowerCase().indexOf("at"));
                if(msg.toLowerCase().substring(msg.length()-7).equalsIgnoreCase("'<eof>'"))
                    error = new StringBuilder("Missing input " + temp + "at the end");
                else
                    error = new StringBuilder("Missing input " + temp);
            }else if(msg.toLowerCase().contains("token recognition error at"))
                error = new StringBuilder("Invalid input " + msg.toLowerCase().substring(msg.toLowerCase().indexOf("'")));
            else
                error = new StringBuilder(msg);

            errorMessage.add(error.toString());
        }

        public Vector<String> getMsg()
        {
            return errorMessage;
        }
    }

}
