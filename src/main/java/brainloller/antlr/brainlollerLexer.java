// Generated from brainloller.g4 by ANTLR 4.8
package brainloller.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class brainlollerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREATER=1, LOWER=2, PLUS=3, MINUS=4, DOT=5, COMMA=6, LPARENTHESES=7, RPARENTHESES=8, 
		ROTATELEFT=9, ROTATERIGHT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GREATER", "LOWER", "PLUS", "MINUS", "DOT", "COMMA", "LPARENTHESES", 
			"RPARENTHESES", "ROTATELEFT", "ROTATERIGHT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'(255, 0, 0)'", "'(128, 0, 0)'", "'(0, 255, 0)'", "'(0, 128, 0)'", 
			"'(0, 0, 255)'", "'(0, 0, 128)'", "'(255, 255, 0)'", "'(128, 128, 0)'", 
			"'(0, 255, 255)'", "'(0, 128, 128)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATER", "LOWER", "PLUS", "MINUS", "DOT", "COMMA", "LPARENTHESES", 
			"RPARENTHESES", "ROTATELEFT", "ROTATERIGHT", "WS"
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


	public brainlollerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "brainloller.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u009d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\2\2"+
		"\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\2\2\u009c\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3"+
		"\31\3\2\2\2\5%\3\2\2\2\7\61\3\2\2\2\t=\3\2\2\2\13I\3\2\2\2\rU\3\2\2\2"+
		"\17a\3\2\2\2\21o\3\2\2\2\23}\3\2\2\2\25\u008b\3\2\2\2\27\u0099\3\2\2\2"+
		"\31\32\7*\2\2\32\33\7\64\2\2\33\34\7\67\2\2\34\35\7\67\2\2\35\36\7.\2"+
		"\2\36\37\7\"\2\2\37 \7\62\2\2 !\7.\2\2!\"\7\"\2\2\"#\7\62\2\2#$\7+\2\2"+
		"$\4\3\2\2\2%&\7*\2\2&\'\7\63\2\2\'(\7\64\2\2()\7:\2\2)*\7.\2\2*+\7\"\2"+
		"\2+,\7\62\2\2,-\7.\2\2-.\7\"\2\2./\7\62\2\2/\60\7+\2\2\60\6\3\2\2\2\61"+
		"\62\7*\2\2\62\63\7\62\2\2\63\64\7.\2\2\64\65\7\"\2\2\65\66\7\64\2\2\66"+
		"\67\7\67\2\2\678\7\67\2\289\7.\2\29:\7\"\2\2:;\7\62\2\2;<\7+\2\2<\b\3"+
		"\2\2\2=>\7*\2\2>?\7\62\2\2?@\7.\2\2@A\7\"\2\2AB\7\63\2\2BC\7\64\2\2CD"+
		"\7:\2\2DE\7.\2\2EF\7\"\2\2FG\7\62\2\2GH\7+\2\2H\n\3\2\2\2IJ\7*\2\2JK\7"+
		"\62\2\2KL\7.\2\2LM\7\"\2\2MN\7\62\2\2NO\7.\2\2OP\7\"\2\2PQ\7\64\2\2QR"+
		"\7\67\2\2RS\7\67\2\2ST\7+\2\2T\f\3\2\2\2UV\7*\2\2VW\7\62\2\2WX\7.\2\2"+
		"XY\7\"\2\2YZ\7\62\2\2Z[\7.\2\2[\\\7\"\2\2\\]\7\63\2\2]^\7\64\2\2^_\7:"+
		"\2\2_`\7+\2\2`\16\3\2\2\2ab\7*\2\2bc\7\64\2\2cd\7\67\2\2de\7\67\2\2ef"+
		"\7.\2\2fg\7\"\2\2gh\7\64\2\2hi\7\67\2\2ij\7\67\2\2jk\7.\2\2kl\7\"\2\2"+
		"lm\7\62\2\2mn\7+\2\2n\20\3\2\2\2op\7*\2\2pq\7\63\2\2qr\7\64\2\2rs\7:\2"+
		"\2st\7.\2\2tu\7\"\2\2uv\7\63\2\2vw\7\64\2\2wx\7:\2\2xy\7.\2\2yz\7\"\2"+
		"\2z{\7\62\2\2{|\7+\2\2|\22\3\2\2\2}~\7*\2\2~\177\7\62\2\2\177\u0080\7"+
		".\2\2\u0080\u0081\7\"\2\2\u0081\u0082\7\64\2\2\u0082\u0083\7\67\2\2\u0083"+
		"\u0084\7\67\2\2\u0084\u0085\7.\2\2\u0085\u0086\7\"\2\2\u0086\u0087\7\64"+
		"\2\2\u0087\u0088\7\67\2\2\u0088\u0089\7\67\2\2\u0089\u008a\7+\2\2\u008a"+
		"\24\3\2\2\2\u008b\u008c\7*\2\2\u008c\u008d\7\62\2\2\u008d\u008e\7.\2\2"+
		"\u008e\u008f\7\"\2\2\u008f\u0090\7\63\2\2\u0090\u0091\7\64\2\2\u0091\u0092"+
		"\7:\2\2\u0092\u0093\7.\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7\63\2\2\u0095"+
		"\u0096\7\64\2\2\u0096\u0097\7:\2\2\u0097\u0098\7+\2\2\u0098\26\3\2\2\2"+
		"\u0099\u009a\13\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\f\2\2\u009c\30"+
		"\3\2\2\2\3\2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}