import java.util.*;

/**
 * This Class represents implements the abstract
 * methods of ANTRL's default listenner to receive the
 * tokens from the SQLite parser and store them with a has code
 * @author Emmeleia Araklitou
 */
public class MyListener {

    public static class MyInnerListener extends sqliteBaseListener
    {
        private Map<Integer, String> myStatement = new TreeMap<>();
        private sqliteParser myParser;

        public MyInnerListener(sqliteParser myParser) {
            this.myParser = myParser;
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * getDot label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        @Override
        public void enterGetDot(sqliteParser.GetDotContext ctx) {
            if(ctx.DOT()!=null)
                myStatement.put(ctx.DOT().getSourceInterval().hashCode(), ctx.DOT().toString());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterGetComma label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        @Override
        public void enterGetComma(sqliteParser.GetCommaContext ctx) {
            if(ctx.COMMA()!=null)
                myStatement.put(ctx.COMMA().getSourceInterval().hashCode(), ctx.COMMA().toString());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterGetOpenPar label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        @Override
        public void enterGetOpenPar(sqliteParser.GetOpenParContext ctx) {
            if(ctx.OPEN_PAR()!=null)
                myStatement.put(ctx.OPEN_PAR().getSourceInterval().hashCode(), ctx.OPEN_PAR().toString());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterGetClosePar label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        @Override
        public void enterGetClosePar(sqliteParser.GetCloseParContext ctx) {
            if(ctx.CLOSE_PAR()!=null)
                myStatement.put(ctx.CLOSE_PAR().getSourceInterval().hashCode(), ctx.CLOSE_PAR().toString());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterGetSCOL label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        @Override
        public void enterGetSCOL(sqliteParser.GetSCOLContext ctx) {
            if(ctx.SCOL()!=null)
                myStatement.put(ctx.SCOL().getSourceInterval().hashCode(), ctx.SCOL().toString());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterGetAssign label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        @Override
        public void  enterGetAssign(sqliteParser.GetAssignContext ctx) {
            if(ctx.ASSIGN()!=null)
                myStatement.put(ctx.ASSIGN().getSourceInterval().hashCode(), ctx.ASSIGN().toString());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterGetDatabaseName label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        public void enterGetDatabaseName(sqliteParser.GetDatabaseNameContext ctx) {
            if(ctx.any_name()!=null)
                myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterGetTableName label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        public void enterGetTableName(sqliteParser.GetTableNameContext ctx) {
            if(ctx.any_name()!=null)
                myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterGetColumnName label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        @Override
        public void enterGetColumnName(sqliteParser.GetColumnNameContext ctx) {
            if(ctx.any_name()!=null)
                myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterMyStar label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        public void enterMyStar(sqliteParser.MyStarContext ctx) {
            if(ctx.STAR()!=null)
                myStatement.put(ctx.STAR().getSourceInterval().hashCode(),ctx.STAR().toString());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterLiteralValue label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        public void enterLiteralValue(sqliteParser.LiteralValueContext ctx) {
            if(ctx.NUMERIC_LITERAL() != null)
                myStatement.put(ctx.NUMERIC_LITERAL().getSourceInterval().hashCode(),ctx.NUMERIC_LITERAL().toString());

            else if(ctx.STRING_LITERAL() != null)
                myStatement.put(ctx.STRING_LITERAL().getSourceInterval().hashCode(), ctx.STRING_LITERAL().toString());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterUnaryOperator label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        public void enterUnaryOperator(sqliteParser.UnaryOperatorContext ctx) {
            if(ctx.MINUS() != null)
                myStatement.put(ctx.MINUS().getSourceInterval().hashCode(), ctx.MINUS().toString());

            else if(ctx.PLUS() != null)
                myStatement.put(ctx.PLUS().getSourceInterval().hashCode(), ctx.PLUS().toString());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterMyExpression label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        public void enterMyExpression(sqliteParser.MyExpressionContext ctx) {
            if(ctx.literal_value() != null)
                myStatement.put(ctx.literal_value().getSourceInterval().hashCode(), ctx.literal_value().getText());

            if(ctx.STAR() != null)
                myStatement.put(ctx.STAR().getSourceInterval().hashCode(), ctx.STAR().toString());

            if(ctx.MINUS() != null)
                myStatement.put(ctx.MINUS().getSourceInterval().hashCode(), ctx.MINUS().toString());

            else if(ctx.PLUS() != null)
                myStatement.put(ctx.PLUS().getSourceInterval().hashCode(), ctx.PLUS().toString());

            if(ctx.LT() != null)
                myStatement.put(ctx.LT().getSourceInterval().hashCode(), ctx.LT().toString());

            if(ctx.LT_EQ() != null)
                myStatement.put(ctx.LT_EQ().getSourceInterval().hashCode(), ctx.LT_EQ().toString());

            if(ctx.GT() != null)
                myStatement.put(ctx.GT().getSourceInterval().hashCode(), ctx.GT().toString());

            if(ctx.GT_EQ() != null)
                myStatement.put(ctx.GT_EQ().getSourceInterval().hashCode(), ctx.GT_EQ().toString());

            if(ctx.EQ() != null)
                myStatement.put(ctx.EQ().getSourceInterval().hashCode(), ctx.EQ().toString());

            if(ctx.NOT_EQ1() != null)
                myStatement.put(ctx.NOT_EQ1().getSourceInterval().hashCode(), ctx.NOT_EQ1().toString());

            if(ctx.NOT_EQ2() != null)
                myStatement.put(ctx.NOT_EQ2().getSourceInterval().hashCode(),ctx.NOT_EQ2().toString());

            if(ctx.K_AND() != null)
                myStatement.put(ctx.K_AND().getSourceInterval().hashCode(),ctx.K_AND().toString());

            if(ctx.K_OR() != null)
                myStatement.put(ctx.K_OR().getSourceInterval().hashCode(),ctx.K_OR().toString());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterDropTable label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        public void enterDropTable(sqliteParser.DropTableContext ctx) {
            if(ctx.K_DROP() != null)
                myStatement.put(ctx.K_DROP().getSourceInterval().hashCode(), ctx.K_DROP().toString());

            if(ctx.K_TABLE() != null)
                myStatement.put(ctx.K_TABLE().getSourceInterval().hashCode(), ctx.K_TABLE().toString());
        }

        /**
         * This method is used to receive the tokens of the rule with the
         * enterSelectCore label in the grammar
         * @param ctx a Context object that contains all the tokens from a rule recognition
         */
        public void enterSelectCore(sqliteParser.SelectCoreContext ctx) {

            if(ctx.K_SELECT()!= null)
                myStatement.put(ctx.K_SELECT().getSourceInterval().hashCode(),ctx.K_SELECT().toString());

            if(ctx.K_FROM() != null)
                myStatement.put(ctx.K_FROM().getSourceInterval().hashCode(), ctx.K_FROM().toString());

            if(ctx.K_WHERE() != null)
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());
        }

        /**
         * Accessor for the Map that contains the tokens
         * and a hashcode that will be used to sort them to get the order in
         * which they were retrieved.
         * @return
         */
        public Map<Integer, String> getMyStatement() {
            return myStatement;
        }

    }
}