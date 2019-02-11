// Generated from C:/Users/emmel/Desktop/SCC 2016-2017/2018-2019/SCC 300 - Third Year Project/DatabaseTool/src\sqlite.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sqliteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, UNDERSCORE=25, 
		K_AND=26, K_DROP=27, K_FROM=28, K_OR=29, K_SELECT=30, K_TABLE=31, K_WHERE=32, 
		IDENTIFIER=33, NUMERIC_LITERAL=34, BIND_PARAMETER=35, STRING_LITERAL=36, 
		BLOB_LITERAL=37, SINGLE_LINE_COMMENT=38, MULTILINE_COMMENT=39, SPACES=40, 
		UNEXPECTED_CHAR=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", 
			"MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", 
			"LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "UNDERSCORE", 
			"K_AND", "K_DROP", "K_FROM", "K_OR", "K_SELECT", "K_TABLE", "K_WHERE", 
			"IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR", "DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
			"X", "Y", "Z"
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
			"K_AND", "K_DROP", "K_FROM", "K_OR", "K_SELECT", "K_TABLE", "K_WHERE", 
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


	public sqliteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sqlite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u01aa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\7"+
		"\"\u00ee\n\"\f\"\16\"\u00f1\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u00f8\n\"\f\""+
		"\16\"\u00fb\13\"\3\"\3\"\3\"\7\"\u0100\n\"\f\"\16\"\u0103\13\"\3\"\3\""+
		"\3\"\7\"\u0108\n\"\f\"\16\"\u010b\13\"\5\"\u010d\n\"\3#\6#\u0110\n#\r"+
		"#\16#\u0111\3#\3#\7#\u0116\n#\f#\16#\u0119\13#\5#\u011b\n#\3#\3#\5#\u011f"+
		"\n#\3#\6#\u0122\n#\r#\16#\u0123\5#\u0126\n#\3#\3#\6#\u012a\n#\r#\16#\u012b"+
		"\3#\3#\5#\u0130\n#\3#\6#\u0133\n#\r#\16#\u0134\5#\u0137\n#\5#\u0139\n"+
		"#\3$\3$\7$\u013d\n$\f$\16$\u0140\13$\3$\3$\5$\u0144\n$\3%\3%\3%\3%\7%"+
		"\u014a\n%\f%\16%\u014d\13%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0158\n"+
		"\'\f\'\16\'\u015b\13\'\3\'\3\'\3(\3(\3(\3(\7(\u0163\n(\f(\16(\u0166\13"+
		"(\3(\3(\3(\5(\u016b\n(\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@"+
		"\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3\u0164\2F\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2"+
		"\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\3\2\'\3\2$$\3\2bb\3\2__\5\2C"+
		"\\aac|\6\2\62;C\\aac|\4\2--//\5\2&&<<BB\3\2))\4\2\f\f\17\17\5\2\13\r\17"+
		"\17\"\"\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2II"+
		"ii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\2\u01a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\3\u008b\3\2\2\2\5\u008d\3\2\2\2\7\u008f\3\2\2\2\t"+
		"\u0091\3\2\2\2\13\u0093\3\2\2\2\r\u0095\3\2\2\2\17\u0097\3\2\2\2\21\u0099"+
		"\3\2\2\2\23\u009b\3\2\2\2\25\u009d\3\2\2\2\27\u009f\3\2\2\2\31\u00a2\3"+
		"\2\2\2\33\u00a4\3\2\2\2\35\u00a6\3\2\2\2\37\u00a9\3\2\2\2!\u00ac\3\2\2"+
		"\2#\u00ae\3\2\2\2%\u00b0\3\2\2\2\'\u00b2\3\2\2\2)\u00b5\3\2\2\2+\u00b7"+
		"\3\2\2\2-\u00ba\3\2\2\2/\u00bd\3\2\2\2\61\u00c0\3\2\2\2\63\u00c3\3\2\2"+
		"\2\65\u00c5\3\2\2\2\67\u00c9\3\2\2\29\u00ce\3\2\2\2;\u00d3\3\2\2\2=\u00d6"+
		"\3\2\2\2?\u00dd\3\2\2\2A\u00e3\3\2\2\2C\u010c\3\2\2\2E\u0138\3\2\2\2G"+
		"\u0143\3\2\2\2I\u0145\3\2\2\2K\u0150\3\2\2\2M\u0153\3\2\2\2O\u015e\3\2"+
		"\2\2Q\u016e\3\2\2\2S\u0172\3\2\2\2U\u0174\3\2\2\2W\u0176\3\2\2\2Y\u0178"+
		"\3\2\2\2[\u017a\3\2\2\2]\u017c\3\2\2\2_\u017e\3\2\2\2a\u0180\3\2\2\2c"+
		"\u0182\3\2\2\2e\u0184\3\2\2\2g\u0186\3\2\2\2i\u0188\3\2\2\2k\u018a\3\2"+
		"\2\2m\u018c\3\2\2\2o\u018e\3\2\2\2q\u0190\3\2\2\2s\u0192\3\2\2\2u\u0194"+
		"\3\2\2\2w\u0196\3\2\2\2y\u0198\3\2\2\2{\u019a\3\2\2\2}\u019c\3\2\2\2\177"+
		"\u019e\3\2\2\2\u0081\u01a0\3\2\2\2\u0083\u01a2\3\2\2\2\u0085\u01a4\3\2"+
		"\2\2\u0087\u01a6\3\2\2\2\u0089\u01a8\3\2\2\2\u008b\u008c\7=\2\2\u008c"+
		"\4\3\2\2\2\u008d\u008e\7\60\2\2\u008e\6\3\2\2\2\u008f\u0090\7*\2\2\u0090"+
		"\b\3\2\2\2\u0091\u0092\7+\2\2\u0092\n\3\2\2\2\u0093\u0094\7.\2\2\u0094"+
		"\f\3\2\2\2\u0095\u0096\7?\2\2\u0096\16\3\2\2\2\u0097\u0098\7,\2\2\u0098"+
		"\20\3\2\2\2\u0099\u009a\7-\2\2\u009a\22\3\2\2\2\u009b\u009c\7/\2\2\u009c"+
		"\24\3\2\2\2\u009d\u009e\7\u0080\2\2\u009e\26\3\2\2\2\u009f\u00a0\7~\2"+
		"\2\u00a0\u00a1\7~\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\32\3"+
		"\2\2\2\u00a4\u00a5\7\'\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8"+
		"\7>\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa\u00ab\7@\2\2\u00ab "+
		"\3\2\2\2\u00ac\u00ad\7(\2\2\u00ad\"\3\2\2\2\u00ae\u00af\7~\2\2\u00af$"+
		"\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7"+
		"@\2\2\u00b8\u00b9\7?\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc"+
		"\7?\2\2\u00bc.\3\2\2\2\u00bd\u00be\7#\2\2\u00be\u00bf\7?\2\2\u00bf\60"+
		"\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c2\7@\2\2\u00c2\62\3\2\2\2\u00c3"+
		"\u00c4\7a\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\5W,\2\u00c6\u00c7\5q9\2\u00c7"+
		"\u00c8\5]/\2\u00c8\66\3\2\2\2\u00c9\u00ca\5]/\2\u00ca\u00cb\5y=\2\u00cb"+
		"\u00cc\5s:\2\u00cc\u00cd\5u;\2\u00cd8\3\2\2\2\u00ce\u00cf\5a\61\2\u00cf"+
		"\u00d0\5y=\2\u00d0\u00d1\5s:\2\u00d1\u00d2\5o8\2\u00d2:\3\2\2\2\u00d3"+
		"\u00d4\5s:\2\u00d4\u00d5\5y=\2\u00d5<\3\2\2\2\u00d6\u00d7\5{>\2\u00d7"+
		"\u00d8\5_\60\2\u00d8\u00d9\5m\67\2\u00d9\u00da\5_\60\2\u00da\u00db\5["+
		".\2\u00db\u00dc\5}?\2\u00dc>\3\2\2\2\u00dd\u00de\5}?\2\u00de\u00df\5W"+
		",\2\u00df\u00e0\5Y-\2\u00e0\u00e1\5m\67\2\u00e1\u00e2\5_\60\2\u00e2@\3"+
		"\2\2\2\u00e3\u00e4\5\u0083B\2\u00e4\u00e5\5e\63\2\u00e5\u00e6\5_\60\2"+
		"\u00e6\u00e7\5y=\2\u00e7\u00e8\5_\60\2\u00e8B\3\2\2\2\u00e9\u00ef\7$\2"+
		"\2\u00ea\u00ee\n\2\2\2\u00eb\u00ec\7$\2\2\u00ec\u00ee\7$\2\2\u00ed\u00ea"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u010d\7$"+
		"\2\2\u00f3\u00f9\7b\2\2\u00f4\u00f8\n\3\2\2\u00f5\u00f6\7b\2\2\u00f6\u00f8"+
		"\7b\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u010d\7b\2\2\u00fd\u0101\7]\2\2\u00fe\u0100\n\4\2\2\u00ff\u00fe"+
		"\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u010d\7_\2\2\u0105\u0109\t\5"+
		"\2\2\u0106\u0108\t\6\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u00e9\3\2\2\2\u010c\u00f3\3\2\2\2\u010c\u00fd\3\2\2\2\u010c"+
		"\u0105\3\2\2\2\u010dD\3\2\2\2\u010e\u0110\5U+\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u011a\3\2"+
		"\2\2\u0113\u0117\5\5\3\2\u0114\u0116\5U+\2\u0115\u0114\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u0113\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0125\3\2"+
		"\2\2\u011c\u011e\5_\60\2\u011d\u011f\t\7\2\2\u011e\u011d\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u0122\5U+\2\u0121\u0120\3\2\2"+
		"\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126"+
		"\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0139\3\2\2\2\u0127"+
		"\u0129\5\5\3\2\u0128\u012a\5U+\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2"+
		"\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0136\3\2\2\2\u012d\u012f"+
		"\5_\60\2\u012e\u0130\t\7\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u0133\5U+\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2"+
		"\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u012d"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u010f\3\2\2\2\u0138"+
		"\u0127\3\2\2\2\u0139F\3\2\2\2\u013a\u013e\7A\2\2\u013b\u013d\5U+\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0144\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\t\b\2\2\u0142"+
		"\u0144\5C\"\2\u0143\u013a\3\2\2\2\u0143\u0141\3\2\2\2\u0144H\3\2\2\2\u0145"+
		"\u014b\7)\2\2\u0146\u014a\n\t\2\2\u0147\u0148\7)\2\2\u0148\u014a\7)\2"+
		"\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u014f\7)\2\2\u014fJ\3\2\2\2\u0150\u0151\5\u0085C\2\u0151\u0152\5I%\2"+
		"\u0152L\3\2\2\2\u0153\u0154\7/\2\2\u0154\u0155\7/\2\2\u0155\u0159\3\2"+
		"\2\2\u0156\u0158\n\n\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u015d\b\'\2\2\u015dN\3\2\2\2\u015e\u015f\7\61\2\2\u015f\u0160"+
		"\7,\2\2\u0160\u0164\3\2\2\2\u0161\u0163\13\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u016a\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7,\2\2\u0168\u016b\7\61\2\2\u0169"+
		"\u016b\7\2\2\3\u016a\u0167\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016d\b(\2\2\u016dP\3\2\2\2\u016e\u016f\t\13\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u0171\b)\2\2\u0171R\3\2\2\2\u0172\u0173\13\2\2\2\u0173"+
		"T\3\2\2\2\u0174\u0175\t\f\2\2\u0175V\3\2\2\2\u0176\u0177\t\r\2\2\u0177"+
		"X\3\2\2\2\u0178\u0179\t\16\2\2\u0179Z\3\2\2\2\u017a\u017b\t\17\2\2\u017b"+
		"\\\3\2\2\2\u017c\u017d\t\20\2\2\u017d^\3\2\2\2\u017e\u017f\t\21\2\2\u017f"+
		"`\3\2\2\2\u0180\u0181\t\22\2\2\u0181b\3\2\2\2\u0182\u0183\t\23\2\2\u0183"+
		"d\3\2\2\2\u0184\u0185\t\24\2\2\u0185f\3\2\2\2\u0186\u0187\t\25\2\2\u0187"+
		"h\3\2\2\2\u0188\u0189\t\26\2\2\u0189j\3\2\2\2\u018a\u018b\t\27\2\2\u018b"+
		"l\3\2\2\2\u018c\u018d\t\30\2\2\u018dn\3\2\2\2\u018e\u018f\t\31\2\2\u018f"+
		"p\3\2\2\2\u0190\u0191\t\32\2\2\u0191r\3\2\2\2\u0192\u0193\t\33\2\2\u0193"+
		"t\3\2\2\2\u0194\u0195\t\34\2\2\u0195v\3\2\2\2\u0196\u0197\t\35\2\2\u0197"+
		"x\3\2\2\2\u0198\u0199\t\36\2\2\u0199z\3\2\2\2\u019a\u019b\t\37\2\2\u019b"+
		"|\3\2\2\2\u019c\u019d\t \2\2\u019d~\3\2\2\2\u019e\u019f\t!\2\2\u019f\u0080"+
		"\3\2\2\2\u01a0\u01a1\t\"\2\2\u01a1\u0082\3\2\2\2\u01a2\u01a3\t#\2\2\u01a3"+
		"\u0084\3\2\2\2\u01a4\u01a5\t$\2\2\u01a5\u0086\3\2\2\2\u01a6\u01a7\t%\2"+
		"\2\u01a7\u0088\3\2\2\2\u01a8\u01a9\t&\2\2\u01a9\u008a\3\2\2\2\34\2\u00ed"+
		"\u00ef\u00f7\u00f9\u0101\u0109\u010c\u0111\u0117\u011a\u011e\u0123\u0125"+
		"\u012b\u012f\u0134\u0136\u0138\u013e\u0143\u0149\u014b\u0159\u0164\u016a"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}