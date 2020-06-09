package brainloller;

import brainloller.antlr.brainlollerLexer;
import brainloller.antlr.brainlollerParser;
import interfaces.ICompiler;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;
import java.io.IOException;

@SuppressWarnings("deprecation")
public class BrainlollerCompiler implements ICompiler {
    public void compile(String sourceCode, BufferedWriter writer) throws IOException {
        System.out.println("Start procesu kompilacji!");

        CommonTokenStream tokens = tokenize(sourceCode);
        brainlollerParser parser = new brainlollerParser(tokens);
        ParseTree parseTree = parser.file();
        System.out.println(parseTree.getChildCount());
        int size = 2048;
        generateOutputCode(writer, parseTree, size);

        System.out.println("Pomyslnie wygenerowano kod!");
    }

    public CommonTokenStream tokenize(String sourceCode) {
        CharStream charStream = new ANTLRInputStream(sourceCode);
        brainlollerLexer lexer = new brainlollerLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return tokens;
    }

    public void generateOutputCode(BufferedWriter writer, ParseTree parseTree, int size) {
        BrainlollerListenerImplementation listener = new BrainlollerListenerImplementation(writer, size);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,parseTree);
    }
}
