import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class us1004 {


    public static void main(String[] args) throws IOException {
        String op;
        do{
            System.out.println("------------------------------------------");
            System.out.println("Deseja usar:");
            System.out.println("1. Visitor");
            System.out.println("2. Listener");
            System.out.println("0. Sair");
            System.out.println("------------------------------------------");
            op = readLineFromConsole("Por favor indique que método deseja utilizar (1 ou 2)");
            if(op.equalsIgnoreCase("1")){
                System.out.println("Resultados com Visitor");
                parseWithVisitor();
            } else if(op.equalsIgnoreCase("2")){
                System.out.println("Resultados com Listener");
                parseWithListener();
            }
        } while(!op.equalsIgnoreCase("0"));
    }

    public static void parseWithVisitor() throws IOException {
        File ficheiro = new File("tp_lprog/us1004Visitor1.txt");
        callUI(ficheiro);
        FileInputStream fis = new FileInputStream(ficheiro);
        us1004Lexer lexer = new us1004Lexer(new ANTLRInputStream(fis));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        us1004Parser parser = new us1004Parser(tokens);
        ParseTree tree = parser.regra();
        EvalVisitorUs1004 eval = new EvalVisitorUs1004();
        eval.visit(tree);
    }

    private static void callUI(File ficheiro) throws IOException{
        System.out.println("------------------------------------------");
        System.out.println("Catálogos disponiveis:");
        System.out.println("1. Reportar Erro/Falha");
        System.out.println("2. Cotações e Descontos");
        System.out.println("3. Pedidos aos Recursos Humanos");
        System.out.println("------------------------------------------");
        String catalogo = readLineFromConsole("Por favor escolha o catálogo. (1,2 ou 3)");
        String servico, catalogoAuxiliar;
        switch(catalogo){
            case("1"):
                System.out.println("------------------------------------------");
                System.out.println("Serviços disponiveis:");
                System.out.println("1. Reportar anomalia de comunicação");
                System.out.println("2. Anomalia de equipamento");
                System.out.println("3. Reportar anomalia em aplicação");
                System.out.println("------------------------------------------");
                servico = readLineFromConsole("Por favor escolha o serviço. (1,2 ou 3)");
                servicosCatalogoErro(servico, ficheiro);
                break;
            case("2"):
                System.out.println("------------------------------------------");
                System.out.println("Serviços disponiveis:");
                System.out.println("1. Requerer cotação para venda por grosso");
                System.out.println("2. Solicitar autorização para aplicação de desconto financeiro");
                System.out.println("------------------------------------------");
                servico = readLineFromConsole("Por favor escolha o serviço. (1 ou 2)");
                servicosCatalogoFinancas(servico, ficheiro);
                break;
            case("3"):
                System.out.println("------------------------------------------");
                System.out.println("Catalogos disponiveis:");
                System.out.println("1. Alteração de Dados Pessoais");
                System.out.println("2. Férias e Justificações");
                System.out.println("------------------------------------------");
                catalogoAuxiliar = readLineFromConsole("Por favor escolha o catalogo. (1 ou 2)");
                switch(catalogoAuxiliar){
                    case("1"):
                        System.out.println("------------------------------------------");
                        System.out.println("Serviços disponiveis:");
                        System.out.println("1. Alteração de NIB");
                        System.out.println("2. Alteração de Residências");
                        System.out.println("3. Alteração de Estado Civil para efeitos de IRS");
                        System.out.println("4. Alteração de Habilitações Literárias");
                        System.out.println("------------------------------------------");
                        servico = readLineFromConsole("Por favor escolha o serviço. (1,2,3 ou 4)");
                        servicosDadosPessoais(servico, ficheiro);
                        //pedir dados
                        break;
                    case("2"):
                        System.out.println("------------------------------------------");
                        System.out.println("Serviços disponiveis:");
                        System.out.println("1. Marcar Férias");
                        System.out.println("2. Justificar falta ocorrida");
                        System.out.println("3. Informar ausência futura");
                        System.out.println("------------------------------------------");
                        servico = readLineFromConsole("Por favor escolha o serviço. (1,2 ou 3)");
                        servicosFerias(servico, ficheiro);
                        //pedir dados
                        break;
                }
                break;

            default:
                System.out.println("Erro!");
        }
    }

    private static void servicosFerias(String servico, File ficheiro) throws IOException {
        String dados;
        dados = "Pedidos aos Recursos Humanos\n"+"Ferias e Justificacoes\n";
        switch(servico){
            case("1"):
                dados += "Marcar Ferias\n";
                System.out.println("------------------------------------------");
                System.out.println("Marcar Férias");
                System.out.println("DataFerias-DescricaoPedido");
                dados += readLineFromConsole("DataFerias-DescricaoPedido")+"\n";
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
            case("2"):
                dados += "Justificar falta ocorrida\n";
                System.out.println("------------------------------------------");
                System.out.println("Justificar falta ocorrida");
                dados += readLineFromConsole("DataFalta-DescricaoPedido")+"\n";
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
            case("3"):
                dados += "Informar ausencia futura\n";
                System.out.println("------------------------------------------");
                System.out.println("Informar ausência futura");
                dados += readLineFromConsole("DataFalta-DescricaoPedido")+"\n";;
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
        }
    }

    private static void servicosDadosPessoais(String servico, File ficheiro) throws IOException {
        String dados;
        dados = "Pedidos aos Recursos Humanos\n"+"Alteracao de Dados Pessoais\n";
        switch(servico){
            case("1"):
                dados += "Alteracao de NIB\n";
                System.out.println("------------------------------------------");
                System.out.println("Alteração de NIB");
                dados += readLineFromConsole("NIB-ficheiroComprovativo")+"\n";
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
            case("2"):
                dados += "Alteracao de Residencias\n";
                System.out.println("------------------------------------------");
                System.out.println("Alteração de Residências");
                dados += readLineFromConsole("NovaResidencia-ficheiroPedido")+"\n";
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
            case("3"):
                dados += "Alteracao de Estado Civil para efeitos de IRS\n";
                System.out.println("------------------------------------------");
                System.out.println("Alteração de Estado Civil para efeitos de IRS");
                dados += readLineFromConsole("EstadoCivil-ficheiroPedido")+"\n";
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
            case("4"):
                dados += "Alteracao de Habilitacoes Literarias\n";
                System.out.println("------------------------------------------");
                System.out.println("Alteração de Habilitações Literárias");
                dados += readLineFromConsole("HabilitacoesLiterarias-ficheiroPedido")+"\n";
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
        }
    }

    private static void servicosCatalogoFinancas(String servico, File ficheiro) throws IOException {
        String dados;
        dados = "Cotacoes e Descontos\n";
        switch(servico){
            case("1"):
                dados += "Requerer cotacao para venda por grosso\n";
                System.out.println("------------------------------------------");
                System.out.println("Requerer cotação para venda por grosso");
                dados += readLineFromConsole("NomeRequesicao-DescricaoRequesicao")+"\n";
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
            case("2"):
                dados += "sDesconto\n";
                System.out.println("------------------------------------------");
                System.out.println("Solicitar autorização para aplicação de desconto financeiro");
                dados += readLineFromConsole("NomeRequesicao-DescricaoRequesicao")+"\n";
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
        }
    }

    private static void servicosCatalogoErro(String servico, File ficheiro) throws IOException {
        String dados;
        dados = "Reportar Erro/Falha\n";
        switch(servico){
            case("1"):
                dados += "Reportar anomalia de comunicacao\n";
                System.out.println("------------------------------------------");
                System.out.println("Reportar anomalia de comunicação");
                dados += readLineFromConsole("tipoAnomalia-descAnomalia")+"\n";
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
            case("2"):
                dados += "Anomalia de equipamento\n";
                System.out.println("------------------------------------------");
                System.out.println("Anomalia de equipamento");
                dados += readLineFromConsole("tipoAnomalia-tipoEquipamento-numeroEquipamento-descricaoAnomalia-[Imagens]")+"\n";
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
            case("3"):
                dados += "Reportar anomalia em aplicacao\n";
                System.out.println("------------------------------------------");
                System.out.println("Reportar anomalia em aplicação");
                dados += readLineFromConsole("tipoAnomalia-descAnomalia")+"\n";
                escreverNoFicheiro(dados, ficheiro);
                System.out.println("------------------------------------------");
                break;
        }

    }

    private static void escreverNoFicheiro(String dados, File ficheiro) throws IOException {
        FileWriter fw=new FileWriter(ficheiro, false);
        fw.write(dados);
        fw.close();
    }

    public static void parseWithListener() throws IOException {
        File ficheiro = new File("tp_lprog/us1004Visitor2.txt");
        callUI(ficheiro);
        FileInputStream fis = new FileInputStream(ficheiro);
        us1004Lexer lexer = new us1004Lexer(new ANTLRInputStream(fis));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        us1004Parser parser = new us1004Parser(tokens);
        ParseTree tree = parser.regra();
        ParseTreeWalker walker = new ParseTreeWalker();
        EvalListenerUs1004 eval = new EvalListenerUs1004();
        walker.walk(eval, tree);
        for(String msg : eval.getResult()) {
            System.out.println(msg);
        }
    }

    public static String readLineFromConsole(String prompt)
    {
        try
        {
            System.out.println("\n" + prompt);

            InputStreamReader converter = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(converter);

            return in.readLine();
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
