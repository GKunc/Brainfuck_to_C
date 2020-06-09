package brainloller;

import brainloller.antlr.brainlollerListener;
import brainloller.antlr.brainlollerParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.IOException;

public class BrainlollerListenerImplementation implements brainlollerListener {
    private BufferedWriter writer;
    private int indents = 0;
    private int size;

    public BrainlollerListenerImplementation(BufferedWriter bufferedWriter, int size) {
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

    public void enterFile(brainlollerParser.FileContext ctx) {
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

    public void exitFile(brainlollerParser.FileContext ctx) {
        try {
            putIndents();
            writer.write("printf(\"\\n\");\n");
            writer.write("return 0;\n");
            indents--;
            putIndents();
            writer.write("}\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterExpression(brainlollerParser.ExpressionContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.startsWith("(255, 255, 0)")) {
                putIndents();
                writer.write("while (*ptr) {\n");
                indents++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitExpression(brainlollerParser.ExpressionContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.endsWith("(128, 128, 0)")) {
                indents--;
                putIndents();
                writer.write("}\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterOperator(brainlollerParser.OperatorContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.equals("(255, 0, 0)")) {
                putIndents();
                writer.write("++ptr;\n");
            }
            else if (txt.equals("(128, 0, 0)")) {
                putIndents();
                writer.write("--ptr;\n");
            }
            else if (txt.equals("(0, 255, 0)")) {
                putIndents();
                writer.write("++*ptr;\n");
            }
            else if (txt.equals("(0, 128, 0)")) {
                putIndents();
                writer.write("--*ptr;\n");
            }
            else if (txt.equals("(0, 0, 255)")) {
                putIndents();
                writer.write("putchar(*ptr);\n");
            }
            else if (txt.equals("(0, 0, 128)")) {
                putIndents();
                writer.write("*ptr=getchar();\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitOperator(brainlollerParser.OperatorContext ctx) {

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
