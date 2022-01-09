// Generated from C:/Users/Hugo/Documents/tp_lprog2021/tp_lprog\u005Cus1004.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class us1004Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CATALOGOERRO=2, SERROCOMUNICACAO=3, SERROEQUIPAMENTO=4, SERROAPLICACAO=5, 
		CATALOGOFINANCA=6, SVENDA=7, SDESCONTO=8, CATALOGORH=9, CATALOGODADOS=10, 
		SNIB=11, SRESIDENCIA=12, SESTADOCIVIL=13, SHABILITACOESLITERARIAS=14, 
		CATALOGOFERIAS=15, SFERIAS=16, SFALTAPASSADA=17, SFALTAFUTURA=18, NIB=19, 
		IMAGEM=20, INTEIRO=21, PALAVRA=22, SEP=23, NL=24, WS=25;
	public static final int
		RULE_regra = 0, RULE_catalogo = 1, RULE_catalogoErro = 2, RULE_sErroEquipamento = 3, 
		RULE_sErroComunicacao = 4, RULE_sErroAplicacao = 5, RULE_anexoAnomalia = 6, 
		RULE_catalogoFinancas = 7, RULE_sVenda = 8, RULE_sDesconto = 9, RULE_catalogoRh = 10, 
		RULE_catalogoDados = 11, RULE_sNIB = 12, RULE_sResidencia = 13, RULE_sEstadoCivil = 14, 
		RULE_sHabilitacoesLiterarias = 15, RULE_catalogoFerias = 16, RULE_sFerias = 17, 
		RULE_sFaltaPassada = 18, RULE_sFaltaFutura = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"regra", "catalogo", "catalogoErro", "sErroEquipamento", "sErroComunicacao", 
			"sErroAplicacao", "anexoAnomalia", "catalogoFinancas", "sVenda", "sDesconto", 
			"catalogoRh", "catalogoDados", "sNIB", "sResidencia", "sEstadoCivil", 
			"sHabilitacoesLiterarias", "catalogoFerias", "sFerias", "sFaltaPassada", 
			"sFaltaFutura"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'Reportar Erro/Falha'", "'Reportar anomalia de comunicacao'", 
			"'Anomalia de equipamento'", "'Reportar anomalia em aplicacao'", "'Cotacoes e Descontos'", 
			"'Requerer cotacao para venda por grosso'", "'sDesconto'", "'Pedidos aos Recursos Humanos'", 
			"'Alteracao de Dados Pessoais'", "'Alteracao de NIB'", "'Alteracao de Residencias'", 
			"'Alteracao de Estado Civil para efeitos de IRS'", "'Alteracao de Habilitacoes Literarias'", 
			"'Ferias e Justificacoes'", "'Marcar Ferias'", "'Justificar falta ocorrida'", 
			"'Informar ausencia futura'", null, null, null, null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CATALOGOERRO", "SERROCOMUNICACAO", "SERROEQUIPAMENTO", "SERROAPLICACAO", 
			"CATALOGOFINANCA", "SVENDA", "SDESCONTO", "CATALOGORH", "CATALOGODADOS", 
			"SNIB", "SRESIDENCIA", "SESTADOCIVIL", "SHABILITACOESLITERARIAS", "CATALOGOFERIAS", 
			"SFERIAS", "SFALTAPASSADA", "SFALTAFUTURA", "NIB", "IMAGEM", "INTEIRO", 
			"PALAVRA", "SEP", "NL", "WS"
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
	public String getGrammarFileName() { return "us1004.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public us1004Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RegraContext extends ParserRuleContext {
		public RegraContext regra() {
			return getRuleContext(RegraContext.class,0);
		}
		public CatalogoContext catalogo() {
			return getRuleContext(CatalogoContext.class,0);
		}
		public TerminalNode NL() { return getToken(us1004Parser.NL, 0); }
		public RegraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterRegra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitRegra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitRegra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegraContext regra() throws RecognitionException {
		return regra(0);
	}

	private RegraContext regra(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RegraContext _localctx = new RegraContext(_ctx, _parentState);
		RegraContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_regra, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RegraContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_regra);
					setState(41);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(42);
					catalogo();
					setState(43);
					match(NL);
					}
					} 
				}
				setState(49);
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

	public static class CatalogoContext extends ParserRuleContext {
		public CatalogoErroContext catalogoErro() {
			return getRuleContext(CatalogoErroContext.class,0);
		}
		public CatalogoFinancasContext catalogoFinancas() {
			return getRuleContext(CatalogoFinancasContext.class,0);
		}
		public CatalogoRhContext catalogoRh() {
			return getRuleContext(CatalogoRhContext.class,0);
		}
		public CatalogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalogo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterCatalogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitCatalogo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitCatalogo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatalogoContext catalogo() throws RecognitionException {
		CatalogoContext _localctx = new CatalogoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_catalogo);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATALOGOERRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				catalogoErro();
				}
				break;
			case CATALOGOFINANCA:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				catalogoFinancas();
				}
				break;
			case CATALOGORH:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				catalogoRh();
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

	public static class CatalogoErroContext extends ParserRuleContext {
		public TerminalNode CATALOGOERRO() { return getToken(us1004Parser.CATALOGOERRO, 0); }
		public List<TerminalNode> NL() { return getTokens(us1004Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(us1004Parser.NL, i);
		}
		public TerminalNode SERROCOMUNICACAO() { return getToken(us1004Parser.SERROCOMUNICACAO, 0); }
		public SErroComunicacaoContext sErroComunicacao() {
			return getRuleContext(SErroComunicacaoContext.class,0);
		}
		public TerminalNode SERROEQUIPAMENTO() { return getToken(us1004Parser.SERROEQUIPAMENTO, 0); }
		public SErroEquipamentoContext sErroEquipamento() {
			return getRuleContext(SErroEquipamentoContext.class,0);
		}
		public TerminalNode SERROAPLICACAO() { return getToken(us1004Parser.SERROAPLICACAO, 0); }
		public SErroAplicacaoContext sErroAplicacao() {
			return getRuleContext(SErroAplicacaoContext.class,0);
		}
		public CatalogoErroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalogoErro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterCatalogoErro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitCatalogoErro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitCatalogoErro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatalogoErroContext catalogoErro() throws RecognitionException {
		CatalogoErroContext _localctx = new CatalogoErroContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_catalogoErro);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(CATALOGOERRO);
				setState(56);
				match(NL);
				setState(57);
				match(SERROCOMUNICACAO);
				setState(58);
				match(NL);
				setState(59);
				sErroComunicacao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(CATALOGOERRO);
				setState(61);
				match(NL);
				setState(62);
				match(SERROEQUIPAMENTO);
				setState(63);
				match(NL);
				setState(64);
				sErroEquipamento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(CATALOGOERRO);
				setState(66);
				match(NL);
				setState(67);
				match(SERROAPLICACAO);
				setState(68);
				match(NL);
				setState(69);
				sErroAplicacao();
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

	public static class SErroEquipamentoContext extends ParserRuleContext {
		public SErroEquipamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sErroEquipamento; }
	 
		public SErroEquipamentoContext() { }
		public void copyFrom(SErroEquipamentoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FaltaNumEquipamentoContext extends SErroEquipamentoContext {
		public List<TerminalNode> PALAVRA() { return getTokens(us1004Parser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(us1004Parser.PALAVRA, i);
		}
		public List<TerminalNode> SEP() { return getTokens(us1004Parser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(us1004Parser.SEP, i);
		}
		public FaltaNumEquipamentoContext(SErroEquipamentoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterFaltaNumEquipamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitFaltaNumEquipamento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitFaltaNumEquipamento(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidoEquipAnomaliaContext extends SErroEquipamentoContext {
		public List<TerminalNode> PALAVRA() { return getTokens(us1004Parser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(us1004Parser.PALAVRA, i);
		}
		public List<TerminalNode> SEP() { return getTokens(us1004Parser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(us1004Parser.SEP, i);
		}
		public TerminalNode INTEIRO() { return getToken(us1004Parser.INTEIRO, 0); }
		public AnexoAnomaliaContext anexoAnomalia() {
			return getRuleContext(AnexoAnomaliaContext.class,0);
		}
		public ValidoEquipAnomaliaContext(SErroEquipamentoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoEquipAnomalia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoEquipAnomalia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoEquipAnomalia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidoEquipContext extends SErroEquipamentoContext {
		public List<TerminalNode> PALAVRA() { return getTokens(us1004Parser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(us1004Parser.PALAVRA, i);
		}
		public List<TerminalNode> SEP() { return getTokens(us1004Parser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(us1004Parser.SEP, i);
		}
		public TerminalNode INTEIRO() { return getToken(us1004Parser.INTEIRO, 0); }
		public ValidoEquipContext(SErroEquipamentoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoEquip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoEquip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoEquip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FaltaTipoAnomaliaContext extends SErroEquipamentoContext {
		public List<TerminalNode> PALAVRA() { return getTokens(us1004Parser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(us1004Parser.PALAVRA, i);
		}
		public List<TerminalNode> SEP() { return getTokens(us1004Parser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(us1004Parser.SEP, i);
		}
		public TerminalNode INTEIRO() { return getToken(us1004Parser.INTEIRO, 0); }
		public FaltaTipoAnomaliaContext(SErroEquipamentoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterFaltaTipoAnomalia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitFaltaTipoAnomalia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitFaltaTipoAnomalia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SErroEquipamentoContext sErroEquipamento() throws RecognitionException {
		SErroEquipamentoContext _localctx = new SErroEquipamentoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sErroEquipamento);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ValidoEquipAnomaliaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(PALAVRA);
				setState(73);
				match(SEP);
				setState(74);
				match(PALAVRA);
				setState(75);
				match(SEP);
				setState(76);
				match(INTEIRO);
				setState(77);
				match(SEP);
				setState(78);
				match(PALAVRA);
				setState(79);
				match(SEP);
				setState(80);
				anexoAnomalia(0);
				}
				break;
			case 2:
				_localctx = new ValidoEquipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(PALAVRA);
				setState(82);
				match(SEP);
				setState(83);
				match(PALAVRA);
				setState(84);
				match(SEP);
				setState(85);
				match(INTEIRO);
				setState(86);
				match(SEP);
				setState(87);
				match(PALAVRA);
				}
				break;
			case 3:
				_localctx = new FaltaTipoAnomaliaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(PALAVRA);
				setState(89);
				match(SEP);
				setState(90);
				match(INTEIRO);
				setState(91);
				match(SEP);
				setState(92);
				match(PALAVRA);
				}
				break;
			case 4:
				_localctx = new FaltaNumEquipamentoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(PALAVRA);
				setState(94);
				match(SEP);
				setState(95);
				match(PALAVRA);
				setState(96);
				match(SEP);
				setState(97);
				match(PALAVRA);
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

	public static class SErroComunicacaoContext extends ParserRuleContext {
		public SErroComunicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sErroComunicacao; }
	 
		public SErroComunicacaoContext() { }
		public void copyFrom(SErroComunicacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InvalidoErroComunicacaoContext extends SErroComunicacaoContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public InvalidoErroComunicacaoContext(SErroComunicacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterInvalidoErroComunicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitInvalidoErroComunicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitInvalidoErroComunicacao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidoErroComunicacaoContext extends SErroComunicacaoContext {
		public List<TerminalNode> PALAVRA() { return getTokens(us1004Parser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(us1004Parser.PALAVRA, i);
		}
		public TerminalNode SEP() { return getToken(us1004Parser.SEP, 0); }
		public ValidoErroComunicacaoContext(SErroComunicacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoErroComunicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoErroComunicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoErroComunicacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SErroComunicacaoContext sErroComunicacao() throws RecognitionException {
		SErroComunicacaoContext _localctx = new SErroComunicacaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sErroComunicacao);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ValidoErroComunicacaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(PALAVRA);
				setState(101);
				match(SEP);
				setState(102);
				match(PALAVRA);
				}
				break;
			case 2:
				_localctx = new InvalidoErroComunicacaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(PALAVRA);
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

	public static class SErroAplicacaoContext extends ParserRuleContext {
		public SErroAplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sErroAplicacao; }
	 
		public SErroAplicacaoContext() { }
		public void copyFrom(SErroAplicacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValidoErroAplicacaoContext extends SErroAplicacaoContext {
		public List<TerminalNode> PALAVRA() { return getTokens(us1004Parser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(us1004Parser.PALAVRA, i);
		}
		public TerminalNode SEP() { return getToken(us1004Parser.SEP, 0); }
		public ValidoErroAplicacaoContext(SErroAplicacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoErroAplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoErroAplicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoErroAplicacao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvalidoErroAplicacaoContext extends SErroAplicacaoContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public InvalidoErroAplicacaoContext(SErroAplicacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterInvalidoErroAplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitInvalidoErroAplicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitInvalidoErroAplicacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SErroAplicacaoContext sErroAplicacao() throws RecognitionException {
		SErroAplicacaoContext _localctx = new SErroAplicacaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sErroAplicacao);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ValidoErroAplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(PALAVRA);
				setState(107);
				match(SEP);
				setState(108);
				match(PALAVRA);
				}
				break;
			case 2:
				_localctx = new InvalidoErroAplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(PALAVRA);
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

	public static class AnexoAnomaliaContext extends ParserRuleContext {
		public TerminalNode IMAGEM() { return getToken(us1004Parser.IMAGEM, 0); }
		public AnexoAnomaliaContext anexoAnomalia() {
			return getRuleContext(AnexoAnomaliaContext.class,0);
		}
		public AnexoAnomaliaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anexoAnomalia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterAnexoAnomalia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitAnexoAnomalia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitAnexoAnomalia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnexoAnomaliaContext anexoAnomalia() throws RecognitionException {
		return anexoAnomalia(0);
	}

	private AnexoAnomaliaContext anexoAnomalia(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AnexoAnomaliaContext _localctx = new AnexoAnomaliaContext(_ctx, _parentState);
		AnexoAnomaliaContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_anexoAnomalia, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			match(IMAGEM);
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AnexoAnomaliaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_anexoAnomalia);
					setState(115);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(116);
					match(T__0);
					setState(117);
					match(IMAGEM);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class CatalogoFinancasContext extends ParserRuleContext {
		public TerminalNode CATALOGOFINANCA() { return getToken(us1004Parser.CATALOGOFINANCA, 0); }
		public List<TerminalNode> NL() { return getTokens(us1004Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(us1004Parser.NL, i);
		}
		public TerminalNode SVENDA() { return getToken(us1004Parser.SVENDA, 0); }
		public SVendaContext sVenda() {
			return getRuleContext(SVendaContext.class,0);
		}
		public TerminalNode SDESCONTO() { return getToken(us1004Parser.SDESCONTO, 0); }
		public SDescontoContext sDesconto() {
			return getRuleContext(SDescontoContext.class,0);
		}
		public CatalogoFinancasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalogoFinancas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterCatalogoFinancas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitCatalogoFinancas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitCatalogoFinancas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatalogoFinancasContext catalogoFinancas() throws RecognitionException {
		CatalogoFinancasContext _localctx = new CatalogoFinancasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_catalogoFinancas);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(CATALOGOFINANCA);
				setState(124);
				match(NL);
				setState(125);
				match(SVENDA);
				setState(126);
				match(NL);
				setState(127);
				sVenda();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(CATALOGOFINANCA);
				setState(129);
				match(NL);
				setState(130);
				match(SDESCONTO);
				setState(131);
				match(NL);
				setState(132);
				sDesconto();
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

	public static class SVendaContext extends ParserRuleContext {
		public SVendaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sVenda; }
	 
		public SVendaContext() { }
		public void copyFrom(SVendaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValidoSVendaContext extends SVendaContext {
		public List<TerminalNode> PALAVRA() { return getTokens(us1004Parser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(us1004Parser.PALAVRA, i);
		}
		public TerminalNode SEP() { return getToken(us1004Parser.SEP, 0); }
		public ValidoSVendaContext(SVendaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoSVenda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoSVenda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoSVenda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvalidoSVendaContext extends SVendaContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public InvalidoSVendaContext(SVendaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterInvalidoSVenda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitInvalidoSVenda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitInvalidoSVenda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SVendaContext sVenda() throws RecognitionException {
		SVendaContext _localctx = new SVendaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sVenda);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ValidoSVendaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(PALAVRA);
				setState(136);
				match(SEP);
				setState(137);
				match(PALAVRA);
				}
				break;
			case 2:
				_localctx = new InvalidoSVendaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(PALAVRA);
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

	public static class SDescontoContext extends ParserRuleContext {
		public SDescontoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sDesconto; }
	 
		public SDescontoContext() { }
		public void copyFrom(SDescontoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InvalidoSDescontoContext extends SDescontoContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public InvalidoSDescontoContext(SDescontoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterInvalidoSDesconto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitInvalidoSDesconto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitInvalidoSDesconto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidoSDescontoContext extends SDescontoContext {
		public List<TerminalNode> PALAVRA() { return getTokens(us1004Parser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(us1004Parser.PALAVRA, i);
		}
		public TerminalNode SEP() { return getToken(us1004Parser.SEP, 0); }
		public ValidoSDescontoContext(SDescontoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoSDesconto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoSDesconto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoSDesconto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SDescontoContext sDesconto() throws RecognitionException {
		SDescontoContext _localctx = new SDescontoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sDesconto);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ValidoSDescontoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(PALAVRA);
				setState(142);
				match(SEP);
				setState(143);
				match(PALAVRA);
				}
				break;
			case 2:
				_localctx = new InvalidoSDescontoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(PALAVRA);
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

	public static class CatalogoRhContext extends ParserRuleContext {
		public TerminalNode CATALOGORH() { return getToken(us1004Parser.CATALOGORH, 0); }
		public List<TerminalNode> NL() { return getTokens(us1004Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(us1004Parser.NL, i);
		}
		public TerminalNode CATALOGODADOS() { return getToken(us1004Parser.CATALOGODADOS, 0); }
		public CatalogoDadosContext catalogoDados() {
			return getRuleContext(CatalogoDadosContext.class,0);
		}
		public TerminalNode CATALOGOFERIAS() { return getToken(us1004Parser.CATALOGOFERIAS, 0); }
		public CatalogoFeriasContext catalogoFerias() {
			return getRuleContext(CatalogoFeriasContext.class,0);
		}
		public CatalogoRhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalogoRh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterCatalogoRh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitCatalogoRh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitCatalogoRh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatalogoRhContext catalogoRh() throws RecognitionException {
		CatalogoRhContext _localctx = new CatalogoRhContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_catalogoRh);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(CATALOGORH);
				setState(148);
				match(NL);
				setState(149);
				match(CATALOGODADOS);
				setState(150);
				match(NL);
				setState(151);
				catalogoDados();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(CATALOGORH);
				setState(153);
				match(NL);
				setState(154);
				match(CATALOGOFERIAS);
				setState(155);
				match(NL);
				setState(156);
				catalogoFerias();
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

	public static class CatalogoDadosContext extends ParserRuleContext {
		public TerminalNode SNIB() { return getToken(us1004Parser.SNIB, 0); }
		public TerminalNode NL() { return getToken(us1004Parser.NL, 0); }
		public SNIBContext sNIB() {
			return getRuleContext(SNIBContext.class,0);
		}
		public TerminalNode SRESIDENCIA() { return getToken(us1004Parser.SRESIDENCIA, 0); }
		public SResidenciaContext sResidencia() {
			return getRuleContext(SResidenciaContext.class,0);
		}
		public TerminalNode SESTADOCIVIL() { return getToken(us1004Parser.SESTADOCIVIL, 0); }
		public SEstadoCivilContext sEstadoCivil() {
			return getRuleContext(SEstadoCivilContext.class,0);
		}
		public TerminalNode SHABILITACOESLITERARIAS() { return getToken(us1004Parser.SHABILITACOESLITERARIAS, 0); }
		public SHabilitacoesLiterariasContext sHabilitacoesLiterarias() {
			return getRuleContext(SHabilitacoesLiterariasContext.class,0);
		}
		public CatalogoDadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalogoDados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterCatalogoDados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitCatalogoDados(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitCatalogoDados(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatalogoDadosContext catalogoDados() throws RecognitionException {
		CatalogoDadosContext _localctx = new CatalogoDadosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_catalogoDados);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SNIB:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(SNIB);
				setState(160);
				match(NL);
				setState(161);
				sNIB();
				}
				break;
			case SRESIDENCIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(SRESIDENCIA);
				setState(163);
				match(NL);
				setState(164);
				sResidencia();
				}
				break;
			case SESTADOCIVIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(SESTADOCIVIL);
				setState(166);
				match(NL);
				setState(167);
				sEstadoCivil();
				}
				break;
			case SHABILITACOESLITERARIAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(SHABILITACOESLITERARIAS);
				setState(169);
				match(NL);
				setState(170);
				sHabilitacoesLiterarias();
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

	public static class SNIBContext extends ParserRuleContext {
		public SNIBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sNIB; }
	 
		public SNIBContext() { }
		public void copyFrom(SNIBContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FaltaFicheiroComprovativoContext extends SNIBContext {
		public TerminalNode NIB() { return getToken(us1004Parser.NIB, 0); }
		public FaltaFicheiroComprovativoContext(SNIBContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterFaltaFicheiroComprovativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitFaltaFicheiroComprovativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitFaltaFicheiroComprovativo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FaltaNIBContext extends SNIBContext {
		public TerminalNode IMAGEM() { return getToken(us1004Parser.IMAGEM, 0); }
		public FaltaNIBContext(SNIBContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterFaltaNIB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitFaltaNIB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitFaltaNIB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidoNIBContext extends SNIBContext {
		public TerminalNode NIB() { return getToken(us1004Parser.NIB, 0); }
		public TerminalNode SEP() { return getToken(us1004Parser.SEP, 0); }
		public TerminalNode IMAGEM() { return getToken(us1004Parser.IMAGEM, 0); }
		public ValidoNIBContext(SNIBContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoNIB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoNIB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoNIB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SNIBContext sNIB() throws RecognitionException {
		SNIBContext _localctx = new SNIBContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sNIB);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ValidoNIBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(NIB);
				setState(174);
				match(SEP);
				setState(175);
				match(IMAGEM);
				}
				break;
			case 2:
				_localctx = new FaltaFicheiroComprovativoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(NIB);
				}
				break;
			case 3:
				_localctx = new FaltaNIBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(IMAGEM);
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

	public static class SResidenciaContext extends ParserRuleContext {
		public SResidenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sResidencia; }
	 
		public SResidenciaContext() { }
		public void copyFrom(SResidenciaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FaltaFicheiroSResidenciaContext extends SResidenciaContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public FaltaFicheiroSResidenciaContext(SResidenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterFaltaFicheiroSResidencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitFaltaFicheiroSResidencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitFaltaFicheiroSResidencia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvalidoSResidenciaContext extends SResidenciaContext {
		public TerminalNode IMAGEM() { return getToken(us1004Parser.IMAGEM, 0); }
		public InvalidoSResidenciaContext(SResidenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterInvalidoSResidencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitInvalidoSResidencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitInvalidoSResidencia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidoSResidenciaContext extends SResidenciaContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public TerminalNode SEP() { return getToken(us1004Parser.SEP, 0); }
		public TerminalNode IMAGEM() { return getToken(us1004Parser.IMAGEM, 0); }
		public ValidoSResidenciaContext(SResidenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoSResidencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoSResidencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoSResidencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SResidenciaContext sResidencia() throws RecognitionException {
		SResidenciaContext _localctx = new SResidenciaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sResidencia);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ValidoSResidenciaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(PALAVRA);
				setState(181);
				match(SEP);
				setState(182);
				match(IMAGEM);
				}
				break;
			case 2:
				_localctx = new FaltaFicheiroSResidenciaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(PALAVRA);
				}
				break;
			case 3:
				_localctx = new InvalidoSResidenciaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(IMAGEM);
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

	public static class SEstadoCivilContext extends ParserRuleContext {
		public SEstadoCivilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sEstadoCivil; }
	 
		public SEstadoCivilContext() { }
		public void copyFrom(SEstadoCivilContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValidoSEstadoCivilContext extends SEstadoCivilContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public TerminalNode SEP() { return getToken(us1004Parser.SEP, 0); }
		public TerminalNode IMAGEM() { return getToken(us1004Parser.IMAGEM, 0); }
		public ValidoSEstadoCivilContext(SEstadoCivilContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoSEstadoCivil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoSEstadoCivil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoSEstadoCivil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvalidoSEstadoCivilContext extends SEstadoCivilContext {
		public TerminalNode IMAGEM() { return getToken(us1004Parser.IMAGEM, 0); }
		public InvalidoSEstadoCivilContext(SEstadoCivilContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterInvalidoSEstadoCivil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitInvalidoSEstadoCivil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitInvalidoSEstadoCivil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FaltaFicheiroSEstadoCivilContext extends SEstadoCivilContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public FaltaFicheiroSEstadoCivilContext(SEstadoCivilContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterFaltaFicheiroSEstadoCivil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitFaltaFicheiroSEstadoCivil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitFaltaFicheiroSEstadoCivil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SEstadoCivilContext sEstadoCivil() throws RecognitionException {
		SEstadoCivilContext _localctx = new SEstadoCivilContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sEstadoCivil);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ValidoSEstadoCivilContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(PALAVRA);
				setState(188);
				match(SEP);
				setState(189);
				match(IMAGEM);
				}
				break;
			case 2:
				_localctx = new FaltaFicheiroSEstadoCivilContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(PALAVRA);
				}
				break;
			case 3:
				_localctx = new InvalidoSEstadoCivilContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(IMAGEM);
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

	public static class SHabilitacoesLiterariasContext extends ParserRuleContext {
		public SHabilitacoesLiterariasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sHabilitacoesLiterarias; }
	 
		public SHabilitacoesLiterariasContext() { }
		public void copyFrom(SHabilitacoesLiterariasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FaltaFicheiroSHabilitacoesLiterariasContext extends SHabilitacoesLiterariasContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public FaltaFicheiroSHabilitacoesLiterariasContext(SHabilitacoesLiterariasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterFaltaFicheiroSHabilitacoesLiterarias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitFaltaFicheiroSHabilitacoesLiterarias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitFaltaFicheiroSHabilitacoesLiterarias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvalidoSHabilitacoesLiterariasContext extends SHabilitacoesLiterariasContext {
		public TerminalNode IMAGEM() { return getToken(us1004Parser.IMAGEM, 0); }
		public InvalidoSHabilitacoesLiterariasContext(SHabilitacoesLiterariasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterInvalidoSHabilitacoesLiterarias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitInvalidoSHabilitacoesLiterarias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitInvalidoSHabilitacoesLiterarias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidoSHabilitacoesLiterariasContext extends SHabilitacoesLiterariasContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public TerminalNode SEP() { return getToken(us1004Parser.SEP, 0); }
		public TerminalNode IMAGEM() { return getToken(us1004Parser.IMAGEM, 0); }
		public ValidoSHabilitacoesLiterariasContext(SHabilitacoesLiterariasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoSHabilitacoesLiterarias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoSHabilitacoesLiterarias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoSHabilitacoesLiterarias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SHabilitacoesLiterariasContext sHabilitacoesLiterarias() throws RecognitionException {
		SHabilitacoesLiterariasContext _localctx = new SHabilitacoesLiterariasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sHabilitacoesLiterarias);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ValidoSHabilitacoesLiterariasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(PALAVRA);
				setState(195);
				match(SEP);
				setState(196);
				match(IMAGEM);
				}
				break;
			case 2:
				_localctx = new FaltaFicheiroSHabilitacoesLiterariasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(PALAVRA);
				}
				break;
			case 3:
				_localctx = new InvalidoSHabilitacoesLiterariasContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(IMAGEM);
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

	public static class CatalogoFeriasContext extends ParserRuleContext {
		public TerminalNode SFERIAS() { return getToken(us1004Parser.SFERIAS, 0); }
		public TerminalNode NL() { return getToken(us1004Parser.NL, 0); }
		public SFeriasContext sFerias() {
			return getRuleContext(SFeriasContext.class,0);
		}
		public TerminalNode SFALTAPASSADA() { return getToken(us1004Parser.SFALTAPASSADA, 0); }
		public SFaltaPassadaContext sFaltaPassada() {
			return getRuleContext(SFaltaPassadaContext.class,0);
		}
		public TerminalNode SFALTAFUTURA() { return getToken(us1004Parser.SFALTAFUTURA, 0); }
		public SFaltaFuturaContext sFaltaFutura() {
			return getRuleContext(SFaltaFuturaContext.class,0);
		}
		public CatalogoFeriasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalogoFerias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterCatalogoFerias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitCatalogoFerias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitCatalogoFerias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatalogoFeriasContext catalogoFerias() throws RecognitionException {
		CatalogoFeriasContext _localctx = new CatalogoFeriasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_catalogoFerias);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SFERIAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(SFERIAS);
				setState(202);
				match(NL);
				setState(203);
				sFerias();
				}
				break;
			case SFALTAPASSADA:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(SFALTAPASSADA);
				setState(205);
				match(NL);
				setState(206);
				sFaltaPassada();
				}
				break;
			case SFALTAFUTURA:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(SFALTAFUTURA);
				setState(208);
				match(NL);
				setState(209);
				sFaltaFutura();
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

	public static class SFeriasContext extends ParserRuleContext {
		public SFeriasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFerias; }
	 
		public SFeriasContext() { }
		public void copyFrom(SFeriasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValidoSFeriasContext extends SFeriasContext {
		public List<TerminalNode> PALAVRA() { return getTokens(us1004Parser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(us1004Parser.PALAVRA, i);
		}
		public TerminalNode SEP() { return getToken(us1004Parser.SEP, 0); }
		public ValidoSFeriasContext(SFeriasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoSFerias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoSFerias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoSFerias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvalidoSFeriasContext extends SFeriasContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public InvalidoSFeriasContext(SFeriasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterInvalidoSFerias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitInvalidoSFerias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitInvalidoSFerias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SFeriasContext sFerias() throws RecognitionException {
		SFeriasContext _localctx = new SFeriasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sFerias);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ValidoSFeriasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(PALAVRA);
				setState(213);
				match(SEP);
				setState(214);
				match(PALAVRA);
				}
				break;
			case 2:
				_localctx = new InvalidoSFeriasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(PALAVRA);
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

	public static class SFaltaPassadaContext extends ParserRuleContext {
		public SFaltaPassadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFaltaPassada; }
	 
		public SFaltaPassadaContext() { }
		public void copyFrom(SFaltaPassadaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InvalidoSFaltaPassadoContext extends SFaltaPassadaContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public InvalidoSFaltaPassadoContext(SFaltaPassadaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterInvalidoSFaltaPassado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitInvalidoSFaltaPassado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitInvalidoSFaltaPassado(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidoSFaltaPassadoContext extends SFaltaPassadaContext {
		public List<TerminalNode> PALAVRA() { return getTokens(us1004Parser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(us1004Parser.PALAVRA, i);
		}
		public TerminalNode SEP() { return getToken(us1004Parser.SEP, 0); }
		public ValidoSFaltaPassadoContext(SFaltaPassadaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoSFaltaPassado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoSFaltaPassado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoSFaltaPassado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SFaltaPassadaContext sFaltaPassada() throws RecognitionException {
		SFaltaPassadaContext _localctx = new SFaltaPassadaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sFaltaPassada);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ValidoSFaltaPassadoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(PALAVRA);
				setState(219);
				match(SEP);
				setState(220);
				match(PALAVRA);
				}
				break;
			case 2:
				_localctx = new InvalidoSFaltaPassadoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(PALAVRA);
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

	public static class SFaltaFuturaContext extends ParserRuleContext {
		public SFaltaFuturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFaltaFutura; }
	 
		public SFaltaFuturaContext() { }
		public void copyFrom(SFaltaFuturaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InvalidoSFaltaFuturaContext extends SFaltaFuturaContext {
		public TerminalNode PALAVRA() { return getToken(us1004Parser.PALAVRA, 0); }
		public InvalidoSFaltaFuturaContext(SFaltaFuturaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterInvalidoSFaltaFutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitInvalidoSFaltaFutura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitInvalidoSFaltaFutura(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValidoSFaltaFuturaContext extends SFaltaFuturaContext {
		public List<TerminalNode> PALAVRA() { return getTokens(us1004Parser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(us1004Parser.PALAVRA, i);
		}
		public TerminalNode SEP() { return getToken(us1004Parser.SEP, 0); }
		public ValidoSFaltaFuturaContext(SFaltaFuturaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).enterValidoSFaltaFutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof us1004Listener ) ((us1004Listener)listener).exitValidoSFaltaFutura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof us1004Visitor ) return ((us1004Visitor<? extends T>)visitor).visitValidoSFaltaFutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SFaltaFuturaContext sFaltaFutura() throws RecognitionException {
		SFaltaFuturaContext _localctx = new SFaltaFuturaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sFaltaFutura);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ValidoSFaltaFuturaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(PALAVRA);
				setState(225);
				match(SEP);
				setState(226);
				match(PALAVRA);
				}
				break;
			case 2:
				_localctx = new InvalidoSFaltaFuturaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(PALAVRA);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return regra_sempred((RegraContext)_localctx, predIndex);
		case 6:
			return anexoAnomalia_sempred((AnexoAnomaliaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean regra_sempred(RegraContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean anexoAnomalia_sempred(AnexoAnomaliaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00e9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5e"+
		"\n\5\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0088\n\t\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13\3\13\5\13"+
		"\u0094\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a0\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00b5\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00bc\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00c3\n\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00ca\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d5\n"+
		"\22\3\23\3\23\3\23\3\23\5\23\u00db\n\23\3\24\3\24\3\24\3\24\5\24\u00e1"+
		"\n\24\3\25\3\25\3\25\3\25\5\25\u00e7\n\25\3\25\2\4\2\16\26\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u00f3\2*\3\2\2\2\4\67\3\2\2\2"+
		"\6H\3\2\2\2\bd\3\2\2\2\nj\3\2\2\2\fp\3\2\2\2\16r\3\2\2\2\20\u0087\3\2"+
		"\2\2\22\u008d\3\2\2\2\24\u0093\3\2\2\2\26\u009f\3\2\2\2\30\u00ad\3\2\2"+
		"\2\32\u00b4\3\2\2\2\34\u00bb\3\2\2\2\36\u00c2\3\2\2\2 \u00c9\3\2\2\2\""+
		"\u00d4\3\2\2\2$\u00da\3\2\2\2&\u00e0\3\2\2\2(\u00e6\3\2\2\2*\61\b\2\1"+
		"\2+,\f\4\2\2,-\5\4\3\2-.\7\32\2\2.\60\3\2\2\2/+\3\2\2\2\60\63\3\2\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\648\5\6\4\2\658"+
		"\5\20\t\2\668\5\26\f\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\5\3"+
		"\2\2\29:\7\4\2\2:;\7\32\2\2;<\7\5\2\2<=\7\32\2\2=I\5\n\6\2>?\7\4\2\2?"+
		"@\7\32\2\2@A\7\6\2\2AB\7\32\2\2BI\5\b\5\2CD\7\4\2\2DE\7\32\2\2EF\7\7\2"+
		"\2FG\7\32\2\2GI\5\f\7\2H9\3\2\2\2H>\3\2\2\2HC\3\2\2\2I\7\3\2\2\2JK\7\30"+
		"\2\2KL\7\31\2\2LM\7\30\2\2MN\7\31\2\2NO\7\27\2\2OP\7\31\2\2PQ\7\30\2\2"+
		"QR\7\31\2\2Re\5\16\b\2ST\7\30\2\2TU\7\31\2\2UV\7\30\2\2VW\7\31\2\2WX\7"+
		"\27\2\2XY\7\31\2\2Ye\7\30\2\2Z[\7\30\2\2[\\\7\31\2\2\\]\7\27\2\2]^\7\31"+
		"\2\2^e\7\30\2\2_`\7\30\2\2`a\7\31\2\2ab\7\30\2\2bc\7\31\2\2ce\7\30\2\2"+
		"dJ\3\2\2\2dS\3\2\2\2dZ\3\2\2\2d_\3\2\2\2e\t\3\2\2\2fg\7\30\2\2gh\7\31"+
		"\2\2hk\7\30\2\2ik\7\30\2\2jf\3\2\2\2ji\3\2\2\2k\13\3\2\2\2lm\7\30\2\2"+
		"mn\7\31\2\2nq\7\30\2\2oq\7\30\2\2pl\3\2\2\2po\3\2\2\2q\r\3\2\2\2rs\b\b"+
		"\1\2st\7\26\2\2tz\3\2\2\2uv\f\4\2\2vw\7\3\2\2wy\7\26\2\2xu\3\2\2\2y|\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|z\3\2\2\2}~\7\b\2\2~\177\7\32\2"+
		"\2\177\u0080\7\t\2\2\u0080\u0081\7\32\2\2\u0081\u0088\5\22\n\2\u0082\u0083"+
		"\7\b\2\2\u0083\u0084\7\32\2\2\u0084\u0085\7\n\2\2\u0085\u0086\7\32\2\2"+
		"\u0086\u0088\5\24\13\2\u0087}\3\2\2\2\u0087\u0082\3\2\2\2\u0088\21\3\2"+
		"\2\2\u0089\u008a\7\30\2\2\u008a\u008b\7\31\2\2\u008b\u008e\7\30\2\2\u008c"+
		"\u008e\7\30\2\2\u008d\u0089\3\2\2\2\u008d\u008c\3\2\2\2\u008e\23\3\2\2"+
		"\2\u008f\u0090\7\30\2\2\u0090\u0091\7\31\2\2\u0091\u0094\7\30\2\2\u0092"+
		"\u0094\7\30\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094\25\3\2\2"+
		"\2\u0095\u0096\7\13\2\2\u0096\u0097\7\32\2\2\u0097\u0098\7\f\2\2\u0098"+
		"\u0099\7\32\2\2\u0099\u00a0\5\30\r\2\u009a\u009b\7\13\2\2\u009b\u009c"+
		"\7\32\2\2\u009c\u009d\7\21\2\2\u009d\u009e\7\32\2\2\u009e\u00a0\5\"\22"+
		"\2\u009f\u0095\3\2\2\2\u009f\u009a\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a2"+
		"\7\r\2\2\u00a2\u00a3\7\32\2\2\u00a3\u00ae\5\32\16\2\u00a4\u00a5\7\16\2"+
		"\2\u00a5\u00a6\7\32\2\2\u00a6\u00ae\5\34\17\2\u00a7\u00a8\7\17\2\2\u00a8"+
		"\u00a9\7\32\2\2\u00a9\u00ae\5\36\20\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac"+
		"\7\32\2\2\u00ac\u00ae\5 \21\2\u00ad\u00a1\3\2\2\2\u00ad\u00a4\3\2\2\2"+
		"\u00ad\u00a7\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0"+
		"\7\25\2\2\u00b0\u00b1\7\31\2\2\u00b1\u00b5\7\26\2\2\u00b2\u00b5\7\25\2"+
		"\2\u00b3\u00b5\7\26\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\30\2\2\u00b7\u00b8\7\31"+
		"\2\2\u00b8\u00bc\7\26\2\2\u00b9\u00bc\7\30\2\2\u00ba\u00bc\7\26\2\2\u00bb"+
		"\u00b6\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\35\3\2\2"+
		"\2\u00bd\u00be\7\30\2\2\u00be\u00bf\7\31\2\2\u00bf\u00c3\7\26\2\2\u00c0"+
		"\u00c3\7\30\2\2\u00c1\u00c3\7\26\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\37\3\2\2\2\u00c4\u00c5\7\30\2\2\u00c5"+
		"\u00c6\7\31\2\2\u00c6\u00ca\7\26\2\2\u00c7\u00ca\7\30\2\2\u00c8\u00ca"+
		"\7\26\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2"+
		"\u00ca!\3\2\2\2\u00cb\u00cc\7\22\2\2\u00cc\u00cd\7\32\2\2\u00cd\u00d5"+
		"\5$\23\2\u00ce\u00cf\7\23\2\2\u00cf\u00d0\7\32\2\2\u00d0\u00d5\5&\24\2"+
		"\u00d1\u00d2\7\24\2\2\u00d2\u00d3\7\32\2\2\u00d3\u00d5\5(\25\2\u00d4\u00cb"+
		"\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5#\3\2\2\2\u00d6"+
		"\u00d7\7\30\2\2\u00d7\u00d8\7\31\2\2\u00d8\u00db\7\30\2\2\u00d9\u00db"+
		"\7\30\2\2\u00da\u00d6\3\2\2\2\u00da\u00d9\3\2\2\2\u00db%\3\2\2\2\u00dc"+
		"\u00dd\7\30\2\2\u00dd\u00de\7\31\2\2\u00de\u00e1\7\30\2\2\u00df\u00e1"+
		"\7\30\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\'\3\2\2\2\u00e2"+
		"\u00e3\7\30\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00e7\7\30\2\2\u00e5\u00e7"+
		"\7\30\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7)\3\2\2\2\26\61"+
		"\67Hdjpz\u0087\u008d\u0093\u009f\u00ad\u00b4\u00bb\u00c2\u00c9\u00d4\u00da"+
		"\u00e0\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}