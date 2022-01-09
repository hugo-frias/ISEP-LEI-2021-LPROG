import java.util.ArrayList;
import java.util.Stack;

public class EvalListenerUs1004 extends us1004BaseListener {

    private final Stack<String> stack = new Stack<>();

    public ArrayList<String> getResult() {
        ArrayList<String> mensagens = new ArrayList<>();

        for(String mensagem : stack) {
            mensagens.add(mensagem);
        }

        return mensagens;
    }

    public void enterValidoNIB(us1004Parser.ValidoNIBContext ctx) {
        String NIB = ctx.NIB().getText();
        String IMG = ctx.IMAGEM().getText();
        if (NIB.length() > 32) {
            String mensagem = "------------------------------------------\n" +
                            "NIB ultrapassa o máximo dos caracteres! (32)\n" +
                            "------------------------------------------\n";
            stack.push(mensagem);
            return;
        }
        if (NIB.length() < 10) {
            String mensagem = "------------------------------------------\n" +
                            "Faltam caracteres! Tem menos de 10\n" +
                            "------------------------------------------\n";
            stack.push(mensagem);
            return;
        }
        String mensagem = "------------------------------------------\n" +
                        "Os valores introduzidos são validos!\n" +
                        "NIB: " + NIB + "\n" +
                        "IMG: " + IMG + "\n" +
                        "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterValidoEquipAnomalia(us1004Parser.ValidoEquipAnomaliaContext ctx) {
        String tipoAnomalia = ctx.PALAVRA(0).getText();
        String tipoEquipamento = ctx.PALAVRA(1).getText();
        String numEquipamento = ctx.INTEIRO().getText();
        String descAnomalia = ctx.PALAVRA(2).getText();
        String imagem = ctx.anexoAnomalia().getText();
        int nErro = 0;

        if (!tipoAnomalia.equalsIgnoreCase("Peca Velha") && !tipoAnomalia.equalsIgnoreCase("Peca Estragada")
                && !tipoAnomalia.equalsIgnoreCase("Falta Peca")) {
            String mensagem = "------------------------------------------\n" +
                            "Tipo de anomalia desconhecido!\n" +
                            "------------------------------------------\n";
            stack.push(mensagem);
            nErro++;
        }

        if (!tipoEquipamento.equalsIgnoreCase("Computador") && !tipoEquipamento.equalsIgnoreCase("Ventoinha")
                && !tipoEquipamento.equalsIgnoreCase("Televisão")) {
            String mensagem2 = "------------------------------------------\n" +
                            "Tipo de equipamento desconhecido!\n" +
                            "------------------------------------------\n";
            stack.push(mensagem2);
            nErro++;
        }

        if(nErro>0) return;

        String mensagem = "------------------------------------------\n" +
                        "Os valores introduzidos são validos!\n" +
                        "Tipo de anomalia: " + tipoAnomalia + "\n" +
                        "Tipo de equipamento: " + tipoEquipamento + "\n" +
                        "Número de equipamento: " + numEquipamento + "\n" +
                        "Descrição anomalia: " + descAnomalia + "\n" +
                        "Imagem: " + imagem + "\n" +
                        "------------------------------------------\n";

        stack.push(mensagem);
    }

    public void enterValidoEquip(us1004Parser.ValidoEquipContext ctx) {
        String tipoAnomalia = ctx.PALAVRA(0).getText();
        String tipoEquipamento = ctx.PALAVRA(1).getText();
        String numEquipamento = ctx.INTEIRO().getText();
        String descAnomalia = ctx.PALAVRA(2).getText();
        int nErro = 0;

        if (!tipoAnomalia.equalsIgnoreCase("Peca Velha") && !tipoAnomalia.equalsIgnoreCase("Peca Estragada")
                && !tipoAnomalia.equalsIgnoreCase("Falta Peca")) {
            String mensagem = "------------------------------------------\n" +
                    "Tipo de anomalia desconhecido!\n" +
                    "------------------------------------------\n";
            stack.push(mensagem);
            nErro++;
        }

        if (!tipoEquipamento.equalsIgnoreCase("Computador") && !tipoEquipamento.equalsIgnoreCase("Ventoinha")
                && !tipoEquipamento.equalsIgnoreCase("Televisão")) {
            String mensagem2 = "------------------------------------------\n" +
                    "Tipo de equipamento desconhecido!\n" +
                    "------------------------------------------\n";
            stack.push(mensagem2);
            nErro++;
        }

        if(nErro>0) return;

        String mensagem = "------------------------------------------\n" +
                "Os valores introduzidos são validos!\n" +
                "Tipo de anomalia: " + tipoAnomalia + "\n" +
                "Tipo de equipamento: " + tipoEquipamento + "\n" +
                "Número de equipamento: " + numEquipamento + "\n" +
                "Descrição anomalia: " + descAnomalia + "\n" +
                "------------------------------------------\n";

        stack.push(mensagem);
    }

