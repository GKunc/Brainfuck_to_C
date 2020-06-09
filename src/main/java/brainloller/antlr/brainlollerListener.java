// Generated from brainloller.g4 by ANTLR 4.8
package brainloller.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link brainlollerParser}.
 */
public interface brainlollerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link brainlollerParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(brainlollerParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link brainlollerParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(brainlollerParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link brainlollerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(brainlollerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link brainlollerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(brainlollerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link brainlollerParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(brainlollerParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link brainlollerParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(brainlollerParser.OperatorContext ctx);
}