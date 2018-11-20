import org.antlr.v4.runtime.misc.Interval;

import java.util.*;

public class MyListener {

    public static class MyInnerListener extends sqliteBaseListener
    {
        private Map<Integer, String> myStatement = new TreeMap<>();
        private HashMap<Interval, String> myKeywords = new HashMap<>();
        private HashMap<Interval, String> myDatabaseNames = new HashMap<>();
        private HashMap<Interval, String> myTableNames = new HashMap<>();
        private HashMap<Interval, String> myColumnNames = new HashMap<>();
        private HashMap<Interval, String> myTableAlias = new HashMap<>();
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
            myDatabaseNames.put(ctx.any_name().getSourceInterval(),ctx.any_name().getText());
            myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        public void enterGetTableName(sqliteParser.GetTableNameContext ctx) {
            myTableNames.put(ctx.any_name().getSourceInterval(),ctx.any_name().getText());
            myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        @Override
        public void enterGetNewTableName(sqliteParser.GetNewTableNameContext ctx) {
            myTableNames.put(ctx.any_name().getSourceInterval(),ctx.any_name().getText());
            myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        @Override
        public void enterGetColumnName(sqliteParser.GetColumnNameContext ctx) {
            myColumnNames.put(ctx.any_name().getSourceInterval(),ctx.any_name().getText());
            myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }
        @Override
        public void enterGetForeignTableName(sqliteParser.GetForeignTableNameContext ctx) {
            myTableNames.put(ctx.any_name().getSourceInterval(),ctx.any_name().getText());
            myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }
        @Override
        public void enterGetTableAlias(sqliteParser.GetTableAliasContext ctx) {
            myTableAlias.put(ctx.any_name().getSourceInterval(),ctx.any_name().getText());
            myStatement.put(ctx.any_name().getSourceInterval().hashCode(),ctx.any_name().getText());
        }

        @Override
        public void enterAlterTable(sqliteParser.AlterTableContext ctx) {

            status.add(0);

            if(ctx.K_ALTER() != null){
                myKeywords.put(ctx.K_ALTER().getSourceInterval(),ctx.K_ALTER().toString());
                myStatement.put(ctx.K_ALTER().getSourceInterval().hashCode(),ctx.K_ALTER().toString());
            }
            if(ctx.K_TABLE()!= null){
                myKeywords.put(ctx.K_TABLE().getSourceInterval(),ctx.K_TABLE().toString());
                myStatement.put(ctx.K_TABLE().getSourceInterval().hashCode(),ctx.K_TABLE().toString());
            }
            if(ctx.K_RENAME() != null){
                myKeywords.put(ctx.K_RENAME().getSourceInterval(),ctx.K_RENAME().toString());
                myStatement.put(ctx.K_RENAME().getSourceInterval().hashCode(),ctx.K_RENAME().toString());
            }
            if(ctx.K_TO() != null) {
                myKeywords.put(ctx.K_TO().getSourceInterval(), ctx.K_TO().toString());
                myStatement.put(ctx.K_TO().getSourceInterval().hashCode(),ctx.K_TO().toString());
            }
            if(ctx.K_ADD() != null) {
                myKeywords.put(ctx.K_ADD().getSourceInterval(), ctx.K_ADD().toString());
                myStatement.put(ctx.K_ADD().getSourceInterval().hashCode(), ctx.K_ADD().toString());
            }
            if(ctx.K_COLUMN() != null) {
                myKeywords.put(ctx.K_COLUMN().getSourceInterval(), ctx.K_COLUMN().toString());
                myStatement.put(ctx.K_COLUMN().getSourceInterval().hashCode(), ctx.K_COLUMN().toString());
            }
        }

        @Override // theli allama se type name
        public void enterTypeName (sqliteParser.TypeNameContext ctx) {
            if(ctx.INT() != null){
                myKeywords.put(ctx.INT().getSourceInterval(),ctx.INT().toString());
                myStatement.put(ctx.INT().getSourceInterval().hashCode(),ctx.INT().toString());
            }
            if(ctx.INTEGER() != null){
                myKeywords.put(ctx.INTEGER().getSourceInterval(),ctx.INTEGER().toString());
                myStatement.put(ctx.INTEGER().getSourceInterval().hashCode(),ctx.INTEGER().toString());
            }
            if(ctx.TINYINT() != null) {
                myKeywords.put(ctx.TINYINT().getSourceInterval(), ctx.TINYINT().toString());
                myStatement.put(ctx.TINYINT().getSourceInterval().hashCode(), ctx.TINYINT().toString());
            }
            if(ctx.SMALLINT() != null) {
                myKeywords.put(ctx.SMALLINT().getSourceInterval(),ctx.SMALLINT().toString());
                myStatement.put(ctx.SMALLINT().getSourceInterval().hashCode(),ctx.SMALLINT().toString());
            }
            if(ctx.MEDIUMINT() != null){
                myKeywords.put(ctx.MEDIUMINT().getSourceInterval(),ctx.MEDIUMINT().toString());
                myStatement.put(ctx.MEDIUMINT().getSourceInterval().hashCode(),ctx.MEDIUMINT().toString());
            }
            if(ctx.BIGINT() != null){
                myKeywords.put(ctx.BIGINT().getSourceInterval(),ctx.BIGINT().toString());
                myStatement.put(ctx.BIGINT().getSourceInterval().hashCode(),ctx.BIGINT().toString());
            }
            if(ctx.UNSIGNED() != null){
                myKeywords.put(ctx.UNSIGNED().getSourceInterval(),ctx.UNSIGNED().toString());
                myStatement.put(ctx.UNSIGNED().getSourceInterval().hashCode(),ctx.UNSIGNED().toString());
            }
            if(ctx.BIG() != null){
                myKeywords.put(ctx.BIG().getSourceInterval(),ctx.BIG().toString());
                myStatement.put(ctx.BIG().getSourceInterval().hashCode(),ctx.BIG().toString());
            }
            if(ctx.TEXT() != null){
                myKeywords.put(ctx.TEXT().getSourceInterval(),ctx.TEXT().toString());
                myStatement.put(ctx.TEXT().getSourceInterval().hashCode(),ctx.TEXT().toString());
            }
            if(ctx.BLOB() != null){
                myKeywords.put(ctx.BLOB().getSourceInterval(),ctx.BLOB().toString());
                myStatement.put(ctx.BLOB().getSourceInterval().hashCode(),ctx.BLOB().toString());
            }
            if(ctx.REAL() != null){
                myKeywords.put(ctx.REAL().getSourceInterval(),ctx.REAL().toString());
                myStatement.put(ctx.REAL().getSourceInterval().hashCode(),ctx.REAL().toString());
            }
            if(ctx.DOUBLE() != null){
                myKeywords.put(ctx.DOUBLE().getSourceInterval(),ctx.DOUBLE().toString());
                myStatement.put(ctx.DOUBLE().getSourceInterval().hashCode(),ctx.DOUBLE().toString());
            }
            if(ctx.FLOAT() != null){
                myKeywords.put(ctx.FLOAT().getSourceInterval(),ctx.FLOAT().toString());
                myStatement.put(ctx.FLOAT().getSourceInterval().hashCode(),ctx.FLOAT().toString());
            }
            if(ctx.NUMERIC() != null){
                myKeywords.put(ctx.NUMERIC().getSourceInterval(),ctx.NUMERIC().toString());
                myStatement.put(ctx.NUMERIC().getSourceInterval().hashCode(),ctx.NUMERIC().toString());
            }
            if(ctx.BOOLEAN() != null){
                myKeywords.put(ctx.BOOLEAN().getSourceInterval(),ctx.BOOLEAN().toString());
                myStatement.put(ctx.BOOLEAN().getSourceInterval().hashCode(),ctx.BOOLEAN().toString());
            }
            if(ctx.DATE() != null){
                myKeywords.put(ctx.DATE().getSourceInterval(),ctx.DATE().toString());
                myStatement.put(ctx.DATE().getSourceInterval().hashCode(),ctx.DATE().toString());
            }
            if(ctx.DATETIME() != null){
                myKeywords.put(ctx.DATETIME().getSourceInterval(),ctx.DATETIME().toString());
                myStatement.put(ctx.DATETIME().getSourceInterval().hashCode(),ctx.DATETIME().toString());
            }
        }

        public void enterTypeNameWithBrackets(sqliteParser.TypeNameWithBracketsContext ctx) {
            if(ctx.CHARACTER() != null){
                myKeywords.put(ctx.CHARACTER().getSourceInterval(),ctx.CHARACTER().toString());
                myStatement.put(ctx.CHARACTER().getSourceInterval().hashCode(),ctx.CHARACTER().toString());
            }
            if(ctx.VARCHAR() != null){
                myKeywords.put(ctx.VARCHAR().getSourceInterval(),ctx.VARCHAR().toString());
                myStatement.put(ctx.VARCHAR().getSourceInterval().hashCode(),ctx.VARCHAR().toString());
            }
            if(ctx.NCHAR() != null) {
                myKeywords.put(ctx.NCHAR().getSourceInterval(), ctx.NCHAR().toString());
                myStatement.put(ctx.NCHAR().getSourceInterval().hashCode(), ctx.NCHAR().toString());
            }
            if(ctx.NVARCHAR() != null) {
                myKeywords.put(ctx.NVARCHAR().getSourceInterval(), ctx.NVARCHAR().toString());
                myStatement.put(ctx.NVARCHAR().getSourceInterval().hashCode(), ctx.NVARCHAR().toString());
            }
            if(ctx.DECIMAL() != null) {
                myKeywords.put(ctx.DECIMAL().getSourceInterval(), ctx.DECIMAL().toString());
                myStatement.put(ctx.DECIMAL().getSourceInterval().hashCode(), ctx.DECIMAL().toString());
            }
        }

        public void enterSignedNumber(sqliteParser.SignedNumberContext ctx) {
            if(ctx.PLUS() != null) {
                myKeywords.put(ctx.PLUS().getSourceInterval(), ctx.PLUS().toString());
                myStatement.put(ctx.PLUS().getSourceInterval().hashCode(), ctx.PLUS().toString());
            }
            if(ctx.MINUS() != null) {
                myKeywords.put(ctx.MINUS().getSourceInterval(), ctx.MINUS().toString());
                myStatement.put(ctx.MINUS().getSourceInterval().hashCode(), ctx.MINUS().toString());
            }
            myKeywords.put(ctx.NUMERIC_LITERAL().getSourceInterval(),ctx.NUMERIC_LITERAL().toString());
            myStatement.put(ctx.NUMERIC_LITERAL().getSourceInterval().hashCode(),ctx.NUMERIC_LITERAL().toString());
        }

        public void enterPrimaryKey(sqliteParser.PrimaryKeyContext ctx) {
            if(ctx.K_PRIMARY() !=null ) {
                myKeywords.put(ctx.K_PRIMARY().getSourceInterval(), ctx.K_PRIMARY().toString());
                myStatement.put(ctx.K_PRIMARY().getSourceInterval().hashCode(), ctx.K_PRIMARY().toString());
            }
            if(ctx.K_KEY() != null){
                myKeywords.put(ctx.K_KEY().getSourceInterval(),ctx.K_KEY().toString());
                myStatement.put(ctx.K_KEY().getSourceInterval().hashCode(),ctx.K_KEY().toString());
            }
            if(ctx.K_ASC() != null){
                myKeywords.put(ctx.K_ASC().getSourceInterval(),ctx.K_ASC().toString());
                myStatement.put(ctx.K_ASC().getSourceInterval().hashCode(),ctx.K_ASC().toString());
            }
            if(ctx.K_DESC() != null){
                myKeywords.put(ctx.K_DESC().getSourceInterval(),ctx.K_DESC().toString());
                myStatement.put(ctx.K_DESC().getSourceInterval().hashCode(),ctx.K_DESC().toString());
            }
            if(ctx.K_AUTOINCREMENT() != null){
                myKeywords.put(ctx.K_AUTOINCREMENT().getSourceInterval(),ctx.K_AUTOINCREMENT().toString());
                myStatement.put(ctx.K_AUTOINCREMENT().getSourceInterval().hashCode(),ctx.K_AUTOINCREMENT().toString());
            }
        }

        public void enterNullOrNot(sqliteParser.NullOrNotContext ctx) {
            if(ctx.K_NOT() != null) {
                myKeywords.put(ctx.K_NOT().getSourceInterval(), ctx.K_NOT().toString());
                myStatement.put(ctx.K_NOT().getSourceInterval().hashCode(), ctx.K_NOT().toString());
            }
            if(ctx.K_NULL() != null){
                myKeywords.put(ctx.K_NULL().getSourceInterval(),ctx.K_NULL().toString());
                myStatement.put(ctx.K_NULL().getSourceInterval().hashCode(),ctx.K_NULL().toString());
            }
        }

        public void enterUnique(sqliteParser.UniqueContext ctx) {
            myKeywords.put(ctx.K_UNIQUE().getSourceInterval(),ctx.K_UNIQUE().toString());
            myStatement.put(ctx.K_UNIQUE().getSourceInterval().hashCode(),ctx.K_UNIQUE().toString());
        }

        public void enterReferences (sqliteParser.ReferencesContext ctx) {
            myStatement.put(ctx.K_REFERENCES().getSourceInterval().hashCode(),ctx.K_REFERENCES().toString());
            myKeywords.put(ctx.K_REFERENCES().getSourceInterval(),ctx.K_REFERENCES().toString());
        }

        public void enterCreateTable (sqliteParser.CreateTableContext ctx) {
            status.add(2);
            myKeywords.put(ctx.K_CREATE().getSourceInterval(),ctx.K_CREATE().toString());
            myStatement.put(ctx.K_CREATE().getSourceInterval().hashCode(),ctx.K_CREATE().toString());

            myKeywords.put(ctx.K_TABLE().getSourceInterval(),ctx.K_TABLE().toString());
            myStatement.put(ctx.K_TABLE().getSourceInterval().hashCode(),ctx.K_TABLE().toString());
            if(ctx.K_AS() != null) {
                myKeywords.put(ctx.K_AS().getSourceInterval(), ctx.K_AS().toString());
                myStatement.put(ctx.K_AS().getSourceInterval().hashCode(), ctx.K_AS().toString());
            }
        }

        public void enterTableConstraint (sqliteParser.TableConstraintContext ctx) {
            if(ctx.K_PRIMARY() !=null ){
                myKeywords.put(ctx.K_PRIMARY().getSourceInterval(),ctx.K_PRIMARY().toString());
                myStatement.put(ctx.K_PRIMARY().getSourceInterval().hashCode(),ctx.K_PRIMARY().toString());
            }
            if(ctx.K_KEY() != null){
                myKeywords.put(ctx.K_KEY().getSourceInterval(),ctx.K_KEY().toString());
                myStatement.put(ctx.K_KEY().getSourceInterval().hashCode(),ctx.K_KEY().toString());
            }
            if(ctx.K_UNIQUE() !=null ){
                myKeywords.put(ctx.K_UNIQUE().getSourceInterval(),ctx.K_UNIQUE().toString());
                myStatement.put(ctx.K_UNIQUE().getSourceInterval().hashCode(),ctx.K_UNIQUE().toString());
            }
            if(ctx.K_FOREIGN() != null){
                myKeywords.put(ctx.K_FOREIGN().getSourceInterval(),ctx.K_FOREIGN().toString());
                myStatement.put(ctx.K_FOREIGN().getSourceInterval().hashCode(),ctx.K_FOREIGN().toString());
            }
        }

        public void enterIndexedColumn (sqliteParser.IndexedColumnContext ctx) {
            if(ctx.K_ASC() != null) {
                myKeywords.put(ctx.K_ASC().getSourceInterval(), ctx.K_ASC().toString());
                myStatement.put(ctx.K_ASC().getSourceInterval().hashCode(), ctx.K_ASC().toString());
            }
            else if(ctx.K_DESC() !=null) {
                myKeywords.put(ctx.K_DESC().getSourceInterval(), ctx.K_DESC().toString());
                myStatement.put(ctx.K_DESC().getSourceInterval().hashCode(), ctx.K_DESC().toString());
            }
        }

        public void enterSelectStatement(sqliteParser.SelectStatementContext ctx) {
            status.add(9);
            if(ctx.K_WITH() != null){
                myKeywords.put(ctx.K_WITH().getSourceInterval(),ctx.K_WITH().toString());
                myStatement.put(ctx.K_WITH().getSourceInterval().hashCode(),ctx.K_WITH().toString());
            }
            if(ctx.K_ORDER() != null) {
                myKeywords.put(ctx.K_ORDER().getSourceInterval(), ctx.K_ORDER().toString());
                myStatement.put(ctx.K_ORDER().getSourceInterval().hashCode(), ctx.K_ORDER().toString());
            }
            if(ctx.K_BY() != null) {
                myKeywords.put(ctx.K_BY().getSourceInterval(), ctx.K_BY().toString());
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());
            }
            if(ctx.K_LIMIT() != null) {
                myKeywords.put(ctx.K_LIMIT().getSourceInterval(), ctx.K_LIMIT().toString());
                myStatement.put(ctx.K_LIMIT().getSourceInterval().hashCode(), ctx.K_LIMIT().toString());
            }
            if(ctx.K_OFFSET() != null) {
                myKeywords.put(ctx.K_OFFSET().getSourceInterval(), ctx.K_OFFSET().toString());
                myStatement.put(ctx.K_OFFSET().getSourceInterval().hashCode(), ctx.K_OFFSET().toString());
            }
        }

        public void enterCommonTableExpression (sqliteParser.CommonTableExpressionContext ctx) {
            if(ctx.K_AS() != null) {
                myKeywords.put(ctx.K_AS().getSourceInterval(), ctx.K_AS().toString());
                myStatement.put(ctx.K_AS().getSourceInterval().hashCode(), ctx.K_AS().toString());
            }
        }

        public void enterSelectOrValues (sqliteParser.SelectOrValuesContext ctx) {
            //gt lei m identical code identified. me tto selectCore.
            int a = 0;

            myKeywords.put(ctx.K_SELECT().getSourceInterval(),ctx.K_SELECT().toString());
            myStatement.put(ctx.K_SELECT().getSourceInterval().hashCode(),ctx.K_SELECT().toString());

            if(ctx.K_DISTINCT() != null) {
                myKeywords.put(ctx.K_DISTINCT().getSourceInterval(), ctx.K_DISTINCT().toString());
                myStatement.put(ctx.K_DISTINCT().getSourceInterval().hashCode(), ctx.K_DISTINCT().toString());
            }
            if(ctx.K_ALL() != null) {
                myKeywords.put(ctx.K_ALL().getSourceInterval(), ctx.K_ALL().toString());
                myStatement.put(ctx.K_ALL().getSourceInterval().hashCode(), ctx.K_ALL().toString());
            }
            if(ctx.K_FROM() != null) {
                myKeywords.put(ctx.K_FROM().getSourceInterval(), ctx.K_FROM().toString());
                myStatement.put(ctx.K_FROM().getSourceInterval().hashCode(), ctx.K_FROM().toString());
            }
            if(ctx.K_WHERE() != null) {
                myKeywords.put(ctx.K_WHERE().getSourceInterval(), ctx.K_WHERE().toString());
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());
            }
            if(ctx.K_GROUP() != null) {
                myKeywords.put(ctx.K_GROUP().getSourceInterval(), ctx.K_GROUP().toString());
                myStatement.put(ctx.K_GROUP().getSourceInterval().hashCode(), ctx.K_GROUP().toString());
            }
            if(ctx.K_BY() != null) {
                myKeywords.put(ctx.K_BY().getSourceInterval(), ctx.K_BY().toString());
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());
            }
            if(ctx.K_HAVING() != null) {
                myKeywords.put(ctx.K_HAVING().getSourceInterval(), ctx.K_HAVING().toString());
                myStatement.put(ctx.K_HAVING().getSourceInterval().hashCode(), ctx.K_HAVING().toString());
            }
        }

