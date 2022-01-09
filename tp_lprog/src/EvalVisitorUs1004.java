import java.util.List;

public class EvalVisitorUs1004 extends us1004BaseVisitor {

    public Object visitRegra(us1004Parser.RegraContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitCatalogo(us1004Parser.CatalogoContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitCatalogoErro(us1004Parser.CatalogoErroContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitAnexoAnomalia(us1004Parser.AnexoAnomaliaContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitCatalogoFinancas(us1004Parser.CatalogoFinancasContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitCatalogoRh(us1004Parser.CatalogoRhContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitCatalogoDados(us1004Parser.CatalogoDadosContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitCatalogoFerias(us1004Parser.CatalogoFeriasContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitValidoNIB(us1004Parser.ValidoNIBContext ctx) {
        String NIB = ctx.NIB().getText();
        String IMG = ctx.IMAGEM().getText();
        if (NIB.length() > 32) {
            System.out.println("------------------------------------------");
            System.out.println("NIB ultrapassa o máximo dos caracteres! (32)");
            System.out.println("------------------------------------------");
            return 0;
        }
        if (NIB.length() < 10) {
            System.out.println("------------------------------------------");
            System.out.println("Faltam caracteres! Tem menos de 10");
            System.out.println("------------------------------------------");
            return 0;
        }
        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("NIB: " + NIB);
        System.out.println("IMG: " + IMG);
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitValidoEquipAnomalia(us1004Parser.ValidoEquipAnomaliaContext ctx) {
        String tipoAnomalia = ctx.PALAVRA(0).getText();
        String tipoEquipamento = ctx.PALAVRA(1).getText();
        String numEquipamento = ctx.INTEIRO().getText();
        String descAnomalia = ctx.PALAVRA(2).getText();
        String imagem = ctx.anexoAnomalia().getText();
        int nErro = 0;

        if (!tipoAnomalia.equalsIgnoreCase("Peca Velha") && !tipoAnomalia.equalsIgnoreCase("Peca Estragada")
                && !tipoAnomalia.equalsIgnoreCase("Falta Peca")) {
            System.out.println("------------------------------------------");
            System.out.println("Tipo de anomalia desconhecido!");
            System.out.println("------------------------------------------");
            nErro++;
        }

        if (!tipoEquipamento.equalsIgnoreCase("Computador") && !tipoEquipamento.equalsIgnoreCase("Ventoinha")
                && !tipoEquipamento.equalsIgnoreCase("Televisão")) {
            System.out.println("------------------------------------------");
            System.out.println("Tipo de equipamento desconhecido!");
            System.out.println("------------------------------------------");
            nErro++;
        }

        if(nErro>0) return 0;

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Tipo de anomalia: " + tipoAnomalia);
        System.out.println("Tipo de equipamento: " + tipoEquipamento);
        System.out.println("Número de equipamento: " + numEquipamento);
        System.out.println("Descrição anomalia: " + descAnomalia);
        System.out.println("Imagem: " + imagem);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitValidoEquip(us1004Parser.ValidoEquipContext ctx) {
        String tipoAnomalia = ctx.PALAVRA(0).getText();
        String tipoEquipamento = ctx.PALAVRA(1).getText();
        String numEquipamento = ctx.INTEIRO().getText();
        String descAnomalia = ctx.PALAVRA(2).getText();
        int nErro = 0;

        if (!tipoAnomalia.equalsIgnoreCase("Peca Velha") && !tipoAnomalia.equalsIgnoreCase("Peca Estragada")
                && !tipoAnomalia.equalsIgnoreCase("Falta Peca")) {
            System.out.println("------------------------------------------");
            System.out.println("Tipo de anomalia desconhecido!");
            System.out.println("------------------------------------------");
            nErro++;
        }

        if (!tipoEquipamento.equalsIgnoreCase("Computador") && !tipoEquipamento.equalsIgnoreCase("Ventoinha")
                && !tipoEquipamento.equalsIgnoreCase("Televisão")) {
            System.out.println("------------------------------------------");
            System.out.println("Tipo de equipamento desconhecido!");
            System.out.println("------------------------------------------");
            nErro++;
        }

        if(nErro>0) return 0;

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Tipo de anomalia: " + tipoAnomalia);
        System.out.println("Tipo de equipamento: " + tipoEquipamento);
        System.out.println("Número de equipamento: " + numEquipamento);
        System.out.println("Descrição anomalia: " + descAnomalia);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitFaltaTipoAnomalia(us1004Parser.FaltaTipoAnomaliaContext ctx) {
        String palavra = ctx.PALAVRA(0).getText();
        if (!palavra.equalsIgnoreCase("Peca Velha") && !palavra.equalsIgnoreCase("Peca Estragada")
                && !palavra.equalsIgnoreCase("Falta Peca")) {
            System.out.println("------------------------------------------");
            System.out.println("Falta introduzir o tipo de anomalia!");
            System.out.println("------------------------------------------");
        } else if (!palavra.equalsIgnoreCase("Computador") && !palavra.equalsIgnoreCase("Ventoinha")
                && !palavra.equalsIgnoreCase("Televisão")) {
            System.out.println("------------------------------------------");
            System.out.println("Falta introduzir o tipo de equipamento!");
            System.out.println("------------------------------------------");
        } else {
            System.out.println("------------------------------------------");
            System.out.println("Tipo de equipamento e tipo de anomalia incorretos!");
            System.out.println("------------------------------------------");

        }
        return 0;
    }

    public Object visitFaltaNumEquipamento(us1004Parser.FaltaNumEquipamentoContext ctx) {

        System.out.println("------------------------------------------");
        System.out.println("Falta introduzir o número de equipamento!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitFaltaFicheiroComprovativo(us1004Parser.FaltaFicheiroComprovativoContext ctx) {

        System.out.println("------------------------------------------");
        System.out.println("Falta introduzir o ficheiro comprovativo!");
        System.out.println("------------------------------------------");
        return 0;
    }
    public Object visitFaltaNIB(us1004Parser.FaltaNIBContext ctx) {

        System.out.println("------------------------------------------");
        System.out.println("Falta introduzir o NIB!");
        System.out.println("------------------------------------------");
        return 0;
    }
    public Object visitValidoErroComunicacao(us1004Parser.ValidoErroComunicacaoContext ctx) {
        String tipoAnomalia = ctx.PALAVRA(0).getText();
        String descAnomalia = ctx.PALAVRA(1).getText();

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Tipo de anomalia: " + tipoAnomalia);
        System.out.println("Descrição anomalia: " + descAnomalia);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitInvalidoErroComunicacao(us1004Parser.InvalidoErroComunicacaoContext ctx) {

        System.out.println("------------------------------------------");
        System.out.println("Erro nos dados!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitValidoErroAplicacao(us1004Parser.ValidoErroAplicacaoContext ctx) {
        String tipoAnomalia = ctx.PALAVRA(0).getText();
        String descAnomalia = ctx.PALAVRA(1).getText();

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Tipo de anomalia: " + tipoAnomalia);
        System.out.println("Descrição anomalia: " + descAnomalia);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitInvalidoErroAplicacao(us1004Parser.InvalidoErroAplicacaoContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Erro nos dados!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitValidoSVenda(us1004Parser.ValidoSVendaContext ctx) {
        String nomeRequesicao = ctx.PALAVRA(0).getText();
        String descRequesicao = ctx.PALAVRA(1).getText();

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Nome da Requesição: " + nomeRequesicao);
        System.out.println("Descrição Requesição: " + descRequesicao);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitInvalidoSVenda(us1004Parser.InvalidoSVendaContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Erro nos dados!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitValidoSDesconto(us1004Parser.ValidoSDescontoContext ctx) {
        String nomeRequesicao = ctx.PALAVRA(0).getText();
        String descRequesicao = ctx.PALAVRA(1).getText();

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Nome da Requesição: " + nomeRequesicao);
        System.out.println("Descrição Requesição: " + descRequesicao);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitInvalidoSDesconto(us1004Parser.InvalidoSDescontoContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Erro nos dados!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitValidoSResidencia(us1004Parser.ValidoSResidenciaContext ctx) {
        String novaResidencia = ctx.PALAVRA().getText();
        String fichComprovativo = ctx.IMAGEM().getText();

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Nova Residencia: " + novaResidencia);
        System.out.println("Ficheiro Comprovativo: " + fichComprovativo);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitFaltaFicheiroSResidencia(us1004Parser.FaltaFicheiroSResidenciaContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Falta o ficheiro comprovativo!!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitInvalidoSResidencia(us1004Parser.InvalidoSResidenciaContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Falta a nova residência!!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitValidoSEstadoCivil(us1004Parser.ValidoSEstadoCivilContext ctx) {
        String estadoCivil = ctx.PALAVRA().getText();
        String fichComprovativo = ctx.IMAGEM().getText();

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Ficheiro Comprovativo: " + fichComprovativo);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitFaltaFicheiroSEstadoCivil(us1004Parser.FaltaFicheiroSEstadoCivilContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Falta o ficheiro comprovativo!!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitInvalidoSEstadoCivil(us1004Parser.InvalidoSEstadoCivilContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Falta o Estado Civil!!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitValidoSHabilitacoesLiterarias(us1004Parser.ValidoSHabilitacoesLiterariasContext ctx) {
        String habLit = ctx.PALAVRA().getText();
        String fichComprovativo = ctx.IMAGEM().getText();

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Habilitações Literárias: " + habLit);
        System.out.println("Ficheiro Comprovativo: " + fichComprovativo);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitFaltaFicheiroSHabilitacoesLiterarias(us1004Parser.FaltaFicheiroSHabilitacoesLiterariasContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Falta o ficheiro comprovativo!!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitInvalidoSHabilitacoesLiterarias(us1004Parser.InvalidoSHabilitacoesLiterariasContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Falta as Habilitações Literárias!!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitValidoSFerias(us1004Parser.ValidoSFeriasContext ctx) {
        String data = ctx.PALAVRA(0).getText();
        String descPedido = ctx.PALAVRA(1).getText();

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Data das férias: " + data);
        System.out.println("Descrição Pedido: " + descPedido);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitInvalidoSFerias(us1004Parser.InvalidoSFeriasContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Erro nos dados!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitValidoSFaltaPassado(us1004Parser.ValidoSFaltaPassadoContext ctx) {
        String data = ctx.PALAVRA(0).getText();
        String descPedido = ctx.PALAVRA(1).getText();

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Data da Falta: " + data);
        System.out.println("Descrição Pedido: " + descPedido);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitInvalidoSFaltaPassado(us1004Parser.InvalidoSFaltaPassadoContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Erro nos dados!");
        System.out.println("------------------------------------------");
        return 0;
    }

    public Object visitValidoSFaltaFutura(us1004Parser.ValidoSFaltaFuturaContext ctx) {
        String data = ctx.PALAVRA(0).getText();
        String descPedido = ctx.PALAVRA(1).getText();

        System.out.println("------------------------------------------");
        System.out.println("Os valores introduzidos são validos!");
        System.out.println("Data da Falta: " + data);
        System.out.println("Descrição Pedido: " + descPedido);
        System.out.println("------------------------------------------");

        return 0;
    }

    public Object visitInvalidoSFaltaFutura(us1004Parser.InvalidoSFaltaFuturaContext ctx) {
        System.out.println("------------------------------------------");
        System.out.println("Erro nos dados!");
        System.out.println("------------------------------------------");
        return 0;
    }
}
