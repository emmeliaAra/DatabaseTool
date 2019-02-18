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
		MINUS=9, LT=10, LT_EQ=11, GT=12, GT_EQ=13, EQ=14, NOT_EQ1=15, NOT_EQ2=16, 
		K_AND=17, K_DATABASE=18, K_DROP=19, K_FROM=20, K_OR=21, K_SELECT=22, K_TABLE=23, 
		K_WHERE=24, IDENTIFIER=25, NUMERIC_LITERAL=26, BIND_PARAMETER=27, STRING_LITERAL=28, 
		BLOB_LITERAL=29, SINGLE_LINE_COMMENT=30, MULTILINE_COMMENT=31, SPACES=32, 
		UNEXPECTED_CHAR=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", 
			"MINUS", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_AND", 
			"K_DATABASE", "K_DROP", "K_FROM", "K_OR", "K_SELECT", "K_TABLE", "K_WHERE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u018e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00d2"+
		"\n\32\f\32\16\32\u00d5\13\32\3\32\3\32\3\32\3\32\3\32\7\32\u00dc\n\32"+
		"\f\32\16\32\u00df\13\32\3\32\3\32\3\32\7\32\u00e4\n\32\f\32\16\32\u00e7"+
		"\13\32\3\32\3\32\3\32\7\32\u00ec\n\32\f\32\16\32\u00ef\13\32\5\32\u00f1"+
		"\n\32\3\33\6\33\u00f4\n\33\r\33\16\33\u00f5\3\33\3\33\7\33\u00fa\n\33"+
		"\f\33\16\33\u00fd\13\33\5\33\u00ff\n\33\3\33\3\33\5\33\u0103\n\33\3\33"+
		"\6\33\u0106\n\33\r\33\16\33\u0107\5\33\u010a\n\33\3\33\3\33\6\33\u010e"+
		"\n\33\r\33\16\33\u010f\3\33\3\33\5\33\u0114\n\33\3\33\6\33\u0117\n\33"+
		"\r\33\16\33\u0118\5\33\u011b\n\33\5\33\u011d\n\33\3\34\3\34\7\34\u0121"+
		"\n\34\f\34\16\34\u0124\13\34\3\34\3\34\5\34\u0128\n\34\3\35\3\35\3\35"+
		"\3\35\7\35\u012e\n\35\f\35\16\35\u0131\13\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\7\37\u013c\n\37\f\37\16\37\u013f\13\37\3\37\3\37"+
		"\3 \3 \3 \3 \7 \u0147\n \f \16 \u014a\13 \3 \3 \3 \5 \u014f\n \3 \3 \3"+
		"!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3\u0148\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a"+
		"\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2\3\2\'\3\2$$\3\2bb\3\2__\5\2C\\"+
		"aac|\6\2\62;C\\aac|\4\2--//\5\2&&<<BB\3\2))\4\2\f\f\17\17\5\2\13\r\17"+
		"\17\"\"\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2II"+
		"ii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\2\u018d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\3{\3\2\2\2\5}\3\2\2\2\7\177\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2"+
		"\2\r\u0085\3\2\2\2\17\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008b\3\2\2\2"+
		"\25\u008d\3\2\2\2\27\u008f\3\2\2\2\31\u0092\3\2\2\2\33\u0094\3\2\2\2\35"+
		"\u0097\3\2\2\2\37\u009a\3\2\2\2!\u009d\3\2\2\2#\u00a0\3\2\2\2%\u00a4\3"+
		"\2\2\2\'\u00ad\3\2\2\2)\u00b2\3\2\2\2+\u00b7\3\2\2\2-\u00ba\3\2\2\2/\u00c1"+
		"\3\2\2\2\61\u00c7\3\2\2\2\63\u00f0\3\2\2\2\65\u011c\3\2\2\2\67\u0127\3"+
		"\2\2\29\u0129\3\2\2\2;\u0134\3\2\2\2=\u0137\3\2\2\2?\u0142\3\2\2\2A\u0152"+
		"\3\2\2\2C\u0156\3\2\2\2E\u0158\3\2\2\2G\u015a\3\2\2\2I\u015c\3\2\2\2K"+
		"\u015e\3\2\2\2M\u0160\3\2\2\2O\u0162\3\2\2\2Q\u0164\3\2\2\2S\u0166\3\2"+
		"\2\2U\u0168\3\2\2\2W\u016a\3\2\2\2Y\u016c\3\2\2\2[\u016e\3\2\2\2]\u0170"+
		"\3\2\2\2_\u0172\3\2\2\2a\u0174\3\2\2\2c\u0176\3\2\2\2e\u0178\3\2\2\2g"+
		"\u017a\3\2\2\2i\u017c\3\2\2\2k\u017e\3\2\2\2m\u0180\3\2\2\2o\u0182\3\2"+
		"\2\2q\u0184\3\2\2\2s\u0186\3\2\2\2u\u0188\3\2\2\2w\u018a\3\2\2\2y\u018c"+
		"\3\2\2\2{|\7=\2\2|\4\3\2\2\2}~\7\60\2\2~\6\3\2\2\2\177\u0080\7*\2\2\u0080"+
		"\b\3\2\2\2\u0081\u0082\7+\2\2\u0082\n\3\2\2\2\u0083\u0084\7.\2\2\u0084"+
		"\f\3\2\2\2\u0085\u0086\7?\2\2\u0086\16\3\2\2\2\u0087\u0088\7,\2\2\u0088"+
		"\20\3\2\2\2\u0089\u008a\7-\2\2\u008a\22\3\2\2\2\u008b\u008c\7/\2\2\u008c"+
		"\24\3\2\2\2\u008d\u008e\7>\2\2\u008e\26\3\2\2\2\u008f\u0090\7>\2\2\u0090"+
		"\u0091\7?\2\2\u0091\30\3\2\2\2\u0092\u0093\7@\2\2\u0093\32\3\2\2\2\u0094"+
		"\u0095\7@\2\2\u0095\u0096\7?\2\2\u0096\34\3\2\2\2\u0097\u0098\7?\2\2\u0098"+
		"\u0099\7?\2\2\u0099\36\3\2\2\2\u009a\u009b\7#\2\2\u009b\u009c\7?\2\2\u009c"+
		" \3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7@\2\2\u009f\"\3\2\2\2\u00a0"+
		"\u00a1\5G$\2\u00a1\u00a2\5a\61\2\u00a2\u00a3\5M\'\2\u00a3$\3\2\2\2\u00a4"+
		"\u00a5\5M\'\2\u00a5\u00a6\5G$\2\u00a6\u00a7\5m\67\2\u00a7\u00a8\5G$\2"+
		"\u00a8\u00a9\5I%\2\u00a9\u00aa\5G$\2\u00aa\u00ab\5k\66\2\u00ab\u00ac\5"+
		"O(\2\u00ac&\3\2\2\2\u00ad\u00ae\5M\'\2\u00ae\u00af\5i\65\2\u00af\u00b0"+
		"\5c\62\2\u00b0\u00b1\5e\63\2\u00b1(\3\2\2\2\u00b2\u00b3\5Q)\2\u00b3\u00b4"+
		"\5i\65\2\u00b4\u00b5\5c\62\2\u00b5\u00b6\5_\60\2\u00b6*\3\2\2\2\u00b7"+
		"\u00b8\5c\62\2\u00b8\u00b9\5i\65\2\u00b9,\3\2\2\2\u00ba\u00bb\5k\66\2"+
		"\u00bb\u00bc\5O(\2\u00bc\u00bd\5]/\2\u00bd\u00be\5O(\2\u00be\u00bf\5K"+
		"&\2\u00bf\u00c0\5m\67\2\u00c0.\3\2\2\2\u00c1\u00c2\5m\67\2\u00c2\u00c3"+
		"\5G$\2\u00c3\u00c4\5I%\2\u00c4\u00c5\5]/\2\u00c5\u00c6\5O(\2\u00c6\60"+
		"\3\2\2\2\u00c7\u00c8\5s:\2\u00c8\u00c9\5U+\2\u00c9\u00ca\5O(\2\u00ca\u00cb"+
		"\5i\65\2\u00cb\u00cc\5O(\2\u00cc\62\3\2\2\2\u00cd\u00d3\7$\2\2\u00ce\u00d2"+
		"\n\2\2\2\u00cf\u00d0\7$\2\2\u00d0\u00d2\7$\2\2\u00d1\u00ce\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00f1\7$\2\2\u00d7"+
		"\u00dd\7b\2\2\u00d8\u00dc\n\3\2\2\u00d9\u00da\7b\2\2\u00da\u00dc\7b\2"+
		"\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00f1\7b\2\2\u00e1\u00e5\7]\2\2\u00e2\u00e4\n\4\2\2\u00e3\u00e2\3\2\2"+
		"\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00f1\7_\2\2\u00e9\u00ed\t\5\2\2\u00ea"+
		"\u00ec\t\6\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00cd\3\2\2\2\u00f0\u00d7\3\2\2\2\u00f0\u00e1\3\2\2\2\u00f0\u00e9\3\2"+
		"\2\2\u00f1\64\3\2\2\2\u00f2\u00f4\5E#\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fe\3\2\2\2\u00f7"+
		"\u00fb\5\5\3\2\u00f8\u00fa\5E#\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0109\3\2\2\2\u0100"+
		"\u0102\5O(\2\u0101\u0103\t\7\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2"+
		"\2\u0103\u0105\3\2\2\2\u0104\u0106\5E#\2\u0105\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0100\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u011d\3\2\2\2\u010b\u010d\5\5"+
		"\3\2\u010c\u010e\5E#\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u011a\3\2\2\2\u0111\u0113\5O(\2\u0112"+
		"\u0114\t\7\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u0117\5E#\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0111\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u00f3\3\2\2\2\u011c\u010b\3\2"+
		"\2\2\u011d\66\3\2\2\2\u011e\u0122\7A\2\2\u011f\u0121\5E#\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0128\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\t\b\2\2\u0126\u0128\5\63"+
		"\32\2\u0127\u011e\3\2\2\2\u0127\u0125\3\2\2\2\u01288\3\2\2\2\u0129\u012f"+
		"\7)\2\2\u012a\u012e\n\t\2\2\u012b\u012c\7)\2\2\u012c\u012e\7)\2\2\u012d"+
		"\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0133\7)\2\2\u0133:\3\2\2\2\u0134\u0135\5u;\2\u0135\u0136\59\35\2\u0136"+
		"<\3\2\2\2\u0137\u0138\7/\2\2\u0138\u0139\7/\2\2\u0139\u013d\3\2\2\2\u013a"+
		"\u013c\n\n\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140"+
		"\u0141\b\37\2\2\u0141>\3\2\2\2\u0142\u0143\7\61\2\2\u0143\u0144\7,\2\2"+
		"\u0144\u0148\3\2\2\2\u0145\u0147\13\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014e\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014c\7,\2\2\u014c\u014f\7\61\2\2\u014d\u014f\7\2"+
		"\2\3\u014e\u014b\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\b \2\2\u0151@\3\2\2\2\u0152\u0153\t\13\2\2\u0153\u0154\3\2\2\2"+
		"\u0154\u0155\b!\2\2\u0155B\3\2\2\2\u0156\u0157\13\2\2\2\u0157D\3\2\2\2"+
		"\u0158\u0159\t\f\2\2\u0159F\3\2\2\2\u015a\u015b\t\r\2\2\u015bH\3\2\2\2"+
		"\u015c\u015d\t\16\2\2\u015dJ\3\2\2\2\u015e\u015f\t\17\2\2\u015fL\3\2\2"+
		"\2\u0160\u0161\t\20\2\2\u0161N\3\2\2\2\u0162\u0163\t\21\2\2\u0163P\3\2"+
		"\2\2\u0164\u0165\t\22\2\2\u0165R\3\2\2\2\u0166\u0167\t\23\2\2\u0167T\3"+
		"\2\2\2\u0168\u0169\t\24\2\2\u0169V\3\2\2\2\u016a\u016b\t\25\2\2\u016b"+
		"X\3\2\2\2\u016c\u016d\t\26\2\2\u016dZ\3\2\2\2\u016e\u016f\t\27\2\2\u016f"+
		"\\\3\2\2\2\u0170\u0171\t\30\2\2\u0171^\3\2\2\2\u0172\u0173\t\31\2\2\u0173"+
		"`\3\2\2\2\u0174\u0175\t\32\2\2\u0175b\3\2\2\2\u0176\u0177\t\33\2\2\u0177"+
		"d\3\2\2\2\u0178\u0179\t\34\2\2\u0179f\3\2\2\2\u017a\u017b\t\35\2\2\u017b"+
		"h\3\2\2\2\u017c\u017d\t\36\2\2\u017dj\3\2\2\2\u017e\u017f\t\37\2\2\u017f"+
		"l\3\2\2\2\u0180\u0181\t \2\2\u0181n\3\2\2\2\u0182\u0183\t!\2\2\u0183p"+
		"\3\2\2\2\u0184\u0185\t\"\2\2\u0185r\3\2\2\2\u0186\u0187\t#\2\2\u0187t"+
		"\3\2\2\2\u0188\u0189\t$\2\2\u0189v\3\2\2\2\u018a\u018b\t%\2\2\u018bx\3"+
		"\2\2\2\u018c\u018d\t&\2\2\u018dz\3\2\2\2\34\2\u00d1\u00d3\u00db\u00dd"+
		"\u00e5\u00ed\u00f0\u00f5\u00fb\u00fe\u0102\u0107\u0109\u010f\u0113\u0118"+
		"\u011a\u011c\u0122\u0127\u012d\u012f\u013d\u0148\u014e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}