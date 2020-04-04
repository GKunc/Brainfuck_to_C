package brainfuck;

import brainfuck.antlr.brainfuckListener;
import brainfuck.antlr.brainfuckParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class brainfuckListenerImplementation implements brainfuckListener {
    public void enterFile(brainfuckParser.FileContext ctx) {
        
    }

    public void exitFile(brainfuckParser.FileContext ctx) {

    }

    public void enterExpression(brainfuckParser.ExpressionContext ctx) {

    }

    public void exitExpression(brainfuckParser.ExpressionContext ctx) {

    }

    public void enterOperator(brainfuckParser.OperatorContext ctx) {

    }

    public void exitOperator(brainfuckParser.OperatorContext ctx) {

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
