// Generated from C:/Users/emmel/Desktop/SCC 2016-2017/2018-2019/SCC 300 - Third Year Project/DatabaseTool/src\sqlite.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sqliteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, UNDERSCORE=25, 
		K_ADD=26, K_ALL=27, K_ALTER=28, K_AND=29, K_AS=30, K_ASC=31, K_AUTOINCREMENT=32, 
		K_BETWEEN=33, K_BY=34, K_CASE=35, K_CAST=36, K_COLUMN=37, K_CREATE=38, 
		K_CROSS=39, K_CURRENT_DATE=40, K_CURRENT_TIME=41, K_CURRENT_TIMESTAMP=42, 
		K_DATABASE=43, K_DEFAULT=44, K_DELETE=45, K_DESC=46, K_DISTINCT=47, K_DROP=48, 
		K_ELSE=49, K_END=50, K_EXCEPT=51, K_EXISTS=52, K_FOR=53, K_FOREIGN=54, 
		K_FROM=55, K_FULL=56, K_GLOB=57, K_GROUP=58, K_HAVING=59, K_IF=60, K_IN=61, 
		K_INNER=62, K_INSERT=63, K_INTERSECT=64, K_INTO=65, K_IS=66, K_ISNULL=67, 
		K_JOIN=68, K_KEY=69, K_LEFT=70, K_LIKE=71, K_LIMIT=72, K_NATURAL=73, K_NO=74, 
		K_NOT=75, K_NOTNULL=76, K_NULL=77, K_OF=78, K_OFFSET=79, K_ON=80, K_OR=81, 
		K_ORDER=82, K_OUTER=83, K_PRIMARY=84, K_REFERENCES=85, K_RENAME=86, K_REPLACE=87, 
		K_RIGHT=88, K_ROW=89, K_SELECT=90, K_SET=91, K_TABLE=92, K_THEN=93, K_TO=94, 
		K_UNION=95, K_UNIQUE=96, K_UPDATE=97, K_USING=98, K_VALUES=99, K_VIEW=100, 
		K_WHEN=101, K_WHERE=102, K_WITH=103, INT=104, INTEGER=105, TINYINT=106, 
		SMALLINT=107, MEDIUMINT=108, BIGINT=109, UNSIGNED=110, BIG=111, TEXT=112, 
		BLOB=113, REAL=114, DOUBLE=115, FLOAT=116, NUMERIC=117, BOOLEAN=118, DATE=119, 
		DATETIME=120, CHARACTER=121, VARCHAR=122, NCHAR=123, NVARCHAR=124, DECIMAL=125, 
		IDENTIFIER=126, NUMERIC_LITERAL=127, BIND_PARAMETER=128, STRING_LITERAL=129, 
		BLOB_LITERAL=130, SINGLE_LINE_COMMENT=131, MULTILINE_COMMENT=132, SPACES=133, 
		UNEXPECTED_CHAR=134;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt = 2, RULE_alter_table_stmt = 3, 
		RULE_compound_select_stmt = 4, RULE_create_table_stmt = 5, RULE_delete_stmt = 6, 
		RULE_delete_stmt_limited = 7, RULE_drop_table_stmt = 8, RULE_factored_select_stmt = 9, 
		RULE_insert_stmt = 10, RULE_simple_select_stmt = 11, RULE_select_stmt = 12, 
		RULE_select_or_values = 13, RULE_update_stmt = 14, RULE_update_stmt_limited = 15, 
		RULE_column_def = 16, RULE_type_name = 17, RULE_column_constraint = 18, 
		RULE_expr = 19, RULE_foreign_key_clause = 20, RULE_indexed_column = 21, 
		RULE_table_constraint = 22, RULE_with_clause = 23, RULE_qualified_table_name = 24, 
		RULE_ordering_term = 25, RULE_common_table_expression = 26, RULE_result_column = 27, 
		RULE_table_or_subquery = 28, RULE_join_clause = 29, RULE_join_operator = 30, 
		RULE_join_constraint = 31, RULE_select_core = 32, RULE_compound_operator = 33, 
		RULE_cte_table_name = 34, RULE_signed_number = 35, RULE_literal_value = 36, 
		RULE_unary_operator = 37, RULE_column_alias = 38, RULE_dot_symbol = 39, 
		RULE_comma_symbol = 40, RULE_semicolon_symbol = 41, RULE_open_paren = 42, 
		RULE_close_paren = 43, RULE_assign_symbol = 44, RULE_keyword = 45, RULE_name = 46, 
		RULE_name_with_brackets = 47, RULE_database_name = 48, RULE_table_name = 49, 
		RULE_new_table_name = 50, RULE_column_name = 51, RULE_foreign_table = 52, 
		RULE_table_alias = 53, RULE_any_name = 54;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt", "alter_table_stmt", "compound_select_stmt", 
		"create_table_stmt", "delete_stmt", "delete_stmt_limited", "drop_table_stmt", 
		"factored_select_stmt", "insert_stmt", "simple_select_stmt", "select_stmt", 
		"select_or_values", "update_stmt", "update_stmt_limited", "column_def", 
		"type_name", "column_constraint", "expr", "foreign_key_clause", "indexed_column", 
		"table_constraint", "with_clause", "qualified_table_name", "ordering_term", 
		"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
		"join_operator", "join_constraint", "select_core", "compound_operator", 
		"cte_table_name", "signed_number", "literal_value", "unary_operator", 
		"column_alias", "dot_symbol", "comma_symbol", "semicolon_symbol", "open_paren", 
		"close_paren", "assign_symbol", "keyword", "name", "name_with_brackets", 
		"database_name", "table_name", "new_table_name", "column_name", "foreign_table", 
		"table_alias", "any_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", 
		"'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'<>'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
		"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
		"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "UNDERSCORE", 
		"K_ADD", "K_ALL", "K_ALTER", "K_AND", "K_AS", "K_ASC", "K_AUTOINCREMENT", 
		"K_BETWEEN", "K_BY", "K_CASE", "K_CAST", "K_COLUMN", "K_CREATE", "K_CROSS", 
		"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
		"K_DEFAULT", "K_DELETE", "K_DESC", "K_DISTINCT", "K_DROP", "K_ELSE", "K_END", 
		"K_EXCEPT", "K_EXISTS", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", 
		"K_GROUP", "K_HAVING", "K_IF", "K_IN", "K_INNER", "K_INSERT", "K_INTERSECT", 
		"K_INTO", "K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
		"K_NATURAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", 
		"K_ON", "K_OR", "K_ORDER", "K_OUTER", "K_PRIMARY", "K_REFERENCES", "K_RENAME", 
		"K_REPLACE", "K_RIGHT", "K_ROW", "K_SELECT", "K_SET", "K_TABLE", "K_THEN", 
		"K_TO", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VALUES", "K_VIEW", 
		"K_WHEN", "K_WHERE", "K_WITH", "INT", "INTEGER", "TINYINT", "SMALLINT", 
		"MEDIUMINT", "BIGINT", "UNSIGNED", "BIG", "TEXT", "BLOB", "REAL", "DOUBLE", 
		"FLOAT", "NUMERIC", "BOOLEAN", "DATE", "DATETIME", "CHARACTER", "VARCHAR", 
		"NCHAR", "NVARCHAR", "DECIMAL", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", 
		"STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
		"SPACES", "UNEXPECTED_CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "sqlite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sqliteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(sqliteParser.EOF, 0); }
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<Semicolon_symbolContext> semicolon_symbol() {
			return getRuleContexts(Semicolon_symbolContext.class);
		}
		public Semicolon_symbolContext semicolon_symbol(int i) {
			return getRuleContext(Semicolon_symbolContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ADD) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTOINCREMENT) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLUMN) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_ELSE) | (1L << K_END) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FOR) | (1L << K_FOREIGN) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IN) | (1L << K_INNER) | (1L << K_INSERT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROW - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THEN - 64)) | (1L << (K_TO - 64)) | (1L << (K_UNION - 64)) | (1L << (K_UNIQUE - 64)) | (1L << (K_UPDATE - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_VIEW - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (IDENTIFIER - 64)))) != 0) || _la==STRING_LITERAL || _la==UNEXPECTED_CHAR) {
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case K_ADD:
				case K_ALL:
				case K_ALTER:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_AUTOINCREMENT:
				case K_BETWEEN:
				case K_BY:
				case K_CASE:
				case K_CAST:
				case K_COLUMN:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DELETE:
				case K_DESC:
				case K_DISTINCT:
				case K_DROP:
				case K_ELSE:
				case K_END:
				case K_EXCEPT:
				case K_EXISTS:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IN:
				case K_INNER:
				case K_INSERT:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PRIMARY:
				case K_REFERENCES:
				case K_RENAME:
				case K_REPLACE:
				case K_RIGHT:
				case K_ROW:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_THEN:
				case K_TO:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VALUES:
				case K_VIEW:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(110);
					sql_stmt();
					setState(111);
					semicolon_symbol();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(113);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(sqliteParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				alter_table_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				compound_select_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				create_table_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				delete_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				delete_stmt_limited();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				drop_table_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				factored_select_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				insert_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				simple_select_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(133);
				select_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(134);
				update_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(135);
				update_stmt_limited();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
	 
		public Alter_table_stmtContext() { }
		public void copyFrom(Alter_table_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlterTableContext extends Alter_table_stmtContext {
		public TerminalNode K_ALTER() { return getToken(sqliteParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(sqliteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(sqliteParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(sqliteParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(sqliteParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Dot_symbolContext dot_symbol() {
			return getRuleContext(Dot_symbolContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(sqliteParser.K_COLUMN, 0); }
		public AlterTableContext(Alter_table_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterAlterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitAlterTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alter_table_stmt);
		try {
			_localctx = new AlterTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(K_ALTER);
			setState(139);
			match(K_TABLE);
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(140);
				database_name();
				setState(141);
				dot_symbol();
				}
				break;
			}
			setState(145);
			table_name();
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(146);
				match(K_RENAME);
				setState(147);
				match(K_TO);
				setState(148);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(149);
				match(K_ADD);
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(150);
					match(K_COLUMN);
					}
					break;
				}
				setState(153);
				column_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(sqliteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(sqliteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(sqliteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(sqliteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(sqliteParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(sqliteParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(sqliteParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(sqliteParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(sqliteParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(sqliteParser.K_EXCEPT, i);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public List<TerminalNode> K_ALL() { return getTokens(sqliteParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(sqliteParser.K_ALL, i);
		}
		public TerminalNode K_OFFSET() { return getToken(sqliteParser.K_OFFSET, 0); }
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(156);
				match(K_WITH);
				setState(157);
				common_table_expression();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(158);
					comma_symbol();
					setState(159);
					common_table_expression();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(168);
			select_core();
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(169);
					match(K_UNION);
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(170);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(173);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(174);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177);
				select_core();
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (K_EXCEPT - 51)) | (1L << (K_INTERSECT - 51)) | (1L << (K_UNION - 51)))) != 0) );
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(182);
				match(K_ORDER);
				setState(183);
				match(K_BY);
				setState(184);
				ordering_term();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(185);
					comma_symbol();
					setState(186);
					ordering_term();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(195);
				match(K_LIMIT);
				setState(196);
				expr(0);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(199);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_OFFSET:
						{
						setState(197);
						match(K_OFFSET);
						}
						break;
					case COMMA:
						{
						setState(198);
						comma_symbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(201);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
	 
		public Create_table_stmtContext() { }
		public void copyFrom(Create_table_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateTableContext extends Create_table_stmtContext {
		public TerminalNode K_CREATE() { return getToken(sqliteParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(sqliteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Open_parenContext open_paren() {
			return getRuleContext(Open_parenContext.class,0);
		}
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public Close_parenContext close_paren() {
			return getRuleContext(Close_parenContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(sqliteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Dot_symbolContext dot_symbol() {
			return getRuleContext(Dot_symbolContext.class,0);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public CreateTableContext(Create_table_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			_localctx = new CreateTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(K_CREATE);
			setState(207);
			match(K_TABLE);
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(208);
				database_name();
				setState(209);
				dot_symbol();
				}
				break;
			}
			setState(213);
			table_name();
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(214);
				open_paren();
				setState(215);
				column_def();
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(216);
						comma_symbol();
						setState(217);
						column_def();
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(224);
					comma_symbol();
					setState(225);
					table_constraint();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				close_paren();
				}
				break;
			case K_AS:
				{
				setState(234);
				match(K_AS);
				setState(235);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
	 
		public Delete_stmtContext() { }
		public void copyFrom(Delete_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteStatementContext extends Delete_stmtContext {
		public TerminalNode K_DELETE() { return getToken(sqliteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(sqliteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(sqliteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeleteStatementContext(Delete_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delete_stmt);
		int _la;
		try {
			_localctx = new DeleteStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(238);
				with_clause();
				}
				break;
			}
			setState(241);
			match(K_DELETE);
			setState(242);
			match(K_FROM);
			setState(243);
			qualified_table_name();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(244);
				match(K_WHERE);
				setState(245);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
	 
		public Delete_stmt_limitedContext() { }
		public void copyFrom(Delete_stmt_limitedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteLimitedContext extends Delete_stmt_limitedContext {
		public TerminalNode K_DELETE() { return getToken(sqliteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(sqliteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(sqliteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(sqliteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(sqliteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(sqliteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(sqliteParser.K_OFFSET, 0); }
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public DeleteLimitedContext(Delete_stmt_limitedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterDeleteLimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitDeleteLimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitDeleteLimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_delete_stmt_limited);
		int _la;
		try {
			_localctx = new DeleteLimitedContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(248);
				with_clause();
				}
				break;
			}
			setState(251);
			match(K_DELETE);
			setState(252);
			match(K_FROM);
			setState(253);
			qualified_table_name();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(254);
				match(K_WHERE);
				setState(255);
				expr(0);
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(258);
					match(K_ORDER);
					setState(259);
					match(K_BY);
					setState(260);
					ordering_term();
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(261);
						comma_symbol();
						setState(262);
						ordering_term();
						}
						}
						setState(268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(271);
				match(K_LIMIT);
				setState(272);
				expr(0);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(275);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_OFFSET:
						{
						setState(273);
						match(K_OFFSET);
						}
						break;
					case COMMA:
						{
						setState(274);
						comma_symbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(277);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
	 
		public Drop_table_stmtContext() { }
		public void copyFrom(Drop_table_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DropTableContext extends Drop_table_stmtContext {
		public TerminalNode K_DROP() { return getToken(sqliteParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(sqliteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(sqliteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(sqliteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Dot_symbolContext dot_symbol() {
			return getRuleContext(Dot_symbolContext.class,0);
		}
		public DropTableContext(Drop_table_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_drop_table_stmt);
		try {
			_localctx = new DropTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(K_DROP);
			setState(283);
			match(K_TABLE);
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(284);
				match(K_IF);
				setState(285);
				match(K_EXISTS);
				}
				break;
			}
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(288);
				database_name();
				setState(289);
				dot_symbol();
				}
				break;
			}
			setState(293);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
	 
		public Factored_select_stmtContext() { }
		public void copyFrom(Factored_select_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactoredSelectStatementContext extends Factored_select_stmtContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(sqliteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(sqliteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(sqliteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(sqliteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(sqliteParser.K_OFFSET, 0); }
		public FactoredSelectStatementContext(Factored_select_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterFactoredSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitFactoredSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitFactoredSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factored_select_stmt);
		int _la;
		try {
			_localctx = new FactoredSelectStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(295);
				match(K_WITH);
				setState(296);
				common_table_expression();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(297);
					comma_symbol();
					setState(298);
					common_table_expression();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(307);
			select_core();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (K_EXCEPT - 51)) | (1L << (K_INTERSECT - 51)) | (1L << (K_UNION - 51)))) != 0)) {
				{
				{
				setState(308);
				compound_operator();
				setState(309);
				select_core();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(316);
				match(K_ORDER);
				setState(317);
				match(K_BY);
				setState(318);
				ordering_term();
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(319);
					comma_symbol();
					setState(320);
					ordering_term();
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(329);
				match(K_LIMIT);
				setState(330);
				expr(0);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(333);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_OFFSET:
						{
						setState(331);
						match(K_OFFSET);
						}
						break;
					case COMMA:
						{
						setState(332);
						comma_symbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(335);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
	 
		public Insert_stmtContext() { }
		public void copyFrom(Insert_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertStatementContext extends Insert_stmtContext {
		public TerminalNode K_INTO() { return getToken(sqliteParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(sqliteParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(sqliteParser.K_REPLACE, 0); }
		public TerminalNode K_VALUES() { return getToken(sqliteParser.K_VALUES, 0); }
		public List<Open_parenContext> open_paren() {
			return getRuleContexts(Open_parenContext.class);
		}
		public Open_parenContext open_paren(int i) {
			return getRuleContext(Open_parenContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Close_parenContext> close_paren() {
			return getRuleContexts(Close_parenContext.class);
		}
		public Close_parenContext close_paren(int i) {
			return getRuleContext(Close_parenContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Dot_symbolContext dot_symbol() {
			return getRuleContext(Dot_symbolContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public InsertStatementContext(Insert_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_insert_stmt);
		int _la;
		try {
			_localctx = new InsertStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(340);
				with_clause();
				}
				break;
			}
			setState(343);
			_la = _input.LA(1);
			if ( !(_la==K_INSERT || _la==K_REPLACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(344);
			match(K_INTO);
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(345);
				database_name();
				setState(346);
				dot_symbol();
				}
				break;
			}
			setState(350);
			table_name();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(351);
				open_paren();
				setState(352);
				column_name();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(353);
					comma_symbol();
					setState(354);
					column_name();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				close_paren();
				}
			}

			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VALUES:
				{
				setState(365);
				match(K_VALUES);
				setState(366);
				open_paren();
				setState(367);
				expr(0);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(368);
					comma_symbol();
					setState(369);
					expr(0);
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				close_paren();
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(377);
					comma_symbol();
					setState(378);
					open_paren();
					setState(379);
					expr(0);
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(380);
						comma_symbol();
						setState(381);
						expr(0);
						}
						}
						setState(387);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(388);
					close_paren();
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case K_SELECT:
			case K_WITH:
				{
				setState(395);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
	 
		public Simple_select_stmtContext() { }
		public void copyFrom(Simple_select_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleSelectStatementContext extends Simple_select_stmtContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(sqliteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(sqliteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(sqliteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(sqliteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(sqliteParser.K_OFFSET, 0); }
		public SimpleSelectStatementContext(Simple_select_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterSimpleSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitSimpleSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitSimpleSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simple_select_stmt);
		int _la;
		try {
			_localctx = new SimpleSelectStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(398);
				match(K_WITH);
				setState(399);
				common_table_expression();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(400);
					comma_symbol();
					setState(401);
					common_table_expression();
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(410);
			select_core();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(411);
				match(K_ORDER);
				setState(412);
				match(K_BY);
				setState(413);
				ordering_term();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(414);
					comma_symbol();
					setState(415);
					ordering_term();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(424);
				match(K_LIMIT);
				setState(425);
				expr(0);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(428);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_OFFSET:
						{
						setState(426);
						match(K_OFFSET);
						}
						break;
					case COMMA:
						{
						setState(427);
						comma_symbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(430);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	 
		public Select_stmtContext() { }
		public void copyFrom(Select_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectStatementContext extends Select_stmtContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(sqliteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(sqliteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(sqliteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(sqliteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(sqliteParser.K_OFFSET, 0); }
		public SelectStatementContext(Select_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_select_stmt);
		int _la;
		try {
			_localctx = new SelectStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(435);
				match(K_WITH);
				setState(436);
				common_table_expression();
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(437);
					comma_symbol();
					setState(438);
					common_table_expression();
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(447);
			select_or_values();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (K_EXCEPT - 51)) | (1L << (K_INTERSECT - 51)) | (1L << (K_UNION - 51)))) != 0)) {
				{
				{
				setState(448);
				compound_operator();
				setState(449);
				select_or_values();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(456);
				match(K_ORDER);
				setState(457);
				match(K_BY);
				setState(458);
				ordering_term();
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(459);
					comma_symbol();
					setState(460);
					ordering_term();
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(469);
				match(K_LIMIT);
				setState(470);
				expr(0);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(473);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_OFFSET:
						{
						setState(471);
						match(K_OFFSET);
						}
						break;
					case COMMA:
						{
						setState(472);
						comma_symbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(475);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
	 
		public Select_or_valuesContext() { }
		public void copyFrom(Select_or_valuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectOrValuesContext extends Select_or_valuesContext {
		public TerminalNode K_SELECT() { return getToken(sqliteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(sqliteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(sqliteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(sqliteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(sqliteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(sqliteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(sqliteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(sqliteParser.K_HAVING, 0); }
		public SelectOrValuesContext(Select_or_valuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterSelectOrValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitSelectOrValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitSelectOrValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_select_or_values);
		int _la;
		try {
			_localctx = new SelectOrValuesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(K_SELECT);
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(481);
				_la = _input.LA(1);
				if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(484);
			result_column();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(485);
				comma_symbol();
				setState(486);
				result_column();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(493);
				match(K_FROM);
				setState(504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(494);
					table_or_subquery();
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(495);
						comma_symbol();
						setState(496);
						table_or_subquery();
						}
						}
						setState(502);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(503);
					join_clause();
					}
					break;
				}
				}
			}

			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(508);
				match(K_WHERE);
				setState(509);
				expr(0);
				}
			}

			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_GROUP) {
				{
				setState(512);
				match(K_GROUP);
				setState(513);
				match(K_BY);
				setState(514);
				expr(0);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(515);
					comma_symbol();
					setState(516);
					expr(0);
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_HAVING) {
					{
					setState(523);
					match(K_HAVING);
					setState(524);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
	 
		public Update_stmtContext() { }
		public void copyFrom(Update_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UpdateStatementContext extends Update_stmtContext {
		public TerminalNode K_UPDATE() { return getToken(sqliteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(sqliteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Assign_symbolContext> assign_symbol() {
			return getRuleContexts(Assign_symbolContext.class);
		}
		public Assign_symbolContext assign_symbol(int i) {
			return getRuleContext(Assign_symbolContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public TerminalNode K_WHERE() { return getToken(sqliteParser.K_WHERE, 0); }
		public UpdateStatementContext(Update_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_update_stmt);
		int _la;
		try {
			_localctx = new UpdateStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(529);
				with_clause();
				}
				break;
			}
			setState(532);
			match(K_UPDATE);
			setState(533);
			qualified_table_name();
			setState(534);
			match(K_SET);
			setState(535);
			column_name();
			setState(536);
			assign_symbol();
			setState(537);
			expr(0);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(538);
				comma_symbol();
				setState(539);
				column_name();
				setState(540);
				assign_symbol();
				setState(541);
				expr(0);
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(548);
				match(K_WHERE);
				setState(549);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
	 
		public Update_stmt_limitedContext() { }
		public void copyFrom(Update_stmt_limitedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UpdateStatementLimitedContext extends Update_stmt_limitedContext {
		public TerminalNode K_UPDATE() { return getToken(sqliteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(sqliteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Assign_symbolContext> assign_symbol() {
			return getRuleContexts(Assign_symbolContext.class);
		}
		public Assign_symbolContext assign_symbol(int i) {
			return getRuleContext(Assign_symbolContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public TerminalNode K_WHERE() { return getToken(sqliteParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(sqliteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(sqliteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(sqliteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(sqliteParser.K_OFFSET, 0); }
		public UpdateStatementLimitedContext(Update_stmt_limitedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterUpdateStatementLimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitUpdateStatementLimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitUpdateStatementLimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_update_stmt_limited);
		int _la;
		try {
			_localctx = new UpdateStatementLimitedContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(552);
				with_clause();
				}
				break;
			}
			setState(555);
			match(K_UPDATE);
			setState(556);
			qualified_table_name();
			setState(557);
			match(K_SET);
			setState(558);
			column_name();
			setState(559);
			assign_symbol();
			setState(560);
			expr(0);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(561);
				comma_symbol();
				setState(562);
				column_name();
				setState(563);
				assign_symbol();
				setState(564);
				expr(0);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(571);
				match(K_WHERE);
				setState(572);
				expr(0);
				}
			}

			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(575);
					match(K_ORDER);
					setState(576);
					match(K_BY);
					setState(577);
					ordering_term();
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(578);
						comma_symbol();
						setState(579);
						ordering_term();
						}
						}
						setState(585);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(588);
				match(K_LIMIT);
				setState(589);
				expr(0);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(592);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_OFFSET:
						{
						setState(590);
						match(K_OFFSET);
						}
						break;
					case COMMA:
						{
						setState(591);
						comma_symbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(594);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			column_name();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (INT - 104)) | (1L << (INTEGER - 104)) | (1L << (TINYINT - 104)) | (1L << (SMALLINT - 104)) | (1L << (MEDIUMINT - 104)) | (1L << (BIGINT - 104)) | (1L << (UNSIGNED - 104)) | (1L << (TEXT - 104)) | (1L << (BLOB - 104)) | (1L << (REAL - 104)) | (1L << (DOUBLE - 104)) | (1L << (FLOAT - 104)) | (1L << (NUMERIC - 104)) | (1L << (BOOLEAN - 104)) | (1L << (DATE - 104)) | (1L << (DATETIME - 104)) | (1L << (CHARACTER - 104)) | (1L << (VARCHAR - 104)) | (1L << (NCHAR - 104)) | (1L << (NVARCHAR - 104)) | (1L << (DECIMAL - 104)))) != 0)) {
				{
				setState(600);
				type_name();
				}
			}

			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (K_NOT - 75)) | (1L << (K_NULL - 75)) | (1L << (K_PRIMARY - 75)) | (1L << (K_REFERENCES - 75)) | (1L << (K_UNIQUE - 75)))) != 0)) {
				{
				{
				setState(603);
				column_constraint();
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<Name_with_bracketsContext> name_with_brackets() {
			return getRuleContexts(Name_with_bracketsContext.class);
		}
		public Name_with_bracketsContext name_with_brackets(int i) {
			return getRuleContext(Name_with_bracketsContext.class,i);
		}
		public Open_parenContext open_paren() {
			return getRuleContext(Open_parenContext.class,0);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public Close_parenContext close_paren() {
			return getRuleContext(Close_parenContext.class,0);
		}
		public Comma_symbolContext comma_symbol() {
			return getRuleContext(Comma_symbolContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type_name);
		int _la;
		try {
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case INTEGER:
			case TINYINT:
			case SMALLINT:
			case MEDIUMINT:
			case BIGINT:
			case UNSIGNED:
			case TEXT:
			case BLOB:
			case REAL:
			case DOUBLE:
			case FLOAT:
			case NUMERIC:
			case BOOLEAN:
			case DATE:
			case DATETIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				name();
				}
				break;
			case CHARACTER:
			case VARCHAR:
			case NCHAR:
			case NVARCHAR:
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(611); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(610);
					name_with_brackets();
					}
					}
					setState(613); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (CHARACTER - 121)) | (1L << (VARCHAR - 121)) | (1L << (NCHAR - 121)) | (1L << (NVARCHAR - 121)) | (1L << (DECIMAL - 121)))) != 0) );
				setState(625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(615);
					open_paren();
					setState(616);
					signed_number();
					setState(617);
					close_paren();
					}
					break;
				case 2:
					{
					setState(619);
					open_paren();
					setState(620);
					signed_number();
					setState(621);
					comma_symbol();
					setState(622);
					signed_number();
					setState(623);
					close_paren();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
	 
		public Column_constraintContext() { }
		public void copyFrom(Column_constraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullOrNotContext extends Column_constraintContext {
		public TerminalNode K_NULL() { return getToken(sqliteParser.K_NULL, 0); }
		public TerminalNode K_NOT() { return getToken(sqliteParser.K_NOT, 0); }
		public NullOrNotContext(Column_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterNullOrNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitNullOrNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitNullOrNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UniqueContext extends Column_constraintContext {
		public TerminalNode K_UNIQUE() { return getToken(sqliteParser.K_UNIQUE, 0); }
		public UniqueContext(Column_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterUnique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitUnique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitUnique(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForeignKeyContext extends Column_constraintContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public ForeignKeyContext(Column_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterForeignKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitForeignKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitForeignKey(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryKeyContext extends Column_constraintContext {
		public TerminalNode K_PRIMARY() { return getToken(sqliteParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(sqliteParser.K_KEY, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(sqliteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(sqliteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(sqliteParser.K_DESC, 0); }
		public PrimaryKeyContext(Column_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitPrimaryKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_column_constraint);
		int _la;
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				_localctx = new PrimaryKeyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(K_PRIMARY);
				setState(630);
				match(K_KEY);
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(631);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(634);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				_localctx = new NullOrNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(637);
					match(K_NOT);
					}
				}

				setState(640);
				match(K_NULL);
				}
				break;
			case K_UNIQUE:
				_localctx = new UniqueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(641);
				match(K_UNIQUE);
				}
				break;
			case K_REFERENCES:
				_localctx = new ForeignKeyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(642);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class None1Context extends ExprContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public None1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterNone1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitNone1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitNone1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MyExpressionContext extends ExprContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Dot_symbolContext> dot_symbol() {
			return getRuleContexts(Dot_symbolContext.class);
		}
		public Dot_symbolContext dot_symbol(int i) {
			return getRuleContext(Dot_symbolContext.class,i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Open_parenContext open_paren() {
			return getRuleContext(Open_parenContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Close_parenContext close_paren() {
			return getRuleContext(Close_parenContext.class,0);
		}
		public TerminalNode K_CAST() { return getToken(sqliteParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(sqliteParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(sqliteParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(sqliteParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(sqliteParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(sqliteParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(sqliteParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(sqliteParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(sqliteParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(sqliteParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(sqliteParser.K_ELSE, 0); }
		public TerminalNode PIPE2() { return getToken(sqliteParser.PIPE2, 0); }
		public TerminalNode STAR() { return getToken(sqliteParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(sqliteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(sqliteParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(sqliteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(sqliteParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(sqliteParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(sqliteParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(sqliteParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(sqliteParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(sqliteParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(sqliteParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(sqliteParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(sqliteParser.GT_EQ, 0); }
		public Assign_symbolContext assign_symbol() {
			return getRuleContext(Assign_symbolContext.class,0);
		}
		public TerminalNode EQ() { return getToken(sqliteParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(sqliteParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(sqliteParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(sqliteParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(sqliteParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(sqliteParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(sqliteParser.K_GLOB, 0); }
		public TerminalNode K_AND() { return getToken(sqliteParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(sqliteParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(sqliteParser.K_BETWEEN, 0); }
		public TerminalNode K_ISNULL() { return getToken(sqliteParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(sqliteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(sqliteParser.K_NULL, 0); }
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public MyExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterMyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitMyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitMyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(646);
				literal_value();
				}
				break;
			case 2:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(650);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						setState(647);
						database_name();
						setState(648);
						dot_symbol();
						}
						break;
					}
					setState(652);
					table_name();
					setState(653);
					dot_symbol();
					}
					break;
				}
				setState(657);
				column_name();
				}
				break;
			case 3:
				{
				_localctx = new None1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(658);
				unary_operator();
				setState(659);
				expr(18);
				}
				break;
			case 4:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(661);
				open_paren();
				setState(662);
				expr(0);
				setState(663);
				close_paren();
				}
				break;
			case 5:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(665);
				match(K_CAST);
				setState(666);
				open_paren();
				setState(667);
				expr(0);
				setState(668);
				match(K_AS);
				setState(669);
				type_name();
				setState(670);
				close_paren();
				}
				break;
			case 6:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(672);
						match(K_NOT);
						}
					}

					setState(675);
					match(K_EXISTS);
					}
				}

				setState(678);
				open_paren();
				setState(679);
				select_stmt();
				setState(680);
				close_paren();
				}
				break;
			case 7:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(682);
				match(K_CASE);
				setState(684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(683);
					expr(0);
					}
					break;
				}
				setState(691); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(686);
					match(K_WHEN);
					setState(687);
					expr(0);
					setState(688);
					match(K_THEN);
					setState(689);
					expr(0);
					}
					}
					setState(693); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(695);
					match(K_ELSE);
					setState(696);
					expr(0);
					}
				}

				setState(699);
				match(K_END);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(796);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(794);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(703);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(704);
						match(PIPE2);
						setState(705);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(706);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(707);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(708);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(709);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(710);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(711);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(712);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(713);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(714);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(715);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(716);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(717);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(718);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(729);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
						case 1:
							{
							setState(719);
							assign_symbol();
							}
							break;
						case 2:
							{
							setState(720);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(721);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(722);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(723);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(724);
							match(K_IS);
							setState(725);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(726);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(727);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(728);
							match(K_GLOB);
							}
							break;
						}
						setState(731);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(732);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(733);
						match(K_AND);
						setState(734);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(735);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(736);
						match(K_OR);
						setState(737);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(738);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(740);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(739);
							match(K_NOT);
							}
						}

						setState(742);
						_la = _input.LA(1);
						if ( !(_la==K_GLOB || _la==K_LIKE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(743);
						expr(8);
						}
						break;
					case 10:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(744);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(745);
						match(K_IS);
						setState(747);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
						case 1:
							{
							setState(746);
							match(K_NOT);
							}
							break;
						}
						setState(749);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(750);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(752);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(751);
							match(K_NOT);
							}
						}

						setState(754);
						match(K_BETWEEN);
						setState(755);
						expr(0);
						setState(756);
						match(K_AND);
						setState(757);
						expr(5);
						}
						break;
					case 12:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(759);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(764);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(760);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(761);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(762);
							match(K_NOT);
							setState(763);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 13:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(766);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(768);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(767);
							match(K_NOT);
							}
						}

						setState(770);
						match(K_IN);
						setState(792);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
						case 1:
							{
							setState(771);
							open_paren();
							setState(782);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
							case 1:
								{
								setState(772);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(773);
								expr(0);
								setState(779);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(774);
									comma_symbol();
									setState(775);
									expr(0);
									}
									}
									setState(781);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(784);
							close_paren();
							}
							break;
						case 2:
							{
							setState(789);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
							case 1:
								{
								setState(786);
								database_name();
								setState(787);
								dot_symbol();
								}
								break;
							}
							setState(791);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(798);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
	 
		public Foreign_key_clauseContext() { }
		public void copyFrom(Foreign_key_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReferencesContext extends Foreign_key_clauseContext {
		public TerminalNode K_REFERENCES() { return getToken(sqliteParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Open_parenContext open_paren() {
			return getRuleContext(Open_parenContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Close_parenContext close_paren() {
			return getRuleContext(Close_parenContext.class,0);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public ReferencesContext(Foreign_key_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitReferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_foreign_key_clause);
		int _la;
		try {
			_localctx = new ReferencesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(K_REFERENCES);
			setState(800);
			foreign_table();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(801);
				open_paren();
				setState(802);
				column_name();
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(803);
					comma_symbol();
					setState(804);
					column_name();
					}
					}
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(811);
				close_paren();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
	 
		public Indexed_columnContext() { }
		public void copyFrom(Indexed_columnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexedColumnContext extends Indexed_columnContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(sqliteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(sqliteParser.K_DESC, 0); }
		public IndexedColumnContext(Indexed_columnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterIndexedColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitIndexedColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitIndexedColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_indexed_column);
		int _la;
		try {
			_localctx = new IndexedColumnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			column_name();
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(816);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
	 
		public Table_constraintContext() { }
		public void copyFrom(Table_constraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableConstraintContext extends Table_constraintContext {
		public Open_parenContext open_paren() {
			return getRuleContext(Open_parenContext.class,0);
		}
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public Close_parenContext close_paren() {
			return getRuleContext(Close_parenContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(sqliteParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(sqliteParser.K_KEY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(sqliteParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(sqliteParser.K_UNIQUE, 0); }
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public TableConstraintContext(Table_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitTableConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_constraint);
		int _la;
		try {
			_localctx = new TableConstraintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(822);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(819);
					match(K_PRIMARY);
					setState(820);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(821);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(824);
				open_paren();
				setState(825);
				indexed_column();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(826);
					comma_symbol();
					setState(827);
					indexed_column();
					}
					}
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(834);
				close_paren();
				}
				break;
			case K_FOREIGN:
				{
				setState(836);
				match(K_FOREIGN);
				setState(837);
				match(K_KEY);
				setState(838);
				open_paren();
				setState(839);
				column_name();
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(840);
					comma_symbol();
					setState(841);
					column_name();
					}
					}
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(848);
				close_paren();
				setState(849);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_clauseContext extends ParserRuleContext {
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
	 
		public With_clauseContext() { }
		public void copyFrom(With_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WithClauseContext extends With_clauseContext {
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(sqliteParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(sqliteParser.K_AS, i);
		}
		public List<Open_parenContext> open_paren() {
			return getRuleContexts(Open_parenContext.class);
		}
		public Open_parenContext open_paren(int i) {
			return getRuleContext(Open_parenContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<Close_parenContext> close_paren() {
			return getRuleContexts(Close_parenContext.class);
		}
		public Close_parenContext close_paren(int i) {
			return getRuleContext(Close_parenContext.class,i);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public WithClauseContext(With_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_with_clause);
		int _la;
		try {
			_localctx = new WithClauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			cte_table_name();
			setState(854);
			match(K_AS);
			setState(855);
			open_paren();
			setState(856);
			select_stmt();
			setState(857);
			close_paren();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(858);
				comma_symbol();
				setState(859);
				cte_table_name();
				setState(860);
				match(K_AS);
				setState(861);
				open_paren();
				setState(862);
				select_stmt();
				setState(863);
				close_paren();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
	 
		public Qualified_table_nameContext() { }
		public void copyFrom(Qualified_table_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QualifiedTableNameContext extends Qualified_table_nameContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Dot_symbolContext dot_symbol() {
			return getRuleContext(Dot_symbolContext.class,0);
		}
		public QualifiedTableNameContext(Qualified_table_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterQualifiedTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitQualifiedTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitQualifiedTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_qualified_table_name);
		try {
			_localctx = new QualifiedTableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(870);
				database_name();
				setState(871);
				dot_symbol();
				}
				break;
			}
			setState(875);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
	 
		public Ordering_termContext() { }
		public void copyFrom(Ordering_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrderingTermContext extends Ordering_termContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(sqliteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(sqliteParser.K_DESC, 0); }
		public OrderingTermContext(Ordering_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterOrderingTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitOrderingTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitOrderingTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ordering_term);
		int _la;
		try {
			_localctx = new OrderingTermContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			expr(0);
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(878);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
	 
		public Common_table_expressionContext() { }
		public void copyFrom(Common_table_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommonTableExpressionContext extends Common_table_expressionContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(sqliteParser.K_AS, 0); }
		public List<Open_parenContext> open_paren() {
			return getRuleContexts(Open_parenContext.class);
		}
		public Open_parenContext open_paren(int i) {
			return getRuleContext(Open_parenContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Close_parenContext> close_paren() {
			return getRuleContexts(Close_parenContext.class);
		}
		public Close_parenContext close_paren(int i) {
			return getRuleContext(Close_parenContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public CommonTableExpressionContext(Common_table_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterCommonTableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitCommonTableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitCommonTableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_common_table_expression);
		int _la;
		try {
			_localctx = new CommonTableExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			table_name();
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(882);
				open_paren();
				setState(883);
				column_name();
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(884);
					comma_symbol();
					setState(885);
					column_name();
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(892);
				close_paren();
				}
			}

			setState(896);
			match(K_AS);
			setState(897);
			open_paren();
			setState(898);
			select_stmt();
			setState(899);
			close_paren();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
	 
		public Result_columnContext() { }
		public void copyFrom(Result_columnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MystartContext extends Result_columnContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Dot_symbolContext dot_symbol() {
			return getRuleContext(Dot_symbolContext.class,0);
		}
		public TerminalNode STAR() { return getToken(sqliteParser.STAR, 0); }
		public MystartContext(Result_columnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterMystart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitMystart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitMystart(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MyStarContext extends Result_columnContext {
		public TerminalNode STAR() { return getToken(sqliteParser.STAR, 0); }
		public MyStarContext(Result_columnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterMyStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitMyStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitMyStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionAliasContext extends Result_columnContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(sqliteParser.K_AS, 0); }
		public ExpressionAliasContext(Result_columnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterExpressionAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitExpressionAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitExpressionAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_result_column);
		int _la;
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				_localctx = new MyStarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				match(STAR);
				}
				break;
			case 2:
				_localctx = new MystartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				table_name();
				setState(903);
				dot_symbol();
				setState(904);
				match(STAR);
				}
				break;
			case 3:
				_localctx = new ExpressionAliasContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(906);
				expr(0);
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(908);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(907);
						match(K_AS);
						}
					}

					setState(910);
					column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
	 
		public Table_or_subqueryContext() { }
		public void copyFrom(Table_or_subqueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableORSubqueryAContext extends Table_or_subqueryContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Dot_symbolContext dot_symbol() {
			return getRuleContext(Dot_symbolContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(sqliteParser.K_AS, 0); }
		public Open_parenContext open_paren() {
			return getRuleContext(Open_parenContext.class,0);
		}
		public Close_parenContext close_paren() {
			return getRuleContext(Close_parenContext.class,0);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TableORSubqueryAContext(Table_or_subqueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterTableORSubqueryA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitTableORSubqueryA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitTableORSubqueryA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_table_or_subquery);
		int _la;
		try {
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				_localctx = new TableORSubqueryAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(915);
					database_name();
					setState(916);
					dot_symbol();
					}
					break;
				}
				setState(920);
				table_name();
				setState(925);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(922);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						setState(921);
						match(K_AS);
						}
						break;
					}
					setState(924);
					table_alias();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new TableORSubqueryAContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				open_paren();
				setState(938);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(928);
					table_or_subquery();
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(929);
						comma_symbol();
						setState(930);
						table_or_subquery();
						}
						}
						setState(936);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(937);
					join_clause();
					}
					break;
				}
				setState(940);
				close_paren();
				setState(945);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(942);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
					case 1:
						{
						setState(941);
						match(K_AS);
						}
						break;
					}
					setState(944);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new TableORSubqueryAContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(947);
				open_paren();
				setState(948);
				select_stmt();
				setState(949);
				close_paren();
				setState(954);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(951);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
					case 1:
						{
						setState(950);
						match(K_AS);
						}
						break;
					}
					setState(953);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			table_or_subquery();
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << K_CROSS) | (1L << K_INNER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_JOIN - 68)) | (1L << (K_LEFT - 68)) | (1L << (K_NATURAL - 68)))) != 0)) {
				{
				{
				setState(959);
				join_operator();
				setState(960);
				table_or_subquery();
				setState(961);
				join_constraint();
				}
				}
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
	 
		public Join_operatorContext() { }
		public void copyFrom(Join_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoneContext extends Join_operatorContext {
		public Comma_symbolContext comma_symbol() {
			return getRuleContext(Comma_symbolContext.class,0);
		}
		public NoneContext(Join_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitNone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinOperatorContext extends Join_operatorContext {
		public TerminalNode K_JOIN() { return getToken(sqliteParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(sqliteParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(sqliteParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(sqliteParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(sqliteParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(sqliteParser.K_OUTER, 0); }
		public JoinOperatorContext(Join_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterJoinOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitJoinOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitJoinOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_join_operator);
		int _la;
		try {
			setState(981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new NoneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				comma_symbol();
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				_localctx = new JoinOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(969);
					match(K_NATURAL);
					}
				}

				setState(978);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(972);
					match(K_LEFT);
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(973);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(976);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(977);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(980);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
	 
		public Join_constraintContext() { }
		public void copyFrom(Join_constraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinConstraintContext extends Join_constraintContext {
		public TerminalNode K_ON() { return getToken(sqliteParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(sqliteParser.K_USING, 0); }
		public Open_parenContext open_paren() {
			return getRuleContext(Open_parenContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Close_parenContext close_paren() {
			return getRuleContext(Close_parenContext.class,0);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public JoinConstraintContext(Join_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterJoinConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitJoinConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitJoinConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_join_constraint);
		int _la;
		try {
			_localctx = new JoinConstraintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(983);
				match(K_ON);
				setState(984);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(985);
				match(K_USING);
				setState(986);
				open_paren();
				setState(987);
				column_name();
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(988);
					comma_symbol();
					setState(989);
					column_name();
					}
					}
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(996);
				close_paren();
				}
				break;
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_CROSS:
			case K_EXCEPT:
			case K_GROUP:
			case K_INNER:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_UNION:
			case K_WHERE:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
	 
		public Select_coreContext() { }
		public void copyFrom(Select_coreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectCoreContext extends Select_coreContext {
		public TerminalNode K_SELECT() { return getToken(sqliteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(sqliteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(sqliteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(sqliteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(sqliteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(sqliteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(sqliteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(sqliteParser.K_HAVING, 0); }
		public SelectCoreContext(Select_coreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterSelectCore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitSelectCore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitSelectCore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_select_core);
		int _la;
		try {
			_localctx = new SelectCoreContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(K_SELECT);
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1001);
				_la = _input.LA(1);
				if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1004);
			result_column();
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1005);
				comma_symbol();
				setState(1006);
				result_column();
				}
				}
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(1013);
				match(K_FROM);
				setState(1024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1014);
					table_or_subquery();
					setState(1020);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1015);
						comma_symbol();
						setState(1016);
						table_or_subquery();
						}
						}
						setState(1022);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1023);
					join_clause();
					}
					break;
				}
				}
			}

			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1028);
				match(K_WHERE);
				setState(1029);
				expr(0);
				}
			}

			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_GROUP) {
				{
				setState(1032);
				match(K_GROUP);
				setState(1033);
				match(K_BY);
				setState(1034);
				expr(0);
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1035);
					comma_symbol();
					setState(1036);
					expr(0);
					}
					}
					setState(1042);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_HAVING) {
					{
					setState(1043);
					match(K_HAVING);
					setState(1044);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_operatorContext extends ParserRuleContext {
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
	 
		public Compound_operatorContext() { }
		public void copyFrom(Compound_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompoundPperatorContext extends Compound_operatorContext {
		public TerminalNode K_UNION() { return getToken(sqliteParser.K_UNION, 0); }
		public CompoundPperatorContext(Compound_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterCompoundPperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitCompoundPperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitCompoundPperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompoundOperatorContext extends Compound_operatorContext {
		public TerminalNode K_UNION() { return getToken(sqliteParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(sqliteParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(sqliteParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(sqliteParser.K_EXCEPT, 0); }
		public CompoundOperatorContext(Compound_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterCompoundOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitCompoundOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitCompoundOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_compound_operator);
		try {
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				_localctx = new CompoundPperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				match(K_UNION);
				}
				break;
			case 2:
				_localctx = new CompoundOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1050);
				match(K_UNION);
				setState(1051);
				match(K_ALL);
				}
				break;
			case 3:
				_localctx = new CompoundOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1052);
				match(K_INTERSECT);
				}
				break;
			case 4:
				_localctx = new CompoundOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1053);
				match(K_EXCEPT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
	 
		public Cte_table_nameContext() { }
		public void copyFrom(Cte_table_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CteTableNameContext extends Cte_table_nameContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Open_parenContext open_paren() {
			return getRuleContext(Open_parenContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Close_parenContext close_paren() {
			return getRuleContext(Close_parenContext.class,0);
		}
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public CteTableNameContext(Cte_table_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterCteTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitCteTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitCteTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cte_table_name);
		int _la;
		try {
			_localctx = new CteTableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			table_name();
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1057);
				open_paren();
				setState(1058);
				column_name();
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1059);
					comma_symbol();
					setState(1060);
					column_name();
					}
					}
					setState(1066);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1067);
				close_paren();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
	 
		public Signed_numberContext() { }
		public void copyFrom(Signed_numberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SignedNumberContext extends Signed_numberContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(sqliteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(sqliteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(sqliteParser.MINUS, 0); }
		public SignedNumberContext(Signed_numberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterSignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitSignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitSignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_signed_number);
		int _la;
		try {
			_localctx = new SignedNumberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1071);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1074);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
	 
		public Literal_valueContext() { }
		public void copyFrom(Literal_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralValueContext extends Literal_valueContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(sqliteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(sqliteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(sqliteParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(sqliteParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(sqliteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(sqliteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(sqliteParser.K_CURRENT_TIMESTAMP, 0); }
		public LiteralValueContext(Literal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitLiteralValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal_value);
		try {
			setState(1083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				match(STRING_LITERAL);
				}
				break;
			case BLOB_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1078);
				match(BLOB_LITERAL);
				}
				break;
			case K_NULL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1079);
				match(K_NULL);
				}
				break;
			case K_CURRENT_TIME:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1080);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_DATE:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1081);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1082);
				match(K_CURRENT_TIMESTAMP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	 
		public Unary_operatorContext() { }
		public void copyFrom(Unary_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryOperatorContext extends Unary_operatorContext {
		public TerminalNode MINUS() { return getToken(sqliteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(sqliteParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(sqliteParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(sqliteParser.K_NOT, 0); }
		public UnaryOperatorContext(Unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unary_operator);
		try {
			setState(1089);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				match(MINUS);
				}
				break;
			case PLUS:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
				match(PLUS);
				}
				break;
			case TILDE:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1087);
				match(TILDE);
				}
				break;
			case K_NOT:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1088);
				match(K_NOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
	 
		public Column_aliasContext() { }
		public void copyFrom(Column_aliasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnAliasContext extends Column_aliasContext {
		public TerminalNode IDENTIFIER() { return getToken(sqliteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(sqliteParser.STRING_LITERAL, 0); }
		public ColumnAliasContext(Column_aliasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterColumnAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitColumnAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitColumnAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_column_alias);
		try {
			setState(1093);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ColumnAliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				_localctx = new ColumnAliasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_symbolContext extends ParserRuleContext {
		public Dot_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_symbol; }
	 
		public Dot_symbolContext() { }
		public void copyFrom(Dot_symbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetDotContext extends Dot_symbolContext {
		public TerminalNode DOT() { return getToken(sqliteParser.DOT, 0); }
		public GetDotContext(Dot_symbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_symbolContext dot_symbol() throws RecognitionException {
		Dot_symbolContext _localctx = new Dot_symbolContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dot_symbol);
		try {
			_localctx = new GetDotContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comma_symbolContext extends ParserRuleContext {
		public Comma_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_symbol; }
	 
		public Comma_symbolContext() { }
		public void copyFrom(Comma_symbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetCommaContext extends Comma_symbolContext {
		public TerminalNode COMMA() { return getToken(sqliteParser.COMMA, 0); }
		public GetCommaContext(Comma_symbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_symbolContext comma_symbol() throws RecognitionException {
		Comma_symbolContext _localctx = new Comma_symbolContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_comma_symbol);
		try {
			_localctx = new GetCommaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semicolon_symbolContext extends ParserRuleContext {
		public Semicolon_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_symbol; }
	 
		public Semicolon_symbolContext() { }
		public void copyFrom(Semicolon_symbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetSCOLContext extends Semicolon_symbolContext {
		public TerminalNode SCOL() { return getToken(sqliteParser.SCOL, 0); }
		public GetSCOLContext(Semicolon_symbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetSCOL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetSCOL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetSCOL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_symbolContext semicolon_symbol() throws RecognitionException {
		Semicolon_symbolContext _localctx = new Semicolon_symbolContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_semicolon_symbol);
		try {
			_localctx = new GetSCOLContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_parenContext extends ParserRuleContext {
		public Open_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_paren; }
	 
		public Open_parenContext() { }
		public void copyFrom(Open_parenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetOpenParContext extends Open_parenContext {
		public TerminalNode OPEN_PAR() { return getToken(sqliteParser.OPEN_PAR, 0); }
		public GetOpenParContext(Open_parenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetOpenPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetOpenPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetOpenPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_parenContext open_paren() throws RecognitionException {
		Open_parenContext _localctx = new Open_parenContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_open_paren);
		try {
			_localctx = new GetOpenParContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(OPEN_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_parenContext extends ParserRuleContext {
		public Close_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_paren; }
	 
		public Close_parenContext() { }
		public void copyFrom(Close_parenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetCloseParContext extends Close_parenContext {
		public TerminalNode CLOSE_PAR() { return getToken(sqliteParser.CLOSE_PAR, 0); }
		public GetCloseParContext(Close_parenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetClosePar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetClosePar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetClosePar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_parenContext close_paren() throws RecognitionException {
		Close_parenContext _localctx = new Close_parenContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_close_paren);
		try {
			_localctx = new GetCloseParContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_symbolContext extends ParserRuleContext {
		public Assign_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_symbol; }
	 
		public Assign_symbolContext() { }
		public void copyFrom(Assign_symbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetAssignContext extends Assign_symbolContext {
		public TerminalNode ASSIGN() { return getToken(sqliteParser.ASSIGN, 0); }
		public GetAssignContext(Assign_symbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_symbolContext assign_symbol() throws RecognitionException {
		Assign_symbolContext _localctx = new Assign_symbolContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assign_symbol);
		try {
			_localctx = new GetAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(sqliteParser.K_ADD, 0); }
		public TerminalNode K_ALL() { return getToken(sqliteParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(sqliteParser.K_ALTER, 0); }
		public TerminalNode K_AND() { return getToken(sqliteParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(sqliteParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(sqliteParser.K_ASC, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(sqliteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BETWEEN() { return getToken(sqliteParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(sqliteParser.K_BY, 0); }
		public TerminalNode K_CASE() { return getToken(sqliteParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(sqliteParser.K_CAST, 0); }
		public TerminalNode K_COLUMN() { return getToken(sqliteParser.K_COLUMN, 0); }
		public TerminalNode K_CREATE() { return getToken(sqliteParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(sqliteParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(sqliteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(sqliteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(sqliteParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(sqliteParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(sqliteParser.K_DEFAULT, 0); }
		public TerminalNode K_DELETE() { return getToken(sqliteParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(sqliteParser.K_DESC, 0); }
		public TerminalNode K_DISTINCT() { return getToken(sqliteParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(sqliteParser.K_DROP, 0); }
		public TerminalNode K_ELSE() { return getToken(sqliteParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(sqliteParser.K_END, 0); }
		public TerminalNode K_EXCEPT() { return getToken(sqliteParser.K_EXCEPT, 0); }
		public TerminalNode K_EXISTS() { return getToken(sqliteParser.K_EXISTS, 0); }
		public TerminalNode K_FOR() { return getToken(sqliteParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(sqliteParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(sqliteParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(sqliteParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(sqliteParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(sqliteParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(sqliteParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(sqliteParser.K_IF, 0); }
		public TerminalNode K_IN() { return getToken(sqliteParser.K_IN, 0); }
		public TerminalNode K_INNER() { return getToken(sqliteParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(sqliteParser.K_INSERT, 0); }
		public TerminalNode K_INTERSECT() { return getToken(sqliteParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(sqliteParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(sqliteParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(sqliteParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(sqliteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(sqliteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(sqliteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(sqliteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(sqliteParser.K_LIMIT, 0); }
		public TerminalNode K_NATURAL() { return getToken(sqliteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(sqliteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(sqliteParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(sqliteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(sqliteParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(sqliteParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(sqliteParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(sqliteParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(sqliteParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(sqliteParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(sqliteParser.K_OUTER, 0); }
		public TerminalNode K_PRIMARY() { return getToken(sqliteParser.K_PRIMARY, 0); }
		public TerminalNode K_REFERENCES() { return getToken(sqliteParser.K_REFERENCES, 0); }
		public TerminalNode K_RENAME() { return getToken(sqliteParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(sqliteParser.K_REPLACE, 0); }
		public TerminalNode K_RIGHT() { return getToken(sqliteParser.K_RIGHT, 0); }
		public TerminalNode K_ROW() { return getToken(sqliteParser.K_ROW, 0); }
		public TerminalNode K_SELECT() { return getToken(sqliteParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(sqliteParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(sqliteParser.K_TABLE, 0); }
		public TerminalNode K_THEN() { return getToken(sqliteParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(sqliteParser.K_TO, 0); }
		public TerminalNode K_UNION() { return getToken(sqliteParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(sqliteParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(sqliteParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(sqliteParser.K_USING, 0); }
		public TerminalNode K_VALUES() { return getToken(sqliteParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(sqliteParser.K_VIEW, 0); }
		public TerminalNode K_WHEN() { return getToken(sqliteParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(sqliteParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(sqliteParser.K_WITH, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ADD) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTOINCREMENT) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLUMN) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_ELSE) | (1L << K_END) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FOR) | (1L << K_FOREIGN) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IN) | (1L << K_INNER) | (1L << K_INSERT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROW - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THEN - 64)) | (1L << (K_TO - 64)) | (1L << (K_UNION - 64)) | (1L << (K_UNIQUE - 64)) | (1L << (K_UPDATE - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_VIEW - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	 
		public NameContext() { }
		public void copyFrom(NameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeNameContext extends NameContext {
		public TerminalNode INT() { return getToken(sqliteParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(sqliteParser.INTEGER, 0); }
		public TerminalNode TINYINT() { return getToken(sqliteParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(sqliteParser.SMALLINT, 0); }
		public TerminalNode MEDIUMINT() { return getToken(sqliteParser.MEDIUMINT, 0); }
		public TerminalNode BIGINT() { return getToken(sqliteParser.BIGINT, 0); }
		public TerminalNode UNSIGNED() { return getToken(sqliteParser.UNSIGNED, 0); }
		public TerminalNode BIG() { return getToken(sqliteParser.BIG, 0); }
		public TerminalNode TEXT() { return getToken(sqliteParser.TEXT, 0); }
		public TerminalNode BLOB() { return getToken(sqliteParser.BLOB, 0); }
		public TerminalNode REAL() { return getToken(sqliteParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(sqliteParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(sqliteParser.FLOAT, 0); }
		public TerminalNode NUMERIC() { return getToken(sqliteParser.NUMERIC, 0); }
		public TerminalNode BOOLEAN() { return getToken(sqliteParser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(sqliteParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(sqliteParser.DATETIME, 0); }
		public TypeNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_name);
		try {
			_localctx = new TypeNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(1109);
				match(INT);
				}
				break;
			case INTEGER:
				{
				setState(1110);
				match(INTEGER);
				}
				break;
			case TINYINT:
				{
				setState(1111);
				match(TINYINT);
				}
				break;
			case SMALLINT:
				{
				setState(1112);
				match(SMALLINT);
				}
				break;
			case MEDIUMINT:
				{
				setState(1113);
				match(MEDIUMINT);
				}
				break;
			case BIGINT:
				{
				setState(1114);
				match(BIGINT);
				}
				break;
			case UNSIGNED:
				{
				setState(1115);
				match(UNSIGNED);
				setState(1116);
				match(BIG);
				setState(1117);
				match(INT);
				}
				break;
			case TEXT:
				{
				setState(1118);
				match(TEXT);
				}
				break;
			case BLOB:
				{
				setState(1119);
				match(BLOB);
				}
				break;
			case REAL:
				{
				setState(1120);
				match(REAL);
				}
				break;
			case DOUBLE:
				{
				setState(1121);
				match(DOUBLE);
				}
				break;
			case FLOAT:
				{
				setState(1122);
				match(FLOAT);
				}
				break;
			case NUMERIC:
				{
				setState(1123);
				match(NUMERIC);
				}
				break;
			case BOOLEAN:
				{
				setState(1124);
				match(BOOLEAN);
				}
				break;
			case DATE:
				{
				setState(1125);
				match(DATE);
				}
				break;
			case DATETIME:
				{
				setState(1126);
				match(DATETIME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_with_bracketsContext extends ParserRuleContext {
		public Name_with_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_with_brackets; }
	 
		public Name_with_bracketsContext() { }
		public void copyFrom(Name_with_bracketsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeNameWithBracketsContext extends Name_with_bracketsContext {
		public TerminalNode CHARACTER() { return getToken(sqliteParser.CHARACTER, 0); }
		public TerminalNode VARCHAR() { return getToken(sqliteParser.VARCHAR, 0); }
		public TerminalNode NCHAR() { return getToken(sqliteParser.NCHAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(sqliteParser.NVARCHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(sqliteParser.DECIMAL, 0); }
		public TypeNameWithBracketsContext(Name_with_bracketsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterTypeNameWithBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitTypeNameWithBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitTypeNameWithBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_with_bracketsContext name_with_brackets() throws RecognitionException {
		Name_with_bracketsContext _localctx = new Name_with_bracketsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_name_with_brackets);
		int _la;
		try {
			_localctx = new TypeNameWithBracketsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (CHARACTER - 121)) | (1L << (VARCHAR - 121)) | (1L << (NCHAR - 121)) | (1L << (NVARCHAR - 121)) | (1L << (DECIMAL - 121)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
	 
		public Database_nameContext() { }
		public void copyFrom(Database_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetDatabaseNameContext extends Database_nameContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public GetDatabaseNameContext(Database_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_database_name);
		try {
			_localctx = new GetDatabaseNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	 
		public Table_nameContext() { }
		public void copyFrom(Table_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetTableNameContext extends Table_nameContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public GetTableNameContext(Table_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_table_name);
		try {
			_localctx = new GetTableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
	 
		public New_table_nameContext() { }
		public void copyFrom(New_table_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetNewTableNameContext extends New_table_nameContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public GetNewTableNameContext(New_table_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetNewTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetNewTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetNewTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_new_table_name);
		try {
			_localctx = new GetNewTableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
	 
		public Column_nameContext() { }
		public void copyFrom(Column_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetColumnNameContext extends Column_nameContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public GetColumnNameContext(Column_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_column_name);
		try {
			_localctx = new GetColumnNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
	 
		public Foreign_tableContext() { }
		public void copyFrom(Foreign_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetForeignTableNameContext extends Foreign_tableContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public GetForeignTableNameContext(Foreign_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetForeignTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetForeignTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetForeignTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_foreign_table);
		try {
			_localctx = new GetForeignTableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
	 
		public Table_aliasContext() { }
		public void copyFrom(Table_aliasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetTableAliasContext extends Table_aliasContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public GetTableAliasContext(Table_aliasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterGetTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitGetTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitGetTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_table_alias);
		try {
			_localctx = new GetTableAliasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
	 
		public Any_nameContext() { }
		public void copyFrom(Any_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends Any_nameContext {
		public TerminalNode IDENTIFIER() { return getToken(sqliteParser.IDENTIFIER, 0); }
		public IdentifierContext(Any_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends Any_nameContext {
		public TerminalNode STRING_LITERAL() { return getToken(sqliteParser.STRING_LITERAL, 0); }
		public StringLiteralContext(Any_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeyWordLContext extends Any_nameContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public KeyWordLContext(Any_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterKeyWordL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitKeyWordL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitKeyWordL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReAnyNameContext extends Any_nameContext {
		public TerminalNode OPEN_PAR() { return getToken(sqliteParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(sqliteParser.CLOSE_PAR, 0); }
		public ReAnyNameContext(Any_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterReAnyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitReAnyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitReAnyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_any_name);
		try {
			setState(1150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				match(IDENTIFIER);
				}
				break;
			case K_ADD:
			case K_ALL:
			case K_ALTER:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_AUTOINCREMENT:
			case K_BETWEEN:
			case K_BY:
			case K_CASE:
			case K_CAST:
			case K_COLUMN:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DELETE:
			case K_DESC:
			case K_DISTINCT:
			case K_DROP:
			case K_ELSE:
			case K_END:
			case K_EXCEPT:
			case K_EXISTS:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IN:
			case K_INNER:
			case K_INSERT:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PRIMARY:
			case K_REFERENCES:
			case K_RENAME:
			case K_REPLACE:
			case K_RIGHT:
			case K_ROW:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_THEN:
			case K_TO:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VALUES:
			case K_VIEW:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
				_localctx = new KeyWordLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
				keyword();
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1145);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				_localctx = new ReAnyNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1146);
				match(OPEN_PAR);
				setState(1147);
				any_name();
				setState(1148);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0088\u0483\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\7\2u\n\2\f\2\16"+
		"\2x\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u008b\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u0092\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u009a\n\5\3\5\5\5\u009d\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u00a4"+
		"\n\6\f\6\16\6\u00a7\13\6\5\6\u00a9\n\6\3\6\3\6\3\6\5\6\u00ae\n\6\3\6\3"+
		"\6\5\6\u00b2\n\6\3\6\6\6\u00b5\n\6\r\6\16\6\u00b6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u00bf\n\6\f\6\16\6\u00c2\13\6\5\6\u00c4\n\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00ca\n\6\3\6\5\6\u00cd\n\6\5\6\u00cf\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00d6"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00de\n\7\f\7\16\7\u00e1\13\7\3\7\3\7"+
		"\3\7\7\7\u00e6\n\7\f\7\16\7\u00e9\13\7\3\7\3\7\3\7\3\7\5\7\u00ef\n\7\3"+
		"\b\5\b\u00f2\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f9\n\b\3\t\5\t\u00fc\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0103\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u010b\n\t"+
		"\f\t\16\t\u010e\13\t\5\t\u0110\n\t\3\t\3\t\3\t\3\t\5\t\u0116\n\t\3\t\5"+
		"\t\u0119\n\t\5\t\u011b\n\t\3\n\3\n\3\n\3\n\5\n\u0121\n\n\3\n\3\n\3\n\5"+
		"\n\u0126\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u012f\n\13\f\13\16"+
		"\13\u0132\13\13\5\13\u0134\n\13\3\13\3\13\3\13\3\13\7\13\u013a\n\13\f"+
		"\13\16\13\u013d\13\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0145\n\13\f"+
		"\13\16\13\u0148\13\13\5\13\u014a\n\13\3\13\3\13\3\13\3\13\5\13\u0150\n"+
		"\13\3\13\5\13\u0153\n\13\5\13\u0155\n\13\3\f\5\f\u0158\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u015f\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0167\n\f\f\f\16\f"+
		"\u016a\13\f\3\f\3\f\5\f\u016e\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0176\n"+
		"\f\f\f\16\f\u0179\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0182\n\f\f\f\16"+
		"\f\u0185\13\f\3\f\3\f\7\f\u0189\n\f\f\f\16\f\u018c\13\f\3\f\5\f\u018f"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u0196\n\r\f\r\16\r\u0199\13\r\5\r\u019b\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01a4\n\r\f\r\16\r\u01a7\13\r\5\r\u01a9"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u01af\n\r\3\r\5\r\u01b2\n\r\5\r\u01b4\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u01bb\n\16\f\16\16\16\u01be\13\16\5\16\u01c0"+
		"\n\16\3\16\3\16\3\16\3\16\7\16\u01c6\n\16\f\16\16\16\u01c9\13\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u01d1\n\16\f\16\16\16\u01d4\13\16\5\16"+
		"\u01d6\n\16\3\16\3\16\3\16\3\16\5\16\u01dc\n\16\3\16\5\16\u01df\n\16\5"+
		"\16\u01e1\n\16\3\17\3\17\5\17\u01e5\n\17\3\17\3\17\3\17\3\17\7\17\u01eb"+
		"\n\17\f\17\16\17\u01ee\13\17\3\17\3\17\3\17\3\17\3\17\7\17\u01f5\n\17"+
		"\f\17\16\17\u01f8\13\17\3\17\5\17\u01fb\n\17\5\17\u01fd\n\17\3\17\3\17"+
		"\5\17\u0201\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0209\n\17\f\17\16"+
		"\17\u020c\13\17\3\17\3\17\5\17\u0210\n\17\5\17\u0212\n\17\3\20\5\20\u0215"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0222"+
		"\n\20\f\20\16\20\u0225\13\20\3\20\3\20\5\20\u0229\n\20\3\21\5\21\u022c"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0239"+
		"\n\21\f\21\16\21\u023c\13\21\3\21\3\21\5\21\u0240\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0248\n\21\f\21\16\21\u024b\13\21\5\21\u024d\n\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0253\n\21\3\21\5\21\u0256\n\21\5\21\u0258\n"+
		"\21\3\22\3\22\5\22\u025c\n\22\3\22\7\22\u025f\n\22\f\22\16\22\u0262\13"+
		"\22\3\23\3\23\6\23\u0266\n\23\r\23\16\23\u0267\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0274\n\23\5\23\u0276\n\23\3\24\3\24\3"+
		"\24\5\24\u027b\n\24\3\24\5\24\u027e\n\24\3\24\5\24\u0281\n\24\3\24\3\24"+
		"\3\24\5\24\u0286\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u028d\n\25\3\25\3"+
		"\25\3\25\5\25\u0292\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02a4\n\25\3\25\5\25\u02a7\n"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02af\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\6\25\u02b6\n\25\r\25\16\25\u02b7\3\25\3\25\5\25\u02bc\n\25\3\25"+
		"\3\25\5\25\u02c0\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u02dc\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u02e7\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u02ee\n\25\3\25\3\25\3"+
		"\25\5\25\u02f3\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u02ff\n\25\3\25\3\25\5\25\u0303\n\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u030c\n\25\f\25\16\25\u030f\13\25\5\25\u0311\n\25\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u0318\n\25\3\25\5\25\u031b\n\25\7\25\u031d\n\25"+
		"\f\25\16\25\u0320\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0329"+
		"\n\26\f\26\16\26\u032c\13\26\3\26\3\26\5\26\u0330\n\26\3\27\3\27\5\27"+
		"\u0334\n\27\3\30\3\30\3\30\5\30\u0339\n\30\3\30\3\30\3\30\3\30\3\30\7"+
		"\30\u0340\n\30\f\30\16\30\u0343\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\7\30\u034e\n\30\f\30\16\30\u0351\13\30\3\30\3\30\3\30\5"+
		"\30\u0356\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u0364\n\31\f\31\16\31\u0367\13\31\3\32\3\32\3\32\5\32\u036c"+
		"\n\32\3\32\3\32\3\33\3\33\5\33\u0372\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u037a\n\34\f\34\16\34\u037d\13\34\3\34\3\34\5\34\u0381\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u038f\n\35"+
		"\3\35\5\35\u0392\n\35\5\35\u0394\n\35\3\36\3\36\3\36\5\36\u0399\n\36\3"+
		"\36\3\36\5\36\u039d\n\36\3\36\5\36\u03a0\n\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u03a7\n\36\f\36\16\36\u03aa\13\36\3\36\5\36\u03ad\n\36\3\36\3\36"+
		"\5\36\u03b1\n\36\3\36\5\36\u03b4\n\36\3\36\3\36\3\36\3\36\5\36\u03ba\n"+
		"\36\3\36\5\36\u03bd\n\36\5\36\u03bf\n\36\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u03c6\n\37\f\37\16\37\u03c9\13\37\3 \3 \5 \u03cd\n \3 \3 \5 \u03d1\n"+
		" \3 \3 \5 \u03d5\n \3 \5 \u03d8\n \3!\3!\3!\3!\3!\3!\3!\3!\7!\u03e2\n"+
		"!\f!\16!\u03e5\13!\3!\3!\5!\u03e9\n!\3\"\3\"\5\"\u03ed\n\"\3\"\3\"\3\""+
		"\3\"\7\"\u03f3\n\"\f\"\16\"\u03f6\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u03fd\n"+
		"\"\f\"\16\"\u0400\13\"\3\"\5\"\u0403\n\"\5\"\u0405\n\"\3\"\3\"\5\"\u0409"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0411\n\"\f\"\16\"\u0414\13\"\3\"\3\""+
		"\5\"\u0418\n\"\5\"\u041a\n\"\3#\3#\3#\3#\3#\5#\u0421\n#\3$\3$\3$\3$\3"+
		"$\3$\7$\u0429\n$\f$\16$\u042c\13$\3$\3$\5$\u0430\n$\3%\5%\u0433\n%\3%"+
		"\3%\3&\3&\3&\3&\3&\3&\3&\5&\u043e\n&\3\'\3\'\3\'\3\'\5\'\u0444\n\'\3("+
		"\3(\5(\u0448\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\5\60\u046a\n\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\38\38\38\38\38\58\u0481\n8\38\2\3(9\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjln\2\f\4\2AAYY\4\2\35\35\61\61\4\2!!\60\60\4\2\t\t\16"+
		"\17\3\2\n\13\3\2\20\23\3\2\24\27\4\2;;II\3\2\34i\3\2{\177\2\u0531\2v\3"+
		"\2\2\2\4{\3\2\2\2\6\u008a\3\2\2\2\b\u008c\3\2\2\2\n\u00a8\3\2\2\2\f\u00d0"+
		"\3\2\2\2\16\u00f1\3\2\2\2\20\u00fb\3\2\2\2\22\u011c\3\2\2\2\24\u0133\3"+
		"\2\2\2\26\u0157\3\2\2\2\30\u019a\3\2\2\2\32\u01bf\3\2\2\2\34\u01e2\3\2"+
		"\2\2\36\u0214\3\2\2\2 \u022b\3\2\2\2\"\u0259\3\2\2\2$\u0275\3\2\2\2&\u0285"+
		"\3\2\2\2(\u02bf\3\2\2\2*\u0321\3\2\2\2,\u0331\3\2\2\2.\u0355\3\2\2\2\60"+
		"\u0357\3\2\2\2\62\u036b\3\2\2\2\64\u036f\3\2\2\2\66\u0373\3\2\2\28\u0393"+
		"\3\2\2\2:\u03be\3\2\2\2<\u03c0\3\2\2\2>\u03d7\3\2\2\2@\u03e8\3\2\2\2B"+
		"\u03ea\3\2\2\2D\u0420\3\2\2\2F\u0422\3\2\2\2H\u0432\3\2\2\2J\u043d\3\2"+
		"\2\2L\u0443\3\2\2\2N\u0447\3\2\2\2P\u0449\3\2\2\2R\u044b\3\2\2\2T\u044d"+
		"\3\2\2\2V\u044f\3\2\2\2X\u0451\3\2\2\2Z\u0453\3\2\2\2\\\u0455\3\2\2\2"+
		"^\u0469\3\2\2\2`\u046b\3\2\2\2b\u046d\3\2\2\2d\u046f\3\2\2\2f\u0471\3"+
		"\2\2\2h\u0473\3\2\2\2j\u0475\3\2\2\2l\u0477\3\2\2\2n\u0480\3\2\2\2pq\5"+
		"\6\4\2qr\5T+\2ru\3\2\2\2su\5\4\3\2tp\3\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\2\2\3z\3\3\2\2\2{|\7\u0088\2\2"+
		"|}\b\3\1\2}\5\3\2\2\2~\u008b\5\b\5\2\177\u008b\5\n\6\2\u0080\u008b\5\f"+
		"\7\2\u0081\u008b\5\16\b\2\u0082\u008b\5\20\t\2\u0083\u008b\5\22\n\2\u0084"+
		"\u008b\5\24\13\2\u0085\u008b\5\26\f\2\u0086\u008b\5\30\r\2\u0087\u008b"+
		"\5\32\16\2\u0088\u008b\5\36\20\2\u0089\u008b\5 \21\2\u008a~\3\2\2\2\u008a"+
		"\177\3\2\2\2\u008a\u0080\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u0082\3\2\2"+
		"\2\u008a\u0083\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086"+
		"\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\7\3\2\2\2\u008c\u008d\7\36\2\2\u008d\u0091\7^\2\2\u008e\u008f\5b\62\2"+
		"\u008f\u0090\5P)\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009c\5d\63\2\u0094\u0095\7X\2\2\u0095"+
		"\u0096\7`\2\2\u0096\u009d\5f\64\2\u0097\u0099\7\34\2\2\u0098\u009a\7\'"+
		"\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\5\"\22\2\u009c\u0094\3\2\2\2\u009c\u0097\3\2\2\2\u009d\t\3\2\2"+
		"\2\u009e\u009f\7i\2\2\u009f\u00a5\5\66\34\2\u00a0\u00a1\5R*\2\u00a1\u00a2"+
		"\5\66\34\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u009e\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00b4\5B\"\2\u00ab\u00ad\7a\2\2\u00ac\u00ae\7\35\2\2\u00ad\u00ac\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b2\7B\2\2\u00b0"+
		"\u00b2\7\65\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\5B\"\2\u00b4\u00b1\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00c3\3\2"+
		"\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7$\2\2\u00ba\u00c0\5\64\33\2\u00bb"+
		"\u00bc\5R*\2\u00bc\u00bd\5\64\33\2\u00bd\u00bf\3\2\2\2\u00be\u00bb\3\2"+
		"\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00b8\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00ce\3\2\2\2\u00c5\u00c6\7J\2\2\u00c6\u00cc\5(\25\2\u00c7"+
		"\u00ca\7Q\2\2\u00c8\u00ca\5R*\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2"+
		"\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\5(\25\2\u00cc\u00c9\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\13\3\2\2\2\u00d0\u00d1\7(\2\2\u00d1\u00d5\7^\2\2\u00d2\u00d3\5b\62\2"+
		"\u00d3\u00d4\5P)\2\u00d4\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00ee\5d\63\2\u00d8\u00d9\5V,\2\u00d9"+
		"\u00df\5\"\22\2\u00da\u00db\5R*\2\u00db\u00dc\5\"\22\2\u00dc\u00de\3\2"+
		"\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e7\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\5R"+
		"*\2\u00e3\u00e4\5.\30\2\u00e4\u00e6\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5X-\2\u00eb\u00ef\3\2\2\2\u00ec\u00ed"+
		"\7 \2\2\u00ed\u00ef\5\32\16\2\u00ee\u00d8\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ef\r\3\2\2\2\u00f0\u00f2\5\60\31\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7/\2\2\u00f4\u00f5\79\2\2\u00f5"+
		"\u00f8\5\62\32\2\u00f6\u00f7\7h\2\2\u00f7\u00f9\5(\25\2\u00f8\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\17\3\2\2\2\u00fa\u00fc\5\60\31\2\u00fb"+
		"\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7/"+
		"\2\2\u00fe\u00ff\79\2\2\u00ff\u0102\5\62\32\2\u0100\u0101\7h\2\2\u0101"+
		"\u0103\5(\25\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u011a\3\2"+
		"\2\2\u0104\u0105\7T\2\2\u0105\u0106\7$\2\2\u0106\u010c\5\64\33\2\u0107"+
		"\u0108\5R*\2\u0108\u0109\5\64\33\2\u0109\u010b\3\2\2\2\u010a\u0107\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0104\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7J\2\2\u0112\u0118\5(\25\2\u0113"+
		"\u0116\7Q\2\2\u0114\u0116\5R*\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2"+
		"\2\u0116\u0117\3\2\2\2\u0117\u0119\5(\25\2\u0118\u0115\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u010f\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\21\3\2\2\2\u011c\u011d\7\62\2\2\u011d\u0120\7^\2\2\u011e\u011f\7>\2\2"+
		"\u011f\u0121\7\66\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125"+
		"\3\2\2\2\u0122\u0123\5b\62\2\u0123\u0124\5P)\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0122\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\5d"+
		"\63\2\u0128\23\3\2\2\2\u0129\u012a\7i\2\2\u012a\u0130\5\66\34\2\u012b"+
		"\u012c\5R*\2\u012c\u012d\5\66\34\2\u012d\u012f\3\2\2\2\u012e\u012b\3\2"+
		"\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0129\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u013b\5B\"\2\u0136\u0137\5D#\2\u0137\u0138"+
		"\5B\"\2\u0138\u013a\3\2\2\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0149\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013e\u013f\7T\2\2\u013f\u0140\7$\2\2\u0140\u0146\5\64\33\2\u0141"+
		"\u0142\5R*\2\u0142\u0143\5\64\33\2\u0143\u0145\3\2\2\2\u0144\u0141\3\2"+
		"\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u0154\3\2\2\2\u014b\u014c\7J\2\2\u014c\u0152\5(\25\2\u014d"+
		"\u0150\7Q\2\2\u014e\u0150\5R*\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2"+
		"\2\u0150\u0151\3\2\2\2\u0151\u0153\5(\25\2\u0152\u014f\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u014b\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\25\3\2\2\2\u0156\u0158\5\60\31\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015a\t\2\2\2\u015a\u015e\7C\2\2\u015b"+
		"\u015c\5b\62\2\u015c\u015d\5P)\2\u015d\u015f\3\2\2\2\u015e\u015b\3\2\2"+
		"\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u016d\5d\63\2\u0161\u0162"+
		"\5V,\2\u0162\u0168\5h\65\2\u0163\u0164\5R*\2\u0164\u0165\5h\65\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0163\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016c\5X-\2\u016c\u016e\3\2\2\2\u016d\u0161\3\2\2\2\u016d\u016e\3\2\2"+
		"\2\u016e\u018e\3\2\2\2\u016f\u0170\7e\2\2\u0170\u0171\5V,\2\u0171\u0177"+
		"\5(\25\2\u0172\u0173\5R*\2\u0173\u0174\5(\25\2\u0174\u0176\3\2\2\2\u0175"+
		"\u0172\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u018a\5X-\2\u017b\u017c"+
		"\5R*\2\u017c\u017d\5V,\2\u017d\u0183\5(\25\2\u017e\u017f\5R*\2\u017f\u0180"+
		"\5(\25\2\u0180\u0182\3\2\2\2\u0181\u017e\3\2\2\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2"+
		"\2\2\u0186\u0187\5X-\2\u0187\u0189\3\2\2\2\u0188\u017b\3\2\2\2\u0189\u018c"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u018f\5\32\16\2\u018e\u016f\3\2\2\2\u018e\u018d\3"+
		"\2\2\2\u018f\27\3\2\2\2\u0190\u0191\7i\2\2\u0191\u0197\5\66\34\2\u0192"+
		"\u0193\5R*\2\u0193\u0194\5\66\34\2\u0194\u0196\3\2\2\2\u0195\u0192\3\2"+
		"\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u0190\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u019c\3\2\2\2\u019c\u01a8\5B\"\2\u019d\u019e\7T\2\2\u019e\u019f"+
		"\7$\2\2\u019f\u01a5\5\64\33\2\u01a0\u01a1\5R*\2\u01a1\u01a2\5\64\33\2"+
		"\u01a2\u01a4\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8"+
		"\u019d\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01b3\3\2\2\2\u01aa\u01ab\7J"+
		"\2\2\u01ab\u01b1\5(\25\2\u01ac\u01af\7Q\2\2\u01ad\u01af\5R*\2\u01ae\u01ac"+
		"\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\5(\25\2\u01b1"+
		"\u01ae\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01aa\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\31\3\2\2\2\u01b5\u01b6\7i\2\2\u01b6\u01bc"+
		"\5\66\34\2\u01b7\u01b8\5R*\2\u01b8\u01b9\5\66\34\2\u01b9\u01bb\3\2\2\2"+
		"\u01ba\u01b7\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01b5\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c7\5\34\17\2\u01c2\u01c3\5"+
		"D#\2\u01c3\u01c4\5\34\17\2\u01c4\u01c6\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c6"+
		"\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01d5\3\2"+
		"\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7T\2\2\u01cb\u01cc\7$\2\2\u01cc\u01d2"+
		"\5\64\33\2\u01cd\u01ce\5R*\2\u01ce\u01cf\5\64\33\2\u01cf\u01d1\3\2\2\2"+
		"\u01d0\u01cd\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01ca\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01e0\3\2\2\2\u01d7\u01d8\7J\2\2\u01d8\u01de\5(\25"+
		"\2\u01d9\u01dc\7Q\2\2\u01da\u01dc\5R*\2\u01db\u01d9\3\2\2\2\u01db\u01da"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\5(\25\2\u01de\u01db\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01d7\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\33\3\2\2\2\u01e2\u01e4\7\\\2\2\u01e3\u01e5\t\3\2\2\u01e4\u01e3"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01ec\58\35\2\u01e7"+
		"\u01e8\5R*\2\u01e8\u01e9\58\35\2\u01e9\u01eb\3\2\2\2\u01ea\u01e7\3\2\2"+
		"\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01fc"+
		"\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01fa\79\2\2\u01f0\u01f6\5:\36\2\u01f1"+
		"\u01f2\5R*\2\u01f2\u01f3\5:\36\2\u01f3\u01f5\3\2\2\2\u01f4\u01f1\3\2\2"+
		"\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fb"+
		"\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fb\5<\37\2\u01fa\u01f0\3\2\2\2\u01fa"+
		"\u01f9\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01ef\3\2\2\2\u01fc\u01fd\3\2"+
		"\2\2\u01fd\u0200\3\2\2\2\u01fe\u01ff\7h\2\2\u01ff\u0201\5(\25\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0211\3\2\2\2\u0202\u0203\7<"+
		"\2\2\u0203\u0204\7$\2\2\u0204\u020a\5(\25\2\u0205\u0206\5R*\2\u0206\u0207"+
		"\5(\25\2\u0207\u0209\3\2\2\2\u0208\u0205\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020f\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u020e\7=\2\2\u020e\u0210\5(\25\2\u020f\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u0202\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\35\3\2\2\2\u0213\u0215\5\60\31\2\u0214\u0213\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7c\2\2\u0217\u0218\5\62"+
		"\32\2\u0218\u0219\7]\2\2\u0219\u021a\5h\65\2\u021a\u021b\5Z.\2\u021b\u0223"+
		"\5(\25\2\u021c\u021d\5R*\2\u021d\u021e\5h\65\2\u021e\u021f\5Z.\2\u021f"+
		"\u0220\5(\25\2\u0220\u0222\3\2\2\2\u0221\u021c\3\2\2\2\u0222\u0225\3\2"+
		"\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0228\3\2\2\2\u0225"+
		"\u0223\3\2\2\2\u0226\u0227\7h\2\2\u0227\u0229\5(\25\2\u0228\u0226\3\2"+
		"\2\2\u0228\u0229\3\2\2\2\u0229\37\3\2\2\2\u022a\u022c\5\60\31\2\u022b"+
		"\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\7c"+
		"\2\2\u022e\u022f\5\62\32\2\u022f\u0230\7]\2\2\u0230\u0231\5h\65\2\u0231"+
		"\u0232\5Z.\2\u0232\u023a\5(\25\2\u0233\u0234\5R*\2\u0234\u0235\5h\65\2"+
		"\u0235\u0236\5Z.\2\u0236\u0237\5(\25\2\u0237\u0239\3\2\2\2\u0238\u0233"+
		"\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023f\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\7h\2\2\u023e\u0240\5(\25"+
		"\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0257\3\2\2\2\u0241\u0242"+
		"\7T\2\2\u0242\u0243\7$\2\2\u0243\u0249\5\64\33\2\u0244\u0245\5R*\2\u0245"+
		"\u0246\5\64\33\2\u0246\u0248\3\2\2\2\u0247\u0244\3\2\2\2\u0248\u024b\3"+
		"\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024d\3\2\2\2\u024b"+
		"\u0249\3\2\2\2\u024c\u0241\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2"+
		"\2\2\u024e\u024f\7J\2\2\u024f\u0255\5(\25\2\u0250\u0253\7Q\2\2\u0251\u0253"+
		"\5R*\2\u0252\u0250\3\2\2\2\u0252\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0256\5(\25\2\u0255\u0252\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2"+
		"\2\2\u0257\u024c\3\2\2\2\u0257\u0258\3\2\2\2\u0258!\3\2\2\2\u0259\u025b"+
		"\5h\65\2\u025a\u025c\5$\23\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u0260\3\2\2\2\u025d\u025f\5&\24\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2"+
		"\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261#\3\2\2\2\u0262\u0260"+
		"\3\2\2\2\u0263\u0276\5^\60\2\u0264\u0266\5`\61\2\u0265\u0264\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0273\3\2"+
		"\2\2\u0269\u026a\5V,\2\u026a\u026b\5H%\2\u026b\u026c\5X-\2\u026c\u0274"+
		"\3\2\2\2\u026d\u026e\5V,\2\u026e\u026f\5H%\2\u026f\u0270\5R*\2\u0270\u0271"+
		"\5H%\2\u0271\u0272\5X-\2\u0272\u0274\3\2\2\2\u0273\u0269\3\2\2\2\u0273"+
		"\u026d\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0263\3\2"+
		"\2\2\u0275\u0265\3\2\2\2\u0276%\3\2\2\2\u0277\u0278\7V\2\2\u0278\u027a"+
		"\7G\2\2\u0279\u027b\t\4\2\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027d\3\2\2\2\u027c\u027e\7\"\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027e\u0286\3\2\2\2\u027f\u0281\7M\2\2\u0280\u027f\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0286\7O\2\2\u0283\u0286\7b\2"+
		"\2\u0284\u0286\5*\26\2\u0285\u0277\3\2\2\2\u0285\u0280\3\2\2\2\u0285\u0283"+
		"\3\2\2\2\u0285\u0284\3\2\2\2\u0286\'\3\2\2\2\u0287\u0288\b\25\1\2\u0288"+
		"\u02c0\5J&\2\u0289\u028a\5b\62\2\u028a\u028b\5P)\2\u028b\u028d\3\2\2\2"+
		"\u028c\u0289\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f"+
		"\5d\63\2\u028f\u0290\5P)\2\u0290\u0292\3\2\2\2\u0291\u028c\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u02c0\5h\65\2\u0294\u0295\5L"+
		"\'\2\u0295\u0296\5(\25\24\u0296\u02c0\3\2\2\2\u0297\u0298\5V,\2\u0298"+
		"\u0299\5(\25\2\u0299\u029a\5X-\2\u029a\u02c0\3\2\2\2\u029b\u029c\7&\2"+
		"\2\u029c\u029d\5V,\2\u029d\u029e\5(\25\2\u029e\u029f\7 \2\2\u029f\u02a0"+
		"\5$\23\2\u02a0\u02a1\5X-\2\u02a1\u02c0\3\2\2\2\u02a2\u02a4\7M\2\2\u02a3"+
		"\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\7\66"+
		"\2\2\u02a6\u02a3\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02a9\5V,\2\u02a9\u02aa\5\32\16\2\u02aa\u02ab\5X-\2\u02ab\u02c0\3\2\2"+
		"\2\u02ac\u02ae\7%\2\2\u02ad\u02af\5(\25\2\u02ae\u02ad\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02af\u02b5\3\2\2\2\u02b0\u02b1\7g\2\2\u02b1\u02b2\5(\25\2\u02b2"+
		"\u02b3\7_\2\2\u02b3\u02b4\5(\25\2\u02b4\u02b6\3\2\2\2\u02b5\u02b0\3\2"+
		"\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02bb\3\2\2\2\u02b9\u02ba\7\63\2\2\u02ba\u02bc\5(\25\2\u02bb\u02b9\3"+
		"\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\7\64\2\2\u02be"+
		"\u02c0\3\2\2\2\u02bf\u0287\3\2\2\2\u02bf\u0291\3\2\2\2\u02bf\u0294\3\2"+
		"\2\2\u02bf\u0297\3\2\2\2\u02bf\u029b\3\2\2\2\u02bf\u02a6\3\2\2\2\u02bf"+
		"\u02ac\3\2\2\2\u02c0\u031e\3\2\2\2\u02c1\u02c2\f\23\2\2\u02c2\u02c3\7"+
		"\r\2\2\u02c3\u031d\5(\25\24\u02c4\u02c5\f\22\2\2\u02c5\u02c6\t\5\2\2\u02c6"+
		"\u031d\5(\25\23\u02c7\u02c8\f\21\2\2\u02c8\u02c9\t\6\2\2\u02c9\u031d\5"+
		"(\25\22\u02ca\u02cb\f\20\2\2\u02cb\u02cc\t\7\2\2\u02cc\u031d\5(\25\21"+
		"\u02cd\u02ce\f\17\2\2\u02ce\u02cf\t\b\2\2\u02cf\u031d\5(\25\20\u02d0\u02db"+
		"\f\16\2\2\u02d1\u02dc\5Z.\2\u02d2\u02dc\7\30\2\2\u02d3\u02dc\7\31\2\2"+
		"\u02d4\u02dc\7\32\2\2\u02d5\u02dc\7D\2\2\u02d6\u02d7\7D\2\2\u02d7\u02dc"+
		"\7M\2\2\u02d8\u02dc\7?\2\2\u02d9\u02dc\7I\2\2\u02da\u02dc\7;\2\2\u02db"+
		"\u02d1\3\2\2\2\u02db\u02d2\3\2\2\2\u02db\u02d3\3\2\2\2\u02db\u02d4\3\2"+
		"\2\2\u02db\u02d5\3\2\2\2\u02db\u02d6\3\2\2\2\u02db\u02d8\3\2\2\2\u02db"+
		"\u02d9\3\2\2\2\u02db\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u031d\5("+
		"\25\17\u02de\u02df\f\r\2\2\u02df\u02e0\7\37\2\2\u02e0\u031d\5(\25\16\u02e1"+
		"\u02e2\f\f\2\2\u02e2\u02e3\7S\2\2\u02e3\u031d\5(\25\r\u02e4\u02e6\f\t"+
		"\2\2\u02e5\u02e7\7M\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02e9\t\t\2\2\u02e9\u031d\5(\25\n\u02ea\u02eb\f\7"+
		"\2\2\u02eb\u02ed\7D\2\2\u02ec\u02ee\7M\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee"+
		"\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u031d\5(\25\b\u02f0\u02f2\f\6\2\2\u02f1"+
		"\u02f3\7M\2\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2"+
		"\2\2\u02f4\u02f5\7#\2\2\u02f5\u02f6\5(\25\2\u02f6\u02f7\7\37\2\2\u02f7"+
		"\u02f8\5(\25\7\u02f8\u031d\3\2\2\2\u02f9\u02fe\f\b\2\2\u02fa\u02ff\7E"+
		"\2\2\u02fb\u02ff\7N\2\2\u02fc\u02fd\7M\2\2\u02fd\u02ff\7O\2\2\u02fe\u02fa"+
		"\3\2\2\2\u02fe\u02fb\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u031d\3\2\2\2\u0300"+
		"\u0302\f\5\2\2\u0301\u0303\7M\2\2\u0302\u0301\3\2\2\2\u0302\u0303\3\2"+
		"\2\2\u0303\u0304\3\2\2\2\u0304\u031a\7?\2\2\u0305\u0310\5V,\2\u0306\u0311"+
		"\5\32\16\2\u0307\u030d\5(\25\2\u0308\u0309\5R*\2\u0309\u030a\5(\25\2\u030a"+
		"\u030c\3\2\2\2\u030b\u0308\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2"+
		"\2\2\u030d\u030e\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u0310"+
		"\u0306\3\2\2\2\u0310\u0307\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2"+
		"\2\2\u0312\u0313\5X-\2\u0313\u031b\3\2\2\2\u0314\u0315\5b\62\2\u0315\u0316"+
		"\5P)\2\u0316\u0318\3\2\2\2\u0317\u0314\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031b\5d\63\2\u031a\u0305\3\2\2\2\u031a\u0317\3\2"+
		"\2\2\u031b\u031d\3\2\2\2\u031c\u02c1\3\2\2\2\u031c\u02c4\3\2\2\2\u031c"+
		"\u02c7\3\2\2\2\u031c\u02ca\3\2\2\2\u031c\u02cd\3\2\2\2\u031c\u02d0\3\2"+
		"\2\2\u031c\u02de\3\2\2\2\u031c\u02e1\3\2\2\2\u031c\u02e4\3\2\2\2\u031c"+
		"\u02ea\3\2\2\2\u031c\u02f0\3\2\2\2\u031c\u02f9\3\2\2\2\u031c\u0300\3\2"+
		"\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		")\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0322\7W\2\2\u0322\u032f\5j\66\2\u0323"+
		"\u0324\5V,\2\u0324\u032a\5h\65\2\u0325\u0326\5R*\2\u0326\u0327\5h\65\2"+
		"\u0327\u0329\3\2\2\2\u0328\u0325\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d"+
		"\u032e\5X-\2\u032e\u0330\3\2\2\2\u032f\u0323\3\2\2\2\u032f\u0330\3\2\2"+
		"\2\u0330+\3\2\2\2\u0331\u0333\5h\65\2\u0332\u0334\t\4\2\2\u0333\u0332"+
		"\3\2\2\2\u0333\u0334\3\2\2\2\u0334-\3\2\2\2\u0335\u0336\7V\2\2\u0336\u0339"+
		"\7G\2\2\u0337\u0339\7b\2\2\u0338\u0335\3\2\2\2\u0338\u0337\3\2\2\2\u0339"+
		"\u033a\3\2\2\2\u033a\u033b\5V,\2\u033b\u0341\5,\27\2\u033c\u033d\5R*\2"+
		"\u033d\u033e\5,\27\2\u033e\u0340\3\2\2\2\u033f\u033c\3\2\2\2\u0340\u0343"+
		"\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343"+
		"\u0341\3\2\2\2\u0344\u0345\5X-\2\u0345\u0356\3\2\2\2\u0346\u0347\78\2"+
		"\2\u0347\u0348\7G\2\2\u0348\u0349\5V,\2\u0349\u034f\5h\65\2\u034a\u034b"+
		"\5R*\2\u034b\u034c\5h\65\2\u034c\u034e\3\2\2\2\u034d\u034a\3\2\2\2\u034e"+
		"\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0352\3\2"+
		"\2\2\u0351\u034f\3\2\2\2\u0352\u0353\5X-\2\u0353\u0354\5*\26\2\u0354\u0356"+
		"\3\2\2\2\u0355\u0338\3\2\2\2\u0355\u0346\3\2\2\2\u0356/\3\2\2\2\u0357"+
		"\u0358\5F$\2\u0358\u0359\7 \2\2\u0359\u035a\5V,\2\u035a\u035b\5\32\16"+
		"\2\u035b\u0365\5X-\2\u035c\u035d\5R*\2\u035d\u035e\5F$\2\u035e\u035f\7"+
		" \2\2\u035f\u0360\5V,\2\u0360\u0361\5\32\16\2\u0361\u0362\5X-\2\u0362"+
		"\u0364\3\2\2\2\u0363\u035c\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2"+
		"\2\2\u0365\u0366\3\2\2\2\u0366\61\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u0369"+
		"\5b\62\2\u0369\u036a\5P)\2\u036a\u036c\3\2\2\2\u036b\u0368\3\2\2\2\u036b"+
		"\u036c\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\5d\63\2\u036e\63\3\2\2"+
		"\2\u036f\u0371\5(\25\2\u0370\u0372\t\4\2\2\u0371\u0370\3\2\2\2\u0371\u0372"+
		"\3\2\2\2\u0372\65\3\2\2\2\u0373\u0380\5d\63\2\u0374\u0375\5V,\2\u0375"+
		"\u037b\5h\65\2\u0376\u0377\5R*\2\u0377\u0378\5h\65\2\u0378\u037a\3\2\2"+
		"\2\u0379\u0376\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c"+
		"\3\2\2\2\u037c\u037e\3\2\2\2\u037d\u037b\3\2\2\2\u037e\u037f\5X-\2\u037f"+
		"\u0381\3\2\2\2\u0380\u0374\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2"+
		"\2\2\u0382\u0383\7 \2\2\u0383\u0384\5V,\2\u0384\u0385\5\32\16\2\u0385"+
		"\u0386\5X-\2\u0386\67\3\2\2\2\u0387\u0394\7\t\2\2\u0388\u0389\5d\63\2"+
		"\u0389\u038a\5P)\2\u038a\u038b\7\t\2\2\u038b\u0394\3\2\2\2\u038c\u0391"+
		"\5(\25\2\u038d\u038f\7 \2\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0392\5N(\2\u0391\u038e\3\2\2\2\u0391\u0392\3\2\2"+
		"\2\u0392\u0394\3\2\2\2\u0393\u0387\3\2\2\2\u0393\u0388\3\2\2\2\u0393\u038c"+
		"\3\2\2\2\u03949\3\2\2\2\u0395\u0396\5b\62\2\u0396\u0397\5P)\2\u0397\u0399"+
		"\3\2\2\2\u0398\u0395\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u039f\5d\63\2\u039b\u039d\7 \2\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2"+
		"\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\5l\67\2\u039f\u039c\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03bf\3\2\2\2\u03a1\u03ac\5V,\2\u03a2\u03a8\5:\36"+
		"\2\u03a3\u03a4\5R*\2\u03a4\u03a5\5:\36\2\u03a5\u03a7\3\2\2\2\u03a6\u03a3"+
		"\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03ad\3\2\2\2\u03aa\u03a8\3\2\2\2\u03ab\u03ad\5<\37\2\u03ac\u03a2\3\2"+
		"\2\2\u03ac\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b3\5X-\2\u03af\u03b1"+
		"\7 \2\2\u03b0\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u03b4\5l\67\2\u03b3\u03b0\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03bf\3\2"+
		"\2\2\u03b5\u03b6\5V,\2\u03b6\u03b7\5\32\16\2\u03b7\u03bc\5X-\2\u03b8\u03ba"+
		"\7 \2\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb"+
		"\u03bd\5l\67\2\u03bc\u03b9\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03bf\3\2"+
		"\2\2\u03be\u0398\3\2\2\2\u03be\u03a1\3\2\2\2\u03be\u03b5\3\2\2\2\u03bf"+
		";\3\2\2\2\u03c0\u03c7\5:\36\2\u03c1\u03c2\5> \2\u03c2\u03c3\5:\36\2\u03c3"+
		"\u03c4\5@!\2\u03c4\u03c6\3\2\2\2\u03c5\u03c1\3\2\2\2\u03c6\u03c9\3\2\2"+
		"\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8=\3\2\2\2\u03c9\u03c7"+
		"\3\2\2\2\u03ca\u03d8\5R*\2\u03cb\u03cd\7K\2\2\u03cc\u03cb\3\2\2\2\u03cc"+
		"\u03cd\3\2\2\2\u03cd\u03d4\3\2\2\2\u03ce\u03d0\7H\2\2\u03cf\u03d1\7U\2"+
		"\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d5\3\2\2\2\u03d2\u03d5"+
		"\7@\2\2\u03d3\u03d5\7)\2\2\u03d4\u03ce\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4"+
		"\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\7F"+
		"\2\2\u03d7\u03ca\3\2\2\2\u03d7\u03cc\3\2\2\2\u03d8?\3\2\2\2\u03d9\u03da"+
		"\7R\2\2\u03da\u03e9\5(\25\2\u03db\u03dc\7d\2\2\u03dc\u03dd\5V,\2\u03dd"+
		"\u03e3\5h\65\2\u03de\u03df\5R*\2\u03df\u03e0\5h\65\2\u03e0\u03e2\3\2\2"+
		"\2\u03e1\u03de\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4"+
		"\3\2\2\2\u03e4\u03e6\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03e7\5X-\2\u03e7"+
		"\u03e9\3\2\2\2\u03e8\u03d9\3\2\2\2\u03e8\u03db\3\2\2\2\u03e8\u03e9\3\2"+
		"\2\2\u03e9A\3\2\2\2\u03ea\u03ec\7\\\2\2\u03eb\u03ed\t\3\2\2\u03ec\u03eb"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f4\58\35\2\u03ef"+
		"\u03f0\5R*\2\u03f0\u03f1\58\35\2\u03f1\u03f3\3\2\2\2\u03f2\u03ef\3\2\2"+
		"\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u0404"+
		"\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u0402\79\2\2\u03f8\u03fe\5:\36\2\u03f9"+
		"\u03fa\5R*\2\u03fa\u03fb\5:\36\2\u03fb\u03fd\3\2\2\2\u03fc\u03f9\3\2\2"+
		"\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0403"+
		"\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0403\5<\37\2\u0402\u03f8\3\2\2\2\u0402"+
		"\u0401\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u03f7\3\2\2\2\u0404\u0405\3\2"+
		"\2\2\u0405\u0408\3\2\2\2\u0406\u0407\7h\2\2\u0407\u0409\5(\25\2\u0408"+
		"\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u0419\3\2\2\2\u040a\u040b\7<"+
		"\2\2\u040b\u040c\7$\2\2\u040c\u0412\5(\25\2\u040d\u040e\5R*\2\u040e\u040f"+
		"\5(\25\2\u040f\u0411\3\2\2\2\u0410\u040d\3\2\2\2\u0411\u0414\3\2\2\2\u0412"+
		"\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0417\3\2\2\2\u0414\u0412\3\2"+
		"\2\2\u0415\u0416\7=\2\2\u0416\u0418\5(\25\2\u0417\u0415\3\2\2\2\u0417"+
		"\u0418\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u040a\3\2\2\2\u0419\u041a\3\2"+
		"\2\2\u041aC\3\2\2\2\u041b\u0421\7a\2\2\u041c\u041d\7a\2\2\u041d\u0421"+
		"\7\35\2\2\u041e\u0421\7B\2\2\u041f\u0421\7\65\2\2\u0420\u041b\3\2\2\2"+
		"\u0420\u041c\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u041f\3\2\2\2\u0421E\3"+
		"\2\2\2\u0422\u042f\5d\63\2\u0423\u0424\5V,\2\u0424\u042a\5h\65\2\u0425"+
		"\u0426\5R*\2\u0426\u0427\5h\65\2\u0427\u0429\3\2\2\2\u0428\u0425\3\2\2"+
		"\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042d"+
		"\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u042e\5X-\2\u042e\u0430\3\2\2\2\u042f"+
		"\u0423\3\2\2\2\u042f\u0430\3\2\2\2\u0430G\3\2\2\2\u0431\u0433\t\6\2\2"+
		"\u0432\u0431\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435"+
		"\7\u0081\2\2\u0435I\3\2\2\2\u0436\u043e\7\u0081\2\2\u0437\u043e\7\u0083"+
		"\2\2\u0438\u043e\7\u0084\2\2\u0439\u043e\7O\2\2\u043a\u043e\7+\2\2\u043b"+
		"\u043e\7*\2\2\u043c\u043e\7,\2\2\u043d\u0436\3\2\2\2\u043d\u0437\3\2\2"+
		"\2\u043d\u0438\3\2\2\2\u043d\u0439\3\2\2\2\u043d\u043a\3\2\2\2\u043d\u043b"+
		"\3\2\2\2\u043d\u043c\3\2\2\2\u043eK\3\2\2\2\u043f\u0444\7\13\2\2\u0440"+
		"\u0444\7\n\2\2\u0441\u0444\7\f\2\2\u0442\u0444\7M\2\2\u0443\u043f\3\2"+
		"\2\2\u0443\u0440\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0442\3\2\2\2\u0444"+
		"M\3\2\2\2\u0445\u0448\7\u0080\2\2\u0446\u0448\7\u0083\2\2\u0447\u0445"+
		"\3\2\2\2\u0447\u0446\3\2\2\2\u0448O\3\2\2\2\u0449\u044a\7\4\2\2\u044a"+
		"Q\3\2\2\2\u044b\u044c\7\7\2\2\u044cS\3\2\2\2\u044d\u044e\7\3\2\2\u044e"+
		"U\3\2\2\2\u044f\u0450\7\5\2\2\u0450W\3\2\2\2\u0451\u0452\7\6\2\2\u0452"+
		"Y\3\2\2\2\u0453\u0454\7\b\2\2\u0454[\3\2\2\2\u0455\u0456\t\n\2\2\u0456"+
		"]\3\2\2\2\u0457\u046a\7j\2\2\u0458\u046a\7k\2\2\u0459\u046a\7l\2\2\u045a"+
		"\u046a\7m\2\2\u045b\u046a\7n\2\2\u045c\u046a\7o\2\2\u045d\u045e\7p\2\2"+
		"\u045e\u045f\7q\2\2\u045f\u046a\7j\2\2\u0460\u046a\7r\2\2\u0461\u046a"+
		"\7s\2\2\u0462\u046a\7t\2\2\u0463\u046a\7u\2\2\u0464\u046a\7v\2\2\u0465"+
		"\u046a\7w\2\2\u0466\u046a\7x\2\2\u0467\u046a\7y\2\2\u0468\u046a\7z\2\2"+
		"\u0469\u0457\3\2\2\2\u0469\u0458\3\2\2\2\u0469\u0459\3\2\2\2\u0469\u045a"+
		"\3\2\2\2\u0469\u045b\3\2\2\2\u0469\u045c\3\2\2\2\u0469\u045d\3\2\2\2\u0469"+
		"\u0460\3\2\2\2\u0469\u0461\3\2\2\2\u0469\u0462\3\2\2\2\u0469\u0463\3\2"+
		"\2\2\u0469\u0464\3\2\2\2\u0469\u0465\3\2\2\2\u0469\u0466\3\2\2\2\u0469"+
		"\u0467\3\2\2\2\u0469\u0468\3\2\2\2\u046a_\3\2\2\2\u046b\u046c\t\13\2\2"+
		"\u046ca\3\2\2\2\u046d\u046e\5n8\2\u046ec\3\2\2\2\u046f\u0470\5n8\2\u0470"+
		"e\3\2\2\2\u0471\u0472\5n8\2\u0472g\3\2\2\2\u0473\u0474\5n8\2\u0474i\3"+
		"\2\2\2\u0475\u0476\5n8\2\u0476k\3\2\2\2\u0477\u0478\5n8\2\u0478m\3\2\2"+
		"\2\u0479\u0481\7\u0080\2\2\u047a\u0481\5\\/\2\u047b\u0481\7\u0083\2\2"+
		"\u047c\u047d\7\5\2\2\u047d\u047e\5n8\2\u047e\u047f\7\6\2\2\u047f\u0481"+
		"\3\2\2\2\u0480\u0479\3\2\2\2\u0480\u047a\3\2\2\2\u0480\u047b\3\2\2\2\u0480"+
		"\u047c\3\2\2\2\u0481o\3\2\2\2\u00a3tv\u008a\u0091\u0099\u009c\u00a5\u00a8"+
		"\u00ad\u00b1\u00b6\u00c0\u00c3\u00c9\u00cc\u00ce\u00d5\u00df\u00e7\u00ee"+
		"\u00f1\u00f8\u00fb\u0102\u010c\u010f\u0115\u0118\u011a\u0120\u0125\u0130"+
		"\u0133\u013b\u0146\u0149\u014f\u0152\u0154\u0157\u015e\u0168\u016d\u0177"+
		"\u0183\u018a\u018e\u0197\u019a\u01a5\u01a8\u01ae\u01b1\u01b3\u01bc\u01bf"+
		"\u01c7\u01d2\u01d5\u01db\u01de\u01e0\u01e4\u01ec\u01f6\u01fa\u01fc\u0200"+
		"\u020a\u020f\u0211\u0214\u0223\u0228\u022b\u023a\u023f\u0249\u024c\u0252"+
		"\u0255\u0257\u025b\u0260\u0267\u0273\u0275\u027a\u027d\u0280\u0285\u028c"+
		"\u0291\u02a3\u02a6\u02ae\u02b7\u02bb\u02bf\u02db\u02e6\u02ed\u02f2\u02fe"+
		"\u0302\u030d\u0310\u0317\u031a\u031c\u031e\u032a\u032f\u0333\u0338\u0341"+
		"\u034f\u0355\u0365\u036b\u0371\u037b\u0380\u038e\u0391\u0393\u0398\u039c"+
		"\u039f\u03a8\u03ac\u03b0\u03b3\u03b9\u03bc\u03be\u03c7\u03cc\u03d0\u03d4"+
		"\u03d7\u03e3\u03e8\u03ec\u03f4\u03fe\u0402\u0404\u0408\u0412\u0417\u0419"+
		"\u0420\u042a\u042f\u0432\u043d\u0443\u0447\u0469\u0480";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}