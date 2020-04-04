package interfaces;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.BufferedWriter;

public interface ICompiler {
    void compile(String sourceCode, BufferedWriter writer);
    CommonTokenStream tokenize(String sourceCode);
    void generateOutputCode(BufferedWriter writer, ParseTree parseTree, int size);
}
