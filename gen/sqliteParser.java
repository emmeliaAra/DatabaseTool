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
		RULE_unary_operator = 37, RULE_column_alias = 38, RULE_keyword = 39, RULE_name = 40, 
		RULE_name_with_brackets = 41, RULE_database_name = 42, RULE_table_name = 43, 
		RULE_new_table_name = 44, RULE_column_name = 45, RULE_foreign_table = 46, 
		RULE_table_alias = 47, RULE_any_name = 48;
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
		"column_alias", "keyword", "name", "name_with_brackets", "database_name", 
		"table_name", "new_table_name", "column_name", "foreign_table", "table_alias", 
		"any_name"
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
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
	 
		public ParseContext() { }
		public void copyFrom(ParseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParseRuleContext extends ParseContext {
		public TerminalNode EOF() { return getToken(sqliteParser.EOF, 0); }
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(sqliteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(sqliteParser.SCOL, i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseRuleContext(ParseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterParseRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitParseRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitParseRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			_localctx = new ParseRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ADD) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_AUTOINCREMENT) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLUMN) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_DROP) | (1L << K_ELSE) | (1L << K_END) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FOR) | (1L << K_FOREIGN) | (1L << K_FROM) | (1L << K_FULL) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IN) | (1L << K_INNER) | (1L << K_INSERT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROW - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_SET - 64)) | (1L << (K_TABLE - 64)) | (1L << (K_THEN - 64)) | (1L << (K_TO - 64)) | (1L << (K_UNION - 64)) | (1L << (K_UNIQUE - 64)) | (1L << (K_UPDATE - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_VIEW - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (IDENTIFIER - 64)))) != 0) || _la==STRING_LITERAL || _la==UNEXPECTED_CHAR) {
				{
				setState(102);
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
					setState(98);
					sql_stmt();
					setState(99);
					match(SCOL);
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(101);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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
			setState(109);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				alter_table_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				compound_select_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				create_table_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				delete_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				delete_stmt_limited();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				drop_table_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				factored_select_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				insert_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(120);
				simple_select_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(121);
				select_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(122);
				update_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(123);
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
		public TerminalNode DOT() { return getToken(sqliteParser.DOT, 0); }
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
			setState(126);
			match(K_ALTER);
			setState(127);
			match(K_TABLE);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(128);
				database_name();
				setState(129);
				match(DOT);
				}
				break;
			}
			setState(133);
			table_name();
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(134);
				match(K_RENAME);
				setState(135);
				match(K_TO);
				setState(136);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(137);
				match(K_ADD);
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(138);
					match(K_COLUMN);
					}
					break;
				}
				setState(141);
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
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(sqliteParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(sqliteParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(sqliteParser.K_ALL, i);
		}
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
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(144);
				match(K_WITH);
				setState(145);
				common_table_expression();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(146);
					match(COMMA);
					setState(147);
					common_table_expression();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(155);
			select_core();
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(156);
					match(K_UNION);
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(157);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(160);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(161);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(164);
				select_core();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (K_EXCEPT - 51)) | (1L << (K_INTERSECT - 51)) | (1L << (K_UNION - 51)))) != 0) );
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(169);
				match(K_ORDER);
				setState(170);
				match(K_BY);
				setState(171);
				ordering_term();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(172);
					match(COMMA);
					setState(173);
					ordering_term();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(181);
				match(K_LIMIT);
				setState(182);
				expr(0);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(183);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(184);
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
		public TerminalNode OPEN_PAR() { return getToken(sqliteParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(sqliteParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(sqliteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(sqliteParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(189);
			match(K_CREATE);
			setState(190);
			match(K_TABLE);
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(191);
				database_name();
				setState(192);
				match(DOT);
				}
				break;
			}
			setState(196);
			table_name();
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(197);
				match(OPEN_PAR);
				setState(198);
				column_def();
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(199);
						match(COMMA);
						setState(200);
						column_def();
						}
						} 
					}
					setState(205);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(206);
					match(COMMA);
					setState(207);
					table_constraint();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(215);
				match(K_AS);
				setState(216);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(219);
				with_clause();
				}
				break;
			}
			setState(222);
			match(K_DELETE);
			setState(223);
			match(K_FROM);
			setState(224);
			qualified_table_name();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(225);
				match(K_WHERE);
				setState(226);
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
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(229);
				with_clause();
				}
				break;
			}
			setState(232);
			match(K_DELETE);
			setState(233);
			match(K_FROM);
			setState(234);
			qualified_table_name();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(235);
				match(K_WHERE);
				setState(236);
				expr(0);
				}
			}

			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(239);
					match(K_ORDER);
					setState(240);
					match(K_BY);
					setState(241);
					ordering_term();
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(242);
						match(COMMA);
						setState(243);
						ordering_term();
						}
						}
						setState(248);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(251);
				match(K_LIMIT);
				setState(252);
				expr(0);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(253);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(254);
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
		public TerminalNode DOT() { return getToken(sqliteParser.DOT, 0); }
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
			setState(259);
			match(K_DROP);
			setState(260);
			match(K_TABLE);
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(261);
				match(K_IF);
				setState(262);
				match(K_EXISTS);
				}
				break;
			}
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(265);
				database_name();
				setState(266);
				match(DOT);
				}
				break;
			}
			setState(270);
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
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(272);
				common_table_expression();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(273);
					match(COMMA);
					setState(274);
					common_table_expression();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(282);
			select_core();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (K_EXCEPT - 51)) | (1L << (K_INTERSECT - 51)) | (1L << (K_UNION - 51)))) != 0)) {
				{
				{
				setState(283);
				compound_operator();
				setState(284);
				select_core();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(291);
				match(K_ORDER);
				setState(292);
				match(K_BY);
				setState(293);
				ordering_term();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(294);
					match(COMMA);
					setState(295);
					ordering_term();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(303);
				match(K_LIMIT);
				setState(304);
				expr(0);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(305);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(306);
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
		public List<TerminalNode> OPEN_PAR() { return getTokens(sqliteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(sqliteParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(sqliteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(sqliteParser.CLOSE_PAR, i);
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
		public TerminalNode DOT() { return getToken(sqliteParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(311);
				with_clause();
				}
				break;
			}
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==K_INSERT || _la==K_REPLACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(315);
			match(K_INTO);
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(316);
				database_name();
				setState(317);
				match(DOT);
				}
				break;
			}
			setState(321);
			table_name();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(322);
				match(OPEN_PAR);
				setState(323);
				column_name();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(324);
					match(COMMA);
					setState(325);
					column_name();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331);
				match(CLOSE_PAR);
				}
			}

			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VALUES:
				{
				setState(335);
				match(K_VALUES);
				setState(336);
				match(OPEN_PAR);
				setState(337);
				expr(0);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(338);
					match(COMMA);
					setState(339);
					expr(0);
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345);
				match(CLOSE_PAR);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(346);
					match(COMMA);
					setState(347);
					match(OPEN_PAR);
					setState(348);
					expr(0);
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(349);
						match(COMMA);
						setState(350);
						expr(0);
						}
						}
						setState(355);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(356);
					match(CLOSE_PAR);
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case K_SELECT:
			case K_WITH:
				{
				setState(363);
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
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(366);
				match(K_WITH);
				setState(367);
				common_table_expression();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(368);
					match(COMMA);
					setState(369);
					common_table_expression();
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(377);
			select_core();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(378);
				match(K_ORDER);
				setState(379);
				match(K_BY);
				setState(380);
				ordering_term();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(381);
					match(COMMA);
					setState(382);
					ordering_term();
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(390);
				match(K_LIMIT);
				setState(391);
				expr(0);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(392);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(393);
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
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(398);
				match(K_WITH);
				setState(399);
				common_table_expression();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(400);
					match(COMMA);
					setState(401);
					common_table_expression();
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(409);
			select_or_values();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (K_EXCEPT - 51)) | (1L << (K_INTERSECT - 51)) | (1L << (K_UNION - 51)))) != 0)) {
				{
				{
				setState(410);
				compound_operator();
				setState(411);
				select_or_values();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(418);
				match(K_ORDER);
				setState(419);
				match(K_BY);
				setState(420);
				ordering_term();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(421);
					match(COMMA);
					setState(422);
					ordering_term();
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(430);
				match(K_LIMIT);
				setState(431);
				expr(0);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(432);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(433);
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
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(438);
			match(K_SELECT);
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(439);
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
			setState(442);
			result_column();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(443);
				match(COMMA);
				setState(444);
				result_column();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(450);
				match(K_FROM);
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(451);
					table_or_subquery();
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(452);
						match(COMMA);
						setState(453);
						table_or_subquery();
						}
						}
						setState(458);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(459);
					join_clause();
					}
					break;
				}
				}
			}

			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(464);
				match(K_WHERE);
				setState(465);
				expr(0);
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_GROUP) {
				{
				setState(468);
				match(K_GROUP);
				setState(469);
				match(K_BY);
				setState(470);
				expr(0);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(471);
					match(COMMA);
					setState(472);
					expr(0);
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_HAVING) {
					{
					setState(478);
					match(K_HAVING);
					setState(479);
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
		public List<TerminalNode> ASSIGN() { return getTokens(sqliteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(sqliteParser.ASSIGN, i);
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
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(484);
				with_clause();
				}
				break;
			}
			setState(487);
			match(K_UPDATE);
			setState(488);
			qualified_table_name();
			setState(489);
			match(K_SET);
			setState(490);
			column_name();
			setState(491);
			match(ASSIGN);
			setState(492);
			expr(0);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(493);
				match(COMMA);
				setState(494);
				column_name();
				setState(495);
				match(ASSIGN);
				setState(496);
				expr(0);
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(503);
				match(K_WHERE);
				setState(504);
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
		public List<TerminalNode> ASSIGN() { return getTokens(sqliteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(sqliteParser.ASSIGN, i);
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
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(507);
				with_clause();
				}
				break;
			}
			setState(510);
			match(K_UPDATE);
			setState(511);
			qualified_table_name();
			setState(512);
			match(K_SET);
			setState(513);
			column_name();
			setState(514);
			match(ASSIGN);
			setState(515);
			expr(0);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(516);
				match(COMMA);
				setState(517);
				column_name();
				setState(518);
				match(ASSIGN);
				setState(519);
				expr(0);
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(526);
				match(K_WHERE);
				setState(527);
				expr(0);
				}
			}

			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(530);
					match(K_ORDER);
					setState(531);
					match(K_BY);
					setState(532);
					ordering_term();
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(533);
						match(COMMA);
						setState(534);
						ordering_term();
						}
						}
						setState(539);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(542);
				match(K_LIMIT);
				setState(543);
				expr(0);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(544);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(545);
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
			setState(550);
			column_name();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (INT - 104)) | (1L << (INTEGER - 104)) | (1L << (TINYINT - 104)) | (1L << (SMALLINT - 104)) | (1L << (MEDIUMINT - 104)) | (1L << (BIGINT - 104)) | (1L << (UNSIGNED - 104)) | (1L << (TEXT - 104)) | (1L << (BLOB - 104)) | (1L << (REAL - 104)) | (1L << (DOUBLE - 104)) | (1L << (FLOAT - 104)) | (1L << (NUMERIC - 104)) | (1L << (BOOLEAN - 104)) | (1L << (DATE - 104)) | (1L << (DATETIME - 104)) | (1L << (CHARACTER - 104)) | (1L << (VARCHAR - 104)) | (1L << (NCHAR - 104)) | (1L << (NVARCHAR - 104)) | (1L << (DECIMAL - 104)))) != 0)) {
				{
				setState(551);
				type_name();
				}
			}

			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (K_NOT - 75)) | (1L << (K_NULL - 75)) | (1L << (K_PRIMARY - 75)) | (1L << (K_REFERENCES - 75)) | (1L << (K_UNIQUE - 75)))) != 0)) {
				{
				{
				setState(554);
				column_constraint();
				}
				}
				setState(559);
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
		public TerminalNode OPEN_PAR() { return getToken(sqliteParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(sqliteParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(sqliteParser.COMMA, 0); }
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
			setState(578);
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
				setState(560);
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
				setState(562); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(561);
					name_with_brackets();
					}
					}
					setState(564); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (CHARACTER - 121)) | (1L << (VARCHAR - 121)) | (1L << (NCHAR - 121)) | (1L << (NVARCHAR - 121)) | (1L << (DECIMAL - 121)))) != 0) );
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(566);
					match(OPEN_PAR);
					setState(567);
					signed_number();
					setState(568);
					match(CLOSE_PAR);
					}
					break;
				case 2:
					{
					setState(570);
					match(OPEN_PAR);
					setState(571);
					signed_number();
					setState(572);
					match(COMMA);
					setState(573);
					signed_number();
					setState(574);
					match(CLOSE_PAR);
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
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				_localctx = new PrimaryKeyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				match(K_PRIMARY);
				setState(581);
				match(K_KEY);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(582);
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

				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(585);
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
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(588);
					match(K_NOT);
					}
				}

				setState(591);
				match(K_NULL);
				}
				break;
			case K_UNIQUE:
				_localctx = new UniqueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				match(K_UNIQUE);
				}
				break;
			case K_REFERENCES:
				_localctx = new ForeignKeyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(593);
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
	public static class NoneContext extends ExprContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NoneContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class MyExpressionContext extends ExprContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(sqliteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(sqliteParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(sqliteParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(sqliteParser.CLOSE_PAR, 0); }
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
		public TerminalNode ASSIGN() { return getToken(sqliteParser.ASSIGN, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				_localctx = new NoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(597);
				literal_value();
				}
				break;
			case 2:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(601);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(598);
						database_name();
						setState(599);
						match(DOT);
						}
						break;
					}
					setState(603);
					table_name();
					setState(604);
					match(DOT);
					}
					break;
				}
				setState(608);
				column_name();
				}
				break;
			case 3:
				{
				_localctx = new NoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(609);
				unary_operator();
				setState(610);
				expr(18);
				}
				break;
			case 4:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(612);
				match(OPEN_PAR);
				setState(613);
				expr(0);
				setState(614);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(616);
				match(K_CAST);
				setState(617);
				match(OPEN_PAR);
				setState(618);
				expr(0);
				setState(619);
				match(K_AS);
				setState(620);
				type_name();
				setState(621);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(623);
						match(K_NOT);
						}
					}

					setState(626);
					match(K_EXISTS);
					}
				}

				setState(629);
				match(OPEN_PAR);
				setState(630);
				select_stmt();
				setState(631);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(633);
				match(K_CASE);
				setState(635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(634);
					expr(0);
					}
					break;
				}
				setState(642); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(637);
					match(K_WHEN);
					setState(638);
					expr(0);
					setState(639);
					match(K_THEN);
					setState(640);
					expr(0);
					}
					}
					setState(644); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(646);
					match(K_ELSE);
					setState(647);
					expr(0);
					}
				}

				setState(650);
				match(K_END);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(743);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(654);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(655);
						match(PIPE2);
						setState(656);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(657);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(658);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(659);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(660);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(661);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(662);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(663);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(664);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(665);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(666);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(667);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(668);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(669);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(680);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
						case 1:
							{
							setState(670);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(671);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(672);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(673);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(674);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(675);
							match(K_IS);
							setState(676);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(677);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(678);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(679);
							match(K_GLOB);
							}
							break;
						}
						setState(682);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(683);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(684);
						match(K_AND);
						setState(685);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(686);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(687);
						match(K_OR);
						setState(688);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(689);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(691);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(690);
							match(K_NOT);
							}
						}

						setState(693);
						_la = _input.LA(1);
						if ( !(_la==K_GLOB || _la==K_LIKE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(694);
						expr(8);
						}
						break;
					case 10:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(695);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(696);
						match(K_IS);
						setState(698);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
						case 1:
							{
							setState(697);
							match(K_NOT);
							}
							break;
						}
						setState(700);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(701);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(703);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(702);
							match(K_NOT);
							}
						}

						setState(705);
						match(K_BETWEEN);
						setState(706);
						expr(0);
						setState(707);
						match(K_AND);
						setState(708);
						expr(5);
						}
						break;
					case 12:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(710);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(715);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(711);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(712);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(713);
							match(K_NOT);
							setState(714);
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
						setState(717);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(719);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(718);
							match(K_NOT);
							}
						}

						setState(721);
						match(K_IN);
						setState(741);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
						case 1:
							{
							setState(722);
							match(OPEN_PAR);
							setState(732);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
							case 1:
								{
								setState(723);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(724);
								expr(0);
								setState(729);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(725);
									match(COMMA);
									setState(726);
									expr(0);
									}
									}
									setState(731);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(734);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(738);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
							case 1:
								{
								setState(735);
								database_name();
								setState(736);
								match(DOT);
								}
								break;
							}
							setState(740);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
		public TerminalNode OPEN_PAR() { return getToken(sqliteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(sqliteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(748);
			match(K_REFERENCES);
			setState(749);
			foreign_table();
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(750);
				match(OPEN_PAR);
				setState(751);
				column_name();
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(752);
					match(COMMA);
					setState(753);
					column_name();
					}
					}
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(759);
				match(CLOSE_PAR);
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
			setState(763);
			column_name();
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(764);
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
		public TerminalNode OPEN_PAR() { return getToken(sqliteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(sqliteParser.CLOSE_PAR, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(770);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(767);
					match(K_PRIMARY);
					setState(768);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(769);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(772);
				match(OPEN_PAR);
				setState(773);
				indexed_column();
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(774);
					match(COMMA);
					setState(775);
					indexed_column();
					}
					}
					setState(780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(781);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(783);
				match(K_FOREIGN);
				setState(784);
				match(K_KEY);
				setState(785);
				match(OPEN_PAR);
				setState(786);
				column_name();
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(787);
					match(COMMA);
					setState(788);
					column_name();
					}
					}
					setState(793);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(794);
				match(CLOSE_PAR);
				setState(795);
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
		public List<TerminalNode> OPEN_PAR() { return getTokens(sqliteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(sqliteParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(sqliteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(sqliteParser.CLOSE_PAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(799);
			cte_table_name();
			setState(800);
			match(K_AS);
			setState(801);
			match(OPEN_PAR);
			setState(802);
			select_stmt();
			setState(803);
			match(CLOSE_PAR);
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(804);
				match(COMMA);
				setState(805);
				cte_table_name();
				setState(806);
				match(K_AS);
				setState(807);
				match(OPEN_PAR);
				setState(808);
				select_stmt();
				setState(809);
				match(CLOSE_PAR);
				}
				}
				setState(815);
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
		public TerminalNode DOT() { return getToken(sqliteParser.DOT, 0); }
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
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(816);
				database_name();
				setState(817);
				match(DOT);
				}
				break;
			}
			setState(821);
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
			setState(823);
			expr(0);
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(824);
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
		public List<TerminalNode> OPEN_PAR() { return getTokens(sqliteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(sqliteParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(sqliteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(sqliteParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(827);
			table_name();
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(828);
				match(OPEN_PAR);
				setState(829);
				column_name();
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(830);
					match(COMMA);
					setState(831);
					column_name();
					}
					}
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(837);
				match(CLOSE_PAR);
				}
			}

			setState(841);
			match(K_AS);
			setState(842);
			match(OPEN_PAR);
			setState(843);
			select_stmt();
			setState(844);
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
	public static class DotANDstarContext extends Result_columnContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(sqliteParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(sqliteParser.STAR, 0); }
		public DotANDstarContext(Result_columnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).enterDotANDstar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqliteListener ) ((sqliteListener)listener).exitDotANDstar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqliteVisitor ) return ((sqliteVisitor<? extends T>)visitor).visitDotANDstar(this);
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
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				_localctx = new MyStarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				match(STAR);
				}
				break;
			case 2:
				_localctx = new DotANDstarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				table_name();
				setState(848);
				match(DOT);
				setState(849);
				match(STAR);
				}
				break;
			case 3:
				_localctx = new ExpressionAliasContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(851);
				expr(0);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(852);
						match(K_AS);
						}
					}

					setState(855);
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
		public TerminalNode DOT() { return getToken(sqliteParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(sqliteParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(sqliteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(sqliteParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				_localctx = new TableORSubqueryAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(860);
					database_name();
					setState(861);
					match(DOT);
					}
					break;
				}
				setState(865);
				table_name();
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(867);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(866);
						match(K_AS);
						}
						break;
					}
					setState(869);
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
				setState(872);
				match(OPEN_PAR);
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(873);
					table_or_subquery();
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(874);
						match(COMMA);
						setState(875);
						table_or_subquery();
						}
						}
						setState(880);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(881);
					join_clause();
					}
					break;
				}
				setState(884);
				match(CLOSE_PAR);
				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(886);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						setState(885);
						match(K_AS);
						}
						break;
					}
					setState(888);
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
				setState(891);
				match(OPEN_PAR);
				setState(892);
				select_stmt();
				setState(893);
				match(CLOSE_PAR);
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(895);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						setState(894);
						match(K_AS);
						}
						break;
					}
					setState(897);
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
			setState(902);
			table_or_subquery();
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << K_CROSS) | (1L << K_INNER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_JOIN - 68)) | (1L << (K_LEFT - 68)) | (1L << (K_NATURAL - 68)))) != 0)) {
				{
				{
				setState(903);
				join_operator();
				setState(904);
				table_or_subquery();
				setState(905);
				join_constraint();
				}
				}
				setState(911);
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
	public static class JoinOperatorContext extends Join_operatorContext {
		public TerminalNode COMMA() { return getToken(sqliteParser.COMMA, 0); }
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
			setState(925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new JoinOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				match(COMMA);
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
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(913);
					match(K_NATURAL);
					}
				}

				setState(922);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(916);
					match(K_LEFT);
					setState(918);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(917);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(920);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(921);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(924);
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
		public TerminalNode OPEN_PAR() { return getToken(sqliteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(sqliteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(941);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(927);
				match(K_ON);
				setState(928);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(929);
				match(K_USING);
				setState(930);
				match(OPEN_PAR);
				setState(931);
				column_name();
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(932);
					match(COMMA);
					setState(933);
					column_name();
					}
					}
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(939);
				match(CLOSE_PAR);
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
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(943);
			match(K_SELECT);
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(944);
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
			setState(947);
			result_column();
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(948);
				match(COMMA);
				setState(949);
				result_column();
				}
				}
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(955);
				match(K_FROM);
				setState(965);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(956);
					table_or_subquery();
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(957);
						match(COMMA);
						setState(958);
						table_or_subquery();
						}
						}
						setState(963);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(964);
					join_clause();
					}
					break;
				}
				}
			}

			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(969);
				match(K_WHERE);
				setState(970);
				expr(0);
				}
			}

			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_GROUP) {
				{
				setState(973);
				match(K_GROUP);
				setState(974);
				match(K_BY);
				setState(975);
				expr(0);
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(976);
					match(COMMA);
					setState(977);
					expr(0);
					}
					}
					setState(982);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_HAVING) {
					{
					setState(983);
					match(K_HAVING);
					setState(984);
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
			setState(994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				_localctx = new CompoundPperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				match(K_UNION);
				}
				break;
			case 2:
				_localctx = new CompoundOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				match(K_UNION);
				setState(991);
				match(K_ALL);
				}
				break;
			case 3:
				_localctx = new CompoundOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(992);
				match(K_INTERSECT);
				}
				break;
			case 4:
				_localctx = new CompoundOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(993);
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
		public TerminalNode OPEN_PAR() { return getToken(sqliteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(sqliteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(sqliteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(sqliteParser.COMMA, i);
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
			setState(996);
			table_name();
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(997);
				match(OPEN_PAR);
				setState(998);
				column_name();
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(999);
					match(COMMA);
					setState(1000);
					column_name();
					}
					}
					setState(1005);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1006);
				match(CLOSE_PAR);
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
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1010);
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

			setState(1013);
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
			setState(1022);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				match(STRING_LITERAL);
				}
				break;
			case BLOB_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1017);
				match(BLOB_LITERAL);
				}
				break;
			case K_NULL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1018);
				match(K_NULL);
				}
				break;
			case K_CURRENT_TIME:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1019);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_DATE:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1020);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1021);
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
			setState(1028);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				match(MINUS);
				}
				break;
			case PLUS:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				match(PLUS);
				}
				break;
			case TILDE:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1026);
				match(TILDE);
				}
				break;
			case K_NOT:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1027);
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
			setState(1032);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ColumnAliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				_localctx = new ColumnAliasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
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
		enterRule(_localctx, 78, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
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
		enterRule(_localctx, 80, RULE_name);
		try {
			_localctx = new TypeNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(1036);
				match(INT);
				}
				break;
			case INTEGER:
				{
				setState(1037);
				match(INTEGER);
				}
				break;
			case TINYINT:
				{
				setState(1038);
				match(TINYINT);
				}
				break;
			case SMALLINT:
				{
				setState(1039);
				match(SMALLINT);
				}
				break;
			case MEDIUMINT:
				{
				setState(1040);
				match(MEDIUMINT);
				}
				break;
			case BIGINT:
				{
				setState(1041);
				match(BIGINT);
				}
				break;
			case UNSIGNED:
				{
				setState(1042);
				match(UNSIGNED);
				setState(1043);
				match(BIG);
				setState(1044);
				match(INT);
				}
				break;
			case TEXT:
				{
				setState(1045);
				match(TEXT);
				}
				break;
			case BLOB:
				{
				setState(1046);
				match(BLOB);
				}
				break;
			case REAL:
				{
				setState(1047);
				match(REAL);
				}
				break;
			case DOUBLE:
				{
				setState(1048);
				match(DOUBLE);
				}
				break;
			case FLOAT:
				{
				setState(1049);
				match(FLOAT);
				}
				break;
			case NUMERIC:
				{
				setState(1050);
				match(NUMERIC);
				}
				break;
			case BOOLEAN:
				{
				setState(1051);
				match(BOOLEAN);
				}
				break;
			case DATE:
				{
				setState(1052);
				match(DATE);
				}
				break;
			case DATETIME:
				{
				setState(1053);
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
		enterRule(_localctx, 82, RULE_name_with_brackets);
		int _la;
		try {
			_localctx = new TypeNameWithBracketsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
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
		enterRule(_localctx, 84, RULE_database_name);
		try {
			_localctx = new GetDatabaseNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
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
		enterRule(_localctx, 86, RULE_table_name);
		try {
			_localctx = new GetTableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
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
		enterRule(_localctx, 88, RULE_new_table_name);
		try {
			_localctx = new GetNewTableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
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
		enterRule(_localctx, 90, RULE_column_name);
		try {
			_localctx = new GetColumnNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
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
		enterRule(_localctx, 92, RULE_foreign_table);
		try {
			_localctx = new GetForeignTableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
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
		enterRule(_localctx, 94, RULE_table_alias);
		try {
			_localctx = new GetTableAliasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
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
		enterRule(_localctx, 96, RULE_any_name);
		try {
			setState(1077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
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
				setState(1071);
				keyword();
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1072);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				_localctx = new ReAnyNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1073);
				match(OPEN_PAR);
				setState(1074);
				any_name();
				setState(1075);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0088\u043a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\7"+
		"\2i\n\2\f\2\16\2l\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u0086\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u008e\n\5\3\5\5\5\u0091\n\5\3\6\3\6\3\6\3\6\7"+
		"\6\u0097\n\6\f\6\16\6\u009a\13\6\5\6\u009c\n\6\3\6\3\6\3\6\5\6\u00a1\n"+
		"\6\3\6\3\6\5\6\u00a5\n\6\3\6\6\6\u00a8\n\6\r\6\16\6\u00a9\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u00b1\n\6\f\6\16\6\u00b4\13\6\5\6\u00b6\n\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00bc\n\6\5\6\u00be\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00c5\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u00cc\n\7\f\7\16\7\u00cf\13\7\3\7\3\7\7\7\u00d3\n\7"+
		"\f\7\16\7\u00d6\13\7\3\7\3\7\3\7\3\7\5\7\u00dc\n\7\3\b\5\b\u00df\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00e6\n\b\3\t\5\t\u00e9\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00f0\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u00f7\n\t\f\t\16\t\u00fa\13\t\5"+
		"\t\u00fc\n\t\3\t\3\t\3\t\3\t\5\t\u0102\n\t\5\t\u0104\n\t\3\n\3\n\3\n\3"+
		"\n\5\n\u010a\n\n\3\n\3\n\3\n\5\n\u010f\n\n\3\n\3\n\3\13\3\13\3\13\7\13"+
		"\u0116\n\13\f\13\16\13\u0119\13\13\5\13\u011b\n\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0121\n\13\f\13\16\13\u0124\13\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u012b\n\13\f\13\16\13\u012e\13\13\5\13\u0130\n\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0136\n\13\5\13\u0138\n\13\3\f\5\f\u013b\n\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0142\n\f\3\f\3\f\3\f\3\f\3\f\7\f\u0149\n\f\f\f\16\f\u014c\13\f\3"+
		"\f\3\f\5\f\u0150\n\f\3\f\3\f\3\f\3\f\3\f\7\f\u0157\n\f\f\f\16\f\u015a"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0162\n\f\f\f\16\f\u0165\13\f\3\f\3"+
		"\f\7\f\u0169\n\f\f\f\16\f\u016c\13\f\3\f\5\f\u016f\n\f\3\r\3\r\3\r\3\r"+
		"\7\r\u0175\n\r\f\r\16\r\u0178\13\r\5\r\u017a\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u0182\n\r\f\r\16\r\u0185\13\r\5\r\u0187\n\r\3\r\3\r\3\r\3\r\5\r"+
		"\u018d\n\r\5\r\u018f\n\r\3\16\3\16\3\16\3\16\7\16\u0195\n\16\f\16\16\16"+
		"\u0198\13\16\5\16\u019a\n\16\3\16\3\16\3\16\3\16\7\16\u01a0\n\16\f\16"+
		"\16\16\u01a3\13\16\3\16\3\16\3\16\3\16\3\16\7\16\u01aa\n\16\f\16\16\16"+
		"\u01ad\13\16\5\16\u01af\n\16\3\16\3\16\3\16\3\16\5\16\u01b5\n\16\5\16"+
		"\u01b7\n\16\3\17\3\17\5\17\u01bb\n\17\3\17\3\17\3\17\7\17\u01c0\n\17\f"+
		"\17\16\17\u01c3\13\17\3\17\3\17\3\17\3\17\7\17\u01c9\n\17\f\17\16\17\u01cc"+
		"\13\17\3\17\5\17\u01cf\n\17\5\17\u01d1\n\17\3\17\3\17\5\17\u01d5\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u01dc\n\17\f\17\16\17\u01df\13\17\3\17"+
		"\3\17\5\17\u01e3\n\17\5\17\u01e5\n\17\3\20\5\20\u01e8\n\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01f5\n\20\f\20\16\20"+
		"\u01f8\13\20\3\20\3\20\5\20\u01fc\n\20\3\21\5\21\u01ff\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u020c\n\21\f\21\16"+
		"\21\u020f\13\21\3\21\3\21\5\21\u0213\n\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u021a\n\21\f\21\16\21\u021d\13\21\5\21\u021f\n\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0225\n\21\5\21\u0227\n\21\3\22\3\22\5\22\u022b\n\22\3\22\7\22\u022e"+
		"\n\22\f\22\16\22\u0231\13\22\3\23\3\23\6\23\u0235\n\23\r\23\16\23\u0236"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0243\n\23\5\23"+
		"\u0245\n\23\3\24\3\24\3\24\5\24\u024a\n\24\3\24\5\24\u024d\n\24\3\24\5"+
		"\24\u0250\n\24\3\24\3\24\3\24\5\24\u0255\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u025c\n\25\3\25\3\25\3\25\5\25\u0261\n\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0273"+
		"\n\25\3\25\5\25\u0276\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u027e\n"+
		"\25\3\25\3\25\3\25\3\25\3\25\6\25\u0285\n\25\r\25\16\25\u0286\3\25\3\25"+
		"\5\25\u028b\n\25\3\25\3\25\5\25\u028f\n\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02ab\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u02b6\n\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u02bd\n\25\3\25\3\25\3\25\5\25\u02c2\n\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u02ce\n\25\3\25\3\25\5\25\u02d2\n\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u02da\n\25\f\25\16\25\u02dd\13\25\5\25"+
		"\u02df\n\25\3\25\3\25\3\25\3\25\5\25\u02e5\n\25\3\25\5\25\u02e8\n\25\7"+
		"\25\u02ea\n\25\f\25\16\25\u02ed\13\25\3\26\3\26\3\26\3\26\3\26\3\26\7"+
		"\26\u02f5\n\26\f\26\16\26\u02f8\13\26\3\26\3\26\5\26\u02fc\n\26\3\27\3"+
		"\27\5\27\u0300\n\27\3\30\3\30\3\30\5\30\u0305\n\30\3\30\3\30\3\30\3\30"+
		"\7\30\u030b\n\30\f\30\16\30\u030e\13\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u0318\n\30\f\30\16\30\u031b\13\30\3\30\3\30\3\30\5\30"+
		"\u0320\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u032e\n\31\f\31\16\31\u0331\13\31\3\32\3\32\3\32\5\32\u0336\n\32"+
		"\3\32\3\32\3\33\3\33\5\33\u033c\n\33\3\34\3\34\3\34\3\34\3\34\7\34\u0343"+
		"\n\34\f\34\16\34\u0346\13\34\3\34\3\34\5\34\u034a\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0358\n\35\3\35\5\35"+
		"\u035b\n\35\5\35\u035d\n\35\3\36\3\36\3\36\5\36\u0362\n\36\3\36\3\36\5"+
		"\36\u0366\n\36\3\36\5\36\u0369\n\36\3\36\3\36\3\36\3\36\7\36\u036f\n\36"+
		"\f\36\16\36\u0372\13\36\3\36\5\36\u0375\n\36\3\36\3\36\5\36\u0379\n\36"+
		"\3\36\5\36\u037c\n\36\3\36\3\36\3\36\3\36\5\36\u0382\n\36\3\36\5\36\u0385"+
		"\n\36\5\36\u0387\n\36\3\37\3\37\3\37\3\37\3\37\7\37\u038e\n\37\f\37\16"+
		"\37\u0391\13\37\3 \3 \5 \u0395\n \3 \3 \5 \u0399\n \3 \3 \5 \u039d\n "+
		"\3 \5 \u03a0\n \3!\3!\3!\3!\3!\3!\3!\7!\u03a9\n!\f!\16!\u03ac\13!\3!\3"+
		"!\5!\u03b0\n!\3\"\3\"\5\"\u03b4\n\"\3\"\3\"\3\"\7\"\u03b9\n\"\f\"\16\""+
		"\u03bc\13\"\3\"\3\"\3\"\3\"\7\"\u03c2\n\"\f\"\16\"\u03c5\13\"\3\"\5\""+
		"\u03c8\n\"\5\"\u03ca\n\"\3\"\3\"\5\"\u03ce\n\"\3\"\3\"\3\"\3\"\3\"\7\""+
		"\u03d5\n\"\f\"\16\"\u03d8\13\"\3\"\3\"\5\"\u03dc\n\"\5\"\u03de\n\"\3#"+
		"\3#\3#\3#\3#\5#\u03e5\n#\3$\3$\3$\3$\3$\7$\u03ec\n$\f$\16$\u03ef\13$\3"+
		"$\3$\5$\u03f3\n$\3%\5%\u03f6\n%\3%\3%\3&\3&\3&\3&\3&\3&\3&\5&\u0401\n"+
		"&\3\'\3\'\3\'\3\'\5\'\u0407\n\'\3(\3(\5(\u040b\n(\3)\3)\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0421\n*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5"+
		"\62\u0438\n\62\3\62\2\3(\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\r\4\2\7\7QQ\4\2AAYY\4\2\35"+
		"\35\61\61\4\2!!\60\60\4\2\t\t\16\17\3\2\n\13\3\2\20\23\3\2\24\27\4\2;"+
		";II\3\2\34i\3\2{\177\2\u04e8\2j\3\2\2\2\4o\3\2\2\2\6~\3\2\2\2\b\u0080"+
		"\3\2\2\2\n\u009b\3\2\2\2\f\u00bf\3\2\2\2\16\u00de\3\2\2\2\20\u00e8\3\2"+
		"\2\2\22\u0105\3\2\2\2\24\u011a\3\2\2\2\26\u013a\3\2\2\2\30\u0179\3\2\2"+
		"\2\32\u0199\3\2\2\2\34\u01b8\3\2\2\2\36\u01e7\3\2\2\2 \u01fe\3\2\2\2\""+
		"\u0228\3\2\2\2$\u0244\3\2\2\2&\u0254\3\2\2\2(\u028e\3\2\2\2*\u02ee\3\2"+
		"\2\2,\u02fd\3\2\2\2.\u031f\3\2\2\2\60\u0321\3\2\2\2\62\u0335\3\2\2\2\64"+
		"\u0339\3\2\2\2\66\u033d\3\2\2\28\u035c\3\2\2\2:\u0386\3\2\2\2<\u0388\3"+
		"\2\2\2>\u039f\3\2\2\2@\u03af\3\2\2\2B\u03b1\3\2\2\2D\u03e4\3\2\2\2F\u03e6"+
		"\3\2\2\2H\u03f5\3\2\2\2J\u0400\3\2\2\2L\u0406\3\2\2\2N\u040a\3\2\2\2P"+
		"\u040c\3\2\2\2R\u0420\3\2\2\2T\u0422\3\2\2\2V\u0424\3\2\2\2X\u0426\3\2"+
		"\2\2Z\u0428\3\2\2\2\\\u042a\3\2\2\2^\u042c\3\2\2\2`\u042e\3\2\2\2b\u0437"+
		"\3\2\2\2de\5\6\4\2ef\7\3\2\2fi\3\2\2\2gi\5\4\3\2hd\3\2\2\2hg\3\2\2\2i"+
		"l\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\2\2\3n\3\3\2\2\2"+
		"op\7\u0088\2\2pq\b\3\1\2q\5\3\2\2\2r\177\5\b\5\2s\177\5\n\6\2t\177\5\f"+
		"\7\2u\177\5\16\b\2v\177\5\20\t\2w\177\5\22\n\2x\177\5\24\13\2y\177\5\26"+
		"\f\2z\177\5\30\r\2{\177\5\32\16\2|\177\5\36\20\2}\177\5 \21\2~r\3\2\2"+
		"\2~s\3\2\2\2~t\3\2\2\2~u\3\2\2\2~v\3\2\2\2~w\3\2\2\2~x\3\2\2\2~y\3\2\2"+
		"\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\7\3\2\2\2\u0080\u0081\7"+
		"\36\2\2\u0081\u0085\7^\2\2\u0082\u0083\5V,\2\u0083\u0084\7\4\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0090\5X-\2\u0088\u0089\7X\2\2\u0089\u008a\7`\2\2\u008a\u0091"+
		"\5Z.\2\u008b\u008d\7\34\2\2\u008c\u008e\7\'\2\2\u008d\u008c\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\5\"\22\2\u0090\u0088\3"+
		"\2\2\2\u0090\u008b\3\2\2\2\u0091\t\3\2\2\2\u0092\u0093\7i\2\2\u0093\u0098"+
		"\5\66\34\2\u0094\u0095\7\7\2\2\u0095\u0097\5\66\34\2\u0096\u0094\3\2\2"+
		"\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a7\5B\"\2\u009e\u00a0\7a\2\2\u009f\u00a1\7\35"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2"+
		"\u00a5\7B\2\2\u00a3\u00a5\7\65\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\5B\"\2\u00a7"+
		"\u00a4\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00b5\3\2\2\2\u00ab\u00ac\7T\2\2\u00ac\u00ad\7$\2\2\u00ad\u00b2"+
		"\5\64\33\2\u00ae\u00af\7\7\2\2\u00af\u00b1\5\64\33\2\u00b0\u00ae\3\2\2"+
		"\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00bd\3\2\2\2\u00b7\u00b8\7J\2\2\u00b8\u00bb\5(\25\2\u00b9\u00ba\t\2"+
		"\2\2\u00ba\u00bc\5(\25\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\13\3\2\2"+
		"\2\u00bf\u00c0\7(\2\2\u00c0\u00c4\7^\2\2\u00c1\u00c2\5V,\2\u00c2\u00c3"+
		"\7\4\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00db\5X-\2\u00c7\u00c8\7\5\2\2\u00c8\u00cd\5\"\22"+
		"\2\u00c9\u00ca\7\7\2\2\u00ca\u00cc\5\"\22\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d4\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\7\2\2\u00d1\u00d3\5.\30\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\6\2\2\u00d8"+
		"\u00dc\3\2\2\2\u00d9\u00da\7 \2\2\u00da\u00dc\5\32\16\2\u00db\u00c7\3"+
		"\2\2\2\u00db\u00d9\3\2\2\2\u00dc\r\3\2\2\2\u00dd\u00df\5\60\31\2\u00de"+
		"\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7/"+
		"\2\2\u00e1\u00e2\79\2\2\u00e2\u00e5\5\62\32\2\u00e3\u00e4\7h\2\2\u00e4"+
		"\u00e6\5(\25\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\17\3\2\2"+
		"\2\u00e7\u00e9\5\60\31\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\7/\2\2\u00eb\u00ec\79\2\2\u00ec\u00ef\5\62"+
		"\32\2\u00ed\u00ee\7h\2\2\u00ee\u00f0\5(\25\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u0103\3\2\2\2\u00f1\u00f2\7T\2\2\u00f2\u00f3\7$\2"+
		"\2\u00f3\u00f8\5\64\33\2\u00f4\u00f5\7\7\2\2\u00f5\u00f7\5\64\33\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7J\2\2\u00fe\u0101\5(\25"+
		"\2\u00ff\u0100\t\2\2\2\u0100\u0102\5(\25\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\21\3\2\2\2\u0105\u0106\7\62\2\2\u0106\u0109\7^\2\2\u0107\u0108\7>\2\2"+
		"\u0108\u010a\7\66\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010e"+
		"\3\2\2\2\u010b\u010c\5V,\2\u010c\u010d\7\4\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010b\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5X"+
		"-\2\u0111\23\3\2\2\2\u0112\u0117\5\66\34\2\u0113\u0114\7\7\2\2\u0114\u0116"+
		"\5\66\34\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u0112"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0122\5B\"\2\u011d"+
		"\u011e\5D#\2\u011e\u011f\5B\"\2\u011f\u0121\3\2\2\2\u0120\u011d\3\2\2"+
		"\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u012f"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7T\2\2\u0126\u0127\7$\2\2\u0127"+
		"\u012c\5\64\33\2\u0128\u0129\7\7\2\2\u0129\u012b\5\64\33\2\u012a\u0128"+
		"\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0125\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0137\3\2\2\2\u0131\u0132\7J\2\2\u0132\u0135\5(\25\2\u0133"+
		"\u0134\t\2\2\2\u0134\u0136\5(\25\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0138\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\25\3\2\2\2\u0139\u013b\5\60\31\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013d\t\3\2\2\u013d\u0141\7C\2\2\u013e"+
		"\u013f\5V,\2\u013f\u0140\7\4\2\2\u0140\u0142\3\2\2\2\u0141\u013e\3\2\2"+
		"\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u014f\5X-\2\u0144\u0145"+
		"\7\5\2\2\u0145\u014a\5\\/\2\u0146\u0147\7\7\2\2\u0147\u0149\5\\/\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\6\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u0144\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u016e\3\2"+
		"\2\2\u0151\u0152\7e\2\2\u0152\u0153\7\5\2\2\u0153\u0158\5(\25\2\u0154"+
		"\u0155\7\7\2\2\u0155\u0157\5(\25\2\u0156\u0154\3\2\2\2\u0157\u015a\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015b\u016a\7\6\2\2\u015c\u015d\7\7\2\2\u015d\u015e\7\5"+
		"\2\2\u015e\u0163\5(\25\2\u015f\u0160\7\7\2\2\u0160\u0162\5(\25\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7\6\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u015c\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016f\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u016f\5\32\16\2\u016e\u0151\3\2\2\2\u016e\u016d\3\2\2\2\u016f\27\3\2"+
		"\2\2\u0170\u0171\7i\2\2\u0171\u0176\5\66\34\2\u0172\u0173\7\7\2\2\u0173"+
		"\u0175\5\66\34\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3"+
		"\2\2\2\u0176\u0177\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u0170\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0186\5B"+
		"\"\2\u017c\u017d\7T\2\2\u017d\u017e\7$\2\2\u017e\u0183\5\64\33\2\u017f"+
		"\u0180\7\7\2\2\u0180\u0182\5\64\33\2\u0181\u017f\3\2\2\2\u0182\u0185\3"+
		"\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0187\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186\u017c\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018e\3\2"+
		"\2\2\u0188\u0189\7J\2\2\u0189\u018c\5(\25\2\u018a\u018b\t\2\2\2\u018b"+
		"\u018d\5(\25\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2"+
		"\2\2\u018e\u0188\3\2\2\2\u018e\u018f\3\2\2\2\u018f\31\3\2\2\2\u0190\u0191"+
		"\7i\2\2\u0191\u0196\5\66\34\2\u0192\u0193\7\7\2\2\u0193\u0195\5\66\34"+
		"\2\u0194\u0192\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u0190\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a1\5\34\17\2\u019c\u019d\5"+
		"D#\2\u019d\u019e\5\34\17\2\u019e\u01a0\3\2\2\2\u019f\u019c\3\2\2\2\u01a0"+
		"\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01ae\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7T\2\2\u01a5\u01a6\7$\2\2\u01a6\u01ab"+
		"\5\64\33\2\u01a7\u01a8\7\7\2\2\u01a8\u01aa\5\64\33\2\u01a9\u01a7\3\2\2"+
		"\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af"+
		"\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01a4\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b6\3\2\2\2\u01b0\u01b1\7J\2\2\u01b1\u01b4\5(\25\2\u01b2\u01b3\t\2"+
		"\2\2\u01b3\u01b5\5(\25\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b7\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\33\3\2\2"+
		"\2\u01b8\u01ba\7\\\2\2\u01b9\u01bb\t\4\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c1\58\35\2\u01bd\u01be\7\7\2\2\u01be"+
		"\u01c0\58\35\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01d0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01ce\79\2\2\u01c5\u01ca\5:\36\2\u01c6\u01c7\7\7\2\2\u01c7\u01c9\5:\36"+
		"\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01cf\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01cf\5<\37\2\u01ce"+
		"\u01c5\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01c4\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d3\7h\2\2\u01d3"+
		"\u01d5\5(\25\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01e4\3\2"+
		"\2\2\u01d6\u01d7\7<\2\2\u01d7\u01d8\7$\2\2\u01d8\u01dd\5(\25\2\u01d9\u01da"+
		"\7\7\2\2\u01da\u01dc\5(\25\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e2\3\2\2\2\u01df\u01dd\3\2"+
		"\2\2\u01e0\u01e1\7=\2\2\u01e1\u01e3\5(\25\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01d6\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\35\3\2\2\2\u01e6\u01e8\5\60\31\2\u01e7\u01e6\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\5\62"+
		"\32\2\u01eb\u01ec\7]\2\2\u01ec\u01ed\5\\/\2\u01ed\u01ee\7\b\2\2\u01ee"+
		"\u01f6\5(\25\2\u01ef\u01f0\7\7\2\2\u01f0\u01f1\5\\/\2\u01f1\u01f2\7\b"+
		"\2\2\u01f2\u01f3\5(\25\2\u01f3\u01f5\3\2\2\2\u01f4\u01ef\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fb\3\2"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\7h\2\2\u01fa\u01fc\5(\25\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\37\3\2\2\2\u01fd\u01ff\5\60\31"+
		"\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201"+
		"\7c\2\2\u0201\u0202\5\62\32\2\u0202\u0203\7]\2\2\u0203\u0204\5\\/\2\u0204"+
		"\u0205\7\b\2\2\u0205\u020d\5(\25\2\u0206\u0207\7\7\2\2\u0207\u0208\5\\"+
		"/\2\u0208\u0209\7\b\2\2\u0209\u020a\5(\25\2\u020a\u020c\3\2\2\2\u020b"+
		"\u0206\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u0212\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7h\2\2\u0211"+
		"\u0213\5(\25\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0226\3\2"+
		"\2\2\u0214\u0215\7T\2\2\u0215\u0216\7$\2\2\u0216\u021b\5\64\33\2\u0217"+
		"\u0218\7\7\2\2\u0218\u021a\5\64\33\2\u0219\u0217\3\2\2\2\u021a\u021d\3"+
		"\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021e\u0214\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0221\7J\2\2\u0221\u0224\5(\25\2\u0222\u0223\t\2\2\2\u0223"+
		"\u0225\5(\25\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2"+
		"\2\2\u0226\u021e\3\2\2\2\u0226\u0227\3\2\2\2\u0227!\3\2\2\2\u0228\u022a"+
		"\5\\/\2\u0229\u022b\5$\23\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022f\3\2\2\2\u022c\u022e\5&\24\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230#\3\2\2\2\u0231\u022f"+
		"\3\2\2\2\u0232\u0245\5R*\2\u0233\u0235\5T+\2\u0234\u0233\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0242\3\2"+
		"\2\2\u0238\u0239\7\5\2\2\u0239\u023a\5H%\2\u023a\u023b\7\6\2\2\u023b\u0243"+
		"\3\2\2\2\u023c\u023d\7\5\2\2\u023d\u023e\5H%\2\u023e\u023f\7\7\2\2\u023f"+
		"\u0240\5H%\2\u0240\u0241\7\6\2\2\u0241\u0243\3\2\2\2\u0242\u0238\3\2\2"+
		"\2\u0242\u023c\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0232"+
		"\3\2\2\2\u0244\u0234\3\2\2\2\u0245%\3\2\2\2\u0246\u0247\7V\2\2\u0247\u0249"+
		"\7G\2\2\u0248\u024a\t\5\2\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024c\3\2\2\2\u024b\u024d\7\"\2\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u0255\3\2\2\2\u024e\u0250\7M\2\2\u024f\u024e\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0255\7O\2\2\u0252\u0255\7b\2"+
		"\2\u0253\u0255\5*\26\2\u0254\u0246\3\2\2\2\u0254\u024f\3\2\2\2\u0254\u0252"+
		"\3\2\2\2\u0254\u0253\3\2\2\2\u0255\'\3\2\2\2\u0256\u0257\b\25\1\2\u0257"+
		"\u028f\5J&\2\u0258\u0259\5V,\2\u0259\u025a\7\4\2\2\u025a\u025c\3\2\2\2"+
		"\u025b\u0258\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e"+
		"\5X-\2\u025e\u025f\7\4\2\2\u025f\u0261\3\2\2\2\u0260\u025b\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u028f\5\\/\2\u0263\u0264\5L\'"+
		"\2\u0264\u0265\5(\25\24\u0265\u028f\3\2\2\2\u0266\u0267\7\5\2\2\u0267"+
		"\u0268\5(\25\2\u0268\u0269\7\6\2\2\u0269\u028f\3\2\2\2\u026a\u026b\7&"+
		"\2\2\u026b\u026c\7\5\2\2\u026c\u026d\5(\25\2\u026d\u026e\7 \2\2\u026e"+
		"\u026f\5$\23\2\u026f\u0270\7\6\2\2\u0270\u028f\3\2\2\2\u0271\u0273\7M"+
		"\2\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0276\7\66\2\2\u0275\u0272\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3"+
		"\2\2\2\u0277\u0278\7\5\2\2\u0278\u0279\5\32\16\2\u0279\u027a\7\6\2\2\u027a"+
		"\u028f\3\2\2\2\u027b\u027d\7%\2\2\u027c\u027e\5(\25\2\u027d\u027c\3\2"+
		"\2\2\u027d\u027e\3\2\2\2\u027e\u0284\3\2\2\2\u027f\u0280\7g\2\2\u0280"+
		"\u0281\5(\25\2\u0281\u0282\7_\2\2\u0282\u0283\5(\25\2\u0283\u0285\3\2"+
		"\2\2\u0284\u027f\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0284\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0289\7\63\2\2\u0289\u028b\5"+
		"(\25\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028d\7\64\2\2\u028d\u028f\3\2\2\2\u028e\u0256\3\2\2\2\u028e\u0260\3"+
		"\2\2\2\u028e\u0263\3\2\2\2\u028e\u0266\3\2\2\2\u028e\u026a\3\2\2\2\u028e"+
		"\u0275\3\2\2\2\u028e\u027b\3\2\2\2\u028f\u02eb\3\2\2\2\u0290\u0291\f\23"+
		"\2\2\u0291\u0292\7\r\2\2\u0292\u02ea\5(\25\24\u0293\u0294\f\22\2\2\u0294"+
		"\u0295\t\6\2\2\u0295\u02ea\5(\25\23\u0296\u0297\f\21\2\2\u0297\u0298\t"+
		"\7\2\2\u0298\u02ea\5(\25\22\u0299\u029a\f\20\2\2\u029a\u029b\t\b\2\2\u029b"+
		"\u02ea\5(\25\21\u029c\u029d\f\17\2\2\u029d\u029e\t\t\2\2\u029e\u02ea\5"+
		"(\25\20\u029f\u02aa\f\16\2\2\u02a0\u02ab\7\b\2\2\u02a1\u02ab\7\30\2\2"+
		"\u02a2\u02ab\7\31\2\2\u02a3\u02ab\7\32\2\2\u02a4\u02ab\7D\2\2\u02a5\u02a6"+
		"\7D\2\2\u02a6\u02ab\7M\2\2\u02a7\u02ab\7?\2\2\u02a8\u02ab\7I\2\2\u02a9"+
		"\u02ab\7;\2\2\u02aa\u02a0\3\2\2\2\u02aa\u02a1\3\2\2\2\u02aa\u02a2\3\2"+
		"\2\2\u02aa\u02a3\3\2\2\2\u02aa\u02a4\3\2\2\2\u02aa\u02a5\3\2\2\2\u02aa"+
		"\u02a7\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02a9\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u02ea\5(\25\17\u02ad\u02ae\f\r\2\2\u02ae\u02af\7\37\2\2\u02af"+
		"\u02ea\5(\25\16\u02b0\u02b1\f\f\2\2\u02b1\u02b2\7S\2\2\u02b2\u02ea\5("+
		"\25\r\u02b3\u02b5\f\t\2\2\u02b4\u02b6\7M\2\2\u02b5\u02b4\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\t\n\2\2\u02b8\u02ea\5("+
		"\25\n\u02b9\u02ba\f\7\2\2\u02ba\u02bc\7D\2\2\u02bb\u02bd\7M\2\2\u02bc"+
		"\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02ea\5("+
		"\25\b\u02bf\u02c1\f\6\2\2\u02c0\u02c2\7M\2\2\u02c1\u02c0\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7#\2\2\u02c4\u02c5\5(\25"+
		"\2\u02c5\u02c6\7\37\2\2\u02c6\u02c7\5(\25\7\u02c7\u02ea\3\2\2\2\u02c8"+
		"\u02cd\f\b\2\2\u02c9\u02ce\7E\2\2\u02ca\u02ce\7N\2\2\u02cb\u02cc\7M\2"+
		"\2\u02cc\u02ce\7O\2\2\u02cd\u02c9\3\2\2\2\u02cd\u02ca\3\2\2\2\u02cd\u02cb"+
		"\3\2\2\2\u02ce\u02ea\3\2\2\2\u02cf\u02d1\f\5\2\2\u02d0\u02d2\7M\2\2\u02d1"+
		"\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02e7\7?"+
		"\2\2\u02d4\u02de\7\5\2\2\u02d5\u02df\5\32\16\2\u02d6\u02db\5(\25\2\u02d7"+
		"\u02d8\7\7\2\2\u02d8\u02da\5(\25\2\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2"+
		"\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02de\u02d5\3\2\2\2\u02de\u02d6\3\2\2\2\u02de\u02df\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e8\7\6\2\2\u02e1\u02e2\5V,\2\u02e2\u02e3"+
		"\7\4\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e1\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e8\5X-\2\u02e7\u02d4\3\2\2\2\u02e7\u02e4\3\2\2"+
		"\2\u02e8\u02ea\3\2\2\2\u02e9\u0290\3\2\2\2\u02e9\u0293\3\2\2\2\u02e9\u0296"+
		"\3\2\2\2\u02e9\u0299\3\2\2\2\u02e9\u029c\3\2\2\2\u02e9\u029f\3\2\2\2\u02e9"+
		"\u02ad\3\2\2\2\u02e9\u02b0\3\2\2\2\u02e9\u02b3\3\2\2\2\u02e9\u02b9\3\2"+
		"\2\2\u02e9\u02bf\3\2\2\2\u02e9\u02c8\3\2\2\2\u02e9\u02cf\3\2\2\2\u02ea"+
		"\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec)\3\2\2\2"+
		"\u02ed\u02eb\3\2\2\2\u02ee\u02ef\7W\2\2\u02ef\u02fb\5^\60\2\u02f0\u02f1"+
		"\7\5\2\2\u02f1\u02f6\5\\/\2\u02f2\u02f3\7\7\2\2\u02f3\u02f5\5\\/\2\u02f4"+
		"\u02f2\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2"+
		"\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fa\7\6\2\2\u02fa"+
		"\u02fc\3\2\2\2\u02fb\u02f0\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc+\3\2\2\2"+
		"\u02fd\u02ff\5\\/\2\u02fe\u0300\t\5\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300"+
		"\3\2\2\2\u0300-\3\2\2\2\u0301\u0302\7V\2\2\u0302\u0305\7G\2\2\u0303\u0305"+
		"\7b\2\2\u0304\u0301\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0307\7\5\2\2\u0307\u030c\5,\27\2\u0308\u0309\7\7\2\2\u0309\u030b\5,"+
		"\27\2\u030a\u0308\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0310\7\6"+
		"\2\2\u0310\u0320\3\2\2\2\u0311\u0312\78\2\2\u0312\u0313\7G\2\2\u0313\u0314"+
		"\7\5\2\2\u0314\u0319\5\\/\2\u0315\u0316\7\7\2\2\u0316\u0318\5\\/\2\u0317"+
		"\u0315\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2"+
		"\2\2\u031a\u031c\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u031d\7\6\2\2\u031d"+
		"\u031e\5*\26\2\u031e\u0320\3\2\2\2\u031f\u0304\3\2\2\2\u031f\u0311\3\2"+
		"\2\2\u0320/\3\2\2\2\u0321\u0322\5F$\2\u0322\u0323\7 \2\2\u0323\u0324\7"+
		"\5\2\2\u0324\u0325\5\32\16\2\u0325\u032f\7\6\2\2\u0326\u0327\7\7\2\2\u0327"+
		"\u0328\5F$\2\u0328\u0329\7 \2\2\u0329\u032a\7\5\2\2\u032a\u032b\5\32\16"+
		"\2\u032b\u032c\7\6\2\2\u032c\u032e\3\2\2\2\u032d\u0326\3\2\2\2\u032e\u0331"+
		"\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330\61\3\2\2\2\u0331"+
		"\u032f\3\2\2\2\u0332\u0333\5V,\2\u0333\u0334\7\4\2\2\u0334\u0336\3\2\2"+
		"\2\u0335\u0332\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338"+
		"\5X-\2\u0338\63\3\2\2\2\u0339\u033b\5(\25\2\u033a\u033c\t\5\2\2\u033b"+
		"\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\65\3\2\2\2\u033d\u0349\5X-\2"+
		"\u033e\u033f\7\5\2\2\u033f\u0344\5\\/\2\u0340\u0341\7\7\2\2\u0341\u0343"+
		"\5\\/\2\u0342\u0340\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0344"+
		"\u0345\3\2\2\2\u0345\u0347\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u0348\7\6"+
		"\2\2\u0348\u034a\3\2\2\2\u0349\u033e\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u034c\7 \2\2\u034c\u034d\7\5\2\2\u034d\u034e\5\32"+
		"\16\2\u034e\u034f\7\6\2\2\u034f\67\3\2\2\2\u0350\u035d\7\t\2\2\u0351\u0352"+
		"\5X-\2\u0352\u0353\7\4\2\2\u0353\u0354\7\t\2\2\u0354\u035d\3\2\2\2\u0355"+
		"\u035a\5(\25\2\u0356\u0358\7 \2\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2"+
		"\2\2\u0358\u0359\3\2\2\2\u0359\u035b\5N(\2\u035a\u0357\3\2\2\2\u035a\u035b"+
		"\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u0350\3\2\2\2\u035c\u0351\3\2\2\2\u035c"+
		"\u0355\3\2\2\2\u035d9\3\2\2\2\u035e\u035f\5V,\2\u035f\u0360\7\4\2\2\u0360"+
		"\u0362\3\2\2\2\u0361\u035e\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\3\2"+
		"\2\2\u0363\u0368\5X-\2\u0364\u0366\7 \2\2\u0365\u0364\3\2\2\2\u0365\u0366"+
		"\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0369\5`\61\2\u0368\u0365\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u0387\3\2\2\2\u036a\u0374\7\5\2\2\u036b\u0370\5:"+
		"\36\2\u036c\u036d\7\7\2\2\u036d\u036f\5:\36\2\u036e\u036c\3\2\2\2\u036f"+
		"\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0375\3\2"+
		"\2\2\u0372\u0370\3\2\2\2\u0373\u0375\5<\37\2\u0374\u036b\3\2\2\2\u0374"+
		"\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u037b\7\6\2\2\u0377\u0379\7 "+
		"\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037c\5`\61\2\u037b\u0378\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u0387\3\2"+
		"\2\2\u037d\u037e\7\5\2\2\u037e\u037f\5\32\16\2\u037f\u0384\7\6\2\2\u0380"+
		"\u0382\7 \2\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2"+
		"\2\2\u0383\u0385\5`\61\2\u0384\u0381\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"\u0387\3\2\2\2\u0386\u0361\3\2\2\2\u0386\u036a\3\2\2\2\u0386\u037d\3\2"+
		"\2\2\u0387;\3\2\2\2\u0388\u038f\5:\36\2\u0389\u038a\5> \2\u038a\u038b"+
		"\5:\36\2\u038b\u038c\5@!\2\u038c\u038e\3\2\2\2\u038d\u0389\3\2\2\2\u038e"+
		"\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390=\3\2\2\2"+
		"\u0391\u038f\3\2\2\2\u0392\u03a0\7\7\2\2\u0393\u0395\7K\2\2\u0394\u0393"+
		"\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u039c\3\2\2\2\u0396\u0398\7H\2\2\u0397"+
		"\u0399\7U\2\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039d\3\2"+
		"\2\2\u039a\u039d\7@\2\2\u039b\u039d\7)\2\2\u039c\u0396\3\2\2\2\u039c\u039a"+
		"\3\2\2\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e"+
		"\u03a0\7F\2\2\u039f\u0392\3\2\2\2\u039f\u0394\3\2\2\2\u03a0?\3\2\2\2\u03a1"+
		"\u03a2\7R\2\2\u03a2\u03b0\5(\25\2\u03a3\u03a4\7d\2\2\u03a4\u03a5\7\5\2"+
		"\2\u03a5\u03aa\5\\/\2\u03a6\u03a7\7\7\2\2\u03a7\u03a9\5\\/\2\u03a8\u03a6"+
		"\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03ad\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03ae\7\6\2\2\u03ae\u03b0\3\2"+
		"\2\2\u03af\u03a1\3\2\2\2\u03af\u03a3\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0"+
		"A\3\2\2\2\u03b1\u03b3\7\\\2\2\u03b2\u03b4\t\4\2\2\u03b3\u03b2\3\2\2\2"+
		"\u03b3\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03ba\58\35\2\u03b6\u03b7"+
		"\7\7\2\2\u03b7\u03b9\58\35\2\u03b8\u03b6\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba"+
		"\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03c9\3\2\2\2\u03bc\u03ba\3\2"+
		"\2\2\u03bd\u03c7\79\2\2\u03be\u03c3\5:\36\2\u03bf\u03c0\7\7\2\2\u03c0"+
		"\u03c2\5:\36\2\u03c1\u03bf\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2"+
		"\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c8\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6"+
		"\u03c8\5<\37\2\u03c7\u03be\3\2\2\2\u03c7\u03c6\3\2\2\2\u03c8\u03ca\3\2"+
		"\2\2\u03c9\u03bd\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb"+
		"\u03cc\7h\2\2\u03cc\u03ce\5(\25\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2"+
		"\2\2\u03ce\u03dd\3\2\2\2\u03cf\u03d0\7<\2\2\u03d0\u03d1\7$\2\2\u03d1\u03d6"+
		"\5(\25\2\u03d2\u03d3\7\7\2\2\u03d3\u03d5\5(\25\2\u03d4\u03d2\3\2\2\2\u03d5"+
		"\u03d8\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03db\3\2"+
		"\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03da\7=\2\2\u03da\u03dc\5(\25\2\u03db"+
		"\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03de\3\2\2\2\u03dd\u03cf\3\2"+
		"\2\2\u03dd\u03de\3\2\2\2\u03deC\3\2\2\2\u03df\u03e5\7a\2\2\u03e0\u03e1"+
		"\7a\2\2\u03e1\u03e5\7\35\2\2\u03e2\u03e5\7B\2\2\u03e3\u03e5\7\65\2\2\u03e4"+
		"\u03df\3\2\2\2\u03e4\u03e0\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e3\3\2"+
		"\2\2\u03e5E\3\2\2\2\u03e6\u03f2\5X-\2\u03e7\u03e8\7\5\2\2\u03e8\u03ed"+
		"\5\\/\2\u03e9\u03ea\7\7\2\2\u03ea\u03ec\5\\/\2\u03eb\u03e9\3\2\2\2\u03ec"+
		"\u03ef\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f0\3\2"+
		"\2\2\u03ef\u03ed\3\2\2\2\u03f0\u03f1\7\6\2\2\u03f1\u03f3\3\2\2\2\u03f2"+
		"\u03e7\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3G\3\2\2\2\u03f4\u03f6\t\7\2\2"+
		"\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8"+
		"\7\u0081\2\2\u03f8I\3\2\2\2\u03f9\u0401\7\u0081\2\2\u03fa\u0401\7\u0083"+
		"\2\2\u03fb\u0401\7\u0084\2\2\u03fc\u0401\7O\2\2\u03fd\u0401\7+\2\2\u03fe"+
		"\u0401\7*\2\2\u03ff\u0401\7,\2\2\u0400\u03f9\3\2\2\2\u0400\u03fa\3\2\2"+
		"\2\u0400\u03fb\3\2\2\2\u0400\u03fc\3\2\2\2\u0400\u03fd\3\2\2\2\u0400\u03fe"+
		"\3\2\2\2\u0400\u03ff\3\2\2\2\u0401K\3\2\2\2\u0402\u0407\7\13\2\2\u0403"+
		"\u0407\7\n\2\2\u0404\u0407\7\f\2\2\u0405\u0407\7M\2\2\u0406\u0402\3\2"+
		"\2\2\u0406\u0403\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0405\3\2\2\2\u0407"+
		"M\3\2\2\2\u0408\u040b\7\u0080\2\2\u0409\u040b\7\u0083\2\2\u040a\u0408"+
		"\3\2\2\2\u040a\u0409\3\2\2\2\u040bO\3\2\2\2\u040c\u040d\t\13\2\2\u040d"+
		"Q\3\2\2\2\u040e\u0421\7j\2\2\u040f\u0421\7k\2\2\u0410\u0421\7l\2\2\u0411"+
		"\u0421\7m\2\2\u0412\u0421\7n\2\2\u0413\u0421\7o\2\2\u0414\u0415\7p\2\2"+
		"\u0415\u0416\7q\2\2\u0416\u0421\7j\2\2\u0417\u0421\7r\2\2\u0418\u0421"+
		"\7s\2\2\u0419\u0421\7t\2\2\u041a\u0421\7u\2\2\u041b\u0421\7v\2\2\u041c"+
		"\u0421\7w\2\2\u041d\u0421\7x\2\2\u041e\u0421\7y\2\2\u041f\u0421\7z\2\2"+
		"\u0420\u040e\3\2\2\2\u0420\u040f\3\2\2\2\u0420\u0410\3\2\2\2\u0420\u0411"+
		"\3\2\2\2\u0420\u0412\3\2\2\2\u0420\u0413\3\2\2\2\u0420\u0414\3\2\2\2\u0420"+
		"\u0417\3\2\2\2\u0420\u0418\3\2\2\2\u0420\u0419\3\2\2\2\u0420\u041a\3\2"+
		"\2\2\u0420\u041b\3\2\2\2\u0420\u041c\3\2\2\2\u0420\u041d\3\2\2\2\u0420"+
		"\u041e\3\2\2\2\u0420\u041f\3\2\2\2\u0421S\3\2\2\2\u0422\u0423\t\f\2\2"+
		"\u0423U\3\2\2\2\u0424\u0425\5b\62\2\u0425W\3\2\2\2\u0426\u0427\5b\62\2"+
		"\u0427Y\3\2\2\2\u0428\u0429\5b\62\2\u0429[\3\2\2\2\u042a\u042b\5b\62\2"+
		"\u042b]\3\2\2\2\u042c\u042d\5b\62\2\u042d_\3\2\2\2\u042e\u042f\5b\62\2"+
		"\u042fa\3\2\2\2\u0430\u0438\7\u0080\2\2\u0431\u0438\5P)\2\u0432\u0438"+
		"\7\u0083\2\2\u0433\u0434\7\5\2\2\u0434\u0435\5b\62\2\u0435\u0436\7\6\2"+
		"\2\u0436\u0438\3\2\2\2\u0437\u0430\3\2\2\2\u0437\u0431\3\2\2\2\u0437\u0432"+
		"\3\2\2\2\u0437\u0433\3\2\2\2\u0438c\3\2\2\2\u009dhj~\u0085\u008d\u0090"+
		"\u0098\u009b\u00a0\u00a4\u00a9\u00b2\u00b5\u00bb\u00bd\u00c4\u00cd\u00d4"+
		"\u00db\u00de\u00e5\u00e8\u00ef\u00f8\u00fb\u0101\u0103\u0109\u010e\u0117"+
		"\u011a\u0122\u012c\u012f\u0135\u0137\u013a\u0141\u014a\u014f\u0158\u0163"+
		"\u016a\u016e\u0176\u0179\u0183\u0186\u018c\u018e\u0196\u0199\u01a1\u01ab"+
		"\u01ae\u01b4\u01b6\u01ba\u01c1\u01ca\u01ce\u01d0\u01d4\u01dd\u01e2\u01e4"+
		"\u01e7\u01f6\u01fb\u01fe\u020d\u0212\u021b\u021e\u0224\u0226\u022a\u022f"+
		"\u0236\u0242\u0244\u0249\u024c\u024f\u0254\u025b\u0260\u0272\u0275\u027d"+
		"\u0286\u028a\u028e\u02aa\u02b5\u02bc\u02c1\u02cd\u02d1\u02db\u02de\u02e4"+
		"\u02e7\u02e9\u02eb\u02f6\u02fb\u02ff\u0304\u030c\u0319\u031f\u032f\u0335"+
		"\u033b\u0344\u0349\u0357\u035a\u035c\u0361\u0365\u0368\u0370\u0374\u0378"+
		"\u037b\u0381\u0384\u0386\u038f\u0394\u0398\u039c\u039f\u03aa\u03af\u03b3"+
		"\u03ba\u03c3\u03c7\u03c9\u03cd\u03d6\u03db\u03dd\u03e4\u03ed\u03f2\u03f5"+
		"\u0400\u0406\u040a\u0420\u0437";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}