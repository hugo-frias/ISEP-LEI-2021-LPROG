// Generated from C:/Users/migue/Documents/tp_lprog2021/tp_lprog\tarefasautomaticas.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tarefasautomaticasParser}.
 */
public interface tarefasautomaticasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tarefasautomaticasParser#regraTA}.
	 * @param ctx the parse tree
	 */
	void enterRegraTA(tarefasautomaticasParser.RegraTAContext ctx);
	/**
	 * Exit a parse tree produced by {@link tarefasautomaticasParser#regraTA}.
	 * @param ctx the parse tree
	 */
	void exitRegraTA(tarefasautomaticasParser.RegraTAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code runScript}
	 * labeled alternative in {@link tarefasautomaticasParser#tarefaAutomatica}.
	 * @param ctx the parse tree
	 */
	void enterRunScript(tarefasautomaticasParser.RunScriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code runScript}
	 * labeled alternative in {@link tarefasautomaticasParser#tarefaAutomatica}.
	 * @param ctx the parse tree
	 */
	void exitRunScript(tarefasautomaticasParser.RunScriptContext ctx);
}