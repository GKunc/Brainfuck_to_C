// Generated from Brainfock.g4 by ANTLR 4.8
package brainfork.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BrainfockParser}.
 */
public interface BrainfockListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BrainfockParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(BrainfockParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainfockParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(BrainfockParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrainfockParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BrainfockParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainfockParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BrainfockParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrainfockParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(BrainfockParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainfockParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(BrainfockParser.OperatorContext ctx);
}