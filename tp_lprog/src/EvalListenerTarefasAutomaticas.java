import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class EvalListenerTarefasAutomaticas extends tarefasautomaticasBaseListener{

    private final Stack<String> stack = new Stack<>();

    public ArrayList<String> getResult() {
        ArrayList<String> emails = new ArrayList<>();

        for(String email : stack) {
            emails.add(email);
        }

        return emails;
    }

    public void enterRunScript(tarefasautomaticasParser.RunScriptContext ctx) {
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

        String mensagem = "\nCálculos efetuados com sucesso!\n" +
                          "\n########## EMAIL ##########\n" +
                          " Enviado para: " + email +
                          " \nAssunto: Encomenda de " + descricao +
                          " \nCorpo da Mensagem: A sua encomenda foi efetuada com sucesso!\n" +
                          "                    Preço sem desconto: " + precoSemDesconto + "€\n" +
                          "                    Preço com desconto: " + precoComDesconto + "€\n" +
                          "                    Preço final: " + precoComDesconto + "€\n" +
                          "-----------------------------------------------------------------";

        stack.push(mensagem);
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
