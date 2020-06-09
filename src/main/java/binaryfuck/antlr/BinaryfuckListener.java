// Generated from Binaryfuck.g4 by ANTLR 4.8
package binaryfuck.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BinaryfuckParser}.
 */
public interface BinaryfuckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BinaryfuckParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(BinaryfuckParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinaryfuckParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(BinaryfuckParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BinaryfuckParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BinaryfuckParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinaryfuckParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BinaryfuckParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BinaryfuckParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(BinaryfuckParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinaryfuckParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(BinaryfuckParser.OperatorContext ctx);
}