// Generated from doublefuck.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class doublefuckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREATER=1, LOWER=2, PLUS=3, MINUS=4, DOT=5, COMMA=6, LPARENTHESES=7, RPARENTHESES=8, 
		V=9, POWER=10, SLASH=11, BACKSLASH=12, COLON=13, SEMICOLON=14, LBRACKET=15, 
		RBRACKET=16, WS=17;
	public static final int
		RULE_file = 0, RULE_expression = 1, RULE_operator = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "expression", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'<'", "'+'", "'-'", "'.'", "','", "'['", "']'", "'v'", 
			"'^'", "'/'", "'\\'", "':'", "';'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATER", "LOWER", "PLUS", "MINUS", "DOT", "COMMA", "LPARENTHESES", 
			"RPARENTHESES", "V", "POWER", "SLASH", "BACKSLASH", "COLON", "SEMICOLON", 
			"LBRACKET", "RBRACKET", "WS"
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
	public String getGrammarFileName() { return "doublefuck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public doublefuckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof doublefuckListener ) ((doublefuckListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof doublefuckListener ) ((doublefuckListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LOWER) | (1L << PLUS) | (1L << MINUS) | (1L << DOT) | (1L << COMMA) | (1L << LPARENTHESES) | (1L << LBRACKET))) != 0)) {
				{
				{
				setState(6);
				expression();
				}
				}
				setState(11);
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

	public static class ExpressionContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode LPARENTHESES() { return getToken(doublefuckParser.LPARENTHESES, 0); }
		public TerminalNode RPARENTHESES() { return getToken(doublefuckParser.RPARENTHESES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(doublefuckParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(doublefuckParser.RBRACKET, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof doublefuckListener ) ((doublefuckListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof doublefuckListener ) ((doublefuckListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREATER:
			case LOWER:
			case PLUS:
			case MINUS:
			case DOT:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				operator();
				}
				break;
			case LPARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(LPARENTHESES);
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LOWER) | (1L << PLUS) | (1L << MINUS) | (1L << DOT) | (1L << COMMA) | (1L << LPARENTHESES) | (1L << LBRACKET))) != 0)) {
					{
					{
					setState(14);
					expression();
					}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(20);
				match(RPARENTHESES);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				match(LBRACKET);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LOWER) | (1L << PLUS) | (1L << MINUS) | (1L << DOT) | (1L << COMMA) | (1L << LPARENTHESES) | (1L << LBRACKET))) != 0)) {
					{
					{
					setState(22);
					expression();
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28);
				match(RBRACKET);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(doublefuckParser.GREATER, 0); }
		public TerminalNode LOWER() { return getToken(doublefuckParser.LOWER, 0); }
		public TerminalNode PLUS() { return getToken(doublefuckParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(doublefuckParser.MINUS, 0); }
		public TerminalNode DOT() { return getToken(doublefuckParser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(doublefuckParser.COMMA, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof doublefuckListener ) ((doublefuckListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof doublefuckListener ) ((doublefuckListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LOWER) | (1L << PLUS) | (1L << MINUS) | (1L << DOT) | (1L << COMMA))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\3\3\3\3\3\7\3\22\n\3\f\3\16"+
		"\3\25\13\3\3\3\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\3\5\3 \n\3\3\4\3"+
		"\4\3\4\2\2\5\2\4\6\2\3\3\2\3\b\2%\2\13\3\2\2\2\4\37\3\2\2\2\6!\3\2\2\2"+
		"\b\n\5\4\3\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2"+
		"\2\2\r\13\3\2\2\2\16 \5\6\4\2\17\23\7\t\2\2\20\22\5\4\3\2\21\20\3\2\2"+
		"\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2"+
		"\2\26 \7\n\2\2\27\33\7\21\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2"+
		"\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36 \7\22\2"+
		"\2\37\16\3\2\2\2\37\17\3\2\2\2\37\27\3\2\2\2 \5\3\2\2\2!\"\t\2\2\2\"\7"+
		"\3\2\2\2\6\13\23\33\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}