import org.antlr.v4.runtime.misc.Interval;

import java.util.*;

public class MyListener {

    public static class MyInnerListener extends sqliteBaseListener
    {
        private Map<Integer, String> myStatement = new TreeMap<>();
        private sqliteParser myParser;

        public MyInnerListener(sqliteParser myParser) {
            this.myParser = myParser;
        }

        @Override
        public void enterGetDot(sqliteParser.GetDotContext ctx) {
            if(ctx.DOT()!=null)
                myStatement.put(ctx.DOT().getSourceInterval().hashCode(), ctx.DOT().toString());
        }

        @Override
        public void enterGetComma(sqliteParser.GetCommaContext ctx) {
            if(ctx.COMMA()!=null)
                myStatement.put(ctx.COMMA().getSourceInterval().hashCode(), ctx.COMMA().toString());
        }

        @Override
        public void enterGetOpenPar(sqliteParser.GetOpenParContext ctx) {
            if(ctx.OPEN_PAR()!=null)
                myStatement.put(ctx.OPEN_PAR().getSourceInterval().hashCode(), ctx.OPEN_PAR().toString());
        }

        @Override
        public void enterGetClosePar(sqliteParser.GetCloseParContext ctx) {
            if(ctx.CLOSE_PAR()!=null)
                myStatement.put(ctx.CLOSE_PAR().getSourceInterval().hashCode(), ctx.CLOSE_PAR().toString());
        }

        @Override
        public void enterGetSCOL(sqliteParser.GetSCOLContext ctx) {
            if(ctx.SCOL()!=null)
                myStatement.put(ctx.SCOL().getSourceInterval().hashCode(), ctx.SCOL().toString());
        }

        @Override
        public void  enterGetAssign(sqliteParser.GetAssignContext ctx) {
            if(ctx.ASSIGN()!=null)
                myStatement.put(ctx.ASSIGN().getSourceInterval().hashCode(), ctx.ASSIGN().toString());
        }

        public void enterGetDatabaseName(sqliteParser.GetDatabaseNameContext ctx) {
            if(ctx.any_name()!=null)
                myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        public void enterGetTableName(sqliteParser.GetTableNameContext ctx) {
            if(ctx.any_name()!=null)
                myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }


        @Override
        public void enterGetColumnName(sqliteParser.GetColumnNameContext ctx) {
            if(ctx.any_name()!=null)
                myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        public void enterMyStar(sqliteParser.MyStarContext ctx) {
            if(ctx.STAR()!=null)
                myStatement.put(ctx.STAR().getSourceInterval().hashCode(),ctx.STAR().toString());
        }

        public void enterLiteralValue(sqliteParser.LiteralValueContext ctx) {
            if(ctx.NUMERIC_LITERAL() != null)
                myStatement.put(ctx.NUMERIC_LITERAL().getSourceInterval().hashCode(),ctx.NUMERIC_LITERAL().toString());

            else if(ctx.STRING_LITERAL() != null)
                myStatement.put(ctx.STRING_LITERAL().getSourceInterval().hashCode(), ctx.STRING_LITERAL().toString());

        }

        public void enterUnaryOperator(sqliteParser.UnaryOperatorContext ctx) {
            if(ctx.MINUS() != null)
                myStatement.put(ctx.MINUS().getSourceInterval().hashCode(), ctx.MINUS().toString());

            else if(ctx.PLUS() != null)
                myStatement.put(ctx.PLUS().getSourceInterval().hashCode(), ctx.PLUS().toString());
        }

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

        public void enterDropTable(sqliteParser.DropTableContext ctx) {
            if(ctx.K_DROP() != null)
                myStatement.put(ctx.K_DROP().getSourceInterval().hashCode(), ctx.K_DROP().toString());

            if(ctx.K_TABLE() != null)
                myStatement.put(ctx.K_TABLE().getSourceInterval().hashCode(), ctx.K_TABLE().toString());
        }

        public void enterSelectCore(sqliteParser.SelectCoreContext ctx) {

            if(ctx.K_SELECT()!= null)
                myStatement.put(ctx.K_SELECT().getSourceInterval().hashCode(),ctx.K_SELECT().toString());

            if(ctx.K_FROM() != null)
                myStatement.put(ctx.K_FROM().getSourceInterval().hashCode(), ctx.K_FROM().toString());

            if(ctx.K_WHERE() != null)
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());
        }

        public Map<Integer, String> getMyStatement() {
            return myStatement;
        }

    }
}