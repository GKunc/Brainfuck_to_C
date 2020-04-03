// Generated from doublefuck.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link doublefuckParser}.
 */
public interface doublefuckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link doublefuckParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(doublefuckParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link doublefuckParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(doublefuckParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link doublefuckParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(doublefuckParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link doublefuckParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(doublefuckParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link doublefuckParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(doublefuckParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link doublefuckParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(doublefuckParser.OperatorContext ctx);
}