package binaryfuck;

import binaryfuck.antlr.BinaryfuckListener;
import binaryfuck.antlr.BinaryfuckParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.IOException;

public class BinaryfuckListenerImplementation implements BinaryfuckListener {
    private BufferedWriter writer;
    private int indents = 0;
    private int size;

    public BinaryfuckListenerImplementation(BufferedWriter bufferedWriter, int size) {
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

    @Override
    public void enterFile(BinaryfuckParser.FileContext ctx) {
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

    @Override
    public void exitFile(BinaryfuckParser.FileContext ctx) {
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

    @Override
    public void enterExpression(BinaryfuckParser.ExpressionContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.startsWith("110")) {
                putIndents();
                writer.write("while (*ptr) {\n");
                indents++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitExpression(BinaryfuckParser.ExpressionContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.endsWith("111")) {
                indents--;
                putIndents();
                writer.write("}\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterOperator(BinaryfuckParser.OperatorContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.equals("010")) {
                putIndents();
                writer.write("++ptr;\n");
            }
            else if (txt.equals("011")) {
                putIndents();
                writer.write("--ptr;\n");
            }
            else if (txt.equals("000")) {
                putIndents();
                writer.write("++*ptr;\n");
            }
            else if (txt.equals("001")) {
                putIndents();
                writer.write("--*ptr;\n");
            }
            else if (txt.equals("100")) {
                putIndents();
                writer.write("putchar(*ptr);\n");
            }
            else if (txt.equals("101")) {
                putIndents();
                writer.write("*ptr=getchar();\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitOperator(BinaryfuckParser.OperatorContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
