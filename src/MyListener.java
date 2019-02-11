import java.util.*;

public class MyListener {

    public static class MyInnerListener extends sqliteBaseListener
    {
        private Map<Integer, String> myStatement = new TreeMap<>();
        private List<Integer> status = new LinkedList<>();
        private sqliteParser myParser;

        public MyInnerListener(sqliteParser myParser) {
            this.myParser = myParser;
        }

        @Override
        public void enterGetDot(sqliteParser.GetDotContext ctx) {
            myStatement.put(ctx.DOT().getSourceInterval().hashCode(), ctx.DOT().toString());
        }

        @Override
        public void enterGetComma(sqliteParser.GetCommaContext ctx) {
            myStatement.put(ctx.COMMA().getSourceInterval().hashCode(), ctx.COMMA().toString());
        }

        @Override
        public void enterGetOpenPar(sqliteParser.GetOpenParContext ctx) {
            myStatement.put(ctx.OPEN_PAR().getSourceInterval().hashCode(), ctx.OPEN_PAR().toString());
        }

        @Override
        public void enterGetClosePar(sqliteParser.GetCloseParContext ctx) {
            myStatement.put(ctx.CLOSE_PAR().getSourceInterval().hashCode(), ctx.CLOSE_PAR().toString());
        }

        @Override
        public void enterGetSCOL(sqliteParser.GetSCOLContext ctx) {
            myStatement.put(ctx.SCOL().getSourceInterval().hashCode(), ctx.SCOL().toString());
        }

        @Override
        public void  enterGetAssign(sqliteParser.GetAssignContext ctx)
        {
            myStatement.put(ctx.ASSIGN().getSourceInterval().hashCode(), ctx.ASSIGN().toString());
        }

        public void enterGetDatabaseName(sqliteParser.GetDatabaseNameContext ctx) {
            myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        public void enterGetTableName(sqliteParser.GetTableNameContext ctx) {
            myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        @Override
        public void enterGetColumnName(sqliteParser.GetColumnNameContext ctx) {
            myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        public void enterSelectOrValues (sqliteParser.SelectOrValuesContext ctx) {

            myStatement.put(ctx.K_SELECT().getSourceInterval().hashCode(),ctx.K_SELECT().toString());

            if(ctx.K_FROM() != null)
                myStatement.put(ctx.K_FROM().getSourceInterval().hashCode(), ctx.K_FROM().toString());

            if(ctx.K_WHERE() != null)
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());
        }

        public void enterMyStar(sqliteParser.MyStarContext ctx) {
            myStatement.put(ctx.STAR().getSourceInterval().hashCode(),ctx.STAR().toString());
        }

        public void enterUnaryOperator(sqliteParser.UnaryOperatorContext ctx) {
            if(ctx.MINUS() != null)
                myStatement.put(ctx.MINUS().getSourceInterval().hashCode(), ctx.MINUS().toString());

            else if(ctx.PLUS() != null)
                myStatement.put(ctx.PLUS().getSourceInterval().hashCode(), ctx.PLUS().toString());

            else if(ctx.TILDE() != null)
                myStatement.put(ctx.TILDE().getSourceInterval().hashCode(), ctx.TILDE().toString());
        }

        public void enterMyExpression(sqliteParser.MyExpressionContext ctx) {

            if(ctx.PIPE2() != null)
                myStatement.put(ctx.PIPE2().getSourceInterval().hashCode(), ctx.PIPE2().toString());

            if(ctx.STAR() != null)
                myStatement.put(ctx.STAR().getSourceInterval().hashCode(), ctx.STAR().toString());

            if(ctx.DIV() != null)
                myStatement.put(ctx.DIV().getSourceInterval().hashCode(),ctx.DIV().toString());

            if(ctx.MOD() != null)
                myStatement.put(ctx.MOD().getSourceInterval().hashCode(), ctx.MOD().toString());

            if(ctx.MINUS() != null)
                myStatement.put(ctx.MINUS().getSourceInterval().hashCode(), ctx.MINUS().toString());

            else if(ctx.PLUS() != null)
                myStatement.put(ctx.PLUS().getSourceInterval().hashCode(), ctx.PLUS().toString());

            if(ctx.LT2() != null)
                myStatement.put(ctx.LT2().getSourceInterval().hashCode(), ctx.LT2().toString());

            if(ctx.GT2() != null)
                myStatement.put(ctx.GT2().getSourceInterval().hashCode(), ctx.GT2().toString());

            if(ctx.AMP() != null)

                myStatement.put(ctx.AMP().getSourceInterval().hashCode(), ctx.AMP().toString());

            if(ctx.PIPE() != null)
                myStatement.put(ctx.PIPE().getSourceInterval().hashCode(), ctx.PIPE().toString());

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

        public void enterDropTable(sqliteParser.DropTableContext ctx) {
            status.add(5);
            if(ctx.K_DROP() != null)
                myStatement.put(ctx.K_DROP().getSourceInterval().hashCode(), ctx.K_DROP().toString());

            if(ctx.K_TABLE() != null)
                myStatement.put(ctx.K_TABLE().getSourceInterval().hashCode(), ctx.K_TABLE().toString());
        }

        public void enterSelectCore(sqliteParser.SelectCoreContext ctx) {

            myStatement.put(ctx.K_SELECT().getSourceInterval().hashCode(),ctx.K_SELECT().toString());
            if(ctx.K_FROM() != null)
                myStatement.put(ctx.K_FROM().getSourceInterval().hashCode(), ctx.K_FROM().toString());

            if(ctx.K_WHERE() != null)
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());

        }

        public void enterColumnAlias (sqliteParser.ColumnAliasContext ctx) {
            if(ctx.IDENTIFIER() != null)
                myStatement.put(ctx.IDENTIFIER().getSourceInterval().hashCode(), ctx.IDENTIFIER().toString());

            else
                myStatement.put(ctx.STRING_LITERAL().getSourceInterval().hashCode(), ctx.STRING_LITERAL().toString());
        }

        public Map<Integer, String> getMyStatement() {
            return myStatement;
        }

    }
}