        public void enterMyStar(sqliteParser.MyStarContext ctx) {
            myColumnNames.put(ctx.STAR().getSourceInterval(),ctx.STAR().toString());
            myStatement.put(ctx.STAR().getSourceInterval().hashCode(),ctx.STAR().toString());
        }

        @Override
        public void enterExpressionAlias(sqliteParser.ExpressionAliasContext ctx) {
            if(ctx.K_AS() != null) {
                myKeywords.put(ctx.K_AS().getSourceInterval(), ctx.K_AS().toString());
                myStatement.put(ctx.K_AS().getSourceInterval().hashCode(), ctx.K_AS().toString());
            }
        }

        public void enterLiteralValue(sqliteParser.LiteralValueContext ctx) {
            if(ctx.NUMERIC_LITERAL() != null){
                myKeywords.put(ctx.NUMERIC_LITERAL().getSourceInterval(),ctx.NUMERIC_LITERAL().toString());
                myStatement.put(ctx.NUMERIC_LITERAL().getSourceInterval().hashCode(),ctx.NUMERIC_LITERAL().toString());
            }
            else if(ctx.STRING_LITERAL() != null) {
                myKeywords.put(ctx.STRING_LITERAL().getSourceInterval(), ctx.STRING_LITERAL().toString());
                myStatement.put(ctx.STRING_LITERAL().getSourceInterval().hashCode(), ctx.STRING_LITERAL().toString());
            }
            else if (ctx.BLOB_LITERAL() != null){
                myKeywords.put(ctx.BLOB_LITERAL().getSourceInterval(), ctx.BLOB_LITERAL().toString());
                myStatement.put(ctx.BLOB_LITERAL().getSourceInterval().hashCode(), ctx.BLOB_LITERAL().toString());
            }
            else if(ctx.K_NULL() != null) {
               myKeywords.put(ctx.K_NULL().getSourceInterval(), ctx.K_NULL().toString());
               myStatement.put(ctx.K_NULL().getSourceInterval().hashCode(), ctx.K_NULL().toString());
            }
            else if(ctx.K_CURRENT_TIME() != null) {
                myKeywords.put(ctx.K_CURRENT_TIME().getSourceInterval(), ctx.K_CURRENT_TIME().toString());
                myStatement.put(ctx.K_CURRENT_TIME().getSourceInterval().hashCode(), ctx.K_CURRENT_TIME().toString());
            }
            else if(ctx.K_CURRENT_DATE() != null) {
            myKeywords.put(ctx.K_CURRENT_DATE().getSourceInterval(), ctx.K_CURRENT_DATE().toString());
            myStatement.put(ctx.K_CURRENT_DATE().getSourceInterval().hashCode(), ctx.K_CURRENT_DATE().toString());
            }
            else{
                myKeywords.put(ctx.K_CURRENT_TIMESTAMP().getSourceInterval(), ctx.K_CURRENT_TIMESTAMP().toString());
                myStatement.put(ctx.K_CURRENT_TIMESTAMP().getSourceInterval().hashCode(), ctx.K_CURRENT_TIMESTAMP().toString());
            }
        }

