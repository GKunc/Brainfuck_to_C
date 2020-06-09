package Ook;

import Binaryfuck.antlr.BinaryfuckListener;
import Binaryfuck.antlr.BinaryfuckParser;
import Ook.antlr.OokListener;
import Ook.antlr.OokParser;
import brainfuck.antlr.BrainfuckParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.IOException;

public class OokListenerImplementation implements OokListener {
    private BufferedWriter writer;
    private int indents = 0;
    private int size;

    public OokListenerImplementation(BufferedWriter bufferedWriter, int size) {
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

    public void enterFile(OokParser.FileContext ctx) {
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

    public void exitFile(OokParser.FileContext ctx) {
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

    public void enterExpression(OokParser.ExpressionContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.startsWith("Ook! Ook?")) {
                putIndents();
                writer.write("while (*ptr) {\n");
                indents++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitExpression(OokParser.ExpressionContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.endsWith("Ook? Ook!")) {
                indents--;
                putIndents();
                writer.write("}\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterOperator(OokParser.OperatorContext ctx) {
        String txt = ctx.getText();
        try {
            if (txt.equals("Ook. Ook?")) {
                putIndents();
                writer.write("++ptr;\n");
            }
            else if (txt.equals("Ook? Ook.")) {
                putIndents();
                writer.write("--ptr;\n");
            }
            else if (txt.equals("Ook. Ook.")) {
                putIndents();
                writer.write("++*ptr;\n");
            }
            else if (txt.equals("Ook! Ook!")) {
                putIndents();
                writer.write("--*ptr;\n");
            }
            else if (txt.equals("Ook! Ook.")) {
                putIndents();
                writer.write("putchar(*ptr);\n");
            }
            else if (txt.equals("Ook. Ook!")) {
                putIndents();
                writer.write("*ptr=getchar();\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitOperator(OokParser.OperatorContext ctx) {

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
