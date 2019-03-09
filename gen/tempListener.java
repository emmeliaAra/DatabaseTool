// Generated from C:/Users/emmel/Desktop/SCC 2016-2017/2018-2019/DatabaseTool/DatabaseTool/src\temp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tempParser}.
 */
public interface tempListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tempParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(tempParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(tempParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(tempParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(tempParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(tempParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(tempParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(tempParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(tempParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(tempParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(tempParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(tempParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(tempParser.Analyze_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(tempParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(tempParser.Attach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(tempParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(tempParser.Begin_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(tempParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(tempParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(tempParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(tempParser.Compound_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(tempParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(tempParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(tempParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(tempParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(tempParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(tempParser.Create_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(tempParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(tempParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(tempParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(tempParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(tempParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(tempParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(tempParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(tempParser.Delete_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(tempParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(tempParser.Detach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(tempParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(tempParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(tempParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(tempParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(tempParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(tempParser.Drop_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(tempParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(tempParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(tempParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(tempParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(tempParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(tempParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(tempParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(tempParser.Pragma_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(tempParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(tempParser.Reindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(tempParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(tempParser.Release_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(tempParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(tempParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(tempParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(tempParser.Savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(tempParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(tempParser.Simple_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(tempParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(tempParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(tempParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(tempParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(tempParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(tempParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(tempParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(tempParser.Update_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(tempParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(tempParser.Vacuum_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(tempParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(tempParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(tempParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(tempParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(tempParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(tempParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(tempParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(tempParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(tempParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(tempParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(tempParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(tempParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(tempParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(tempParser.Raise_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(tempParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(tempParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(tempParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(tempParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(tempParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(tempParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(tempParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(tempParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(tempParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(tempParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(tempParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(tempParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(tempParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(tempParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(tempParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(tempParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(tempParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(tempParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(tempParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(tempParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(tempParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(tempParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(tempParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(tempParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(tempParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(tempParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(tempParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(tempParser.Compound_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(tempParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(tempParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(tempParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(tempParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(tempParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(tempParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(tempParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(tempParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(tempParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(tempParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(tempParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(tempParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(tempParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(tempParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(tempParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(tempParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(tempParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(tempParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(tempParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(tempParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(tempParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(tempParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tablename}
	 * labeled alternative in {@link tempParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTablename(tempParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tablename}
	 * labeled alternative in {@link tempParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTablename(tempParser.TablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(tempParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(tempParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(tempParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(tempParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(tempParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(tempParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(tempParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(tempParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(tempParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(tempParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(tempParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(tempParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(tempParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(tempParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(tempParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(tempParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(tempParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(tempParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(tempParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(tempParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(tempParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(tempParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(tempParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(tempParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(tempParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(tempParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tempParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(tempParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tempParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(tempParser.Any_nameContext ctx);
}