    public void enterFaltaTipoAnomalia(us1004Parser.FaltaTipoAnomaliaContext ctx) {
        String palavra = ctx.PALAVRA(0).getText();
        String mensagem;
        if (!palavra.equalsIgnoreCase("Peca Velha") && !palavra.equalsIgnoreCase("Peca Estragada")
                && !palavra.equalsIgnoreCase("Falta Peca")) {
             mensagem = "------------------------------------------\n" +
                            "Falta introduzir o tipo de anomalia!\n" +
                            "------------------------------------------\n";
        } else if (!palavra.equalsIgnoreCase("Computador") && !palavra.equalsIgnoreCase("Ventoinha")
                && !palavra.equalsIgnoreCase("Televisão")) {
            mensagem = "------------------------------------------\n" +
                            "Falta introduzir o tipo de equipamento!\n" +
                            "------------------------------------------\n";
        } else {
            mensagem = "------------------------------------------\n" +
                            "Tipo de equipamento e tipo de anomalia incorretos!\n" +
                            "------------------------------------------\n";
        }
        stack.push(mensagem);
    }

    public void enterFaltaNumEquipamento(us1004Parser.FaltaNumEquipamentoContext ctx) {

        String mensagem = "------------------------------------------\n" +
                        "Falta introduzir o número de equipamento!\n" +
                        "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterFaltaFicheiroComprovativo(us1004Parser.FaltaFicheiroComprovativoContext ctx) {

        String mensagem = "------------------------------------------\n" +
                        "Falta introduzir o ficheiro comprovativo!\n" +
                        "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterFaltaNIB(us1004Parser.FaltaNIBContext ctx) {

        String mensagem = "------------------------------------------\n" +
                        "Falta introduzir o NIB!\n" +
                        "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterValidoErroComunicacao(us1004Parser.ValidoErroComunicacaoContext ctx) {
        String tipoAnomalia = ctx.PALAVRA(0).getText();
        String descAnomalia = ctx.PALAVRA(1).getText();

        String mensagem = "------------------------------------------\n" +
                        "Os valores introduzidos são validos!\n" +
                        "Tipo de anomalia: " + tipoAnomalia + "\n" +
                        "Descrição anomalia: " + descAnomalia + "\n" +
                        "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterInvalidoErroComunicacao(us1004Parser.InvalidoErroComunicacaoContext ctx) {

        String mensagem = "------------------------------------------\n" +
                "Erro nos dados!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterValidoErroAplicacao(us1004Parser.ValidoErroAplicacaoContext ctx) {
        String tipoAnomalia = ctx.PALAVRA(0).getText();
        String descAnomalia = ctx.PALAVRA(1).getText();

        String mensagem = "------------------------------------------\n" +
                    "Os valores introduzidos são validos!\n" +
                    "Tipo de anomalia: " + tipoAnomalia + "\n" +
                    "Descrição anomalia: " + descAnomalia + "\n" +
                    "------------------------------------------\n";

        stack.push(mensagem);
    }

