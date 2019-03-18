import org.antlr.v4.runtime.*;
import java.util.*;

/**
 * This class is used to evaluate the error messages produced
 * by ANTLR and prevent the output.
 * Produce new messages to present to the user
 * @author Emmeleia Arakleitou
 */
public class SyntaxErrorListener {

    public static class InnerErrorListener extends  BaseErrorListener{

        private Vector<String> errorMessage = new Vector<>();
        private boolean check = false;

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

            StringBuilder error =  null;
            if(msg.toLowerCase().contains("extraneous input") || msg.toLowerCase().contains("mismatched input")) {
                error = new StringBuilder("Invalid input " + msg.toLowerCase().substring(msg.indexOf("'"), msg.indexOf("expecting")));
                check = true;
                CommonTokenStream tokens = (CommonTokenStream)recognizer.getInputStream();
                String input = tokens.getTokenSource().getInputStream().toString();
                if(input.contains("*") && (input.charAt(input.indexOf("*")+1)!=' ' || input.charAt(input.indexOf("*")-1) != ' ')  )
                    if( ((input.charAt(input.indexOf("*")+1)!=' ') && !input.substring(input.indexOf("*")+1,input.indexOf("*")+5).equalsIgnoreCase("from"))
                            || ((input.charAt(input.indexOf("*")-1)!=' ') && !input.substring(0,input.indexOf("*")).equalsIgnoreCase("select")) ){
                        error.append("\n A filed name cannon contain this \" * \"  character. A valid select statement that uses this  \" * \" operator is:\n" +
                                "\t\t Select * from table name;");
                        check = false;
                    }
            }
            else if(msg.toLowerCase().contains("no viable alternative at input"))
                error = new StringBuilder("Invalid input " + msg.toLowerCase().substring(msg.indexOf("'")));
            else if(msg.toLowerCase().contains("missing"))
            {
                if (msg.toLowerCase().contains("k_table")){
                    if (msg.toLowerCase().indexOf("at") >= 0 && msg.indexOf("'") >= 0)
                        error = new StringBuilder("Invalid input " + msg.substring(msg.indexOf("'")) + " expecting \"Table\"");
                }else {
                    String temp = msg.substring(msg.indexOf("'"), msg.toLowerCase().indexOf("at"));
                    if (msg.toLowerCase().substring(msg.length() - 7).equalsIgnoreCase("'<eof>'"))
                        error = new StringBuilder("Missing input " + temp + "at the end");
                    else
                        error = new StringBuilder("Missing input " + temp);
                }
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

        public boolean getCheck()
        {
            return check;
        }
    }

}
