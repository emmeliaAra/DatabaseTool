import org.antlr.v4.runtime.misc.Interval;

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
        @Override
        public void enterGetTableAlias(sqliteParser.GetTableAliasContext ctx) {
            myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        @Override
        public void enterTypeName (sqliteParser.TypeNameContext ctx) {
            if(ctx.INT() != null)
                myStatement.put(ctx.INT().getSourceInterval().hashCode(),ctx.INT().toString());

            if(ctx.INTEGER() != null)
                myStatement.put(ctx.INTEGER().getSourceInterval().hashCode(),ctx.INTEGER().toString());

            if(ctx.TINYINT() != null)
                myStatement.put(ctx.TINYINT().getSourceInterval().hashCode(), ctx.TINYINT().toString());

            if(ctx.SMALLINT() != null)
                myStatement.put(ctx.SMALLINT().getSourceInterval().hashCode(),ctx.SMALLINT().toString());

            if(ctx.MEDIUMINT() != null)
                myStatement.put(ctx.MEDIUMINT().getSourceInterval().hashCode(),ctx.MEDIUMINT().toString());

            if(ctx.BIGINT() != null)
                myStatement.put(ctx.BIGINT().getSourceInterval().hashCode(),ctx.BIGINT().toString());

            if(ctx.UNSIGNED() != null)
                myStatement.put(ctx.UNSIGNED().getSourceInterval().hashCode(),ctx.UNSIGNED().toString());

            if(ctx.BIG() != null)
                myStatement.put(ctx.BIG().getSourceInterval().hashCode(),ctx.BIG().toString());

            if(ctx.TEXT() != null)
                myStatement.put(ctx.TEXT().getSourceInterval().hashCode(),ctx.TEXT().toString());

            if(ctx.BLOB() != null)
                myStatement.put(ctx.BLOB().getSourceInterval().hashCode(),ctx.BLOB().toString());

            if(ctx.REAL() != null)
                myStatement.put(ctx.REAL().getSourceInterval().hashCode(),ctx.REAL().toString());

            if(ctx.DOUBLE() != null)
                myStatement.put(ctx.DOUBLE().getSourceInterval().hashCode(),ctx.DOUBLE().toString());

            if(ctx.FLOAT() != null)
                myStatement.put(ctx.FLOAT().getSourceInterval().hashCode(),ctx.FLOAT().toString());

            if(ctx.NUMERIC() != null)
                myStatement.put(ctx.NUMERIC().getSourceInterval().hashCode(),ctx.NUMERIC().toString());

            if(ctx.BOOLEAN() != null)
                myStatement.put(ctx.BOOLEAN().getSourceInterval().hashCode(),ctx.BOOLEAN().toString());

            if(ctx.DATE() != null)
                myStatement.put(ctx.DATE().getSourceInterval().hashCode(),ctx.DATE().toString());

            if(ctx.DATETIME() != null)
                myStatement.put(ctx.DATETIME().getSourceInterval().hashCode(),ctx.DATETIME().toString());
        }

        public void enterTypeNameWithBrackets(sqliteParser.TypeNameWithBracketsContext ctx) {
            if(ctx.CHARACTER() != null)
                myStatement.put(ctx.CHARACTER().getSourceInterval().hashCode(),ctx.CHARACTER().toString());

            if(ctx.VARCHAR() != null)
                myStatement.put(ctx.VARCHAR().getSourceInterval().hashCode(),ctx.VARCHAR().toString());

            if(ctx.NCHAR() != null)
                myStatement.put(ctx.NCHAR().getSourceInterval().hashCode(), ctx.NCHAR().toString());

            if(ctx.NVARCHAR() != null)
                myStatement.put(ctx.NVARCHAR().getSourceInterval().hashCode(), ctx.NVARCHAR().toString());

            if(ctx.DECIMAL() != null)
                myStatement.put(ctx.DECIMAL().getSourceInterval().hashCode(), ctx.DECIMAL().toString());
        }

        public void enterSignedNumber(sqliteParser.SignedNumberContext ctx) {
            if(ctx.PLUS() != null)
                myStatement.put(ctx.PLUS().getSourceInterval().hashCode(), ctx.PLUS().toString());

            if(ctx.MINUS() != null)
                myStatement.put(ctx.MINUS().getSourceInterval().hashCode(), ctx.MINUS().toString());

            myStatement.put(ctx.NUMERIC_LITERAL().getSourceInterval().hashCode(),ctx.NUMERIC_LITERAL().toString());
        }

        public void enterSelectStatement(sqliteParser.SelectStatementContext ctx) {
            status.add(9);
            if(ctx.K_WITH() != null)
                myStatement.put(ctx.K_WITH().getSourceInterval().hashCode(),ctx.K_WITH().toString());

            if(ctx.K_ORDER() != null)
                myStatement.put(ctx.K_ORDER().getSourceInterval().hashCode(), ctx.K_ORDER().toString());

            if(ctx.K_BY() != null)
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());

            if(ctx.K_LIMIT() != null)
                myStatement.put(ctx.K_LIMIT().getSourceInterval().hashCode(), ctx.K_LIMIT().toString());

            if(ctx.K_OFFSET() != null)
                myStatement.put(ctx.K_OFFSET().getSourceInterval().hashCode(), ctx.K_OFFSET().toString());
        }

        public void enterCommonTableExpression (sqliteParser.CommonTableExpressionContext ctx) {
            if(ctx.K_AS() != null)
                myStatement.put(ctx.K_AS().getSourceInterval().hashCode(), ctx.K_AS().toString());
        }

        public void enterSelectOrValues (sqliteParser.SelectOrValuesContext ctx) {

            myStatement.put(ctx.K_SELECT().getSourceInterval().hashCode(),ctx.K_SELECT().toString());

            if(ctx.K_DISTINCT() != null)
                myStatement.put(ctx.K_DISTINCT().getSourceInterval().hashCode(), ctx.K_DISTINCT().toString());

            if(ctx.K_ALL() != null)
                myStatement.put(ctx.K_ALL().getSourceInterval().hashCode(), ctx.K_ALL().toString());

            if(ctx.K_FROM() != null)
                myStatement.put(ctx.K_FROM().getSourceInterval().hashCode(), ctx.K_FROM().toString());

            if(ctx.K_WHERE() != null)
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());

            if(ctx.K_GROUP() != null)
                myStatement.put(ctx.K_GROUP().getSourceInterval().hashCode(), ctx.K_GROUP().toString());

            if(ctx.K_BY() != null)
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());

            if(ctx.K_HAVING() != null)
                myStatement.put(ctx.K_HAVING().getSourceInterval().hashCode(), ctx.K_HAVING().toString());
        }

        public void enterMyStar(sqliteParser.MyStarContext ctx) {
            myStatement.put(ctx.STAR().getSourceInterval().hashCode(),ctx.STAR().toString());
        }

        @Override
        public void enterExpressionAlias(sqliteParser.ExpressionAliasContext ctx) {
            if(ctx.K_AS() != null)
                myStatement.put(ctx.K_AS().getSourceInterval().hashCode(), ctx.K_AS().toString());
        }

        public void enterLiteralValue(sqliteParser.LiteralValueContext ctx) {
            if(ctx.NUMERIC_LITERAL() != null)
                myStatement.put(ctx.NUMERIC_LITERAL().getSourceInterval().hashCode(),ctx.NUMERIC_LITERAL().toString());

            else if(ctx.STRING_LITERAL() != null)
                myStatement.put(ctx.STRING_LITERAL().getSourceInterval().hashCode(), ctx.STRING_LITERAL().toString());

            else if (ctx.BLOB_LITERAL() != null)
                myStatement.put(ctx.BLOB_LITERAL().getSourceInterval().hashCode(), ctx.BLOB_LITERAL().toString());

            else if(ctx.K_NULL() != null)
               myStatement.put(ctx.K_NULL().getSourceInterval().hashCode(), ctx.K_NULL().toString());

            else if(ctx.K_CURRENT_TIME() != null)
                myStatement.put(ctx.K_CURRENT_TIME().getSourceInterval().hashCode(), ctx.K_CURRENT_TIME().toString());

            else if(ctx.K_CURRENT_DATE() != null)
            myStatement.put(ctx.K_CURRENT_DATE().getSourceInterval().hashCode(), ctx.K_CURRENT_DATE().toString());

            else
                myStatement.put(ctx.K_CURRENT_TIMESTAMP().getSourceInterval().hashCode(), ctx.K_CURRENT_TIMESTAMP().toString());
        }

        public void enterUnaryOperator(sqliteParser.UnaryOperatorContext ctx) {
            if(ctx.MINUS() != null)
                myStatement.put(ctx.MINUS().getSourceInterval().hashCode(), ctx.MINUS().toString());

            else if(ctx.PLUS() != null)
                myStatement.put(ctx.PLUS().getSourceInterval().hashCode(), ctx.PLUS().toString());

            else if(ctx.TILDE() != null)
                myStatement.put(ctx.TILDE().getSourceInterval().hashCode(), ctx.TILDE().toString());

            else
                myStatement.put(ctx.K_NOT().getSourceInterval().hashCode(), ctx.K_NOT().toString());
        }

        public void enterMyExpression(sqliteParser.MyExpressionContext ctx) {
           if(ctx.literal_value() != null)
               myStatement.put(ctx.literal_value().getSourceInterval().hashCode(), ctx.literal_value().getText());

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

            if(ctx.K_IS() != null)
                myStatement.put(ctx.K_IS().getSourceInterval().hashCode(), ctx.K_IS().toString());

            if(ctx.K_NOT() != null)

                myStatement.put(ctx.K_NOT().getSourceInterval().hashCode(), ctx.K_NOT().toString());

            if(ctx.K_IN() != null)
                myStatement.put(ctx.K_IN().getSourceInterval().hashCode(), ctx.K_IN().toString());

            if(ctx.K_LIKE() != null)
                myStatement.put(ctx.K_LIKE().getSourceInterval().hashCode(),ctx.K_LIKE().toString());

            if(ctx.K_GLOB() != null)
                myStatement.put(ctx.K_GLOB().getSourceInterval().hashCode(), ctx.K_GLOB().toString());

            if(ctx.K_AND() != null)
                myStatement.put(ctx.K_AND().getSourceInterval().hashCode(),ctx.K_AND().toString());

            if(ctx.K_OR() != null)
                myStatement.put(ctx.K_OR().getSourceInterval().hashCode(),ctx.K_OR().toString());

          /*  if(ctx.K_DISTINCT() != null)
                myKeywords.put(ctx.K_DISTINCT().getSourceInterval(),ctx.K_DISTINCT().toString());*/
            if (ctx.K_CAST()  != null)
                myStatement.put(ctx.K_CAST().getSourceInterval().hashCode(), ctx.K_CAST().toString());

            if(ctx.K_AS() != null)
                myStatement.put(ctx.K_AS().getSourceInterval().hashCode(),ctx.K_AS().toString());

            if(ctx.K_BETWEEN() != null)
                myStatement.put(ctx.K_BETWEEN().getSourceInterval().hashCode(),ctx.K_BETWEEN().toString());

            if (ctx.K_EXISTS()  != null)
                myStatement.put(ctx.K_EXISTS().getSourceInterval().hashCode(), ctx.K_EXISTS().toString());

            if(ctx.K_WHEN(0) != null)
                myStatement.put(ctx.K_WHEN(0).getSourceInterval().hashCode(), ctx.K_WHEN().toString());

            if(ctx.K_THEN(0) != null)
                myStatement.put(ctx.K_THEN(0).getSourceInterval().hashCode(), ctx.K_THEN().toString());

            if(ctx.K_ELSE() != null)
                myStatement.put(ctx.K_ELSE().getSourceInterval().hashCode(),ctx.K_ELSE().toString());

            if(ctx.K_END() != null)
                myStatement.put(ctx.K_END().getSourceInterval().hashCode(), ctx.K_END().toString());
        }

        @Override
        public void enterOrderingTerm(sqliteParser.OrderingTermContext ctx) {
            if(ctx.K_ASC() != null)
                myStatement.put(ctx.K_ASC().getSourceInterval().hashCode(), ctx.K_ASC().toString());
            else
                myStatement.put(ctx.K_DESC().getSourceInterval().hashCode(), ctx.K_DESC().toString());
        }

        @Override
        public void enterTableORSubqueryA(sqliteParser.TableORSubqueryAContext ctx) {
            if(ctx.K_AS() != null)
                myStatement.put(ctx.K_AS().getSourceInterval().hashCode(), ctx.K_AS().toString());
        }

        public void enterJoinOperator(sqliteParser.JoinOperatorContext ctx) {
            if(ctx.K_NATURAL() != null)
                myStatement.put(ctx.K_NATURAL().getSourceInterval().hashCode(), ctx.K_NATURAL().toString());

            if(ctx.K_LEFT() != null)
                myStatement.put(ctx.K_LEFT().getSourceInterval().hashCode(), ctx.K_LEFT().toString());

            else if(ctx.K_INNER() != null)
                myStatement.put(ctx.K_INNER().getSourceInterval().hashCode(), ctx.K_INNER().toString());

            else if(ctx.K_CROSS() != null)
                myStatement.put(ctx.K_CROSS().getSourceInterval().hashCode(), ctx.K_CROSS().toString());

            if(ctx.K_OUTER() != null)
                myStatement.put(ctx.K_OUTER().getSourceInterval().hashCode(), ctx.K_OUTER().toString());

            myStatement.put(ctx.K_JOIN().getSourceInterval().hashCode(),ctx.K_JOIN().toString());
        }

        public void enterJoinConstraint(sqliteParser.JoinConstraintContext ctx) {
            if(ctx.K_ON() != null)
                myStatement.put(ctx.K_ON().getSourceInterval().hashCode(), ctx.K_ON().toString());
            else
            {
                if(ctx.K_USING() != null)
                    myStatement.put(ctx.K_USING().getSourceInterval().hashCode(), ctx.K_USING().toString());
            }
        }

        public void enterDropTable(sqliteParser.DropTableContext ctx) {
            status.add(5);
            if(ctx.K_DROP() != null)
                myStatement.put(ctx.K_DROP().getSourceInterval().hashCode(), ctx.K_DROP().toString());

            if(ctx.K_TABLE() != null)
                myStatement.put(ctx.K_TABLE().getSourceInterval().hashCode(), ctx.K_TABLE().toString());

            if(ctx.K_IF() != null)
                myStatement.put(ctx.K_IF().getSourceInterval().hashCode(),ctx.K_IF().toString());

            if(ctx.K_EXISTS() != null)
                myStatement.put(ctx.K_EXISTS().getSourceInterval().hashCode(), ctx.K_EXISTS().toString());
        }

        public void enterFactoredSelectStatement(sqliteParser.FactoredSelectStatementContext ctx) {
            status.add(6);
            if(ctx.K_ORDER() != null)
                myStatement.put(ctx.K_ORDER().getSourceInterval().hashCode(), ctx.K_ORDER().toString());

            if(ctx.K_BY() != null)
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());

            if(ctx.K_LIMIT() != null)
                myStatement.put(ctx.K_LIMIT().getSourceInterval().hashCode(), ctx.K_LIMIT().toString());

            if(ctx.K_OFFSET() != null)
                myStatement.put(ctx.K_OFFSET().getSourceInterval().hashCode(), ctx.K_OFFSET().toString());

            if(ctx.K_WITH() != null)
                myStatement.put(ctx.K_WITH().getSourceInterval().hashCode(), ctx.K_WITH().toString());
        }

        public void enterSelectCore(sqliteParser.SelectCoreContext ctx) {

            myStatement.put(ctx.K_SELECT().getSourceInterval().hashCode(),ctx.K_SELECT().toString());

            if(ctx.K_DISTINCT() != null)
                myStatement.put(ctx.K_DISTINCT().getSourceInterval().hashCode(), ctx.K_DISTINCT().toString());

            if(ctx.K_ALL() != null)
                myStatement.put(ctx.K_ALL().getSourceInterval().hashCode(), ctx.K_ALL().toString());

            if(ctx.K_FROM() != null)
                myStatement.put(ctx.K_FROM().getSourceInterval().hashCode(), ctx.K_FROM().toString());

            if(ctx.K_WHERE() != null)
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());

            if(ctx.K_GROUP() != null)
                myStatement.put(ctx.K_GROUP().getSourceInterval().hashCode(), ctx.K_GROUP().toString());

            if(ctx.K_BY() != null)
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());

            if(ctx.K_HAVING() != null)
                myStatement.put(ctx.K_HAVING().getSourceInterval().hashCode(), ctx.K_HAVING().toString());
        }

        public void enterCompoundOperator(sqliteParser.CompoundOperatorContext ctx) {
            if(ctx.K_UNION() != null)
                myStatement.put(ctx.K_UNION().getSourceInterval().hashCode(), ctx.K_UNION().toString());

            if(ctx.K_ALL() != null)
                myStatement.put(ctx.K_ALL().getSourceInterval().hashCode(), ctx.K_ALL().toString());

            if(ctx.K_INTERSECT() != null)
                myStatement.put(ctx.K_INTERSECT().getSourceInterval().hashCode(),ctx.K_INTERSECT().toString());

            if(ctx.K_EXCEPT() != null)
                myStatement.put(ctx.K_EXCEPT().getSourceInterval().hashCode(), ctx.K_EXCEPT().toString());
        }

        public  void enterSimpleSelectStatement (sqliteParser.SimpleSelectStatementContext ctx) {
            status.add(8);
            if(ctx.K_WITH() != null)
                myStatement.put(ctx.K_WITH().getSourceInterval().hashCode(), ctx.K_WITH().toString());

            if(ctx.K_ORDER() != null)
                myStatement.put(ctx.K_ORDER().getSourceInterval().hashCode(),ctx.K_ORDER().toString());

            if(ctx.K_BY() != null)
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());

            if(ctx.K_LIMIT() != null)
                myStatement.put(ctx.K_LIMIT().getSourceInterval().hashCode(), ctx.K_LIMIT().toString());

            if(ctx.K_WITH() != null)
                myStatement.put(ctx.K_OFFSET().getSourceInterval().hashCode(), ctx.K_OFFSET().toString());
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

