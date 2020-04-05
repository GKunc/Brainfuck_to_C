// Generated from Doublefuck.g4 by ANTLR 4.8
package doublefuck.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DoublefuckParser}.
 */
public interface DoublefuckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DoublefuckParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(DoublefuckParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoublefuckParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(DoublefuckParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoublefuckParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DoublefuckParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoublefuckParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DoublefuckParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DoublefuckParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(DoublefuckParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DoublefuckParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(DoublefuckParser.OperatorContext ctx);
}