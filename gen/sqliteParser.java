// Generated from C:/Users/emmel/Desktop/SCC 2016-2017/2018-2019/SCC 300 - Third Year Project/DatabaseTool/src\sqlite.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt = 2, RULE_compound_select_stmt = 3, 
		RULE_drop_table_stmt = 4, RULE_factored_select_stmt = 5, RULE_simple_select_stmt = 6, 
		RULE_select_stmt = 7, RULE_select_or_values = 8, RULE_type_name = 9, RULE_expr = 10, 
		RULE_ordering_term = 11, RULE_common_table_expression = 12, RULE_result_column = 13, 
		RULE_table_or_subquery = 14, RULE_join_clause = 15, RULE_join_operator = 16, 
		RULE_join_constraint = 17, RULE_select_core = 18, RULE_compound_operator = 19, 
		RULE_signed_number = 20, RULE_literal_value = 21, RULE_unary_operator = 22, 
		RULE_column_alias = 23, RULE_dot_symbol = 24, RULE_comma_symbol = 25, 
		RULE_semicolon_symbol = 26, RULE_open_paren = 27, RULE_close_paren = 28, 
		RULE_assign_symbol = 29, RULE_keyword = 30, RULE_name = 31, RULE_name_with_brackets = 32, 
		RULE_database_name = 33, RULE_table_name = 34, RULE_column_name = 35, 
		RULE_table_alias = 36, RULE_any_name = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt", "compound_select_stmt", "drop_table_stmt", 
			"factored_select_stmt", "simple_select_stmt", "select_stmt", "select_or_values", 
			"type_name", "expr", "ordering_term", "common_table_expression", "result_column", 
			"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
			"select_core", "compound_operator", "signed_number", "literal_value", 
			"unary_operator", "column_alias", "dot_symbol", "comma_symbol", "semicolon_symbol", 
			"open_paren", "close_paren", "assign_symbol", "keyword", "name", "name_with_brackets", 
			"database_name", "table_name", "column_name", "table_alias", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "UNDERSCORE", 
			"K_ADD", "K_ALL", "K_ALTER", "K_AND", "K_AS", "K_ASC", "K_AUTOINCREMENT", 
			"K_BETWEEN", "K_BY", "K_CASE", "K_CAST", "K_COLUMN", "K_CREATE", "K_CROSS", 
			"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
			"K_DEFAULT", "K_DELETE", "K_DESC", "K_DISTINCT", "K_DROP", "K_ELSE", 
			"K_END", "K_EXCEPT", "K_EXISTS", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", 
			"K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IN", "K_INNER", "K_INSERT", 
			"K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", 
			"K_LIKE", "K_LIMIT", "K_NATURAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", 
			"K_OF", "K_OFFSET", "K_ON", "K_OR", "K_ORDER", "K_OUTER", "K_PRIMARY", 
			"K_REFERENCES", "K_RENAME", "K_REPLACE", "K_RIGHT", "K_ROW", "K_SELECT", 
			"K_SET", "K_TABLE", "K_THEN", "K_TO", "K_UNION", "K_UNIQUE", "K_UPDATE", 
			"K_USING", "K_VALUES", "K_VIEW", "K_WHEN", "K_WHERE", "K_WITH", "INT", 
			"INTEGER", "TINYINT", "SMALLINT", "MEDIUMINT", "BIGINT", "UNSIGNED", 
			"BIG", "TEXT", "BLOB", "REAL", "DOUBLE", "FLOAT", "NUMERIC", "BOOLEAN", 
			"DATE", "DATETIME", "CHARACTER", "VARCHAR", "NCHAR", "NVARCHAR", "DECIMAL", 
			"IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_DROP || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (K_SELECT - 90)) | (1L << (K_WITH - 90)) | (1L << (UNEXPECTED_CHAR - 90)))) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_DROP:
				case K_SELECT:
				case K_WITH:
					{
					setState(76);
					sql_stmt();
					setState(77);
					semicolon_symbol();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(79);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
			setState(87);
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
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				compound_select_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				drop_table_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				factored_select_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				simple_select_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				select_stmt();
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
		enterRule(_localctx, 6, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(97);
				match(K_WITH);
				setState(98);
				common_table_expression();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99);
					comma_symbol();
					setState(100);
					common_table_expression();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(109);
			select_core();
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(110);
					match(K_UNION);
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(111);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(114);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(115);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118);
				select_core();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (K_EXCEPT - 51)) | (1L << (K_INTERSECT - 51)) | (1L << (K_UNION - 51)))) != 0) );
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(123);
				match(K_ORDER);
				setState(124);
				match(K_BY);
				setState(125);
				ordering_term();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(126);
					comma_symbol();
					setState(127);
					ordering_term();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(136);
				match(K_LIMIT);
				setState(137);
				expr(0);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(140);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_OFFSET:
						{
						setState(138);
						match(K_OFFSET);
						}
						break;
					case COMMA:
						{
						setState(139);
						comma_symbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(142);
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
		enterRule(_localctx, 8, RULE_drop_table_stmt);
		try {
			_localctx = new DropTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(K_DROP);
			setState(148);
			match(K_TABLE);
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(149);
				match(K_IF);
				setState(150);
				match(K_EXISTS);
				}
				break;
			}
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(153);
				database_name();
				setState(154);
				dot_symbol();
				}
				break;
			}
			setState(158);
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
		enterRule(_localctx, 10, RULE_factored_select_stmt);
		int _la;
		try {
			_localctx = new FactoredSelectStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(160);
				match(K_WITH);
				setState(161);
				common_table_expression();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(162);
					comma_symbol();
					setState(163);
					common_table_expression();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(172);
			select_core();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (K_EXCEPT - 51)) | (1L << (K_INTERSECT - 51)) | (1L << (K_UNION - 51)))) != 0)) {
				{
				{
				setState(173);
				compound_operator();
				setState(174);
				select_core();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(181);
				match(K_ORDER);
				setState(182);
				match(K_BY);
				setState(183);
				ordering_term();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(184);
					comma_symbol();
					setState(185);
					ordering_term();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(194);
				match(K_LIMIT);
				setState(195);
				expr(0);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(198);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_OFFSET:
						{
						setState(196);
						match(K_OFFSET);
						}
						break;
					case COMMA:
						{
						setState(197);
						comma_symbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(200);
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
		enterRule(_localctx, 12, RULE_simple_select_stmt);
		int _la;
		try {
			_localctx = new SimpleSelectStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(205);
				match(K_WITH);
				setState(206);
				common_table_expression();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(207);
					comma_symbol();
					setState(208);
					common_table_expression();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(217);
			select_core();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(218);
				match(K_ORDER);
				setState(219);
				match(K_BY);
				setState(220);
				ordering_term();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(221);
					comma_symbol();
					setState(222);
					ordering_term();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(231);
				match(K_LIMIT);
				setState(232);
				expr(0);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(235);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_OFFSET:
						{
						setState(233);
						match(K_OFFSET);
						}
						break;
					case COMMA:
						{
						setState(234);
						comma_symbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(237);
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
		enterRule(_localctx, 14, RULE_select_stmt);
		int _la;
		try {
			_localctx = new SelectStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(242);
				match(K_WITH);
				setState(243);
				common_table_expression();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(244);
					comma_symbol();
					setState(245);
					common_table_expression();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(254);
			select_or_values();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (K_EXCEPT - 51)) | (1L << (K_INTERSECT - 51)) | (1L << (K_UNION - 51)))) != 0)) {
				{
				{
				setState(255);
				compound_operator();
				setState(256);
				select_or_values();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(263);
				match(K_ORDER);
				setState(264);
				match(K_BY);
				setState(265);
				ordering_term();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(266);
					comma_symbol();
					setState(267);
					ordering_term();
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(276);
				match(K_LIMIT);
				setState(277);
				expr(0);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(280);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_OFFSET:
						{
						setState(278);
						match(K_OFFSET);
						}
						break;
					case COMMA:
						{
						setState(279);
						comma_symbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(282);
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
		enterRule(_localctx, 16, RULE_select_or_values);
		int _la;
		try {
			_localctx = new SelectOrValuesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(K_SELECT);
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(288);
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
			setState(291);
			result_column();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(292);
				comma_symbol();
				setState(293);
				result_column();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(300);
				match(K_FROM);
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(301);
					table_or_subquery();
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(302);
						comma_symbol();
						setState(303);
						table_or_subquery();
						}
						}
						setState(309);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(310);
					join_clause();
					}
					break;
				}
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(315);
				match(K_WHERE);
				setState(316);
				expr(0);
				}
			}

			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_GROUP) {
				{
				setState(319);
				match(K_GROUP);
				setState(320);
				match(K_BY);
				setState(321);
				expr(0);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(322);
					comma_symbol();
					setState(323);
					expr(0);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_HAVING) {
					{
					setState(330);
					match(K_HAVING);
					setState(331);
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
		enterRule(_localctx, 18, RULE_type_name);
		int _la;
		try {
			setState(354);
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
				setState(336);
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
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(337);
					name_with_brackets();
					}
					}
					setState(340); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (CHARACTER - 121)) | (1L << (VARCHAR - 121)) | (1L << (NCHAR - 121)) | (1L << (NVARCHAR - 121)) | (1L << (DECIMAL - 121)))) != 0) );
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(342);
					open_paren();
					setState(343);
					signed_number();
					setState(344);
					close_paren();
					}
					break;
				case 2:
					{
					setState(346);
					open_paren();
					setState(347);
					signed_number();
					setState(348);
					comma_symbol();
					setState(349);
					signed_number();
					setState(350);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(357);
				literal_value();
				}
				break;
			case 2:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						setState(358);
						database_name();
						setState(359);
						dot_symbol();
						}
						break;
					}
					setState(363);
					table_name();
					setState(364);
					dot_symbol();
					}
					break;
				}
				setState(368);
				column_name();
				}
				break;
			case 3:
				{
				_localctx = new None1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(369);
				unary_operator();
				setState(370);
				expr(18);
				}
				break;
			case 4:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(372);
				open_paren();
				setState(373);
				expr(0);
				setState(374);
				close_paren();
				}
				break;
			case 5:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(376);
				match(K_CAST);
				setState(377);
				open_paren();
				setState(378);
				expr(0);
				setState(379);
				match(K_AS);
				setState(380);
				type_name();
				setState(381);
				close_paren();
				}
				break;
			case 6:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(383);
						match(K_NOT);
						}
					}

					setState(386);
					match(K_EXISTS);
					}
				}

				setState(389);
				open_paren();
				setState(390);
				select_stmt();
				setState(391);
				close_paren();
				}
				break;
			case 7:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(393);
				match(K_CASE);
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(394);
					expr(0);
					}
					break;
				}
				setState(402); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(397);
					match(K_WHEN);
					setState(398);
					expr(0);
					setState(399);
					match(K_THEN);
					setState(400);
					expr(0);
					}
					}
					setState(404); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(406);
					match(K_ELSE);
					setState(407);
					expr(0);
					}
				}

				setState(410);
				match(K_END);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(505);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(414);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(415);
						match(PIPE2);
						setState(416);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(417);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(418);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(419);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(420);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(421);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(422);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(423);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(424);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(425);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(426);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(427);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(428);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(429);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(440);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
						case 1:
							{
							setState(430);
							assign_symbol();
							}
							break;
						case 2:
							{
							setState(431);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(432);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(433);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(434);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(435);
							match(K_IS);
							setState(436);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(437);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(438);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(439);
							match(K_GLOB);
							}
							break;
						}
						setState(442);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(443);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(444);
						match(K_AND);
						setState(445);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(446);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(447);
						match(K_OR);
						setState(448);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(449);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(451);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(450);
							match(K_NOT);
							}
						}

						setState(453);
						_la = _input.LA(1);
						if ( !(_la==K_GLOB || _la==K_LIKE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(454);
						expr(8);
						}
						break;
					case 10:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(455);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(456);
						match(K_IS);
						setState(458);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
						case 1:
							{
							setState(457);
							match(K_NOT);
							}
							break;
						}
						setState(460);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(461);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(463);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(462);
							match(K_NOT);
							}
						}

						setState(465);
						match(K_BETWEEN);
						setState(466);
						expr(0);
						setState(467);
						match(K_AND);
						setState(468);
						expr(5);
						}
						break;
					case 12:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(470);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(475);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(471);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(472);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(473);
							match(K_NOT);
							setState(474);
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
						setState(477);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(479);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(478);
							match(K_NOT);
							}
						}

						setState(481);
						match(K_IN);
						setState(503);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
						case 1:
							{
							setState(482);
							open_paren();
							setState(493);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
							case 1:
								{
								setState(483);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(484);
								expr(0);
								setState(490);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(485);
									comma_symbol();
									setState(486);
									expr(0);
									}
									}
									setState(492);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(495);
							close_paren();
							}
							break;
						case 2:
							{
							setState(500);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
							case 1:
								{
								setState(497);
								database_name();
								setState(498);
								dot_symbol();
								}
								break;
							}
							setState(502);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		enterRule(_localctx, 22, RULE_ordering_term);
		int _la;
		try {
			_localctx = new OrderingTermContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			expr(0);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(511);
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
		enterRule(_localctx, 24, RULE_common_table_expression);
		int _la;
		try {
			_localctx = new CommonTableExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			table_name();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(515);
				open_paren();
				setState(516);
				column_name();
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(517);
					comma_symbol();
					setState(518);
					column_name();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
				close_paren();
				}
			}

			setState(529);
			match(K_AS);
			setState(530);
			open_paren();
			setState(531);
			select_stmt();
			setState(532);
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
		enterRule(_localctx, 26, RULE_result_column);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new MyStarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(STAR);
				}
				break;
			case 2:
				_localctx = new MystartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				table_name();
				setState(536);
				dot_symbol();
				setState(537);
				match(STAR);
				}
				break;
			case 3:
				_localctx = new ExpressionAliasContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				expr(0);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(541);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(540);
						match(K_AS);
						}
					}

					setState(543);
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
		enterRule(_localctx, 28, RULE_table_or_subquery);
		int _la;
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				_localctx = new TableORSubqueryAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(548);
					database_name();
					setState(549);
					dot_symbol();
					}
					break;
				}
				setState(553);
				table_name();
				setState(558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(555);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(554);
						match(K_AS);
						}
						break;
					}
					setState(557);
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
				setState(560);
				open_paren();
				setState(571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(561);
					table_or_subquery();
					setState(567);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(562);
						comma_symbol();
						setState(563);
						table_or_subquery();
						}
						}
						setState(569);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(570);
					join_clause();
					}
					break;
				}
				setState(573);
				close_paren();
				setState(578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(575);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(574);
						match(K_AS);
						}
						break;
					}
					setState(577);
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
				setState(580);
				open_paren();
				setState(581);
				select_stmt();
				setState(582);
				close_paren();
				setState(587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(584);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(583);
						match(K_AS);
						}
						break;
					}
					setState(586);
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
		enterRule(_localctx, 30, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			table_or_subquery();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << K_CROSS) | (1L << K_INNER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_JOIN - 68)) | (1L << (K_LEFT - 68)) | (1L << (K_NATURAL - 68)))) != 0)) {
				{
				{
				setState(592);
				join_operator();
				setState(593);
				table_or_subquery();
				setState(594);
				join_constraint();
				}
				}
				setState(600);
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
		enterRule(_localctx, 32, RULE_join_operator);
		int _la;
		try {
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new NoneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
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
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(602);
					match(K_NATURAL);
					}
				}

				setState(611);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(605);
					match(K_LEFT);
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(606);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(609);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(610);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(613);
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
		enterRule(_localctx, 34, RULE_join_constraint);
		int _la;
		try {
			_localctx = new JoinConstraintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(616);
				match(K_ON);
				setState(617);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(618);
				match(K_USING);
				setState(619);
				open_paren();
				setState(620);
				column_name();
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(621);
					comma_symbol();
					setState(622);
					column_name();
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(629);
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
		enterRule(_localctx, 36, RULE_select_core);
		int _la;
		try {
			_localctx = new SelectCoreContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(K_SELECT);
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(634);
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
			setState(637);
			result_column();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(638);
				comma_symbol();
				setState(639);
				result_column();
				}
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(646);
				match(K_FROM);
				setState(657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(647);
					table_or_subquery();
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(648);
						comma_symbol();
						setState(649);
						table_or_subquery();
						}
						}
						setState(655);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(656);
					join_clause();
					}
					break;
				}
				}
			}

			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(661);
				match(K_WHERE);
				setState(662);
				expr(0);
				}
			}

			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_GROUP) {
				{
				setState(665);
				match(K_GROUP);
				setState(666);
				match(K_BY);
				setState(667);
				expr(0);
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(668);
					comma_symbol();
					setState(669);
					expr(0);
					}
					}
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_HAVING) {
					{
					setState(676);
					match(K_HAVING);
					setState(677);
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
		enterRule(_localctx, 38, RULE_compound_operator);
		try {
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				_localctx = new CompoundPperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				match(K_UNION);
				}
				break;
			case 2:
				_localctx = new CompoundOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				match(K_UNION);
				setState(684);
				match(K_ALL);
				}
				break;
			case 3:
				_localctx = new CompoundOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(685);
				match(K_INTERSECT);
				}
				break;
			case 4:
				_localctx = new CompoundOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(686);
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
		enterRule(_localctx, 40, RULE_signed_number);
		int _la;
		try {
			_localctx = new SignedNumberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(689);
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

			setState(692);
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
		enterRule(_localctx, 42, RULE_literal_value);
		try {
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				match(STRING_LITERAL);
				}
				break;
			case BLOB_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
				match(BLOB_LITERAL);
				}
				break;
			case K_NULL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(697);
				match(K_NULL);
				}
				break;
			case K_CURRENT_TIME:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(698);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_DATE:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(699);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(700);
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
		enterRule(_localctx, 44, RULE_unary_operator);
		try {
			setState(707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(MINUS);
				}
				break;
			case PLUS:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				match(PLUS);
				}
				break;
			case TILDE:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(705);
				match(TILDE);
				}
				break;
			case K_NOT:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(706);
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
		enterRule(_localctx, 46, RULE_column_alias);
		try {
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ColumnAliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				_localctx = new ColumnAliasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
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
		enterRule(_localctx, 48, RULE_dot_symbol);
		try {
			_localctx = new GetDotContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
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
		enterRule(_localctx, 50, RULE_comma_symbol);
		try {
			_localctx = new GetCommaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
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
		enterRule(_localctx, 52, RULE_semicolon_symbol);
		try {
			_localctx = new GetSCOLContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
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
		enterRule(_localctx, 54, RULE_open_paren);
		try {
			_localctx = new GetOpenParContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
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
		enterRule(_localctx, 56, RULE_close_paren);
		try {
			_localctx = new GetCloseParContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
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
		enterRule(_localctx, 58, RULE_assign_symbol);
		try {
			_localctx = new GetAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
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
		enterRule(_localctx, 60, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
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
		enterRule(_localctx, 62, RULE_name);
		try {
			_localctx = new TypeNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(727);
				match(INT);
				}
				break;
			case INTEGER:
				{
				setState(728);
				match(INTEGER);
				}
				break;
			case TINYINT:
				{
				setState(729);
				match(TINYINT);
				}
				break;
			case SMALLINT:
				{
				setState(730);
				match(SMALLINT);
				}
				break;
			case MEDIUMINT:
				{
				setState(731);
				match(MEDIUMINT);
				}
				break;
			case BIGINT:
				{
				setState(732);
				match(BIGINT);
				}
				break;
			case UNSIGNED:
				{
				setState(733);
				match(UNSIGNED);
				setState(734);
				match(BIG);
				setState(735);
				match(INT);
				}
				break;
			case TEXT:
				{
				setState(736);
				match(TEXT);
				}
				break;
			case BLOB:
				{
				setState(737);
				match(BLOB);
				}
				break;
			case REAL:
				{
				setState(738);
				match(REAL);
				}
				break;
			case DOUBLE:
				{
				setState(739);
				match(DOUBLE);
				}
				break;
			case FLOAT:
				{
				setState(740);
				match(FLOAT);
				}
				break;
			case NUMERIC:
				{
				setState(741);
				match(NUMERIC);
				}
				break;
			case BOOLEAN:
				{
				setState(742);
				match(BOOLEAN);
				}
				break;
			case DATE:
				{
				setState(743);
				match(DATE);
				}
				break;
			case DATETIME:
				{
				setState(744);
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
		enterRule(_localctx, 64, RULE_name_with_brackets);
		int _la;
		try {
			_localctx = new TypeNameWithBracketsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
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
		enterRule(_localctx, 66, RULE_database_name);
		try {
			_localctx = new GetDatabaseNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
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
		enterRule(_localctx, 68, RULE_table_name);
		try {
			_localctx = new GetTableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
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
		enterRule(_localctx, 70, RULE_column_name);
		try {
			_localctx = new GetColumnNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
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
		enterRule(_localctx, 72, RULE_table_alias);
		try {
			_localctx = new GetTableAliasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
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
		enterRule(_localctx, 74, RULE_any_name);
		try {
			setState(764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
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
				setState(758);
				keyword();
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				_localctx = new ReAnyNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(760);
				match(OPEN_PAR);
				setState(761);
				any_name();
				setState(762);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0088\u0301\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\7\2S\n\2\f"+
		"\2\16\2V\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4b\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\5\5n\n\5\3\5\3\5\3\5\5\5s\n\5\3\5"+
		"\3\5\5\5w\n\5\3\5\6\5z\n\5\r\5\16\5{\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0084"+
		"\n\5\f\5\16\5\u0087\13\5\5\5\u0089\n\5\3\5\3\5\3\5\3\5\5\5\u008f\n\5\3"+
		"\5\5\5\u0092\n\5\5\5\u0094\n\5\3\6\3\6\3\6\3\6\5\6\u009a\n\6\3\6\3\6\3"+
		"\6\5\6\u009f\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u00a8\n\7\f\7\16\7\u00ab"+
		"\13\7\5\7\u00ad\n\7\3\7\3\7\3\7\3\7\7\7\u00b3\n\7\f\7\16\7\u00b6\13\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00be\n\7\f\7\16\7\u00c1\13\7\5\7\u00c3\n"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00c9\n\7\3\7\5\7\u00cc\n\7\5\7\u00ce\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u00d5\n\b\f\b\16\b\u00d8\13\b\5\b\u00da\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00e3\n\b\f\b\16\b\u00e6\13\b\5\b\u00e8\n\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00ee\n\b\3\b\5\b\u00f1\n\b\5\b\u00f3\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u00fa\n\t\f\t\16\t\u00fd\13\t\5\t\u00ff\n\t\3\t\3\t\3\t"+
		"\3\t\7\t\u0105\n\t\f\t\16\t\u0108\13\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0110"+
		"\n\t\f\t\16\t\u0113\13\t\5\t\u0115\n\t\3\t\3\t\3\t\3\t\5\t\u011b\n\t\3"+
		"\t\5\t\u011e\n\t\5\t\u0120\n\t\3\n\3\n\5\n\u0124\n\n\3\n\3\n\3\n\3\n\7"+
		"\n\u012a\n\n\f\n\16\n\u012d\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u0134\n\n\f\n"+
		"\16\n\u0137\13\n\3\n\5\n\u013a\n\n\5\n\u013c\n\n\3\n\3\n\5\n\u0140\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0148\n\n\f\n\16\n\u014b\13\n\3\n\3\n\5\n"+
		"\u014f\n\n\5\n\u0151\n\n\3\13\3\13\6\13\u0155\n\13\r\13\16\13\u0156\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0163\n\13\5\13"+
		"\u0165\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u016c\n\f\3\f\3\f\3\f\5\f\u0171\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0183\n\f\3\f\5\f\u0186\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u018e\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\6\f\u0195\n\f\r\f\16\f\u0196\3\f\3\f\5\f\u019b\n\f\3"+
		"\f\3\f\5\f\u019f\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01bb\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01c6\n\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u01cd\n\f\3\f\3\f\3\f\5\f\u01d2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u01de\n\f\3\f\3\f\5\f\u01e2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u01eb\n\f\f\f\16\f\u01ee\13\f\5\f\u01f0\n\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u01f7\n\f\3\f\5\f\u01fa\n\f\7\f\u01fc\n\f\f\f\16\f\u01ff\13\f\3\r"+
		"\3\r\5\r\u0203\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u020b\n\16\f\16"+
		"\16\16\u020e\13\16\3\16\3\16\5\16\u0212\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0220\n\17\3\17\5\17\u0223\n"+
		"\17\5\17\u0225\n\17\3\20\3\20\3\20\5\20\u022a\n\20\3\20\3\20\5\20\u022e"+
		"\n\20\3\20\5\20\u0231\n\20\3\20\3\20\3\20\3\20\3\20\7\20\u0238\n\20\f"+
		"\20\16\20\u023b\13\20\3\20\5\20\u023e\n\20\3\20\3\20\5\20\u0242\n\20\3"+
		"\20\5\20\u0245\n\20\3\20\3\20\3\20\3\20\5\20\u024b\n\20\3\20\5\20\u024e"+
		"\n\20\5\20\u0250\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u0257\n\21\f\21\16"+
		"\21\u025a\13\21\3\22\3\22\5\22\u025e\n\22\3\22\3\22\5\22\u0262\n\22\3"+
		"\22\3\22\5\22\u0266\n\22\3\22\5\22\u0269\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0273\n\23\f\23\16\23\u0276\13\23\3\23\3\23\5\23"+
		"\u027a\n\23\3\24\3\24\5\24\u027e\n\24\3\24\3\24\3\24\3\24\7\24\u0284\n"+
		"\24\f\24\16\24\u0287\13\24\3\24\3\24\3\24\3\24\3\24\7\24\u028e\n\24\f"+
		"\24\16\24\u0291\13\24\3\24\5\24\u0294\n\24\5\24\u0296\n\24\3\24\3\24\5"+
		"\24\u029a\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u02a2\n\24\f\24\16\24"+
		"\u02a5\13\24\3\24\3\24\5\24\u02a9\n\24\5\24\u02ab\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u02b2\n\25\3\26\5\26\u02b5\n\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u02c0\n\27\3\30\3\30\3\30\3\30\5\30\u02c6"+
		"\n\30\3\31\3\31\5\31\u02ca\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u02ec\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\5\'\u02ff\n\'\3\'\2\3\26(\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\13\4\2\35\35\61\61\4\2\t\t\16"+
		"\17\3\2\n\13\3\2\20\23\3\2\24\27\4\2;;II\4\2!!\60\60\3\2\34i\3\2{\177"+
		"\2\u0383\2T\3\2\2\2\4Y\3\2\2\2\6a\3\2\2\2\bm\3\2\2\2\n\u0095\3\2\2\2\f"+
		"\u00ac\3\2\2\2\16\u00d9\3\2\2\2\20\u00fe\3\2\2\2\22\u0121\3\2\2\2\24\u0164"+
		"\3\2\2\2\26\u019e\3\2\2\2\30\u0200\3\2\2\2\32\u0204\3\2\2\2\34\u0224\3"+
		"\2\2\2\36\u024f\3\2\2\2 \u0251\3\2\2\2\"\u0268\3\2\2\2$\u0279\3\2\2\2"+
		"&\u027b\3\2\2\2(\u02b1\3\2\2\2*\u02b4\3\2\2\2,\u02bf\3\2\2\2.\u02c5\3"+
		"\2\2\2\60\u02c9\3\2\2\2\62\u02cb\3\2\2\2\64\u02cd\3\2\2\2\66\u02cf\3\2"+
		"\2\28\u02d1\3\2\2\2:\u02d3\3\2\2\2<\u02d5\3\2\2\2>\u02d7\3\2\2\2@\u02eb"+
		"\3\2\2\2B\u02ed\3\2\2\2D\u02ef\3\2\2\2F\u02f1\3\2\2\2H\u02f3\3\2\2\2J"+
		"\u02f5\3\2\2\2L\u02fe\3\2\2\2NO\5\6\4\2OP\5\66\34\2PS\3\2\2\2QS\5\4\3"+
		"\2RN\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2"+
		"\2WX\7\2\2\3X\3\3\2\2\2YZ\7\u0088\2\2Z[\b\3\1\2[\5\3\2\2\2\\b\5\b\5\2"+
		"]b\5\n\6\2^b\5\f\7\2_b\5\16\b\2`b\5\20\t\2a\\\3\2\2\2a]\3\2\2\2a^\3\2"+
		"\2\2a_\3\2\2\2a`\3\2\2\2b\7\3\2\2\2cd\7i\2\2dj\5\32\16\2ef\5\64\33\2f"+
		"g\5\32\16\2gi\3\2\2\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2"+
		"\2lj\3\2\2\2mc\3\2\2\2mn\3\2\2\2no\3\2\2\2oy\5&\24\2pr\7a\2\2qs\7\35\2"+
		"\2rq\3\2\2\2rs\3\2\2\2sw\3\2\2\2tw\7B\2\2uw\7\65\2\2vp\3\2\2\2vt\3\2\2"+
		"\2vu\3\2\2\2wx\3\2\2\2xz\5&\24\2yv\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|\u0088\3\2\2\2}~\7T\2\2~\177\7$\2\2\177\u0085\5\30\r\2\u0080\u0081"+
		"\5\64\33\2\u0081\u0082\5\30\r\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2"+
		"\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088}\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u0093\3\2\2\2\u008a\u008b\7J\2\2\u008b\u0091\5\26\f\2\u008c\u008f\7Q"+
		"\2\2\u008d\u008f\5\64\33\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\5\26\f\2\u0091\u008e\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0094\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\t\3\2\2\2\u0095\u0096\7\62\2\2\u0096\u0099\7^\2\2\u0097\u0098\7>\2\2"+
		"\u0098\u009a\7\66\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009e"+
		"\3\2\2\2\u009b\u009c\5D#\2\u009c\u009d\5\62\32\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009b\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\5F"+
		"$\2\u00a1\13\3\2\2\2\u00a2\u00a3\7i\2\2\u00a3\u00a9\5\32\16\2\u00a4\u00a5"+
		"\5\64\33\2\u00a5\u00a6\5\32\16\2\u00a6\u00a8\3\2\2\2\u00a7\u00a4\3\2\2"+
		"\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b4\5&\24\2\u00af\u00b0\5(\25\2\u00b0\u00b1\5&"+
		"\24\2\u00b1\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00c2\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\7T\2\2\u00b8\u00b9\7$\2\2\u00b9\u00bf\5\30\r\2\u00ba"+
		"\u00bb\5\64\33\2\u00bb\u00bc\5\30\r\2\u00bc\u00be\3\2\2\2\u00bd\u00ba"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00b7\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00cd\3\2\2\2\u00c4\u00c5\7J\2\2\u00c5\u00cb\5\26\f\2\u00c6"+
		"\u00c9\7Q\2\2\u00c7\u00c9\5\64\33\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\5\26\f\2\u00cb\u00c8\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\r\3\2\2\2\u00cf\u00d0\7i\2\2\u00d0\u00d6\5\32\16\2\u00d1\u00d2"+
		"\5\64\33\2\u00d2\u00d3\5\32\16\2\u00d3\u00d5\3\2\2\2\u00d4\u00d1\3\2\2"+
		"\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00cf\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00e7\5&\24\2\u00dc\u00dd\7T\2\2\u00dd\u00de\7$\2"+
		"\2\u00de\u00e4\5\30\r\2\u00df\u00e0\5\64\33\2\u00e0\u00e1\5\30\r\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00dc\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00f2\3\2\2\2\u00e9\u00ea\7J"+
		"\2\2\u00ea\u00f0\5\26\f\2\u00eb\u00ee\7Q\2\2\u00ec\u00ee\5\64\33\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\5\26"+
		"\f\2\u00f0\u00ed\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00e9\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\17\3\2\2\2\u00f4\u00f5\7i\2\2"+
		"\u00f5\u00fb\5\32\16\2\u00f6\u00f7\5\64\33\2\u00f7\u00f8\5\32\16\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u00f4\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0106\5\22"+
		"\n\2\u0101\u0102\5(\25\2\u0102\u0103\5\22\n\2\u0103\u0105\3\2\2\2\u0104"+
		"\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0114\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7T\2\2\u010a"+
		"\u010b\7$\2\2\u010b\u0111\5\30\r\2\u010c\u010d\5\64\33\2\u010d\u010e\5"+
		"\30\r\2\u010e\u0110\3\2\2\2\u010f\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0109\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011f\3\2\2\2\u0116"+
		"\u0117\7J\2\2\u0117\u011d\5\26\f\2\u0118\u011b\7Q\2\2\u0119\u011b\5\64"+
		"\33\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011e\5\26\f\2\u011d\u011a\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3"+
		"\2\2\2\u011f\u0116\3\2\2\2\u011f\u0120\3\2\2\2\u0120\21\3\2\2\2\u0121"+
		"\u0123\7\\\2\2\u0122\u0124\t\2\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u012b\5\34\17\2\u0126\u0127\5\64\33\2\u0127"+
		"\u0128\5\34\17\2\u0128\u012a\3\2\2\2\u0129\u0126\3\2\2\2\u012a\u012d\3"+
		"\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u013b\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u0139\79\2\2\u012f\u0135\5\36\20\2\u0130\u0131\5"+
		"\64\33\2\u0131\u0132\5\36\20\2\u0132\u0134\3\2\2\2\u0133\u0130\3\2\2\2"+
		"\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013a"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\5 \21\2\u0139\u012f\3\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u012e\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013e\7h\2\2\u013e\u0140\5\26\f\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0150\3\2\2\2\u0141\u0142\7<"+
		"\2\2\u0142\u0143\7$\2\2\u0143\u0149\5\26\f\2\u0144\u0145\5\64\33\2\u0145"+
		"\u0146\5\26\f\2\u0146\u0148\3\2\2\2\u0147\u0144\3\2\2\2\u0148\u014b\3"+
		"\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014e\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014d\7=\2\2\u014d\u014f\5\26\f\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u0141\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\23\3\2\2\2\u0152\u0165\5@!\2\u0153\u0155\5B\"\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0162\3\2\2\2\u0158\u0159\58\35\2\u0159\u015a\5*\26\2\u015a"+
		"\u015b\5:\36\2\u015b\u0163\3\2\2\2\u015c\u015d\58\35\2\u015d\u015e\5*"+
		"\26\2\u015e\u015f\5\64\33\2\u015f\u0160\5*\26\2\u0160\u0161\5:\36\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0158\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0165\3\2\2\2\u0164\u0152\3\2\2\2\u0164\u0154\3\2\2\2\u0165"+
		"\25\3\2\2\2\u0166\u0167\b\f\1\2\u0167\u019f\5,\27\2\u0168\u0169\5D#\2"+
		"\u0169\u016a\5\62\32\2\u016a\u016c\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\5F$\2\u016e\u016f\5\62\32\2\u016f"+
		"\u0171\3\2\2\2\u0170\u016b\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u019f\5H%\2\u0173\u0174\5.\30\2\u0174\u0175\5\26\f\24\u0175"+
		"\u019f\3\2\2\2\u0176\u0177\58\35\2\u0177\u0178\5\26\f\2\u0178\u0179\5"+
		":\36\2\u0179\u019f\3\2\2\2\u017a\u017b\7&\2\2\u017b\u017c\58\35\2\u017c"+
		"\u017d\5\26\f\2\u017d\u017e\7 \2\2\u017e\u017f\5\24\13\2\u017f\u0180\5"+
		":\36\2\u0180\u019f\3\2\2\2\u0181\u0183\7M\2\2\u0182\u0181\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\7\66\2\2\u0185\u0182\3"+
		"\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\58\35\2\u0188"+
		"\u0189\5\20\t\2\u0189\u018a\5:\36\2\u018a\u019f\3\2\2\2\u018b\u018d\7"+
		"%\2\2\u018c\u018e\5\26\f\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0194\3\2\2\2\u018f\u0190\7g\2\2\u0190\u0191\5\26\f\2\u0191\u0192\7_"+
		"\2\2\u0192\u0193\5\26\f\2\u0193\u0195\3\2\2\2\u0194\u018f\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019a\3\2"+
		"\2\2\u0198\u0199\7\63\2\2\u0199\u019b\5\26\f\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\7\64\2\2\u019d\u019f\3"+
		"\2\2\2\u019e\u0166\3\2\2\2\u019e\u0170\3\2\2\2\u019e\u0173\3\2\2\2\u019e"+
		"\u0176\3\2\2\2\u019e\u017a\3\2\2\2\u019e\u0185\3\2\2\2\u019e\u018b\3\2"+
		"\2\2\u019f\u01fd\3\2\2\2\u01a0\u01a1\f\23\2\2\u01a1\u01a2\7\r\2\2\u01a2"+
		"\u01fc\5\26\f\24\u01a3\u01a4\f\22\2\2\u01a4\u01a5\t\3\2\2\u01a5\u01fc"+
		"\5\26\f\23\u01a6\u01a7\f\21\2\2\u01a7\u01a8\t\4\2\2\u01a8\u01fc\5\26\f"+
		"\22\u01a9\u01aa\f\20\2\2\u01aa\u01ab\t\5\2\2\u01ab\u01fc\5\26\f\21\u01ac"+
		"\u01ad\f\17\2\2\u01ad\u01ae\t\6\2\2\u01ae\u01fc\5\26\f\20\u01af\u01ba"+
		"\f\16\2\2\u01b0\u01bb\5<\37\2\u01b1\u01bb\7\30\2\2\u01b2\u01bb\7\31\2"+
		"\2\u01b3\u01bb\7\32\2\2\u01b4\u01bb\7D\2\2\u01b5\u01b6\7D\2\2\u01b6\u01bb"+
		"\7M\2\2\u01b7\u01bb\7?\2\2\u01b8\u01bb\7I\2\2\u01b9\u01bb\7;\2\2\u01ba"+
		"\u01b0\3\2\2\2\u01ba\u01b1\3\2\2\2\u01ba\u01b2\3\2\2\2\u01ba\u01b3\3\2"+
		"\2\2\u01ba\u01b4\3\2\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01b7\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01fc\5\26"+
		"\f\17\u01bd\u01be\f\r\2\2\u01be\u01bf\7\37\2\2\u01bf\u01fc\5\26\f\16\u01c0"+
		"\u01c1\f\f\2\2\u01c1\u01c2\7S\2\2\u01c2\u01fc\5\26\f\r\u01c3\u01c5\f\t"+
		"\2\2\u01c4\u01c6\7M\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c8\t\7\2\2\u01c8\u01fc\5\26\f\n\u01c9\u01ca\f"+
		"\7\2\2\u01ca\u01cc\7D\2\2\u01cb\u01cd\7M\2\2\u01cc\u01cb\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01fc\5\26\f\b\u01cf\u01d1\f"+
		"\6\2\2\u01d0\u01d2\7M\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d4\7#\2\2\u01d4\u01d5\5\26\f\2\u01d5\u01d6\7\37"+
		"\2\2\u01d6\u01d7\5\26\f\7\u01d7\u01fc\3\2\2\2\u01d8\u01dd\f\b\2\2\u01d9"+
		"\u01de\7E\2\2\u01da\u01de\7N\2\2\u01db\u01dc\7M\2\2\u01dc\u01de\7O\2\2"+
		"\u01dd\u01d9\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01fc"+
		"\3\2\2\2\u01df\u01e1\f\5\2\2\u01e0\u01e2\7M\2\2\u01e1\u01e0\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01f9\7?\2\2\u01e4\u01ef\58\35"+
		"\2\u01e5\u01f0\5\20\t\2\u01e6\u01ec\5\26\f\2\u01e7\u01e8\5\64\33\2\u01e8"+
		"\u01e9\5\26\f\2\u01e9\u01eb\3\2\2\2\u01ea\u01e7\3\2\2\2\u01eb\u01ee\3"+
		"\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\u01e5\3\2\2\2\u01ef\u01e6\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\5:\36\2\u01f2\u01fa\3\2\2\2\u01f3"+
		"\u01f4\5D#\2\u01f4\u01f5\5\62\32\2\u01f5\u01f7\3\2\2\2\u01f6\u01f3\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\5F$\2\u01f9\u01e4"+
		"\3\2\2\2\u01f9\u01f6\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01a0\3\2\2\2\u01fb"+
		"\u01a3\3\2\2\2\u01fb\u01a6\3\2\2\2\u01fb\u01a9\3\2\2\2\u01fb\u01ac\3\2"+
		"\2\2\u01fb\u01af\3\2\2\2\u01fb\u01bd\3\2\2\2\u01fb\u01c0\3\2\2\2\u01fb"+
		"\u01c3\3\2\2\2\u01fb\u01c9\3\2\2\2\u01fb\u01cf\3\2\2\2\u01fb\u01d8\3\2"+
		"\2\2\u01fb\u01df\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\27\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\5\26\f"+
		"\2\u0201\u0203\t\b\2\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\31"+
		"\3\2\2\2\u0204\u0211\5F$\2\u0205\u0206\58\35\2\u0206\u020c\5H%\2\u0207"+
		"\u0208\5\64\33\2\u0208\u0209\5H%\2\u0209\u020b\3\2\2\2\u020a\u0207\3\2"+
		"\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\5:\36\2\u0210\u0212\3\2"+
		"\2\2\u0211\u0205\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0214\7 \2\2\u0214\u0215\58\35\2\u0215\u0216\5\20\t\2\u0216\u0217\5:"+
		"\36\2\u0217\33\3\2\2\2\u0218\u0225\7\t\2\2\u0219\u021a\5F$\2\u021a\u021b"+
		"\5\62\32\2\u021b\u021c\7\t\2\2\u021c\u0225\3\2\2\2\u021d\u0222\5\26\f"+
		"\2\u021e\u0220\7 \2\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221\u0223\5\60\31\2\u0222\u021f\3\2\2\2\u0222\u0223\3\2\2\2"+
		"\u0223\u0225\3\2\2\2\u0224\u0218\3\2\2\2\u0224\u0219\3\2\2\2\u0224\u021d"+
		"\3\2\2\2\u0225\35\3\2\2\2\u0226\u0227\5D#\2\u0227\u0228\5\62\32\2\u0228"+
		"\u022a\3\2\2\2\u0229\u0226\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u0230\5F$\2\u022c\u022e\7 \2\2\u022d\u022c\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\5J&\2\u0230\u022d\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0250\3\2\2\2\u0232\u023d\58\35\2\u0233\u0239\5\36"+
		"\20\2\u0234\u0235\5\64\33\2\u0235\u0236\5\36\20\2\u0236\u0238\3\2\2\2"+
		"\u0237\u0234\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a"+
		"\3\2\2\2\u023a\u023e\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023e\5 \21\2\u023d"+
		"\u0233\3\2\2\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0244\5:"+
		"\36\2\u0240\u0242\7 \2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0245\5J&\2\u0244\u0241\3\2\2\2\u0244\u0245\3\2\2"+
		"\2\u0245\u0250\3\2\2\2\u0246\u0247\58\35\2\u0247\u0248\5\20\t\2\u0248"+
		"\u024d\5:\36\2\u0249\u024b\7 \2\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2"+
		"\2\2\u024b\u024c\3\2\2\2\u024c\u024e\5J&\2\u024d\u024a\3\2\2\2\u024d\u024e"+
		"\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0229\3\2\2\2\u024f\u0232\3\2\2\2\u024f"+
		"\u0246\3\2\2\2\u0250\37\3\2\2\2\u0251\u0258\5\36\20\2\u0252\u0253\5\""+
		"\22\2\u0253\u0254\5\36\20\2\u0254\u0255\5$\23\2\u0255\u0257\3\2\2\2\u0256"+
		"\u0252\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259!\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u0269\5\64\33\2\u025c\u025e"+
		"\7K\2\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0265\3\2\2\2\u025f"+
		"\u0261\7H\2\2\u0260\u0262\7U\2\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2"+
		"\2\u0262\u0266\3\2\2\2\u0263\u0266\7@\2\2\u0264\u0266\7)\2\2\u0265\u025f"+
		"\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u0269\7F\2\2\u0268\u025b\3\2\2\2\u0268\u025d\3\2"+
		"\2\2\u0269#\3\2\2\2\u026a\u026b\7R\2\2\u026b\u027a\5\26\f\2\u026c\u026d"+
		"\7d\2\2\u026d\u026e\58\35\2\u026e\u0274\5H%\2\u026f\u0270\5\64\33\2\u0270"+
		"\u0271\5H%\2\u0271\u0273\3\2\2\2\u0272\u026f\3\2\2\2\u0273\u0276\3\2\2"+
		"\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0274"+
		"\3\2\2\2\u0277\u0278\5:\36\2\u0278\u027a\3\2\2\2\u0279\u026a\3\2\2\2\u0279"+
		"\u026c\3\2\2\2\u0279\u027a\3\2\2\2\u027a%\3\2\2\2\u027b\u027d\7\\\2\2"+
		"\u027c\u027e\t\2\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f"+
		"\3\2\2\2\u027f\u0285\5\34\17\2\u0280\u0281\5\64\33\2\u0281\u0282\5\34"+
		"\17\2\u0282\u0284\3\2\2\2\u0283\u0280\3\2\2\2\u0284\u0287\3\2\2\2\u0285"+
		"\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0295\3\2\2\2\u0287\u0285\3\2"+
		"\2\2\u0288\u0293\79\2\2\u0289\u028f\5\36\20\2\u028a\u028b\5\64\33\2\u028b"+
		"\u028c\5\36\20\2\u028c\u028e\3\2\2\2\u028d\u028a\3\2\2\2\u028e\u0291\3"+
		"\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0294\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0292\u0294\5 \21\2\u0293\u0289\3\2\2\2\u0293\u0292\3\2"+
		"\2\2\u0294\u0296\3\2\2\2\u0295\u0288\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0299\3\2\2\2\u0297\u0298\7h\2\2\u0298\u029a\5\26\f\2\u0299\u0297\3\2"+
		"\2\2\u0299\u029a\3\2\2\2\u029a\u02aa\3\2\2\2\u029b\u029c\7<\2\2\u029c"+
		"\u029d\7$\2\2\u029d\u02a3\5\26\f\2\u029e\u029f\5\64\33\2\u029f\u02a0\5"+
		"\26\f\2\u02a0\u02a2\3\2\2\2\u02a1\u029e\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a8\3\2\2\2\u02a5\u02a3\3\2"+
		"\2\2\u02a6\u02a7\7=\2\2\u02a7\u02a9\5\26\f\2\u02a8\u02a6\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u029b\3\2\2\2\u02aa\u02ab\3\2"+
		"\2\2\u02ab\'\3\2\2\2\u02ac\u02b2\7a\2\2\u02ad\u02ae\7a\2\2\u02ae\u02b2"+
		"\7\35\2\2\u02af\u02b2\7B\2\2\u02b0\u02b2\7\65\2\2\u02b1\u02ac\3\2\2\2"+
		"\u02b1\u02ad\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2)\3"+
		"\2\2\2\u02b3\u02b5\t\4\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b7\7\u0081\2\2\u02b7+\3\2\2\2\u02b8\u02c0\7\u0081"+
		"\2\2\u02b9\u02c0\7\u0083\2\2\u02ba\u02c0\7\u0084\2\2\u02bb\u02c0\7O\2"+
		"\2\u02bc\u02c0\7+\2\2\u02bd\u02c0\7*\2\2\u02be\u02c0\7,\2\2\u02bf\u02b8"+
		"\3\2\2\2\u02bf\u02b9\3\2\2\2\u02bf\u02ba\3\2\2\2\u02bf\u02bb\3\2\2\2\u02bf"+
		"\u02bc\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02be\3\2\2\2\u02c0-\3\2\2\2"+
		"\u02c1\u02c6\7\13\2\2\u02c2\u02c6\7\n\2\2\u02c3\u02c6\7\f\2\2\u02c4\u02c6"+
		"\7M\2\2\u02c5\u02c1\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5"+
		"\u02c4\3\2\2\2\u02c6/\3\2\2\2\u02c7\u02ca\7\u0080\2\2\u02c8\u02ca\7\u0083"+
		"\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02ca\61\3\2\2\2\u02cb\u02cc"+
		"\7\4\2\2\u02cc\63\3\2\2\2\u02cd\u02ce\7\7\2\2\u02ce\65\3\2\2\2\u02cf\u02d0"+
		"\7\3\2\2\u02d0\67\3\2\2\2\u02d1\u02d2\7\5\2\2\u02d29\3\2\2\2\u02d3\u02d4"+
		"\7\6\2\2\u02d4;\3\2\2\2\u02d5\u02d6\7\b\2\2\u02d6=\3\2\2\2\u02d7\u02d8"+
		"\t\t\2\2\u02d8?\3\2\2\2\u02d9\u02ec\7j\2\2\u02da\u02ec\7k\2\2\u02db\u02ec"+
		"\7l\2\2\u02dc\u02ec\7m\2\2\u02dd\u02ec\7n\2\2\u02de\u02ec\7o\2\2\u02df"+
		"\u02e0\7p\2\2\u02e0\u02e1\7q\2\2\u02e1\u02ec\7j\2\2\u02e2\u02ec\7r\2\2"+
		"\u02e3\u02ec\7s\2\2\u02e4\u02ec\7t\2\2\u02e5\u02ec\7u\2\2\u02e6\u02ec"+
		"\7v\2\2\u02e7\u02ec\7w\2\2\u02e8\u02ec\7x\2\2\u02e9\u02ec\7y\2\2\u02ea"+
		"\u02ec\7z\2\2\u02eb\u02d9\3\2\2\2\u02eb\u02da\3\2\2\2\u02eb\u02db\3\2"+
		"\2\2\u02eb\u02dc\3\2\2\2\u02eb\u02dd\3\2\2\2\u02eb\u02de\3\2\2\2\u02eb"+
		"\u02df\3\2\2\2\u02eb\u02e2\3\2\2\2\u02eb\u02e3\3\2\2\2\u02eb\u02e4\3\2"+
		"\2\2\u02eb\u02e5\3\2\2\2\u02eb\u02e6\3\2\2\2\u02eb\u02e7\3\2\2\2\u02eb"+
		"\u02e8\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ecA\3\2\2\2"+
		"\u02ed\u02ee\t\n\2\2\u02eeC\3\2\2\2\u02ef\u02f0\5L\'\2\u02f0E\3\2\2\2"+
		"\u02f1\u02f2\5L\'\2\u02f2G\3\2\2\2\u02f3\u02f4\5L\'\2\u02f4I\3\2\2\2\u02f5"+
		"\u02f6\5L\'\2\u02f6K\3\2\2\2\u02f7\u02ff\7\u0080\2\2\u02f8\u02ff\5> \2"+
		"\u02f9\u02ff\7\u0083\2\2\u02fa\u02fb\7\5\2\2\u02fb\u02fc\5L\'\2\u02fc"+
		"\u02fd\7\6\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02f7\3\2\2\2\u02fe\u02f8\3\2"+
		"\2\2\u02fe\u02f9\3\2\2\2\u02fe\u02fa\3\2\2\2\u02ffM\3\2\2\2oRTajmrv{\u0085"+
		"\u0088\u008e\u0091\u0093\u0099\u009e\u00a9\u00ac\u00b4\u00bf\u00c2\u00c8"+
		"\u00cb\u00cd\u00d6\u00d9\u00e4\u00e7\u00ed\u00f0\u00f2\u00fb\u00fe\u0106"+
		"\u0111\u0114\u011a\u011d\u011f\u0123\u012b\u0135\u0139\u013b\u013f\u0149"+
		"\u014e\u0150\u0156\u0162\u0164\u016b\u0170\u0182\u0185\u018d\u0196\u019a"+
		"\u019e\u01ba\u01c5\u01cc\u01d1\u01dd\u01e1\u01ec\u01ef\u01f6\u01f9\u01fb"+
		"\u01fd\u0202\u020c\u0211\u021f\u0222\u0224\u0229\u022d\u0230\u0239\u023d"+
		"\u0241\u0244\u024a\u024d\u024f\u0258\u025d\u0261\u0265\u0268\u0274\u0279"+
		"\u027d\u0285\u028f\u0293\u0295\u0299\u02a3\u02a8\u02aa\u02b1\u02b4\u02bf"+
		"\u02c5\u02c9\u02eb\u02fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}