// Generated from C:/Users/Hugo/Documents/tp_lprog2021/tp_lprog\u005Cus1004.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class us1004Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "CATALOGOERRO", "SERROCOMUNICACAO", "SERROEQUIPAMENTO", "SERROAPLICACAO", 
			"CATALOGOFINANCA", "SVENDA", "SDESCONTO", "CATALOGORH", "CATALOGODADOS", 
			"SNIB", "SRESIDENCIA", "SESTADOCIVIL", "SHABILITACOESLITERARIAS", "CATALOGOFERIAS", 
			"SFERIAS", "SFALTAPASSADA", "SFALTAFUTURA", "NIB", "IMAGEM", "INTEIRO", 
			"PALAVRA", "SEP", "NL", "WS"
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


	public us1004Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "us1004.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u021f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\6\24\u01fc\n\24\r\24\16\24\u01fd\3\25\6\25\u0201\n\25\r\25\16"+
		"\25\u0202\3\25\3\25\3\25\3\25\3\25\3\26\6\26\u020b\n\26\r\26\16\26\u020c"+
		"\3\27\7\27\u0210\n\27\f\27\16\27\u0213\13\27\3\30\3\30\3\31\3\31\3\32"+
		"\6\32\u021a\n\32\r\32\16\32\u021b\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\3\2\7\3\2\62;\5\2\"\"C\\c|\7\2\"\"\62"+
		";C\\aac|\3\2\f\f\5\2\13\13\17\17\"\"\2\u0223\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\3\65\3\2\2\2\5\67\3\2\2\2\7K\3\2\2\2\tl\3\2\2\2\13\u0084\3\2\2\2\r"+
		"\u00a3\3\2\2\2\17\u00b8\3\2\2\2\21\u00df\3\2\2\2\23\u00e9\3\2\2\2\25\u0106"+
		"\3\2\2\2\27\u0122\3\2\2\2\31\u0133\3\2\2\2\33\u014c\3\2\2\2\35\u017a\3"+
		"\2\2\2\37\u019f\3\2\2\2!\u01b6\3\2\2\2#\u01c4\3\2\2\2%\u01de\3\2\2\2\'"+
		"\u01f7\3\2\2\2)\u0200\3\2\2\2+\u020a\3\2\2\2-\u0211\3\2\2\2/\u0214\3\2"+
		"\2\2\61\u0216\3\2\2\2\63\u0219\3\2\2\2\65\66\7.\2\2\66\4\3\2\2\2\678\7"+
		"T\2\289\7g\2\29:\7r\2\2:;\7q\2\2;<\7t\2\2<=\7v\2\2=>\7c\2\2>?\7t\2\2?"+
		"@\7\"\2\2@A\7G\2\2AB\7t\2\2BC\7t\2\2CD\7q\2\2DE\7\61\2\2EF\7H\2\2FG\7"+
		"c\2\2GH\7n\2\2HI\7j\2\2IJ\7c\2\2J\6\3\2\2\2KL\7T\2\2LM\7g\2\2MN\7r\2\2"+
		"NO\7q\2\2OP\7t\2\2PQ\7v\2\2QR\7c\2\2RS\7t\2\2ST\7\"\2\2TU\7c\2\2UV\7p"+
		"\2\2VW\7q\2\2WX\7o\2\2XY\7c\2\2YZ\7n\2\2Z[\7k\2\2[\\\7c\2\2\\]\7\"\2\2"+
		"]^\7f\2\2^_\7g\2\2_`\7\"\2\2`a\7e\2\2ab\7q\2\2bc\7o\2\2cd\7w\2\2de\7p"+
		"\2\2ef\7k\2\2fg\7e\2\2gh\7c\2\2hi\7e\2\2ij\7c\2\2jk\7q\2\2k\b\3\2\2\2"+
		"lm\7C\2\2mn\7p\2\2no\7q\2\2op\7o\2\2pq\7c\2\2qr\7n\2\2rs\7k\2\2st\7c\2"+
		"\2tu\7\"\2\2uv\7f\2\2vw\7g\2\2wx\7\"\2\2xy\7g\2\2yz\7s\2\2z{\7w\2\2{|"+
		"\7k\2\2|}\7r\2\2}~\7c\2\2~\177\7o\2\2\177\u0080\7g\2\2\u0080\u0081\7p"+
		"\2\2\u0081\u0082\7v\2\2\u0082\u0083\7q\2\2\u0083\n\3\2\2\2\u0084\u0085"+
		"\7T\2\2\u0085\u0086\7g\2\2\u0086\u0087\7r\2\2\u0087\u0088\7q\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7v\2\2\u008a\u008b\7c\2\2\u008b\u008c\7t\2\2"+
		"\u008c\u008d\7\"\2\2\u008d\u008e\7c\2\2\u008e\u008f\7p\2\2\u008f\u0090"+
		"\7q\2\2\u0090\u0091\7o\2\2\u0091\u0092\7c\2\2\u0092\u0093\7n\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7c\2\2\u0095\u0096\7\"\2\2\u0096\u0097\7g\2"+
		"\2\u0097\u0098\7o\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7c\2\2\u009a\u009b"+
		"\7r\2\2\u009b\u009c\7n\2\2\u009c\u009d\7k\2\2\u009d\u009e\7e\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7q\2\2"+
		"\u00a2\f\3\2\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7v"+
		"\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa"+
		"\7g\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7\"\2\2\u00ae\u00af\7F\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7u\2"+
		"\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7u\2\2\u00b7\16\3\2\2\2\u00b8\u00b9"+
		"\7T\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7s\2\2\u00bb\u00bc\7w\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7t\2\2"+
		"\u00c0\u00c1\7\"\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4"+
		"\7v\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7c\2\2\u00c7"+
		"\u00c8\7q\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7c\2"+
		"\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7\"\2\2\u00ce\u00cf"+
		"\7x\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7f\2\2\u00d2"+
		"\u00d3\7c\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7q\2"+
		"\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\7i\2\2\u00d9\u00da"+
		"\7t\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7u\2\2\u00dd"+
		"\u00de\7q\2\2\u00de\20\3\2\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7F\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7q\2\2"+
		"\u00e5\u00e6\7p\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7q\2\2\u00e8\22\3\2"+
		"\2\2\u00e9\u00ea\7R\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed"+
		"\7k\2\2\u00ed\u00ee\7f\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7u\2\2\u00f0"+
		"\u00f1\7\"\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7u\2"+
		"\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\7T\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8"+
		"\7e\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7u\2\2\u00fb"+
		"\u00fc\7q\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7\"\2\2\u00fe\u00ff\7J\2"+
		"\2\u00ff\u0100\7w\2\2\u0100\u0101\7o\2\2\u0101\u0102\7c\2\2\u0102\u0103"+
		"\7p\2\2\u0103\u0104\7q\2\2\u0104\u0105\7u\2\2\u0105\24\3\2\2\2\u0106\u0107"+
		"\7C\2\2\u0107\u0108\7n\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7t\2\2\u010b\u010c\7c\2\2\u010c\u010d\7e\2\2\u010d\u010e\7c\2\2"+
		"\u010e\u010f\7q\2\2\u010f\u0110\7\"\2\2\u0110\u0111\7f\2\2\u0111\u0112"+
		"\7g\2\2\u0112\u0113\7\"\2\2\u0113\u0114\7F\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7f\2\2\u0116\u0117\7q\2\2\u0117\u0118\7u\2\2\u0118\u0119\7\"\2"+
		"\2\u0119\u011a\7R\2\2\u011a\u011b\7g\2\2\u011b\u011c\7u\2\2\u011c\u011d"+
		"\7u\2\2\u011d\u011e\7q\2\2\u011e\u011f\7c\2\2\u011f\u0120\7k\2\2\u0120"+
		"\u0121\7u\2\2\u0121\26\3\2\2\2\u0122\u0123\7C\2\2\u0123\u0124\7n\2\2\u0124"+
		"\u0125\7v\2\2\u0125\u0126\7g\2\2\u0126\u0127\7t\2\2\u0127\u0128\7c\2\2"+
		"\u0128\u0129\7e\2\2\u0129\u012a\7c\2\2\u012a\u012b\7q\2\2\u012b\u012c"+
		"\7\"\2\2\u012c\u012d\7f\2\2\u012d\u012e\7g\2\2\u012e\u012f\7\"\2\2\u012f"+
		"\u0130\7P\2\2\u0130\u0131\7K\2\2\u0131\u0132\7D\2\2\u0132\30\3\2\2\2\u0133"+
		"\u0134\7C\2\2\u0134\u0135\7n\2\2\u0135\u0136\7v\2\2\u0136\u0137\7g\2\2"+
		"\u0137\u0138\7t\2\2\u0138\u0139\7c\2\2\u0139\u013a\7e\2\2\u013a\u013b"+
		"\7c\2\2\u013b\u013c\7q\2\2\u013c\u013d\7\"\2\2\u013d\u013e\7f\2\2\u013e"+
		"\u013f\7g\2\2\u013f\u0140\7\"\2\2\u0140\u0141\7T\2\2\u0141\u0142\7g\2"+
		"\2\u0142\u0143\7u\2\2\u0143\u0144\7k\2\2\u0144\u0145\7f\2\2\u0145\u0146"+
		"\7g\2\2\u0146\u0147\7p\2\2\u0147\u0148\7e\2\2\u0148\u0149\7k\2\2\u0149"+
		"\u014a\7c\2\2\u014a\u014b\7u\2\2\u014b\32\3\2\2\2\u014c\u014d\7C\2\2\u014d"+
		"\u014e\7n\2\2\u014e\u014f\7v\2\2\u014f\u0150\7g\2\2\u0150\u0151\7t\2\2"+
		"\u0151\u0152\7c\2\2\u0152\u0153\7e\2\2\u0153\u0154\7c\2\2\u0154\u0155"+
		"\7q\2\2\u0155\u0156\7\"\2\2\u0156\u0157\7f\2\2\u0157\u0158\7g\2\2\u0158"+
		"\u0159\7\"\2\2\u0159\u015a\7G\2\2\u015a\u015b\7u\2\2\u015b\u015c\7v\2"+
		"\2\u015c\u015d\7c\2\2\u015d\u015e\7f\2\2\u015e\u015f\7q\2\2\u015f\u0160"+
		"\7\"\2\2\u0160\u0161\7E\2\2\u0161\u0162\7k\2\2\u0162\u0163\7x\2\2\u0163"+
		"\u0164\7k\2\2\u0164\u0165\7n\2\2\u0165\u0166\7\"\2\2\u0166\u0167\7r\2"+
		"\2\u0167\u0168\7c\2\2\u0168\u0169\7t\2\2\u0169\u016a\7c\2\2\u016a\u016b"+
		"\7\"\2\2\u016b\u016c\7g\2\2\u016c\u016d\7h\2\2\u016d\u016e\7g\2\2\u016e"+
		"\u016f\7k\2\2\u016f\u0170\7v\2\2\u0170\u0171\7q\2\2\u0171\u0172\7u\2\2"+
		"\u0172\u0173\7\"\2\2\u0173\u0174\7f\2\2\u0174\u0175\7g\2\2\u0175\u0176"+
		"\7\"\2\2\u0176\u0177\7K\2\2\u0177\u0178\7T\2\2\u0178\u0179\7U\2\2\u0179"+
		"\34\3\2\2\2\u017a\u017b\7C\2\2\u017b\u017c\7n\2\2\u017c\u017d\7v\2\2\u017d"+
		"\u017e\7g\2\2\u017e\u017f\7t\2\2\u017f\u0180\7c\2\2\u0180\u0181\7e\2\2"+
		"\u0181\u0182\7c\2\2\u0182\u0183\7q\2\2\u0183\u0184\7\"\2\2\u0184\u0185"+
		"\7f\2\2\u0185\u0186\7g\2\2\u0186\u0187\7\"\2\2\u0187\u0188\7J\2\2\u0188"+
		"\u0189\7c\2\2\u0189\u018a\7d\2\2\u018a\u018b\7k\2\2\u018b\u018c\7n\2\2"+
		"\u018c\u018d\7k\2\2\u018d\u018e\7v\2\2\u018e\u018f\7c\2\2\u018f\u0190"+
		"\7e\2\2\u0190\u0191\7q\2\2\u0191\u0192\7g\2\2\u0192\u0193\7u\2\2\u0193"+
		"\u0194\7\"\2\2\u0194\u0195\7N\2\2\u0195\u0196\7k\2\2\u0196\u0197\7v\2"+
		"\2\u0197\u0198\7g\2\2\u0198\u0199\7t\2\2\u0199\u019a\7c\2\2\u019a\u019b"+
		"\7t\2\2\u019b\u019c\7k\2\2\u019c\u019d\7c\2\2\u019d\u019e\7u\2\2\u019e"+
		"\36\3\2\2\2\u019f\u01a0\7H\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2\7t\2\2\u01a2"+
		"\u01a3\7k\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7u\2\2\u01a5\u01a6\7\"\2"+
		"\2\u01a6\u01a7\7g\2\2\u01a7\u01a8\7\"\2\2\u01a8\u01a9\7L\2\2\u01a9\u01aa"+
		"\7w\2\2\u01aa\u01ab\7u\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7k\2\2\u01ad"+
		"\u01ae\7h\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7e\2\2\u01b0\u01b1\7c\2\2"+
		"\u01b1\u01b2\7e\2\2\u01b2\u01b3\7q\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5"+
		"\7u\2\2\u01b5 \3\2\2\2\u01b6\u01b7\7O\2\2\u01b7\u01b8\7c\2\2\u01b8\u01b9"+
		"\7t\2\2\u01b9\u01ba\7e\2\2\u01ba\u01bb\7c\2\2\u01bb\u01bc\7t\2\2\u01bc"+
		"\u01bd\7\"\2\2\u01bd\u01be\7H\2\2\u01be\u01bf\7g\2\2\u01bf\u01c0\7t\2"+
		"\2\u01c0\u01c1\7k\2\2\u01c1\u01c2\7c\2\2\u01c2\u01c3\7u\2\2\u01c3\"\3"+
		"\2\2\2\u01c4\u01c5\7L\2\2\u01c5\u01c6\7w\2\2\u01c6\u01c7\7u\2\2\u01c7"+
		"\u01c8\7v\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca\7h\2\2\u01ca\u01cb\7k\2\2"+
		"\u01cb\u01cc\7e\2\2\u01cc\u01cd\7c\2\2\u01cd\u01ce\7t\2\2\u01ce\u01cf"+
		"\7\"\2\2\u01cf\u01d0\7h\2\2\u01d0\u01d1\7c\2\2\u01d1\u01d2\7n\2\2\u01d2"+
		"\u01d3\7v\2\2\u01d3\u01d4\7c\2\2\u01d4\u01d5\7\"\2\2\u01d5\u01d6\7q\2"+
		"\2\u01d6\u01d7\7e\2\2\u01d7\u01d8\7q\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da"+
		"\7t\2\2\u01da\u01db\7k\2\2\u01db\u01dc\7f\2\2\u01dc\u01dd\7c\2\2\u01dd"+
		"$\3\2\2\2\u01de\u01df\7K\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7h\2\2\u01e1"+
		"\u01e2\7q\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4\7o\2\2\u01e4\u01e5\7c\2\2"+
		"\u01e5\u01e6\7t\2\2\u01e6\u01e7\7\"\2\2\u01e7\u01e8\7c\2\2\u01e8\u01e9"+
		"\7w\2\2\u01e9\u01ea\7u\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec\7p\2\2\u01ec"+
		"\u01ed\7e\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7c\2\2\u01ef\u01f0\7\"\2"+
		"\2\u01f0\u01f1\7h\2\2\u01f1\u01f2\7w\2\2\u01f2\u01f3\7v\2\2\u01f3\u01f4"+
		"\7w\2\2\u01f4\u01f5\7t\2\2\u01f5\u01f6\7c\2\2\u01f6&\3\2\2\2\u01f7\u01f8"+
		"\7R\2\2\u01f8\u01f9\7V\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01fc\t\2\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe(\3\2\2\2\u01ff\u0201\t\3\2\2\u0200\u01ff\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0205\7\60\2\2\u0205\u0206\7l\2\2\u0206\u0207\7r\2\2\u0207\u0208\7i\2"+
		"\2\u0208*\3\2\2\2\u0209\u020b\t\2\2\2\u020a\u0209\3\2\2\2\u020b\u020c"+
		"\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d,\3\2\2\2\u020e"+
		"\u0210\t\4\2\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212.\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215"+
		"\7/\2\2\u0215\60\3\2\2\2\u0216\u0217\t\5\2\2\u0217\62\3\2\2\2\u0218\u021a"+
		"\t\6\2\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\b\32\2\2\u021e\64\3\2\2"+
		"\2\b\2\u01fd\u0202\u020c\u0211\u021b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}