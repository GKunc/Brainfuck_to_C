package BCDfuck;

import interfaces.ICompiler;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;

public class BCDfuckCompiler implements ICompiler {
    public void compile(String sourceCode, BufferedWriter writer) {

    }

    public CommonTokenStream tokenize(String sourceCode) {
        return null;
    }

    public void generateOutputCode(BufferedWriter writer, ParseTree parseTree, int size) {

    }
}
