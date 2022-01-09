// Generated from C:/Users/Hugo/Documents/tp_lprog2021/tp_lprog\u005Cus1004.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link us1004Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface us1004Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link us1004Parser#regra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegra(us1004Parser.RegraContext ctx);
	/**
	 * Visit a parse tree produced by {@link us1004Parser#catalogo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalogo(us1004Parser.CatalogoContext ctx);
	/**
	 * Visit a parse tree produced by {@link us1004Parser#catalogoErro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalogoErro(us1004Parser.CatalogoErroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoEquipAnomalia}
	 * labeled alternative in {@link us1004Parser#sErroEquipamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoEquipAnomalia(us1004Parser.ValidoEquipAnomaliaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoEquip}
	 * labeled alternative in {@link us1004Parser#sErroEquipamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoEquip(us1004Parser.ValidoEquipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code faltaTipoAnomalia}
	 * labeled alternative in {@link us1004Parser#sErroEquipamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltaTipoAnomalia(us1004Parser.FaltaTipoAnomaliaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code faltaNumEquipamento}
	 * labeled alternative in {@link us1004Parser#sErroEquipamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltaNumEquipamento(us1004Parser.FaltaNumEquipamentoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoErroComunicacao}
	 * labeled alternative in {@link us1004Parser#sErroComunicacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoErroComunicacao(us1004Parser.ValidoErroComunicacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invalidoErroComunicacao}
	 * labeled alternative in {@link us1004Parser#sErroComunicacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidoErroComunicacao(us1004Parser.InvalidoErroComunicacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoErroAplicacao}
	 * labeled alternative in {@link us1004Parser#sErroAplicacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoErroAplicacao(us1004Parser.ValidoErroAplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invalidoErroAplicacao}
	 * labeled alternative in {@link us1004Parser#sErroAplicacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidoErroAplicacao(us1004Parser.InvalidoErroAplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link us1004Parser#anexoAnomalia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnexoAnomalia(us1004Parser.AnexoAnomaliaContext ctx);
	/**
	 * Visit a parse tree produced by {@link us1004Parser#catalogoFinancas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalogoFinancas(us1004Parser.CatalogoFinancasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoSVenda}
	 * labeled alternative in {@link us1004Parser#sVenda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoSVenda(us1004Parser.ValidoSVendaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invalidoSVenda}
	 * labeled alternative in {@link us1004Parser#sVenda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidoSVenda(us1004Parser.InvalidoSVendaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoSDesconto}
	 * labeled alternative in {@link us1004Parser#sDesconto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoSDesconto(us1004Parser.ValidoSDescontoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invalidoSDesconto}
	 * labeled alternative in {@link us1004Parser#sDesconto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidoSDesconto(us1004Parser.InvalidoSDescontoContext ctx);
	/**
	 * Visit a parse tree produced by {@link us1004Parser#catalogoRh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalogoRh(us1004Parser.CatalogoRhContext ctx);
	/**
	 * Visit a parse tree produced by {@link us1004Parser#catalogoDados}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalogoDados(us1004Parser.CatalogoDadosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoNIB}
	 * labeled alternative in {@link us1004Parser#sNIB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoNIB(us1004Parser.ValidoNIBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code faltaFicheiroComprovativo}
	 * labeled alternative in {@link us1004Parser#sNIB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltaFicheiroComprovativo(us1004Parser.FaltaFicheiroComprovativoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code faltaNIB}
	 * labeled alternative in {@link us1004Parser#sNIB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltaNIB(us1004Parser.FaltaNIBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoSResidencia}
	 * labeled alternative in {@link us1004Parser#sResidencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoSResidencia(us1004Parser.ValidoSResidenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code faltaFicheiroSResidencia}
	 * labeled alternative in {@link us1004Parser#sResidencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltaFicheiroSResidencia(us1004Parser.FaltaFicheiroSResidenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invalidoSResidencia}
	 * labeled alternative in {@link us1004Parser#sResidencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidoSResidencia(us1004Parser.InvalidoSResidenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoSEstadoCivil}
	 * labeled alternative in {@link us1004Parser#sEstadoCivil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoSEstadoCivil(us1004Parser.ValidoSEstadoCivilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code faltaFicheiroSEstadoCivil}
	 * labeled alternative in {@link us1004Parser#sEstadoCivil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltaFicheiroSEstadoCivil(us1004Parser.FaltaFicheiroSEstadoCivilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invalidoSEstadoCivil}
	 * labeled alternative in {@link us1004Parser#sEstadoCivil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidoSEstadoCivil(us1004Parser.InvalidoSEstadoCivilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoSHabilitacoesLiterarias}
	 * labeled alternative in {@link us1004Parser#sHabilitacoesLiterarias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoSHabilitacoesLiterarias(us1004Parser.ValidoSHabilitacoesLiterariasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code faltaFicheiroSHabilitacoesLiterarias}
	 * labeled alternative in {@link us1004Parser#sHabilitacoesLiterarias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltaFicheiroSHabilitacoesLiterarias(us1004Parser.FaltaFicheiroSHabilitacoesLiterariasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invalidoSHabilitacoesLiterarias}
	 * labeled alternative in {@link us1004Parser#sHabilitacoesLiterarias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidoSHabilitacoesLiterarias(us1004Parser.InvalidoSHabilitacoesLiterariasContext ctx);
	/**
	 * Visit a parse tree produced by {@link us1004Parser#catalogoFerias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalogoFerias(us1004Parser.CatalogoFeriasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoSFerias}
	 * labeled alternative in {@link us1004Parser#sFerias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoSFerias(us1004Parser.ValidoSFeriasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invalidoSFerias}
	 * labeled alternative in {@link us1004Parser#sFerias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidoSFerias(us1004Parser.InvalidoSFeriasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoSFaltaPassado}
	 * labeled alternative in {@link us1004Parser#sFaltaPassada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoSFaltaPassado(us1004Parser.ValidoSFaltaPassadoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invalidoSFaltaPassado}
	 * labeled alternative in {@link us1004Parser#sFaltaPassada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidoSFaltaPassado(us1004Parser.InvalidoSFaltaPassadoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validoSFaltaFutura}
	 * labeled alternative in {@link us1004Parser#sFaltaFutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidoSFaltaFutura(us1004Parser.ValidoSFaltaFuturaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invalidoSFaltaFutura}
	 * labeled alternative in {@link us1004Parser#sFaltaFutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvalidoSFaltaFutura(us1004Parser.InvalidoSFaltaFuturaContext ctx);
}