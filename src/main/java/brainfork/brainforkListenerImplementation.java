package brainfork;

import brainfork.antlr.brainfockListener;
import brainfork.antlr.brainfockParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class brainforkListenerImplementation implements brainfockListener {
    public void enterFile(brainfockParser.FileContext ctx) {

    }

    public void exitFile(brainfockParser.FileContext ctx) {

    }

    public void enterExpression(brainfockParser.ExpressionContext ctx) {

    }

    public void exitExpression(brainfockParser.ExpressionContext ctx) {

    }

    public void enterOperator(brainfockParser.OperatorContext ctx) {

    }

    public void exitOperator(brainfockParser.OperatorContext ctx) {

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
