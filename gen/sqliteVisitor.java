// Generated from C:/Users/emmel/Desktop/SCC 2016-2017/2018-2019/SCC 300 - Third Year Project/DatabaseTool/src\sqlite.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by the {@code alterTable}
	 * labeled alternative in {@link sqliteParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(sqliteParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqliteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(sqliteParser.Compound_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link sqliteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(sqliteParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteStatement}
	 * labeled alternative in {@link sqliteParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(sqliteParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteLimited}
	 * labeled alternative in {@link sqliteParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteLimited(sqliteParser.DeleteLimitedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link sqliteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(sqliteParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factoredSelectStatement}
	 * labeled alternative in {@link sqliteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoredSelectStatement(sqliteParser.FactoredSelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertStatement}
	 * labeled alternative in {@link sqliteParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(sqliteParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleSelectStatement}
	 * labeled alternative in {@link sqliteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelectStatement(sqliteParser.SimpleSelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectStatement}
	 * labeled alternative in {@link sqliteParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(sqliteParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectOrValues}
	 * labeled alternative in {@link sqliteParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectOrValues(sqliteParser.SelectOrValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code updateStatement}
	 * labeled alternative in {@link sqliteParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(sqliteParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code updateStatementLimited}
	 * labeled alternative in {@link sqliteParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatementLimited(sqliteParser.UpdateStatementLimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqliteParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(sqliteParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqliteParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(sqliteParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKey}
	 * labeled alternative in {@link sqliteParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(sqliteParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullOrNot}
	 * labeled alternative in {@link sqliteParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullOrNot(sqliteParser.NullOrNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unique}
	 * labeled alternative in {@link sqliteParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique(sqliteParser.UniqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreignKey}
	 * labeled alternative in {@link sqliteParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKey(sqliteParser.ForeignKeyContext ctx);
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
	 * Visit a parse tree produced by the {@code references}
	 * labeled alternative in {@link sqliteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferences(sqliteParser.ReferencesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexedColumn}
	 * labeled alternative in {@link sqliteParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedColumn(sqliteParser.IndexedColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableConstraint}
	 * labeled alternative in {@link sqliteParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(sqliteParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withClause}
	 * labeled alternative in {@link sqliteParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(sqliteParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualifiedTableName}
	 * labeled alternative in {@link sqliteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedTableName(sqliteParser.QualifiedTableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orderingTerm}
	 * labeled alternative in {@link sqliteParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderingTerm(sqliteParser.OrderingTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commonTableExpression}
	 * labeled alternative in {@link sqliteParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonTableExpression(sqliteParser.CommonTableExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code tableORSubqueryA}
	 * labeled alternative in {@link sqliteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableORSubqueryA(sqliteParser.TableORSubqueryAContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqliteParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(sqliteParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code none}
	 * labeled alternative in {@link sqliteParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNone(sqliteParser.NoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinOperator}
	 * labeled alternative in {@link sqliteParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinOperator(sqliteParser.JoinOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinConstraint}
	 * labeled alternative in {@link sqliteParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinConstraint(sqliteParser.JoinConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectCore}
	 * labeled alternative in {@link sqliteParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCore(sqliteParser.SelectCoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundPperator}
	 * labeled alternative in {@link sqliteParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundPperator(sqliteParser.CompoundPperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundOperator}
	 * labeled alternative in {@link sqliteParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundOperator(sqliteParser.CompoundOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cteTableName}
	 * labeled alternative in {@link sqliteParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteTableName(sqliteParser.CteTableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signedNumber}
	 * labeled alternative in {@link sqliteParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumber(sqliteParser.SignedNumberContext ctx);
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
	 * Visit a parse tree produced by the {@code columnAlias}
	 * labeled alternative in {@link sqliteParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAlias(sqliteParser.ColumnAliasContext ctx);
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
	 * Visit a parse tree produced by the {@code typeName}
	 * labeled alternative in {@link sqliteParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(sqliteParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeNameWithBrackets}
	 * labeled alternative in {@link sqliteParser#name_with_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameWithBrackets(sqliteParser.TypeNameWithBracketsContext ctx);
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
	 * Visit a parse tree produced by the {@code getNewTableName}
	 * labeled alternative in {@link sqliteParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetNewTableName(sqliteParser.GetNewTableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getColumnName}
	 * labeled alternative in {@link sqliteParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetColumnName(sqliteParser.GetColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getForeignTableName}
	 * labeled alternative in {@link sqliteParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetForeignTableName(sqliteParser.GetForeignTableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getTableAlias}
	 * labeled alternative in {@link sqliteParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetTableAlias(sqliteParser.GetTableAliasContext ctx);
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