    public void enterInvalidoErroAplicacao(us1004Parser.InvalidoErroAplicacaoContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Erro nos dados!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterValidoSVenda(us1004Parser.ValidoSVendaContext ctx) {
        String nomeRequesicao = ctx.PALAVRA(0).getText();
        String descRequesicao = ctx.PALAVRA(1).getText();

        String mensagem = "------------------------------------------\n" +
                    "Os valores introduzidos são validos!\n" +
                    "Nome da Requesição: " + nomeRequesicao + "\n" +
                    "Descrição Requesição: " + descRequesicao + "\n" +
                    "------------------------------------------\n";

        stack.push(mensagem);
    }

    public void enterInvalidoSVenda(us1004Parser.InvalidoSVendaContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Erro nos dados!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterValidoSDesconto(us1004Parser.ValidoSDescontoContext ctx) {
        String nomeRequesicao = ctx.PALAVRA(0).getText();
        String descRequesicao = ctx.PALAVRA(1).getText();

        String mensagem = "------------------------------------------\n" +
                    "Os valores introduzidos são validos!\n" +
                    "Nome da Requesição: " + nomeRequesicao + "\n" +
                    "Descrição Requesição: " + descRequesicao + "\n" +
                    "------------------------------------------\n";

        stack.push(mensagem);
    }

    public void enterInvalidoSDesconto(us1004Parser.InvalidoSDescontoContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Erro nos dados!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterValidoSResidencia(us1004Parser.ValidoSResidenciaContext ctx) {
        String novaResidencia = ctx.PALAVRA().getText();
        String fichComprovativo = ctx.IMAGEM().getText();

        String mensagem = "------------------------------------------\n" +
                "Os valores introduzidos são validos!\n" +
                "Nova Residencia: " + novaResidencia + "\n" +
                "Ficheiro Comprovativo: " + fichComprovativo + "\n" +
                "------------------------------------------\n";

        stack.push(mensagem);
    }

    public void enterFaltaFicheiroSResidencia(us1004Parser.FaltaFicheiroSResidenciaContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Falta o ficheiro comprovativo!!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterInvalidoSResidencia(us1004Parser.InvalidoSResidenciaContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Falta a nova residência!!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterValidoSEstadoCivil(us1004Parser.ValidoSEstadoCivilContext ctx) {
        String estadoCivil = ctx.PALAVRA().getText();
        String fichComprovativo = ctx.IMAGEM().getText();

        String mensagem = "------------------------------------------\n" +
                "Os valores introduzidos são validos!\n" +
                "Estado Civil: " + estadoCivil + "\n" +
                "Ficheiro Comprovativo: " + fichComprovativo + "\n" +
                "------------------------------------------\n";

        stack.push(mensagem);
    }

    public void enterFaltaFicheiroSEstadoCivil(us1004Parser.FaltaFicheiroSEstadoCivilContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Falta o ficheiro comprovativo!!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterInvalidoSEstadoCivil(us1004Parser.InvalidoSEstadoCivilContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Falta o Estado Civil!!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterValidoSHabilitacoesLiterarias(us1004Parser.ValidoSHabilitacoesLiterariasContext ctx) {
        String habLit = ctx.PALAVRA().getText();
        String fichComprovativo = ctx.IMAGEM().getText();

        String mensagem = "------------------------------------------\n" +
                "Os valores introduzidos são validos!\n" +
                "Habilitações Literárias: " + habLit + "\n" +
                "Ficheiro Comprovativo: " + fichComprovativo + "\n" +
                "------------------------------------------\n";

        stack.push(mensagem);
    }

    public void enterFaltaFicheiroSHabilitacoesLiterarias(us1004Parser.FaltaFicheiroSHabilitacoesLiterariasContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Falta o ficheiro comprovativo!!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterInvalidoSHabilitacoesLiterarias(us1004Parser.InvalidoSHabilitacoesLiterariasContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Falta as Habilitações Literárias!!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterValidoSFerias(us1004Parser.ValidoSFeriasContext ctx) {
        String data = ctx.PALAVRA(0).getText();
        String descPedido = ctx.PALAVRA(1).getText();

        String mensagem = "------------------------------------------\n" +
                "Os valores introduzidos são validos!\n" +
                "Data das férias: " + data + "\n" +
                "Descrição Pedido: " + descPedido + "\n" +
                "------------------------------------------\n";

        stack.push(mensagem);
    }

    public void enterInvalidoSFerias(us1004Parser.InvalidoSFeriasContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Erro nos dados!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterValidoSFaltaPassado(us1004Parser.ValidoSFaltaPassadoContext ctx) {
        String data = ctx.PALAVRA(0).getText();
        String descPedido = ctx.PALAVRA(1).getText();

        String mensagem = "------------------------------------------\n" +
                "Os valores introduzidos são validos!\n" +
                "Data da Falta: " + data + "\n" +
                "Descrição Pedido: " + descPedido + "\n" +
                "------------------------------------------\n";

        stack.push(mensagem);
    }

    public void enterInvalidoSFaltaPassado(us1004Parser.InvalidoSFaltaPassadoContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Erro nos dados!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

    public void enterValidoSFaltaFutura(us1004Parser.ValidoSFaltaFuturaContext ctx) {
        String data = ctx.PALAVRA(0).getText();
        String descPedido = ctx.PALAVRA(1).getText();

        String mensagem = "------------------------------------------\n" +
                "Os valores introduzidos são validos!\n" +
                "Data da Falta: " + data + "\n" +
                "Descrição Pedido: " + descPedido + "\n" +
                "------------------------------------------\n";

        stack.push(mensagem);
    }

    public void enterInvalidoSFaltaFutura(us1004Parser.InvalidoSFaltaFuturaContext ctx) {
        String mensagem = "------------------------------------------\n" +
                "Erro nos dados!\n" +
                "------------------------------------------\n";
        stack.push(mensagem);
    }

}
