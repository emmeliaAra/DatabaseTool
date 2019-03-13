// Generated from C:/Users/emmel/Desktop/SCC 2016-2017/2018-2019/DatabaseTool/DatabaseTool/src\sqlite.g4 by ANTLR 4.7.2
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
		MINUS=9, LT=10, LT_EQ=11, GT=12, GT_EQ=13, EQ=14, NOT_EQ1=15, NOT_EQ2=16, 
		K_AND=17, K_DATABASE=18, K_DROP=19, K_FROM=20, K_OR=21, K_SELECT=22, K_TABLE=23, 
		K_WHERE=24, IDENTIFIER=25, NUMERIC_LITERAL=26, BIND_PARAMETER=27, STRING_LITERAL=28, 
		BLOB_LITERAL=29, SINGLE_LINE_COMMENT=30, MULTILINE_COMMENT=31, SPACES=32, 
		UNEXPECTED_CHAR=33;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt = 2, RULE_drop_table_stmt = 3, 
		RULE_expr = 4, RULE_result_column = 5, RULE_table_or_subquery = 6, RULE_select_core = 7, 
		RULE_literal_value = 8, RULE_unary_operator = 9, RULE_dot_symbol = 10, 
		RULE_comma_symbol = 11, RULE_semicolon_symbol = 12, RULE_open_paren = 13, 
		RULE_close_paren = 14, RULE_assign_symbol = 15, RULE_keyword = 16, RULE_database_name = 17, 
		RULE_table_name = 18, RULE_column_name = 19, RULE_any_name = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt", "drop_table_stmt", "expr", "result_column", 
			"table_or_subquery", "select_core", "literal_value", "unary_operator", 
			"dot_symbol", "comma_symbol", "semicolon_symbol", "open_paren", "close_paren", 
			"assign_symbol", "keyword", "database_name", "table_name", "column_name", 
			"any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", 
			"K_AND", "K_DATABASE", "K_DROP", "K_FROM", "K_OR", "K_SELECT", "K_TABLE", 
			"K_WHERE", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
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
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_DROP) | (1L << K_SELECT) | (1L << UNEXPECTED_CHAR))) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_DROP:
				case K_SELECT:
					{
					setState(42);
					sql_stmt();
					setState(43);
					semicolon_symbol();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(45);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
			setState(53);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			        notifyErrorListeners("Unexpected characher found " + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			    
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
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DROP:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				drop_table_stmt();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				select_core();
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
		enterRule(_localctx, 6, RULE_drop_table_stmt);
		try {
			_localctx = new DropTableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(K_DROP);
			setState(61);
			match(K_TABLE);
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(62);
				database_name();
				setState(63);
				dot_symbol();
				}
				break;
			}
			setState(67);
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
		public TerminalNode STAR() { return getToken(sqliteParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(sqliteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(sqliteParser.MINUS, 0); }
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
		public TerminalNode K_AND() { return getToken(sqliteParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(sqliteParser.K_OR, 0); }
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70);
				literal_value();
				}
				break;
			case 2:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(71);
						database_name();
						setState(72);
						dot_symbol();
						}
						break;
					}
					setState(76);
					table_name();
					setState(77);
					dot_symbol();
					}
					break;
				}
				setState(81);
				column_name();
				}
				break;
			case 3:
				{
				_localctx = new None1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				unary_operator();
				setState(83);
				expr(8);
				}
				break;
			case 4:
				{
				_localctx = new MyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				open_paren();
				setState(86);
				expr(0);
				setState(87);
				close_paren();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(92);
						match(STAR);
						setState(93);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(95);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(98);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(105);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ASSIGN:
							{
							setState(101);
							assign_symbol();
							}
							break;
						case EQ:
							{
							setState(102);
							match(EQ);
							}
							break;
						case NOT_EQ1:
							{
							setState(103);
							match(NOT_EQ1);
							}
							break;
						case NOT_EQ2:
							{
							setState(104);
							match(NOT_EQ2);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(107);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(109);
						match(K_AND);
						setState(110);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new MyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(112);
						match(K_OR);
						setState(113);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 10, RULE_result_column);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new MyStarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(STAR);
				}
				break;
			case 2:
				_localctx = new MystartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				table_name();
				setState(121);
				dot_symbol();
				setState(122);
				match(STAR);
				}
				break;
			case 3:
				_localctx = new ExpressionAliasContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				expr(0);
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
		public List<Comma_symbolContext> comma_symbol() {
			return getRuleContexts(Comma_symbolContext.class);
		}
		public Comma_symbolContext comma_symbol(int i) {
			return getRuleContext(Comma_symbolContext.class,i);
		}
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
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
		enterRule(_localctx, 12, RULE_table_or_subquery);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new TableORSubqueryAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(127);
					database_name();
					setState(128);
					dot_symbol();
					}
					break;
				}
				setState(132);
				table_name();
				}
				break;
			case 2:
				_localctx = new TableORSubqueryAContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				open_paren();
				{
				setState(134);
				table_or_subquery();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(135);
					comma_symbol();
					setState(136);
					table_or_subquery();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(143);
				close_paren();
				}
				break;
			case 3:
				_localctx = new TableORSubqueryAContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				open_paren();
				setState(146);
				select_core();
				setState(147);
				close_paren();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
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
		enterRule(_localctx, 14, RULE_select_core);
		int _la;
		try {
			_localctx = new SelectCoreContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(K_SELECT);
			setState(152);
			result_column();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				comma_symbol();
				setState(154);
				result_column();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(161);
				match(K_FROM);
				{
				setState(162);
				table_or_subquery();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(163);
					comma_symbol();
					setState(164);
					table_or_subquery();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(173);
				match(K_WHERE);
				setState(174);
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
		enterRule(_localctx, 16, RULE_literal_value);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new LiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
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
		enterRule(_localctx, 18, RULE_unary_operator);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(MINUS);
				}
				break;
			case PLUS:
				_localctx = new UnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(PLUS);
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
		enterRule(_localctx, 20, RULE_dot_symbol);
		try {
			_localctx = new GetDotContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		enterRule(_localctx, 22, RULE_comma_symbol);
		try {
			_localctx = new GetCommaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		enterRule(_localctx, 24, RULE_semicolon_symbol);
		try {
			_localctx = new GetSCOLContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		enterRule(_localctx, 26, RULE_open_paren);
		try {
			_localctx = new GetOpenParContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
		enterRule(_localctx, 28, RULE_close_paren);
		try {
			_localctx = new GetCloseParContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		enterRule(_localctx, 30, RULE_assign_symbol);
		try {
			_localctx = new GetAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
		public TerminalNode K_AND() { return getToken(sqliteParser.K_AND, 0); }
		public TerminalNode K_DATABASE() { return getToken(sqliteParser.K_DATABASE, 0); }
		public TerminalNode K_DROP() { return getToken(sqliteParser.K_DROP, 0); }
		public TerminalNode K_FROM() { return getToken(sqliteParser.K_FROM, 0); }
		public TerminalNode K_OR() { return getToken(sqliteParser.K_OR, 0); }
		public TerminalNode K_SELECT() { return getToken(sqliteParser.K_SELECT, 0); }
		public TerminalNode K_TABLE() { return getToken(sqliteParser.K_TABLE, 0); }
		public TerminalNode K_WHERE() { return getToken(sqliteParser.K_WHERE, 0); }
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
		enterRule(_localctx, 32, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_AND) | (1L << K_DATABASE) | (1L << K_DROP) | (1L << K_FROM) | (1L << K_OR) | (1L << K_SELECT) | (1L << K_TABLE) | (1L << K_WHERE))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_database_name);
		try {
			_localctx = new GetDatabaseNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		enterRule(_localctx, 36, RULE_table_name);
		try {
			_localctx = new GetTableNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		enterRule(_localctx, 38, RULE_column_name);
		try {
			_localctx = new GetColumnNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		enterRule(_localctx, 40, RULE_any_name);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(IDENTIFIER);
				}
				break;
			case K_AND:
			case K_DATABASE:
			case K_DROP:
			case K_FROM:
			case K_OR:
			case K_SELECT:
			case K_TABLE:
			case K_WHERE:
				_localctx = new KeyWordLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				keyword();
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				_localctx = new ReAnyNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(OPEN_PAR);
				setState(209);
				any_name();
				setState(210);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\5D\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\6\3\6\3\6\5\6R\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"u\n\6\f\6\16\6x\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\b"+
		"\5\b\u0085\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0098\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u009f"+
		"\n\t\f\t\16\t\u00a2\13\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a9\n\t\f\t\16\t\u00ac"+
		"\13\t\5\t\u00ae\n\t\3\t\3\t\5\t\u00b2\n\t\3\n\3\n\5\n\u00b6\n\n\3\13\3"+
		"\13\5\13\u00ba\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00d7\n\26\3\26\2\3\n\27\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*\2\5\3\2\n\13\3\2\f\17\3\2\23\32\2\u00e4\2\62\3\2\2\2"+
		"\4\67\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\n[\3\2\2\2\f\177\3\2\2\2\16\u0097"+
		"\3\2\2\2\20\u0099\3\2\2\2\22\u00b5\3\2\2\2\24\u00b9\3\2\2\2\26\u00bb\3"+
		"\2\2\2\30\u00bd\3\2\2\2\32\u00bf\3\2\2\2\34\u00c1\3\2\2\2\36\u00c3\3\2"+
		"\2\2 \u00c5\3\2\2\2\"\u00c7\3\2\2\2$\u00c9\3\2\2\2&\u00cb\3\2\2\2(\u00cd"+
		"\3\2\2\2*\u00d6\3\2\2\2,-\5\6\4\2-.\5\32\16\2.\61\3\2\2\2/\61\5\4\3\2"+
		"\60,\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63"+
		"\65\3\2\2\2\64\62\3\2\2\2\65\66\7\2\2\3\66\3\3\2\2\2\678\7#\2\289\b\3"+
		"\1\29\5\3\2\2\2:=\5\b\5\2;=\5\20\t\2<:\3\2\2\2<;\3\2\2\2=\7\3\2\2\2>?"+
		"\7\25\2\2?C\7\31\2\2@A\5$\23\2AB\5\26\f\2BD\3\2\2\2C@\3\2\2\2CD\3\2\2"+
		"\2DE\3\2\2\2EF\5&\24\2F\t\3\2\2\2GH\b\6\1\2H\\\5\22\n\2IJ\5$\23\2JK\5"+
		"\26\f\2KM\3\2\2\2LI\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\5&\24\2OP\5\26\f\2P"+
		"R\3\2\2\2QL\3\2\2\2QR\3\2\2\2RS\3\2\2\2S\\\5(\25\2TU\5\24\13\2UV\5\n\6"+
		"\nV\\\3\2\2\2WX\5\34\17\2XY\5\n\6\2YZ\5\36\20\2Z\\\3\2\2\2[G\3\2\2\2["+
		"Q\3\2\2\2[T\3\2\2\2[W\3\2\2\2\\v\3\2\2\2]^\f\t\2\2^_\7\t\2\2_u\5\n\6\n"+
		"`a\f\b\2\2ab\t\2\2\2bu\5\n\6\tcd\f\7\2\2de\t\3\2\2eu\5\n\6\bfk\f\6\2\2"+
		"gl\5 \21\2hl\7\20\2\2il\7\21\2\2jl\7\22\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2"+
		"\2\2kj\3\2\2\2lm\3\2\2\2mu\5\n\6\7no\f\5\2\2op\7\23\2\2pu\5\n\6\6qr\f"+
		"\4\2\2rs\7\27\2\2su\5\n\6\5t]\3\2\2\2t`\3\2\2\2tc\3\2\2\2tf\3\2\2\2tn"+
		"\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\13\3\2\2\2xv\3\2\2\2"+
		"y\u0080\7\t\2\2z{\5&\24\2{|\5\26\f\2|}\7\t\2\2}\u0080\3\2\2\2~\u0080\5"+
		"\n\6\2\177y\3\2\2\2\177z\3\2\2\2\177~\3\2\2\2\u0080\r\3\2\2\2\u0081\u0082"+
		"\5$\23\2\u0082\u0083\5\26\f\2\u0083\u0085\3\2\2\2\u0084\u0081\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0098\5&\24\2\u0087\u0088"+
		"\5\34\17\2\u0088\u008e\5\16\b\2\u0089\u008a\5\30\r\2\u008a\u008b\5\16"+
		"\b\2\u008b\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0092\5\36\20\2\u0092\u0098\3\2\2\2\u0093\u0094\5\34\17\2\u0094"+
		"\u0095\5\20\t\2\u0095\u0096\5\36\20\2\u0096\u0098\3\2\2\2\u0097\u0084"+
		"\3\2\2\2\u0097\u0087\3\2\2\2\u0097\u0093\3\2\2\2\u0098\17\3\2\2\2\u0099"+
		"\u009a\7\30\2\2\u009a\u00a0\5\f\7\2\u009b\u009c\5\30\r\2\u009c\u009d\5"+
		"\f\7\2\u009d\u009f\3\2\2\2\u009e\u009b\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ad\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7\26\2\2\u00a4\u00aa\5\16\b\2\u00a5\u00a6\5\30\r\2\u00a6"+
		"\u00a7\5\16\b\2\u00a7\u00a9\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9\u00ac\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00b0\7\32\2\2\u00b0\u00b2\5\n\6\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\21\3\2\2\2\u00b3\u00b6\7\34\2\2\u00b4\u00b6\7\36"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\23\3\2\2\2\u00b7\u00ba"+
		"\7\13\2\2\u00b8\u00ba\7\n\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\25\3\2\2\2\u00bb\u00bc\7\4\2\2\u00bc\27\3\2\2\2\u00bd\u00be\7\7"+
		"\2\2\u00be\31\3\2\2\2\u00bf\u00c0\7\3\2\2\u00c0\33\3\2\2\2\u00c1\u00c2"+
		"\7\5\2\2\u00c2\35\3\2\2\2\u00c3\u00c4\7\6\2\2\u00c4\37\3\2\2\2\u00c5\u00c6"+
		"\7\b\2\2\u00c6!\3\2\2\2\u00c7\u00c8\t\4\2\2\u00c8#\3\2\2\2\u00c9\u00ca"+
		"\5*\26\2\u00ca%\3\2\2\2\u00cb\u00cc\5*\26\2\u00cc\'\3\2\2\2\u00cd\u00ce"+
		"\5*\26\2\u00ce)\3\2\2\2\u00cf\u00d7\7\33\2\2\u00d0\u00d7\5\"\22\2\u00d1"+
		"\u00d7\7\36\2\2\u00d2\u00d3\7\5\2\2\u00d3\u00d4\5*\26\2\u00d4\u00d5\7"+
		"\6\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6"+
		"\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7+\3\2\2\2\27\60\62<CLQ[ktv\177"+
		"\u0084\u008e\u0097\u00a0\u00aa\u00ad\u00b1\u00b5\u00b9\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}