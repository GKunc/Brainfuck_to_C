package doublefuck;

import doublefuck.antlr.DoublefuckListener;
import doublefuck.antlr.DoublefuckParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.IOException;

public class DoublefuckListenerImplementation implements DoublefuckListener {
    private BufferedWriter writer;
    private int indents = 0;
    private int size;

    public DoublefuckListenerImplementation(BufferedWriter bufferedWriter, int size) {
        this.writer = bufferedWriter;
        this.size = size;
    }

    private void putIndents() {
        try {
            for (int i=0;i<indents;i++) {
                writer.write("\t");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterFile(DoublefuckParser.FileContext ctx) {
        try {
            writer.write("#include <stdio.h>\n \n");
            writer.write("int main()\n");
            writer.write("{\n");
            indents++;
            putIndents();
            writer.write("char array["+size+"] = {0};\n");
            putIndents();
            writer.write("char *ptr=array;\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitFile(DoublefuckParser.FileContext ctx) {
        try {
            putIndents();
            writer.write("return 0;\n");
            indents--;
            putIndents();
            writer.write("}\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterExpression(DoublefuckParser.ExpressionContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.startsWith("[")) {
                putIndents();
                writer.write("while (*ptr) {\n");
                indents++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitExpression(DoublefuckParser.ExpressionContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.endsWith("]")) {
                indents--;
                putIndents();
                writer.write("}\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterOperator(DoublefuckParser.OperatorContext ctx) {

    }

    public void exitOperator(DoublefuckParser.OperatorContext ctx) {

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
