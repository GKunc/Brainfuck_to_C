package brainfork;

import brainfork.antlr.BrainforkListener;
import brainfork.antlr.BrainforkParser;
import brainfuck.antlr.BrainfuckParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.IOException;

public class BrainforkListenerImplementation implements BrainforkListener {
    private BufferedWriter writer;
    private int indents = 0;
    private int size;

    public BrainforkListenerImplementation(BufferedWriter bufferedWriter, int size) {
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

    public void enterFile(BrainforkParser.FileContext ctx) {
        try {
            writer.write("#include <stdio.h>\n");
            writer.write("#include <stdlib.h>\n");
            writer.write("#include <string.h>\n");
            writer.write("#include <unistd.h>\n");
            writer.write("#include  <sys/types.h>\n \n");

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

    public void exitFile(BrainforkParser.FileContext ctx) {
        try {
            putIndents();
            writer.write("\n");
            writer.write("return 0;\n");
            indents--;
            putIndents();
            writer.write("}\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterExpression(BrainforkParser.ExpressionContext ctx) {
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

    public void exitExpression(BrainforkParser.ExpressionContext ctx) {
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

    public void enterOperator(BrainforkParser.OperatorContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.equals(">")) {
                putIndents();
                writer.write("++ptr;\n");
            }
            else if (txt.equals("<")) {
                putIndents();
                writer.write("--ptr;\n");
            }
            else if (txt.equals("+")) {
                putIndents();
                writer.write("++*ptr;\n");
            }
            else if (txt.equals("-")) {
                putIndents();
                writer.write("--*ptr;\n");
            }
            else if (txt.equals(".")) {
                putIndents();
                writer.write("putchar(*ptr);\n");
            }
            else if (txt.equals(",")) {
                putIndents();
                writer.write("*ptr=getchar();\n");
            }
            else if (txt.equals("Y")) {
                putIndents();
                writer.write("fork();\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitOperator(BrainforkParser.OperatorContext ctx) {

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
