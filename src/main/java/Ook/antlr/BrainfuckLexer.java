// Generated from Ook.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BrainfuckLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREATER=1, LOWER=2, PLUS=3, MINUS=4, DOT=5, COMMA=6, LPARENTHESES=7, RPARENTHESES=8, 
		WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GREATER", "LOWER", "PLUS", "MINUS", "DOT", "COMMA", "LPARENTHESES", 
			"RPARENTHESES", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Ook. Ook?'", "'Ook? Ook.'", "'Ook. Ook.'", "'Ook! Ook!'", "'Ook! Ook.'", 
			"'Ook. Ook!'", "'Ook! Ook?'", "'Ook? Ook!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATER", "LOWER", "PLUS", "MINUS", "DOT", "COMMA", "LPARENTHESES", 
			"RPARENTHESES", "WS"
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


	public BrainfuckLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ook.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13i\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\2\2\13\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\3\2\2\2h\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\3\25\3\2\2\2\5\37\3\2\2\2\7)\3\2\2\2\t\63\3\2\2\2\13=\3\2\2\2"+
		"\rG\3\2\2\2\17Q\3\2\2\2\21[\3\2\2\2\23e\3\2\2\2\25\26\7Q\2\2\26\27\7q"+
		"\2\2\27\30\7m\2\2\30\31\7\60\2\2\31\32\7\"\2\2\32\33\7Q\2\2\33\34\7q\2"+
		"\2\34\35\7m\2\2\35\36\7A\2\2\36\4\3\2\2\2\37 \7Q\2\2 !\7q\2\2!\"\7m\2"+
		"\2\"#\7A\2\2#$\7\"\2\2$%\7Q\2\2%&\7q\2\2&\'\7m\2\2\'(\7\60\2\2(\6\3\2"+
		"\2\2)*\7Q\2\2*+\7q\2\2+,\7m\2\2,-\7\60\2\2-.\7\"\2\2./\7Q\2\2/\60\7q\2"+
		"\2\60\61\7m\2\2\61\62\7\60\2\2\62\b\3\2\2\2\63\64\7Q\2\2\64\65\7q\2\2"+
		"\65\66\7m\2\2\66\67\7#\2\2\678\7\"\2\289\7Q\2\29:\7q\2\2:;\7m\2\2;<\7"+
		"#\2\2<\n\3\2\2\2=>\7Q\2\2>?\7q\2\2?@\7m\2\2@A\7#\2\2AB\7\"\2\2BC\7Q\2"+
		"\2CD\7q\2\2DE\7m\2\2EF\7\60\2\2F\f\3\2\2\2GH\7Q\2\2HI\7q\2\2IJ\7m\2\2"+
		"JK\7\60\2\2KL\7\"\2\2LM\7Q\2\2MN\7q\2\2NO\7m\2\2OP\7#\2\2P\16\3\2\2\2"+
		"QR\7Q\2\2RS\7q\2\2ST\7m\2\2TU\7#\2\2UV\7\"\2\2VW\7Q\2\2WX\7q\2\2XY\7m"+
		"\2\2YZ\7A\2\2Z\20\3\2\2\2[\\\7Q\2\2\\]\7q\2\2]^\7m\2\2^_\7A\2\2_`\7\""+
		"\2\2`a\7Q\2\2ab\7q\2\2bc\7m\2\2cd\7#\2\2d\22\3\2\2\2ef\13\2\2\2fg\3\2"+
		"\2\2gh\b\n\2\2h\24\3\2\2\2\3\2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}