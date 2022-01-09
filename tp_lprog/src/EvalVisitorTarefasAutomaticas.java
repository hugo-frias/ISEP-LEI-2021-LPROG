import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class EvalVisitorTarefasAutomaticas extends tarefasautomaticasBaseVisitor{

    public Object visitRegraTA(tarefasautomaticasParser.RegraTAContext ctx) { return visitChildren(ctx); }

    public Object visitRunScript(tarefasautomaticasParser.RunScriptContext ctx) {
        ArrayList<String> clientes = loadClientes();
        ArrayList<String> produtos = loadProdutos();

        String cliente = ctx.NCLIENTE().getText();
        String email = "";
        int escalao = 0;
        for(String cli : clientes) {
            String testCliente[] = cli.split(";");

            if(cliente.equalsIgnoreCase(testCliente[0])){
                email = testCliente[1];
                escalao = Integer.parseInt(testCliente[2]);
            }
        }

        String produto = ctx.NPRODUTO().getText();
        String descricao = "";
        double precoBase = 0;
        for(String prod : produtos) {
            String testProduto[] = prod.split(";");

            if(produto.equalsIgnoreCase(testProduto[0])){
                descricao = testProduto[1];
                precoBase = Double.parseDouble(testProduto[2]);
            }
        }

        int quantidade = Integer.parseInt(ctx.QUANTIDADE().getText());
        double precoSemDesconto = quantidade * precoBase;
        double precoComDesconto = precoSemDesconto;
        if(escalao == 2 || escalao == 3) {
            precoComDesconto = precoSemDesconto * 0.98;
        } else if(escalao == 4) {
            precoComDesconto = precoSemDesconto * 0.95;
        }

        System.out.printf("Cálculos efetuados com sucesso!\n");
        System.out.printf("\n########## EMAIL ##########\n");
        System.out.printf(" Enviado para: %s\n", email);
        System.out.printf(" Assunto: Encomenda de %s\n", descricao);
        System.out.println(" Corpo da Mensagem: A sua encomenda foi efetuada com sucesso!");
        System.out.printf("                    Preço sem desconto: %.2f€\n", precoSemDesconto);
        System.out.printf("                    Preço com desconto: %.2f€\n", precoComDesconto);
        System.out.printf("                    Preço final: %.2f€\n", precoComDesconto);
        System.out.println("-----------------------------------------------------------------");

        return visitChildren(ctx);
    }

    public static ArrayList<String> loadClientes() {
        ArrayList<String> clientes = new ArrayList<>();

        try {
            File myObj = new File("clientes.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                clientes.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return clientes;
    }

    public static ArrayList<String> loadProdutos() {
        ArrayList<String> produtos = new ArrayList<>();

        try {
            File myObj = new File("produtos.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                produtos.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return produtos;
    }
}
