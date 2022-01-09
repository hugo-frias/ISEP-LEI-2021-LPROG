// Generated from C:/Users/migue/Documents/tp_lprog2021/tp_lprog\tarefasautomaticas.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tarefasautomaticasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NCLIENTE=2, NPRODUTO=3, QUANTIDADE=4, NL=5, WS=6;
	public static final int
		RULE_regraTA = 0, RULE_tarefaAutomatica = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"regraTA", "tarefaAutomatica"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NCLIENTE", "NPRODUTO", "QUANTIDADE", "NL", "WS"
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
	public String getGrammarFileName() { return "tarefasautomaticas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tarefasautomaticasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RegraTAContext extends ParserRuleContext {
		public RegraTAContext regraTA() {
			return getRuleContext(RegraTAContext.class,0);
		}
		public TarefaAutomaticaContext tarefaAutomatica() {
			return getRuleContext(TarefaAutomaticaContext.class,0);
		}
		public TerminalNode NL() { return getToken(tarefasautomaticasParser.NL, 0); }
		public RegraTAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regraTA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tarefasautomaticasListener ) ((tarefasautomaticasListener)listener).enterRegraTA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tarefasautomaticasListener ) ((tarefasautomaticasListener)listener).exitRegraTA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tarefasautomaticasVisitor ) return ((tarefasautomaticasVisitor<? extends T>)visitor).visitRegraTA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegraTAContext regraTA() throws RecognitionException {
		return regraTA(0);
	}

	private RegraTAContext regraTA(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RegraTAContext _localctx = new RegraTAContext(_ctx, _parentState);
		RegraTAContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_regraTA, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(11);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RegraTAContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_regraTA);
					setState(5);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(6);
					tarefaAutomatica();
					setState(7);
					match(NL);
					}
					} 
				}
				setState(13);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class TarefaAutomaticaContext extends ParserRuleContext {
		public TarefaAutomaticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tarefaAutomatica; }
	 
		public TarefaAutomaticaContext() { }
		public void copyFrom(TarefaAutomaticaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RunScriptContext extends TarefaAutomaticaContext {
		public TerminalNode NCLIENTE() { return getToken(tarefasautomaticasParser.NCLIENTE, 0); }
		public TerminalNode NPRODUTO() { return getToken(tarefasautomaticasParser.NPRODUTO, 0); }
		public TerminalNode QUANTIDADE() { return getToken(tarefasautomaticasParser.QUANTIDADE, 0); }
		public RunScriptContext(TarefaAutomaticaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tarefasautomaticasListener ) ((tarefasautomaticasListener)listener).enterRunScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tarefasautomaticasListener ) ((tarefasautomaticasListener)listener).exitRunScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tarefasautomaticasVisitor ) return ((tarefasautomaticasVisitor<? extends T>)visitor).visitRunScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TarefaAutomaticaContext tarefaAutomatica() throws RecognitionException {
		TarefaAutomaticaContext _localctx = new TarefaAutomaticaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tarefaAutomatica);
		try {
			_localctx = new RunScriptContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(NCLIENTE);
			setState(15);
			match(T__0);
			setState(16);
			match(NPRODUTO);
			setState(17);
			match(T__0);
			setState(18);
			match(QUANTIDADE);
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
		case 0:
			return regraTA_sempred((RegraTAContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean regraTA_sempred(RegraTAContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\27\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\2\3\2\4\2\4\2\2\2\25\2\6\3\2\2\2\4\20\3\2\2\2\6\r\b\2\1\2\7"+
		"\b\f\4\2\2\b\t\5\4\3\2\t\n\7\7\2\2\n\f\3\2\2\2\13\7\3\2\2\2\f\17\3\2\2"+
		"\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\r\3\2\2\2\20\21\7\4\2\2\21"+
		"\22\7\3\2\2\22\23\7\5\2\2\23\24\7\3\2\2\24\25\7\6\2\2\25\5\3\2\2\2\3\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}