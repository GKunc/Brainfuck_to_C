// Generated from BCDfuck.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BCDfuckParser}.
 */
public interface BCDfuckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BCDfuckParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(BCDfuckParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCDfuckParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(BCDfuckParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCDfuckParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BCDfuckParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCDfuckParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BCDfuckParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCDfuckParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(BCDfuckParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCDfuckParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(BCDfuckParser.OperatorContext ctx);
}