        public void enterUnaryOperator(sqliteParser.UnaryOperatorContext ctx) {
            if(ctx.MINUS() != null) {
                myKeywords.put(ctx.MINUS().getSourceInterval(), ctx.MINUS().toString());
                myStatement.put(ctx.MINUS().getSourceInterval().hashCode(), ctx.MINUS().toString());
            }
            else if(ctx.PLUS() != null) {
                myKeywords.put(ctx.PLUS().getSourceInterval(), ctx.PLUS().toString());
                myStatement.put(ctx.PLUS().getSourceInterval().hashCode(), ctx.PLUS().toString());
            }
            else if(ctx.TILDE() != null) {
                myKeywords.put(ctx.TILDE().getSourceInterval(), ctx.TILDE().toString());
                myStatement.put(ctx.TILDE().getSourceInterval().hashCode(), ctx.TILDE().toString());
            }
            else {
                myKeywords.put(ctx.K_NOT().getSourceInterval(), ctx.K_NOT().toString());
                myStatement.put(ctx.K_NOT().getSourceInterval().hashCode(), ctx.K_NOT().toString());
            }
        }

        public void enterMyExpression(sqliteParser.MyExpressionContext ctx) {
           if(ctx.literal_value() != null) {
               myKeywords.put(ctx.literal_value().getSourceInterval(), ctx.literal_value().getText());
               myStatement.put(ctx.literal_value().getSourceInterval().hashCode(), ctx.literal_value().getText());
           }
            if(ctx.PIPE2() != null) {
                myKeywords.put(ctx.PIPE2().getSourceInterval(), ctx.PIPE2().toString());
                myStatement.put(ctx.PIPE2().getSourceInterval().hashCode(), ctx.PIPE2().toString());
            }
            if(ctx.STAR() != null) {
                myKeywords.put(ctx.STAR().getSourceInterval(), ctx.STAR().toString());
                myStatement.put(ctx.STAR().getSourceInterval().hashCode(), ctx.STAR().toString());
            }
            if(ctx.DIV() != null){
                myKeywords.put(ctx.DIV().getSourceInterval(),ctx.DIV().toString());
                myStatement.put(ctx.DIV().getSourceInterval().hashCode(),ctx.DIV().toString());
            }
            if(ctx.MOD() != null) {
                myKeywords.put(ctx.MOD().getSourceInterval(), ctx.MOD().toString());
                myStatement.put(ctx.MOD().getSourceInterval().hashCode(), ctx.MOD().toString());
            }
            if(ctx.MINUS() != null) {
                myKeywords.put(ctx.MINUS().getSourceInterval(), ctx.MINUS().toString());
                myStatement.put(ctx.MINUS().getSourceInterval().hashCode(), ctx.MINUS().toString());
            }
            else if(ctx.PLUS() != null) {
                myKeywords.put(ctx.PLUS().getSourceInterval(), ctx.PLUS().toString());
                myStatement.put(ctx.PLUS().getSourceInterval().hashCode(), ctx.PLUS().toString());
            }
            if(ctx.LT2() != null) {
                myKeywords.put(ctx.LT2().getSourceInterval(), ctx.LT2().toString());
                myStatement.put(ctx.LT2().getSourceInterval().hashCode(), ctx.LT2().toString());
            }
            if(ctx.GT2() != null) {
                myKeywords.put(ctx.GT2().getSourceInterval(), ctx.GT2().toString());
                myStatement.put(ctx.GT2().getSourceInterval().hashCode(), ctx.GT2().toString());
            }
            if(ctx.AMP() != null) {
                myKeywords.put(ctx.AMP().getSourceInterval(), ctx.AMP().toString());
                myStatement.put(ctx.AMP().getSourceInterval().hashCode(), ctx.AMP().toString());
            }
            if(ctx.PIPE() != null) {
                myKeywords.put(ctx.PIPE().getSourceInterval(), ctx.PIPE().toString());
                myStatement.put(ctx.PIPE().getSourceInterval().hashCode(), ctx.PIPE().toString());
            }
            if(ctx.LT() != null) {
                myKeywords.put(ctx.LT().getSourceInterval(), ctx.LT().toString());
                myStatement.put(ctx.LT().getSourceInterval().hashCode(), ctx.LT().toString());
            }
            if(ctx.LT_EQ() != null) {
                myKeywords.put(ctx.LT_EQ().getSourceInterval(), ctx.LT_EQ().toString());
                myStatement.put(ctx.LT_EQ().getSourceInterval().hashCode(), ctx.LT_EQ().toString());
            }
            if(ctx.GT() != null) {
                myKeywords.put(ctx.GT().getSourceInterval(), ctx.GT().toString());
                myStatement.put(ctx.GT().getSourceInterval().hashCode(), ctx.GT().toString());
            }

            if(ctx.GT_EQ() != null) {
                myKeywords.put(ctx.GT_EQ().getSourceInterval(), ctx.GT_EQ().toString());
                myStatement.put(ctx.GT_EQ().getSourceInterval().hashCode(), ctx.GT_EQ().toString());
            }
            if(ctx.EQ() != null) {
                myKeywords.put(ctx.EQ().getSourceInterval(), ctx.EQ().toString());
                myStatement.put(ctx.EQ().getSourceInterval().hashCode(), ctx.EQ().toString());
            }
            if(ctx.NOT_EQ1() != null) {
                myKeywords.put(ctx.NOT_EQ1().getSourceInterval(), ctx.NOT_EQ1().toString());
                myStatement.put(ctx.NOT_EQ1().getSourceInterval().hashCode(), ctx.NOT_EQ1().toString());
            }
            if(ctx.NOT_EQ2() != null){
                myKeywords.put(ctx.NOT_EQ2().getSourceInterval(),ctx.NOT_EQ2().toString());
                myStatement.put(ctx.NOT_EQ2().getSourceInterval().hashCode(),ctx.NOT_EQ2().toString());
           }

            if(ctx.K_IS() != null) {
                myKeywords.put(ctx.K_IS().getSourceInterval(), ctx.K_IS().toString());
                myStatement.put(ctx.K_IS().getSourceInterval().hashCode(), ctx.K_IS().toString());
            }
            if(ctx.K_NOT() != null) {
                myKeywords.put(ctx.K_NOT().getSourceInterval(), ctx.K_NOT().toString());
                myStatement.put(ctx.K_NOT().getSourceInterval().hashCode(), ctx.K_NOT().toString());
            }
            if(ctx.K_IN() != null) {
                myKeywords.put(ctx.K_IN().getSourceInterval(), ctx.K_IN().toString());
                myStatement.put(ctx.K_IN().getSourceInterval().hashCode(), ctx.K_IN().toString());
            }
            if(ctx.K_LIKE() != null){
                myKeywords.put(ctx.K_LIKE().getSourceInterval(),ctx.K_LIKE().toString());
                myStatement.put(ctx.K_LIKE().getSourceInterval().hashCode(),ctx.K_LIKE().toString());
           }
            if(ctx.K_GLOB() != null) {
                myKeywords.put(ctx.K_GLOB().getSourceInterval(), ctx.K_GLOB().toString());
                myStatement.put(ctx.K_GLOB().getSourceInterval().hashCode(), ctx.K_GLOB().toString());
            }
            if(ctx.K_AND() != null){
                myKeywords.put(ctx.K_AND().getSourceInterval(),ctx.K_AND().toString());
                myStatement.put(ctx.K_AND().getSourceInterval().hashCode(),ctx.K_AND().toString());
           }
            if(ctx.K_OR() != null){
                myKeywords.put(ctx.K_OR().getSourceInterval(),ctx.K_OR().toString());
                myStatement.put(ctx.K_OR().getSourceInterval().hashCode(),ctx.K_OR().toString());
           }

          /*  if(ctx.K_DISTINCT() != null)
                myKeywords.put(ctx.K_DISTINCT().getSourceInterval(),ctx.K_DISTINCT().toString());*/
            if (ctx.K_CAST()  != null) {
                myKeywords.put(ctx.K_CAST().getSourceInterval(), ctx.K_CAST().toString());
                myStatement.put(ctx.K_CAST().getSourceInterval().hashCode(), ctx.K_CAST().toString());
            }
            if(ctx.K_AS() != null){
                myKeywords.put(ctx.K_AS().getSourceInterval(),ctx.K_AS().toString());
                myStatement.put(ctx.K_AS().getSourceInterval().hashCode(),ctx.K_AS().toString());
            }
            if(ctx.K_BETWEEN() != null){
                myKeywords.put(ctx.K_BETWEEN().getSourceInterval(),ctx.K_BETWEEN().toString());
                myStatement.put(ctx.K_BETWEEN().getSourceInterval().hashCode(),ctx.K_BETWEEN().toString());
            }
            if (ctx.K_EXISTS()  != null) {
                myKeywords.put(ctx.K_EXISTS().getSourceInterval(), ctx.K_EXISTS().toString());
                myStatement.put(ctx.K_EXISTS().getSourceInterval().hashCode(), ctx.K_EXISTS().toString());
            }
            if(ctx.K_WHEN(0) != null) {
                myKeywords.put(ctx.K_WHEN(0).getSourceInterval(), ctx.K_WHEN().toString());
                myStatement.put(ctx.K_WHEN(0).getSourceInterval().hashCode(), ctx.K_WHEN().toString());
            }
            if(ctx.K_THEN(0) != null) {
                myKeywords.put(ctx.K_THEN(0).getSourceInterval(), ctx.K_THEN().toString());
                myStatement.put(ctx.K_THEN(0).getSourceInterval().hashCode(), ctx.K_THEN().toString());
            }
            if(ctx.K_ELSE() != null){
                myKeywords.put(ctx.K_ELSE().getSourceInterval(),ctx.K_ELSE().toString());
                myStatement.put(ctx.K_ELSE().getSourceInterval().hashCode(),ctx.K_ELSE().toString());
            }

            if(ctx.K_END() != null) {
                myKeywords.put(ctx.K_END().getSourceInterval(), ctx.K_END().toString());
                myStatement.put(ctx.K_END().getSourceInterval().hashCode(), ctx.K_END().toString());
            }
        }

