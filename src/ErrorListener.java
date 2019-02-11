import org.antlr.v4.runtime.*;
import java.util.*;

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
            StringBuilder error = new StringBuilder(msg.substring(0,msg.indexOf("expecting")));
         //   StringBuilder temp  = underlineError(recognizer,(Token)offendingSymbol,line,charPositionInLine);
           // if( temp!= null)
             //   error.append("\n" + temp);
                errorMessage.add(error.toString());
        }

        protected StringBuilder underlineError(Recognizer recognizer, Token offendingToken, int line, int charPositionInLine) {

            StringBuilder errorMessagePointer = null;
            CommonTokenStream tokens = (CommonTokenStream)recognizer.getInputStream();
            String input = tokens.getTokenSource().getInputStream().toString();
            String[] lines = input.split("\n");
            String errorLine = lines[line - 1];
            System.err.println(errorLine);

            errorMessagePointer = new StringBuilder(errorLine + "\n");

            for (int i=0; i<charPositionInLine; i++)
                errorMessagePointer.append(" ");

            int start = offendingToken.getStartIndex();
            int stop = offendingToken.getStopIndex();
            if ( start>=0 && stop>=0 ) {
                for (int i=start; i<=stop; i++) {
                    System.err.print("^");
                    errorMessagePointer.append("-");
                }
            }
            System.err.println();
            return errorMessagePointer;
        }

        public Vector<String> getMsg()
        {
            return errorMessage;
        }
    }

}
