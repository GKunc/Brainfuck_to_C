// Generated from brainfock.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link brainfockParser}.
 */
public interface brainfockListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link brainfockParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(brainfockParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link brainfockParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(brainfockParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link brainfockParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(brainfockParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link brainfockParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(brainfockParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link brainfockParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(brainfockParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link brainfockParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(brainfockParser.OperatorContext ctx);
}