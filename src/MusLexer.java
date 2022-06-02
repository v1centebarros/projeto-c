// Generated from Mus.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, LOGICALOP=19, TYPE=20, NUM=21, BOOL=22, TEXT=23, ID=24, WS=25, 
		COMMENT_INLINE=26, COMMENT_MULTILINE=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "LOGICALOP", "TYPE", "NUM", "BOOL", "TEXT", "ID", "WS", "COMMENT_INLINE", 
			"COMMENT_MULTILINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'do'", "'end'", "'while'", "'until'", "';'", "'='", "'('", 
			"','", "')'", "'|'", "'not'", "'-'", "'*'", "'/'", "'%'", "'+'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "LOGICALOP", "TYPE", "NUM", 
			"BOOL", "TEXT", "ID", "WS", "COMMENT_INLINE", "COMMENT_MULTILINE"
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


	public MusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mus.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00df\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24{\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0091\n\25\3\26\5\26\u0094\n\26\3\26\6\26\u0097\n"+
		"\26\r\26\16\26\u0098\3\26\3\26\6\26\u009d\n\26\r\26\16\26\u009e\5\26\u00a1"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ac\n\27\3\30"+
		"\3\30\3\30\3\30\7\30\u00b2\n\30\f\30\16\30\u00b5\13\30\3\30\3\30\3\31"+
		"\3\31\7\31\u00bb\n\31\f\31\16\31\u00be\13\31\3\32\6\32\u00c1\n\32\r\32"+
		"\16\32\u00c2\3\32\3\32\3\33\3\33\7\33\u00c9\n\33\f\33\16\33\u00cc\13\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00d6\n\34\f\34\16\34\u00d9"+
		"\13\34\3\34\3\34\3\34\3\34\3\34\4\u00ca\u00d7\2\35\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\t\3\2\62;\4\2VVvv\4\2"+
		"HHhh\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00f4\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5<\3\2\2\2"+
		"\7?\3\2\2\2\tC\3\2\2\2\13I\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21S\3\2\2\2"+
		"\23U\3\2\2\2\25W\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33_\3\2\2\2\35a\3\2\2"+
		"\2\37c\3\2\2\2!e\3\2\2\2#g\3\2\2\2%i\3\2\2\2\'z\3\2\2\2)\u0090\3\2\2\2"+
		"+\u0093\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2\2\2\61\u00b8\3\2\2\2\63\u00c0"+
		"\3\2\2\2\65\u00c6\3\2\2\2\67\u00d1\3\2\2\29:\7k\2\2:;\7h\2\2;\4\3\2\2"+
		"\2<=\7f\2\2=>\7q\2\2>\6\3\2\2\2?@\7g\2\2@A\7p\2\2AB\7f\2\2B\b\3\2\2\2"+
		"CD\7y\2\2DE\7j\2\2EF\7k\2\2FG\7n\2\2GH\7g\2\2H\n\3\2\2\2IJ\7w\2\2JK\7"+
		"p\2\2KL\7v\2\2LM\7k\2\2MN\7n\2\2N\f\3\2\2\2OP\7=\2\2P\16\3\2\2\2QR\7?"+
		"\2\2R\20\3\2\2\2ST\7*\2\2T\22\3\2\2\2UV\7.\2\2V\24\3\2\2\2WX\7+\2\2X\26"+
		"\3\2\2\2YZ\7~\2\2Z\30\3\2\2\2[\\\7p\2\2\\]\7q\2\2]^\7v\2\2^\32\3\2\2\2"+
		"_`\7/\2\2`\34\3\2\2\2ab\7,\2\2b\36\3\2\2\2cd\7\61\2\2d \3\2\2\2ef\7\'"+
		"\2\2f\"\3\2\2\2gh\7-\2\2h$\3\2\2\2ij\7\60\2\2j&\3\2\2\2kl\7c\2\2lm\7p"+
		"\2\2m{\7f\2\2no\7q\2\2o{\7t\2\2p{\7@\2\2qr\7@\2\2r{\7?\2\2s{\7>\2\2tu"+
		"\7>\2\2u{\7?\2\2vw\7?\2\2w{\7?\2\2xy\7#\2\2y{\7?\2\2zk\3\2\2\2zn\3\2\2"+
		"\2zp\3\2\2\2zq\3\2\2\2zs\3\2\2\2zt\3\2\2\2zv\3\2\2\2zx\3\2\2\2{(\3\2\2"+
		"\2|}\7P\2\2}~\7W\2\2~\u0091\7O\2\2\177\u0080\7D\2\2\u0080\u0081\7Q\2\2"+
		"\u0081\u0082\7Q\2\2\u0082\u0091\7N\2\2\u0083\u0084\7V\2\2\u0084\u0085"+
		"\7G\2\2\u0085\u0086\7Z\2\2\u0086\u0091\7V\2\2\u0087\u0088\7G\2\2\u0088"+
		"\u0089\7P\2\2\u0089\u008a\7W\2\2\u008a\u0091\7O\2\2\u008b\u008c\7T\2\2"+
		"\u008c\u008d\7Q\2\2\u008d\u008e\7D\2\2\u008e\u008f\7Q\2\2\u008f\u0091"+
		"\7V\2\2\u0090|\3\2\2\2\u0090\177\3\2\2\2\u0090\u0083\3\2\2\2\u0090\u0087"+
		"\3\2\2\2\u0090\u008b\3\2\2\2\u0091*\3\2\2\2\u0092\u0094\7/\2\2\u0093\u0092"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097\t\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u00a0\3\2\2\2\u009a\u009c\7\60\2\2\u009b\u009d\t\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		",\3\2\2\2\u00a2\u00a3\t\3\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7w\2\2\u00a5"+
		"\u00ac\7g\2\2\u00a6\u00a7\t\4\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7n\2"+
		"\2\u00a9\u00aa\7u\2\2\u00aa\u00ac\7g\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a6"+
		"\3\2\2\2\u00ac.\3\2\2\2\u00ad\u00b3\7$\2\2\u00ae\u00b2\n\5\2\2\u00af\u00b0"+
		"\7$\2\2\u00b0\u00b2\7$\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7\60\3\2\2\2\u00b8\u00bc"+
		"\t\6\2\2\u00b9\u00bb\t\7\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\62\3\2\2\2\u00be\u00bc\3\2\2"+
		"\2\u00bf\u00c1\t\b\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\32\2\2"+
		"\u00c5\64\3\2\2\2\u00c6\u00ca\7%\2\2\u00c7\u00c9\13\2\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\b\33\2\2\u00d0\66\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2"+
		"\u00d3\7,\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\13\2\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7,\2\2\u00db\u00dc\7\61"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\34\2\2\u00de8\3\2\2\2\20\2z\u0090"+
		"\u0093\u0098\u009e\u00a0\u00ab\u00b1\u00b3\u00bc\u00c2\u00ca\u00d7\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}