// Generated from C:/Users/migue/Documents/tp_lprog2021/tp_lprog\tarefasautomaticas.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tarefasautomaticasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tarefasautomaticasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tarefasautomaticasParser#regraTA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraTA(tarefasautomaticasParser.RegraTAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code runScript}
	 * labeled alternative in {@link tarefasautomaticasParser#tarefaAutomatica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunScript(tarefasautomaticasParser.RunScriptContext ctx);
}