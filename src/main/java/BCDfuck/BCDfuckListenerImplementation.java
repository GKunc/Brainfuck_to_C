package BCDfuck;

import BCDfuck.antlr.BCDfuckListener;
import BCDfuck.antlr.BCDfuckParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BCDfuckListenerImplementation implements BCDfuckListener {
    public void enterFile(BCDfuckParser.FileContext ctx) {

    }

    public void exitFile(BCDfuckParser.FileContext ctx) {

    }

    public void enterExpression(BCDfuckParser.ExpressionContext ctx) {

    }

    public void exitExpression(BCDfuckParser.ExpressionContext ctx) {

    }

    public void enterOperator(BCDfuckParser.OperatorContext ctx) {

    }

    public void exitOperator(BCDfuckParser.OperatorContext ctx) {

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
