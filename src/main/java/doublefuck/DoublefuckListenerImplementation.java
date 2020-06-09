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
            writer.write("char array1["+size+"] = {0};\n");
            putIndents();
            writer.write("char *ptr1=array1;\n");
            putIndents();
            writer.write("char array2["+size+"] = {0};\n");
            putIndents();
            writer.write("char *ptr2=array2;\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitFile(DoublefuckParser.FileContext ctx) {
        try {
            putIndents();
            writer.write("\n");
            writer.write("printf(\"\\n\");\n");
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
                writer.write("while (*ptr1) {\n");
                indents++;
            } else if (txt.startsWith("{")) {
                putIndents();
                writer.write("while (*ptr2) {\n");
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
            } else if (txt.endsWith("}")) {
                indents--;
                putIndents();
                writer.write("}\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterOperator(DoublefuckParser.OperatorContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.equals(">")) {
                putIndents();
                writer.write("++ptr1;\n");
            } else if (txt.equals("<")) {
                putIndents();
                writer.write("--ptr1;\n");
            } else if (txt.equals("+")) {
                putIndents();
                writer.write("++*ptr1;\n");
            } else if (txt.equals("-")) {
                putIndents();
                writer.write("--*ptr1;\n");
            } else if (txt.equals(".")) {
                putIndents();
                writer.write("putchar(*ptr1);\n");
            } else if (txt.equals(",")) {
                putIndents();
                writer.write("*ptr1=getchar();\n");
            } else if (txt.equals("v")) {
                putIndents();
                writer.write("++ptr2;\n");
            } else if (txt.equals("^")) {
                putIndents();
                writer.write("--ptr2;\n");
            } else if (txt.equals("/")) {
                putIndents();
                writer.write("++*ptr2;\n");
            } else if (txt.equals("\\")) {
                putIndents();
                writer.write("--*ptr2;\n");
            } else if (txt.equals(":")) {
                putIndents();
                writer.write("putchar(*ptr2);\n");
            } else if (txt.equals(";")) {
                putIndents();
                writer.write("*ptr2=getchar();\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
