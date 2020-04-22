package doublefuck;

import doublefuck.antlr.DoublefuckLexer;
import doublefuck.antlr.DoublefuckParser;
import interfaces.ICompiler;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.BufferedWriter;

@SuppressWarnings("deprecation")
public class DoublefuckCompiler implements ICompiler {
    public void compile(String sourceCode, BufferedWriter writer) {
        System.out.println("Start procesu kompilacji!");

        CommonTokenStream tokens = tokenize(sourceCode);
        DoublefuckParser parser = new DoublefuckParser(tokens);
        ParseTree parseTree = parser.file();
        int size = 2048;
        generateOutputCode(writer, parseTree, size);

        System.out.println("Pomyslnie wygenerowano kod!");
    }

    public CommonTokenStream tokenize(String sourceCode) {
        CharStream charStream = new ANTLRInputStream(sourceCode);
        DoublefuckLexer lexer = new DoublefuckLexer(charStream);
        return new CommonTokenStream(lexer);
    }

    public void generateOutputCode(BufferedWriter writer, ParseTree parseTree, int size) {
        DoublefuckListenerImplementation listener = new DoublefuckListenerImplementation(writer, size);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,parseTree);
    }
}