        @Override
        public void enterOrderingTerm(sqliteParser.OrderingTermContext ctx) {
            if(ctx.K_ASC() != null) {
                myKeywords.put(ctx.K_ASC().getSourceInterval(), ctx.K_ASC().toString());
                myStatement.put(ctx.K_ASC().getSourceInterval().hashCode(), ctx.K_ASC().toString());
            }
            else {
                myKeywords.put(ctx.K_DESC().getSourceInterval(), ctx.K_DESC().toString());
                myStatement.put(ctx.K_DESC().getSourceInterval().hashCode(), ctx.K_DESC().toString());
            }
        }

        @Override
        public void enterTableORSubqueryA(sqliteParser.TableORSubqueryAContext ctx) {
            if(ctx.K_AS() != null) {
                myKeywords.put(ctx.K_AS().getSourceInterval(), ctx.K_AS().toString());
                myStatement.put(ctx.K_AS().getSourceInterval().hashCode(), ctx.K_AS().toString());
            }
        }

        public void enterJoinOperator(sqliteParser.JoinOperatorContext ctx) {
            if(ctx.K_NATURAL() != null) {
                myKeywords.put(ctx.K_NATURAL().getSourceInterval(), ctx.K_NATURAL().toString());
                myStatement.put(ctx.K_NATURAL().getSourceInterval().hashCode(), ctx.K_NATURAL().toString());
            }
            if(ctx.K_LEFT() != null) {
                myKeywords.put(ctx.K_LEFT().getSourceInterval(), ctx.K_LEFT().toString());
                myStatement.put(ctx.K_LEFT().getSourceInterval().hashCode(), ctx.K_LEFT().toString());
            }
            else if(ctx.K_INNER() != null) {
                myKeywords.put(ctx.K_INNER().getSourceInterval(), ctx.K_INNER().toString());
                myStatement.put(ctx.K_INNER().getSourceInterval().hashCode(), ctx.K_INNER().toString());
            }
            else if(ctx.K_CROSS() != null) {
                myKeywords.put(ctx.K_CROSS().getSourceInterval(), ctx.K_CROSS().toString());
                myStatement.put(ctx.K_CROSS().getSourceInterval().hashCode(), ctx.K_CROSS().toString());
            }
            if(ctx.K_OUTER() != null) {
                myKeywords.put(ctx.K_OUTER().getSourceInterval(), ctx.K_OUTER().toString());
                myStatement.put(ctx.K_OUTER().getSourceInterval().hashCode(), ctx.K_OUTER().toString());
            }
            myKeywords.put(ctx.K_JOIN().getSourceInterval(),ctx.K_JOIN().toString());
            myStatement.put(ctx.K_JOIN().getSourceInterval().hashCode(),ctx.K_JOIN().toString());
        }

