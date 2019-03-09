// Generated from C:/Users/emmel/Desktop/SCC 2016-2017/2018-2019/DatabaseTool/DatabaseTool/src\temp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tempParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tempVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tempParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(tempParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(tempParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(tempParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(tempParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(tempParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#analyze_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_stmt(tempParser.Analyze_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#attach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_stmt(tempParser.Attach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#begin_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_stmt(tempParser.Begin_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(tempParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(tempParser.Compound_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(tempParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(tempParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_stmt(tempParser.Create_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(tempParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_virtual_table_stmt(tempParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(tempParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_limited(tempParser.Delete_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#detach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetach_stmt(tempParser.Detach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(tempParser.Drop_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(tempParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_stmt(tempParser.Drop_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(tempParser.Drop_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(tempParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(tempParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#pragma_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_stmt(tempParser.Pragma_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#reindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_stmt(tempParser.Reindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#release_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_stmt(tempParser.Release_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(tempParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_stmt(tempParser.Savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(tempParser.Simple_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(tempParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(tempParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(tempParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_limited(tempParser.Update_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(tempParser.Vacuum_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(tempParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(tempParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(tempParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(tempParser.Conflict_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(tempParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(tempParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#raise_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_function(tempParser.Raise_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(tempParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(tempParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(tempParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(tempParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(tempParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(tempParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(tempParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(tempParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(tempParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(tempParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(tempParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(tempParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(tempParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(tempParser.Compound_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(tempParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(tempParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(tempParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(tempParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(tempParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(tempParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(tempParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(tempParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(tempParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(tempParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(tempParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tablename}
	 * labeled alternative in {@link tempParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablename(tempParser.TablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(tempParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(tempParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(tempParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(tempParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(tempParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(tempParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(tempParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(tempParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(tempParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(tempParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(tempParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(tempParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(tempParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tempParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(tempParser.Any_nameContext ctx);
}