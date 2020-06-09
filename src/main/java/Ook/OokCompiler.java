package Ook;

import Ook.antlr.OokLexer;
import Ook.antlr.OokParser;
import interfaces.ICompiler;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;

public class OokCompiler implements ICompiler {
    public void compile(String sourceCode, BufferedWriter writer) {
        System.out.println("Start procesu kompilacji!");

        CommonTokenStream tokens = tokenize(sourceCode);
        OokParser parser = new OokParser(tokens);
        ParseTree parseTree = parser.file();
        int size = 2048;
        generateOutputCode(writer, parseTree, size);

        System.out.println("Pomyslnie wygenerowano kod!");
    }

    public CommonTokenStream tokenize(String sourceCode) {
        CharStream charStream = new ANTLRInputStream(sourceCode);
        OokLexer lexer = new OokLexer(charStream);
        return new CommonTokenStream(lexer);
    }

    public void generateOutputCode(BufferedWriter writer, ParseTree parseTree, int size) {
        OokListenerImplementation listener = new OokListenerImplementation(writer, size);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,parseTree);
    }
}
