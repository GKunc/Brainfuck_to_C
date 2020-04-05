package brainfuck.antlr;// Generated from Brainfuck.g4 by ANTLR 4.8

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BrainfuckParser}.
 */
public interface BrainfuckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BrainfuckParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(BrainfuckParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainfuckParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(BrainfuckParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrainfuckParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BrainfuckParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainfuckParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BrainfuckParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrainfuckParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(BrainfuckParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainfuckParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(BrainfuckParser.OperatorContext ctx);
}