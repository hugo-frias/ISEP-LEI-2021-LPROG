import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class tarefasautomaticas {
    public static void main(String[] args) throws IOException {
        System.out.println("################ Resultados com Visitor ################");
        parseWithVisitor();

        System.out.printf("\n################ Resultados com Listener ################");
        parseWithListener();
    }

    public static void parseWithVisitor() throws IOException {
        FileInputStream fis = new FileInputStream(new File("scriptTA.txt"));
        tarefasautomaticasLexer lexer = new tarefasautomaticasLexer(new ANTLRInputStream(fis));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tarefasautomaticasParser parser = new tarefasautomaticasParser(tokens);
        ParseTree tree = parser.regraTA();
        EvalVisitorTarefasAutomaticas eval = new EvalVisitorTarefasAutomaticas();
        eval.visit(tree);
    }

    public static void parseWithListener() throws IOException {
        FileInputStream fis = new FileInputStream(new File("scriptTA.txt"));
        tarefasautomaticasLexer lexer = new tarefasautomaticasLexer(new ANTLRInputStream(fis));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tarefasautomaticasParser parser = new tarefasautomaticasParser(tokens);
        ParseTree tree = parser.regraTA();
        ParseTreeWalker walker = new ParseTreeWalker();
        EvalListenerTarefasAutomaticas eval = new EvalListenerTarefasAutomaticas();
        walker.walk(eval, tree);
        for(String email : eval.getResult()) {
            System.out.println(email);
        }
    }
}
