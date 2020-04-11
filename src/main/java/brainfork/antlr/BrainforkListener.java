package brainfork.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BrainforkParser}.
 */
public interface BrainforkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BrainforkParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(BrainforkParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainforkParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(BrainforkParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrainforkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BrainforkParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainforkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BrainforkParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrainforkParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(BrainforkParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainforkParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(BrainforkParser.OperatorContext ctx);
}