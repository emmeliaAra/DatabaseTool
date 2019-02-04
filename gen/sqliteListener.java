// Generated from C:/Users/emmel/Desktop/SCC 2016-2017/2018-2019/SCC 300 - Third Year Project/DatabaseTool/src\sqlite.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link sqliteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(sqliteParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqliteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(sqliteParser.Compound_select_stmtContext ctx);
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
	 * Enter a parse tree produced by the {@code factoredSelectStatement}
	 * labeled alternative in {@link sqliteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactoredSelectStatement(sqliteParser.FactoredSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factoredSelectStatement}
	 * labeled alternative in {@link sqliteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactoredSelectStatement(sqliteParser.FactoredSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelectStatement}
	 * labeled alternative in {@link sqliteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelectStatement(sqliteParser.SimpleSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelectStatement}
	 * labeled alternative in {@link sqliteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelectStatement(sqliteParser.SimpleSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectStatement}
	 * labeled alternative in {@link sqliteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(sqliteParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectStatement}
	 * labeled alternative in {@link sqliteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(sqliteParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectOrValues}
	 * labeled alternative in {@link sqliteParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelectOrValues(sqliteParser.SelectOrValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectOrValues}
	 * labeled alternative in {@link sqliteParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelectOrValues(sqliteParser.SelectOrValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqliteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(sqliteParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqliteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(sqliteParser.Type_nameContext ctx);
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
	 * Enter a parse tree produced by the {@code orderingTerm}
	 * labeled alternative in {@link sqliteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrderingTerm(sqliteParser.OrderingTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orderingTerm}
	 * labeled alternative in {@link sqliteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrderingTerm(sqliteParser.OrderingTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commonTableExpression}
	 * labeled alternative in {@link sqliteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommonTableExpression(sqliteParser.CommonTableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commonTableExpression}
	 * labeled alternative in {@link sqliteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommonTableExpression(sqliteParser.CommonTableExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link sqliteParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(sqliteParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqliteParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(sqliteParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code none}
	 * labeled alternative in {@link sqliteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterNone(sqliteParser.NoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code none}
	 * labeled alternative in {@link sqliteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitNone(sqliteParser.NoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinOperator}
	 * labeled alternative in {@link sqliteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoinOperator(sqliteParser.JoinOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinOperator}
	 * labeled alternative in {@link sqliteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoinOperator(sqliteParser.JoinOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinConstraint}
	 * labeled alternative in {@link sqliteParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoinConstraint(sqliteParser.JoinConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinConstraint}
	 * labeled alternative in {@link sqliteParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoinConstraint(sqliteParser.JoinConstraintContext ctx);
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
	 * Enter a parse tree produced by the {@code compoundPperator}
	 * labeled alternative in {@link sqliteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompoundPperator(sqliteParser.CompoundPperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundPperator}
	 * labeled alternative in {@link sqliteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompoundPperator(sqliteParser.CompoundPperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundOperator}
	 * labeled alternative in {@link sqliteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompoundOperator(sqliteParser.CompoundOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundOperator}
	 * labeled alternative in {@link sqliteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompoundOperator(sqliteParser.CompoundOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signedNumber}
	 * labeled alternative in {@link sqliteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumber(sqliteParser.SignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signedNumber}
	 * labeled alternative in {@link sqliteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumber(sqliteParser.SignedNumberContext ctx);
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
	 * Enter a parse tree produced by the {@code columnAlias}
	 * labeled alternative in {@link sqliteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumnAlias(sqliteParser.ColumnAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnAlias}
	 * labeled alternative in {@link sqliteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumnAlias(sqliteParser.ColumnAliasContext ctx);
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
	 * Enter a parse tree produced by the {@code typeName}
	 * labeled alternative in {@link sqliteParser#name}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(sqliteParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeName}
	 * labeled alternative in {@link sqliteParser#name}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(sqliteParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeNameWithBrackets}
	 * labeled alternative in {@link sqliteParser#name_with_brackets}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameWithBrackets(sqliteParser.TypeNameWithBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeNameWithBrackets}
	 * labeled alternative in {@link sqliteParser#name_with_brackets}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameWithBrackets(sqliteParser.TypeNameWithBracketsContext ctx);
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
	 * Enter a parse tree produced by the {@code getTableAlias}
	 * labeled alternative in {@link sqliteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterGetTableAlias(sqliteParser.GetTableAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getTableAlias}
	 * labeled alternative in {@link sqliteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitGetTableAlias(sqliteParser.GetTableAliasContext ctx);
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