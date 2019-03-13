// Generated from C:/Users/emmel/Desktop/SCC 2016-2017/2018-2019/DatabaseTool/DatabaseTool/src\sqlite.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sqliteParser}.
 */
public interface sqliteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sqliteParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(sqliteParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqliteParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(sqliteParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqliteParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(sqliteParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqliteParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(sqliteParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqliteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(sqliteParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqliteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(sqliteParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link sqliteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(sqliteParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link sqliteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(sqliteParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code none1}
	 * labeled alternative in {@link sqliteParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNone1(sqliteParser.None1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code none1}
	 * labeled alternative in {@link sqliteParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNone1(sqliteParser.None1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code myExpression}
	 * labeled alternative in {@link sqliteParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMyExpression(sqliteParser.MyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code myExpression}
	 * labeled alternative in {@link sqliteParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMyExpression(sqliteParser.MyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code myStar}
	 * labeled alternative in {@link sqliteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterMyStar(sqliteParser.MyStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code myStar}
	 * labeled alternative in {@link sqliteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitMyStar(sqliteParser.MyStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mystart}
	 * labeled alternative in {@link sqliteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterMystart(sqliteParser.MystartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mystart}
	 * labeled alternative in {@link sqliteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitMystart(sqliteParser.MystartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAlias}
	 * labeled alternative in {@link sqliteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAlias(sqliteParser.ExpressionAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAlias}
	 * labeled alternative in {@link sqliteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAlias(sqliteParser.ExpressionAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableORSubqueryA}
	 * labeled alternative in {@link sqliteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTableORSubqueryA(sqliteParser.TableORSubqueryAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableORSubqueryA}
	 * labeled alternative in {@link sqliteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTableORSubqueryA(sqliteParser.TableORSubqueryAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectCore}
	 * labeled alternative in {@link sqliteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelectCore(sqliteParser.SelectCoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectCore}
	 * labeled alternative in {@link sqliteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelectCore(sqliteParser.SelectCoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalValue}
	 * labeled alternative in {@link sqliteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(sqliteParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalValue}
	 * labeled alternative in {@link sqliteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(sqliteParser.LiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperator}
	 * labeled alternative in {@link sqliteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(sqliteParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperator}
	 * labeled alternative in {@link sqliteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(sqliteParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getDot}
	 * labeled alternative in {@link sqliteParser#dot_symbol}.
	 * @param ctx the parse tree
	 */
	void enterGetDot(sqliteParser.GetDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getDot}
	 * labeled alternative in {@link sqliteParser#dot_symbol}.
	 * @param ctx the parse tree
	 */
	void exitGetDot(sqliteParser.GetDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getComma}
	 * labeled alternative in {@link sqliteParser#comma_symbol}.
	 * @param ctx the parse tree
	 */
	void enterGetComma(sqliteParser.GetCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getComma}
	 * labeled alternative in {@link sqliteParser#comma_symbol}.
	 * @param ctx the parse tree
	 */
	void exitGetComma(sqliteParser.GetCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getSCOL}
	 * labeled alternative in {@link sqliteParser#semicolon_symbol}.
	 * @param ctx the parse tree
	 */
	void enterGetSCOL(sqliteParser.GetSCOLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getSCOL}
	 * labeled alternative in {@link sqliteParser#semicolon_symbol}.
	 * @param ctx the parse tree
	 */
	void exitGetSCOL(sqliteParser.GetSCOLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getOpenPar}
	 * labeled alternative in {@link sqliteParser#open_paren}.
	 * @param ctx the parse tree
	 */
	void enterGetOpenPar(sqliteParser.GetOpenParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getOpenPar}
	 * labeled alternative in {@link sqliteParser#open_paren}.
	 * @param ctx the parse tree
	 */
	void exitGetOpenPar(sqliteParser.GetOpenParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getClosePar}
	 * labeled alternative in {@link sqliteParser#close_paren}.
	 * @param ctx the parse tree
	 */
	void enterGetClosePar(sqliteParser.GetCloseParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getClosePar}
	 * labeled alternative in {@link sqliteParser#close_paren}.
	 * @param ctx the parse tree
	 */
	void exitGetClosePar(sqliteParser.GetCloseParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getAssign}
	 * labeled alternative in {@link sqliteParser#assign_symbol}.
	 * @param ctx the parse tree
	 */
	void enterGetAssign(sqliteParser.GetAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getAssign}
	 * labeled alternative in {@link sqliteParser#assign_symbol}.
	 * @param ctx the parse tree
	 */
	void exitGetAssign(sqliteParser.GetAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqliteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(sqliteParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqliteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(sqliteParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getDatabaseName}
	 * labeled alternative in {@link sqliteParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterGetDatabaseName(sqliteParser.GetDatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getDatabaseName}
	 * labeled alternative in {@link sqliteParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitGetDatabaseName(sqliteParser.GetDatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getTableName}
	 * labeled alternative in {@link sqliteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterGetTableName(sqliteParser.GetTableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getTableName}
	 * labeled alternative in {@link sqliteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitGetTableName(sqliteParser.GetTableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getColumnName}
	 * labeled alternative in {@link sqliteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterGetColumnName(sqliteParser.GetColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getColumnName}
	 * labeled alternative in {@link sqliteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitGetColumnName(sqliteParser.GetColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(sqliteParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(sqliteParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keyWordL}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterKeyWordL(sqliteParser.KeyWordLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keyWordL}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitKeyWordL(sqliteParser.KeyWordLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(sqliteParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(sqliteParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reAnyName}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterReAnyName(sqliteParser.ReAnyNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reAnyName}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitReAnyName(sqliteParser.ReAnyNameContext ctx);
}