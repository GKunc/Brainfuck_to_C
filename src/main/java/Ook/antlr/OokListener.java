package Ook.antlr;// Generated from Ook.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OokParser}.
 */
public interface OokListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OokParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(OokParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link OokParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(OokParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link OokParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(OokParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OokParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(OokParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OokParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(OokParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OokParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(OokParser.OperatorContext ctx);
}