        public void enterJoinConstraint(sqliteParser.JoinConstraintContext ctx) {
            if(ctx.K_ON() != null) {
                myKeywords.put(ctx.K_ON().getSourceInterval(), ctx.K_ON().toString());
                myStatement.put(ctx.K_ON().getSourceInterval().hashCode(), ctx.K_ON().toString());
            }
            else
            {
                if(ctx.K_USING() != null) {
                    myKeywords.put(ctx.K_USING().getSourceInterval(), ctx.K_USING().toString());
                    myStatement.put(ctx.K_USING().getSourceInterval().hashCode(), ctx.K_USING().toString());
                }
            }
        }

        public void enterDeleteStatement(sqliteParser.DeleteStatementContext ctx) {
            status.add(3);
            myKeywords.put(ctx.K_DELETE().getSourceInterval(),ctx.K_DELETE().toString());
            myStatement.put(ctx.K_DELETE().getSourceInterval().hashCode(),ctx.K_DELETE().toString());
            myKeywords.put(ctx.K_FROM().getSourceInterval(),ctx.K_FROM().toString());
            myStatement.put(ctx.K_FROM().getSourceInterval().hashCode(),ctx.K_FROM().toString());
            if(ctx.K_WHERE() != null) {
                myKeywords.put(ctx.K_WHERE().getSourceInterval(), ctx.K_WHERE().toString());
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());
            }
        }

        public void enterWithClause (sqliteParser.WithClauseContext ctx) {
            if(ctx.K_AS(0) != null) {
                myKeywords.put(ctx.K_AS(0).getSourceInterval(), ctx.K_AS().toString());
                myStatement.put(ctx.K_AS(0).getSourceInterval().hashCode(), ctx.K_AS().toString());
            }
        }


        public void enterDeleteLimited(sqliteParser.DeleteLimitedContext ctx) {
            status.add(4);
            myKeywords.put(ctx.K_DELETE().getSourceInterval(),ctx.K_DELETE().toString());
            myStatement.put(ctx.K_FROM().getSourceInterval().hashCode(),ctx.K_FROM().toString());
            if(ctx.K_WHERE() != null) {
                myKeywords.put(ctx.K_WHERE().getSourceInterval(), ctx.K_WHERE().toString());
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());
            }
            if(ctx.K_ORDER() != null){
                myKeywords.put(ctx.K_ORDER().getSourceInterval(),ctx.K_ORDER().toString());
                myStatement.put(ctx.K_ORDER().getSourceInterval().hashCode(),ctx.K_ORDER().toString());
            }
            if(ctx.K_BY() != null) {
                myKeywords.put(ctx.K_BY().getSourceInterval(), ctx.K_BY().toString());
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());
            }
            if(ctx.K_LIMIT() != null) {
                myKeywords.put(ctx.K_LIMIT().getSourceInterval(), ctx.K_LIMIT().toString());
                myStatement.put(ctx.K_LIMIT().getSourceInterval().hashCode(), ctx.K_LIMIT().toString());
            }
            if(ctx.K_OFFSET() != null) {
                myKeywords.put(ctx.K_OFFSET().getSourceInterval(), ctx.K_OFFSET().toString());
                myStatement.put(ctx.K_OFFSET().getSourceInterval().hashCode(), ctx.K_OFFSET().toString());
            }
        }

        public void enterDropTable(sqliteParser.DropTableContext ctx) {
            status.add(5);
            if(ctx.K_DROP() != null) {
                myKeywords.put(ctx.K_DROP().getSourceInterval(), ctx.K_DROP().toString());
                myStatement.put(ctx.K_DROP().getSourceInterval().hashCode(), ctx.K_DROP().toString());
            }
            if(ctx.K_TABLE() != null) {
                myKeywords.put(ctx.K_TABLE().getSourceInterval(), ctx.K_TABLE().toString());
                myStatement.put(ctx.K_TABLE().getSourceInterval().hashCode(), ctx.K_TABLE().toString());
            }
            if(ctx.K_IF() != null){
                myKeywords.put(ctx.K_IF().getSourceInterval(),ctx.K_IF().toString());
                myStatement.put(ctx.K_IF().getSourceInterval().hashCode(),ctx.K_IF().toString());}

            if(ctx.K_EXISTS() != null) {
                myKeywords.put(ctx.K_EXISTS().getSourceInterval(), ctx.K_EXISTS().toString());
                myStatement.put(ctx.K_EXISTS().getSourceInterval().hashCode(), ctx.K_EXISTS().toString());
            }
        }

        public void enterFactoredSelectStatement(sqliteParser.FactoredSelectStatementContext ctx) {
            status.add(6);
            if(ctx.K_ORDER() != null) {
                myKeywords.put(ctx.K_ORDER().getSourceInterval(), ctx.K_ORDER().toString());
                myStatement.put(ctx.K_ORDER().getSourceInterval().hashCode(), ctx.K_ORDER().toString());
            }
            if(ctx.K_BY() != null) {
                myKeywords.put(ctx.K_BY().getSourceInterval(), ctx.K_BY().toString());
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());
            }
            if(ctx.K_LIMIT() != null) {
                myKeywords.put(ctx.K_LIMIT().getSourceInterval(), ctx.K_LIMIT().toString());
                myStatement.put(ctx.K_LIMIT().getSourceInterval().hashCode(), ctx.K_LIMIT().toString());
            }
            if(ctx.K_OFFSET() != null) {
                myKeywords.put(ctx.K_OFFSET().getSourceInterval(), ctx.K_OFFSET().toString());
                myStatement.put(ctx.K_OFFSET().getSourceInterval().hashCode(), ctx.K_OFFSET().toString());
            }
            if(ctx.K_WITH() != null){
                myKeywords.put(ctx.K_WITH().getSourceInterval(), ctx.K_WITH().toString());
                myStatement.put(ctx.K_WITH().getSourceInterval().hashCode(), ctx.K_WITH().toString());
            }
        }

        public void enterSelectCore(sqliteParser.SelectCoreContext ctx) {
            myKeywords.put(ctx.K_SELECT().getSourceInterval(),ctx.K_SELECT().toString());
            myStatement.put(ctx.K_SELECT().getSourceInterval().hashCode(),ctx.K_SELECT().toString());

            if(ctx.K_DISTINCT() != null) {
                myKeywords.put(ctx.K_DISTINCT().getSourceInterval(), ctx.K_DISTINCT().toString());
                myStatement.put(ctx.K_DISTINCT().getSourceInterval().hashCode(), ctx.K_DISTINCT().toString());
            }
            if(ctx.K_ALL() != null) {
                myKeywords.put(ctx.K_ALL().getSourceInterval(), ctx.K_ALL().toString());
                myStatement.put(ctx.K_ALL().getSourceInterval().hashCode(), ctx.K_ALL().toString());
            }
            if(ctx.K_FROM() != null) {
                myKeywords.put(ctx.K_FROM().getSourceInterval(), ctx.K_FROM().toString());
                myStatement.put(ctx.K_FROM().getSourceInterval().hashCode(), ctx.K_FROM().toString());
            }
            if(ctx.K_WHERE() != null) {
                myKeywords.put(ctx.K_WHERE().getSourceInterval(), ctx.K_WHERE().toString());
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());
            }
            if(ctx.K_GROUP() != null) {
                myKeywords.put(ctx.K_GROUP().getSourceInterval(), ctx.K_GROUP().toString());
                myStatement.put(ctx.K_GROUP().getSourceInterval().hashCode(), ctx.K_GROUP().toString());
            }
            if(ctx.K_BY() != null) {
                myKeywords.put(ctx.K_BY().getSourceInterval(), ctx.K_BY().toString());
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());
            }
            if(ctx.K_HAVING() != null) {
                myKeywords.put(ctx.K_HAVING().getSourceInterval(), ctx.K_HAVING().toString());
                myStatement.put(ctx.K_HAVING().getSourceInterval().hashCode(), ctx.K_HAVING().toString());
            }
        }

        public void enterCompoundOperator(sqliteParser.CompoundOperatorContext ctx) {
            if(ctx.K_UNION() != null) {
                myKeywords.put(ctx.K_UNION().getSourceInterval(), ctx.K_UNION().toString());
                myStatement.put(ctx.K_UNION().getSourceInterval().hashCode(), ctx.K_UNION().toString());
            }
            if(ctx.K_ALL() != null) {
                myKeywords.put(ctx.K_ALL().getSourceInterval(), ctx.K_ALL().toString());
                myStatement.put(ctx.K_ALL().getSourceInterval().hashCode(), ctx.K_ALL().toString());
            }
            if(ctx.K_INTERSECT() != null){
                myKeywords.put(ctx.K_INTERSECT().getSourceInterval(),ctx.K_INTERSECT().toString());
                myStatement.put(ctx.K_INTERSECT().getSourceInterval().hashCode(),ctx.K_INTERSECT().toString());
            }
            if(ctx.K_EXCEPT() != null) {
                myKeywords.put(ctx.K_EXCEPT().getSourceInterval(), ctx.K_EXCEPT().toString());
                myStatement.put(ctx.K_EXCEPT().getSourceInterval().hashCode(), ctx.K_EXCEPT().toString());
            }
        }

        @Override
        public void enterInsertStatement(sqliteParser.InsertStatementContext ctx) {
            status.add(7);
            if(ctx.K_INSERT() != null) {
                myKeywords.put(ctx.K_INSERT().getSourceInterval(), ctx.K_INSERT().toString());
                myStatement.put(ctx.K_INSERT().getSourceInterval().hashCode(), ctx.K_INSERT().toString());
            }
            if(ctx.K_REPLACE() != null) {
                myKeywords.put(ctx.K_REPLACE().getSourceInterval(), ctx.K_REPLACE().toString());
                myStatement.put(ctx.K_REPLACE().getSourceInterval().hashCode(), ctx.K_REPLACE().toString());
            }
            if(ctx.K_INTO() != null) {
                myKeywords.put(ctx.K_INTO().getSourceInterval(), ctx.K_INTO().toString());
                myStatement.put(ctx.K_INTO().getSourceInterval().hashCode(), ctx.K_INTO().toString());
            }
            if(ctx.K_INTO() != null) {
                myKeywords.put(ctx.K_INTO().getSourceInterval(), ctx.K_INTO().toString());
                myStatement.put(ctx.K_INTO().getSourceInterval().hashCode(), ctx.K_INTO().toString());
            }
            if(ctx.K_VALUES() != null) {
                myKeywords.put(ctx.K_VALUES().getSourceInterval(), ctx.K_VALUES().toString());
                myStatement.put(ctx.K_VALUES().getSourceInterval().hashCode(), ctx.K_VALUES().toString());
            }
        }

        public  void enterSimpleSelectStatement (sqliteParser.SimpleSelectStatementContext ctx) {
            status.add(8);
            if(ctx.K_WITH() != null) {
                myKeywords.put(ctx.K_WITH().getSourceInterval(), ctx.K_WITH().toString());
                myStatement.put(ctx.K_WITH().getSourceInterval().hashCode(), ctx.K_WITH().toString());
            }
            if(ctx.K_ORDER() != null){
                myKeywords.put(ctx.K_ORDER().getSourceInterval(),ctx.K_ORDER().toString());
                myStatement.put(ctx.K_ORDER().getSourceInterval().hashCode(),ctx.K_ORDER().toString());
            }
            if(ctx.K_BY() != null) {
                myKeywords.put(ctx.K_BY().getSourceInterval(), ctx.K_BY().toString());
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());
            }
            if(ctx.K_LIMIT() != null) {
                myKeywords.put(ctx.K_LIMIT().getSourceInterval(), ctx.K_LIMIT().toString());
                myStatement.put(ctx.K_LIMIT().getSourceInterval().hashCode(), ctx.K_LIMIT().toString());
            }
            if(ctx.K_WITH() != null) {
                myKeywords.put(ctx.K_OFFSET().getSourceInterval(), ctx.K_OFFSET().toString());
                myStatement.put(ctx.K_OFFSET().getSourceInterval().hashCode(), ctx.K_OFFSET().toString());
            }
        }

        @Override
        public void enterUpdateStatement(sqliteParser.UpdateStatementContext ctx) {
            status.add(10);
            if(ctx.K_UPDATE() != null){
                myKeywords.put(ctx.K_UPDATE().getSourceInterval(),ctx.K_UPDATE().toString());
                myStatement.put(ctx.K_UPDATE().getSourceInterval().hashCode(),ctx.K_UPDATE().toString());
            }
            if(ctx.K_SET() != null) {
                myKeywords.put(ctx.K_SET().getSourceInterval(), ctx.K_SET().toString());
                myStatement.put(ctx.K_SET().getSourceInterval().hashCode(), ctx.K_SET().toString());
            }
            if(ctx.K_WHERE() != null) {
                myKeywords.put(ctx.K_WHERE().getSourceInterval(), ctx.K_WHERE().toString());
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());
            }
        }

        public void enterUpdateStatementLimited(sqliteParser.UpdateStatementLimitedContext ctx) {
            status.add(11);
            if(ctx.K_UPDATE() != null) {
                myKeywords.put(ctx.K_UPDATE().getSourceInterval(), ctx.K_UPDATE().toString());
                myStatement.put(ctx.K_UPDATE().getSourceInterval().hashCode(), ctx.K_UPDATE().toString());
            }
            if(ctx.K_SET() != null) {
                myKeywords.put(ctx.K_SET().getSourceInterval(), ctx.K_SET().toString());
                myStatement.put(ctx.K_SET().getSourceInterval().hashCode(), ctx.K_SET().toString());
            }
            if(ctx.K_WHERE() != null) {
                myKeywords.put(ctx.K_WHERE().getSourceInterval(), ctx.K_WHERE().toString());
                myStatement.put(ctx.K_WHERE().getSourceInterval().hashCode(), ctx.K_WHERE().toString());
            }
            if(ctx.K_ORDER() != null) {
                myKeywords.put(ctx.K_ORDER().getSourceInterval(), ctx.K_ORDER().toString());
                myStatement.put(ctx.K_ORDER().getSourceInterval().hashCode(), ctx.K_ORDER().toString());
            }
            if(ctx.K_BY() != null) {
                myKeywords.put(ctx.K_BY().getSourceInterval(), ctx.K_BY().toString());
                myStatement.put(ctx.K_BY().getSourceInterval().hashCode(), ctx.K_BY().toString());
            }
            if(ctx.K_LIMIT() != null) {
                myKeywords.put(ctx.K_LIMIT().getSourceInterval(), ctx.K_LIMIT().toString());
                myStatement.put(ctx.K_LIMIT().getSourceInterval().hashCode(), ctx.K_LIMIT().toString());
            }
            if(ctx.K_OFFSET() != null) {
                myKeywords.put(ctx.K_OFFSET().getSourceInterval(), ctx.K_OFFSET().toString());
                myStatement.put(ctx.K_OFFSET().getSourceInterval().hashCode(), ctx.K_OFFSET().toString());
            }
        }

        public void enterColumnAlias (sqliteParser.ColumnAliasContext ctx) {
            if(ctx.IDENTIFIER() != null) {
                myTableAlias.put(ctx.IDENTIFIER().getSourceInterval(), ctx.IDENTIFIER().toString());
                myStatement.put(ctx.IDENTIFIER().getSourceInterval().hashCode(), ctx.IDENTIFIER().toString());
            }
            else {
                myTableAlias.put(ctx.STRING_LITERAL().getSourceInterval(), ctx.STRING_LITERAL().toString());
                myStatement.put(ctx.STRING_LITERAL().getSourceInterval().hashCode(), ctx.STRING_LITERAL().toString());
            }
        }

        public HashMap<Interval, String> getMyKeywords() {
            return myKeywords;
        }

        public HashMap<Interval, String> getMyDatabaseNames() {
            return myDatabaseNames;
        }

        public HashMap<Interval, String> getMyColumnNames() {
            return myColumnNames;
        }

        public HashMap<Interval, String> getMyTableAlias() {
            return myTableAlias;
        }

        public HashMap<Interval, String> getMyTableNames() {
            return myTableNames;
        }
        public Map<Integer, String> getMyStatement() {
            return myStatement;
        }

        public List<Integer> getStatus() {
            return status;
        }
    }
}

