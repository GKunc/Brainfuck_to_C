package interfaces;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.BufferedWriter;
import java.io.IOException;

public interface ICompiler {
    void compile(String sourceCode, BufferedWriter writer) throws IOException;
    CommonTokenStream tokenize(String sourceCode);
    void generateOutputCode(BufferedWriter writer, ParseTree parseTree, int size);
}
