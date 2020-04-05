package brainfuck;

import brainfuck.antlr.BrainfuckListener;
import brainfuck.antlr.BrainfuckParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;

public class BrainfuckListenerImplementation implements BrainfuckListener {
    private BufferedWriter writer;
    private int indents = 0;
    private int size;

    public BrainfuckListenerImplementation(BufferedWriter bufferedWriter, int size) {
        this.writer = bufferedWriter;
        this.size = size;
    }

    public void enterFile(BrainfuckParser.FileContext ctx) {
        
    }

    public void exitFile(BrainfuckParser.FileContext ctx) {

    }

    public void enterExpression(BrainfuckParser.ExpressionContext ctx) {

    }

    public void exitExpression(BrainfuckParser.ExpressionContext ctx) {

    }

    public void enterOperator(BrainfuckParser.OperatorContext ctx) {

    }

    public void exitOperator(BrainfuckParser.OperatorContext ctx) {

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
