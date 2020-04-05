package brainfork;

import brainfork.antlr.BrainfockListener;
import brainfork.antlr.BrainfockParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BrainforkListenerImplementation implements BrainfockListener {
    public void enterFile(BrainfockParser.FileContext ctx) {

    }

    public void exitFile(BrainfockParser.FileContext ctx) {

    }

    public void enterExpression(BrainfockParser.ExpressionContext ctx) {

    }

    public void exitExpression(BrainfockParser.ExpressionContext ctx) {

    }

    public void enterOperator(BrainfockParser.OperatorContext ctx) {

    }

    public void exitOperator(BrainfockParser.OperatorContext ctx) {

    }

    public void visitTerminal(TerminalNode terminalNode) {

    }

    public void visitErrorNode(ErrorNode errorNode) {

    }

    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
