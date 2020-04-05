package brainfuck;

import brainfuck.antlr.BrainfuckLexer;
import brainfuck.antlr.BrainfuckParser;
import interfaces.ICompiler;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;

@SuppressWarnings("deprecation")
public class BrainfuckCompiler implements ICompiler {
    public void compile(String sourceCode, BufferedWriter writer) {
        System.out.println("Start procesu kompilacji!");

        CommonTokenStream tokens = tokenize(sourceCode);
        BrainfuckParser parser = new BrainfuckParser(tokens);
        ParseTree parseTree = parser.file();
        int size = 2048;
        generateOutputCode(writer, parseTree, size);

        System.out.println("Pomyslnie wygenerowano kod!");
    }

    public CommonTokenStream tokenize(String sourceCode) {
        CharStream charStream = new ANTLRInputStream(sourceCode);
        BrainfuckLexer lexer = new BrainfuckLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return tokens;
    }

    public void generateOutputCode(BufferedWriter writer, ParseTree parseTree, int size) {
        BrainfuckListenerImplementation listener = new BrainfuckListenerImplementation(writer, size);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,parseTree);
    }
}
