package brainfork;

import brainfork.antlr.BrainforkLexer;
import brainfork.antlr.BrainforkParser;
import brainfuck.BrainfuckListenerImplementation;
import brainfuck.antlr.BrainfuckLexer;
import brainfuck.antlr.BrainfuckParser;
import interfaces.ICompiler;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;

public class BrainforkCompiler implements ICompiler {
    public void compile(String sourceCode, BufferedWriter writer) {
        System.out.println("Start procesu kompilacji!");

        CommonTokenStream tokens = tokenize(sourceCode);
        BrainforkParser parser = new BrainforkParser(tokens);
        ParseTree parseTree = parser.file();
        int size = 2048;
        generateOutputCode(writer, parseTree, size);

        System.out.println("Pomyslnie wygenerowano kod!");
    }

    public CommonTokenStream tokenize(String sourceCode) {
        CharStream charStream = new ANTLRInputStream(sourceCode);
        BrainforkLexer lexer = new BrainforkLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return tokens;
    }

    public void generateOutputCode(BufferedWriter writer, ParseTree parseTree, int size) {
        BrainforkListenerImplementation listener = new BrainforkListenerImplementation(writer, size);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,parseTree);
    }
}
