// Generated from C:/Users/emmel/Desktop/SCC 2016-2017/2018-2019/DatabaseTool/DatabaseTool/src\sqlite.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sqliteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sqliteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sqliteParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(sqliteParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqliteParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(sqliteParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqliteParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(sqliteParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link sqliteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(sqliteParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectCore}
	 * labeled alternative in {@link sqliteParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCore(sqliteParser.SelectCoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code myStar}
	 * labeled alternative in {@link sqliteParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyStar(sqliteParser.MyStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mystart}
	 * labeled alternative in {@link sqliteParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMystart(sqliteParser.MystartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAlias}
	 * labeled alternative in {@link sqliteParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAlias(sqliteParser.ExpressionAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqliteParser#table_or_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_database(sqliteParser.Table_or_databaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code none1}
	 * labeled alternative in {@link sqliteParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNone1(sqliteParser.None1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code myExpression}
	 * labeled alternative in {@link sqliteParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyExpression(sqliteParser.MyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalValue}
	 * labeled alternative in {@link sqliteParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralValue(sqliteParser.LiteralValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperator}
	 * labeled alternative in {@link sqliteParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(sqliteParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getDot}
	 * labeled alternative in {@link sqliteParser#dot_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetDot(sqliteParser.GetDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getComma}
	 * labeled alternative in {@link sqliteParser#comma_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetComma(sqliteParser.GetCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getSCOL}
	 * labeled alternative in {@link sqliteParser#semicolon_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetSCOL(sqliteParser.GetSCOLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getOpenPar}
	 * labeled alternative in {@link sqliteParser#open_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetOpenPar(sqliteParser.GetOpenParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getClosePar}
	 * labeled alternative in {@link sqliteParser#close_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetClosePar(sqliteParser.GetCloseParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getAssign}
	 * labeled alternative in {@link sqliteParser#assign_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAssign(sqliteParser.GetAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqliteParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(sqliteParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getDatabaseName}
	 * labeled alternative in {@link sqliteParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetDatabaseName(sqliteParser.GetDatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getTableName}
	 * labeled alternative in {@link sqliteParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetTableName(sqliteParser.GetTableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getColumnName}
	 * labeled alternative in {@link sqliteParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetColumnName(sqliteParser.GetColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(sqliteParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keyWordL}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyWordL(sqliteParser.KeyWordLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(sqliteParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reAnyName}
	 * labeled alternative in {@link sqliteParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReAnyName(sqliteParser.ReAnyNameContext ctx);
}