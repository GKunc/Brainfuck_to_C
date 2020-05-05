import BCDfuck.BCDfuckCompiler;
import Binaryfuck.BinaryfuckCompiler;
import brainfork.BrainforkCompiler;
import brainfuck.BrainfuckCompiler;
import doublefuck.DoublefuckCompiler;
import helpers.FileHelper;
import interfaces.ICompiler;
import jdk.internal.util.xml.impl.Pair;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        String inputFilePath = null;
        String outputFilePath = null;
        String fileContent;
        BufferedWriter bufferedWriter;
        FileHelper fileHelper = new FileHelper();
        ICompiler compiler;

        try {
            inputFilePath = args[0];
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Nie podano ścieżki do pliku wejściowego!");
            return;
        }

        try {
            outputFilePath = args[1];
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Nie podano ścieżki do pliku wyjściowego!");
            System.out.println("Rezultat zostanie zapisany w katalogu języka jako 'compiledFile.c'!");
            outputFilePath = "files/compiledFile.c";
        }

        try {
            fileContent = fileHelper.readFile(inputFilePath);
        } catch (FileNotFoundException exception) {
            System.out.println("Nie można znaleźć pliku pod podaną ścieżką '" + inputFilePath + "'!");
            return;
        }

        try {
            bufferedWriter = fileHelper.createBufferWriter(outputFilePath);
        } catch (IOException e) {
            System.out.println("Błąd przy tworzeniu bufora do zapisu pliku: '" + args[1] + "'!");
            return;
        }

        compiler = createCompiler(inputFilePath);
        compiler.compile(fileContent, bufferedWriter);

        try {
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Błąd przy zamykaniu bufora do pliku!");
            return;
        }
    }

    private static ICompiler createCompiler(String filePath) {
        if(filePath.endsWith("BCDfuck")) {
            System.out.println("BCDfuck");
            return new BCDfuckCompiler();
        } else if(filePath.endsWith("brainfork")) {
            System.out.println("brainfork");
            return new BrainforkCompiler();
        } else if(filePath.endsWith("brainfuck")) {
            System.out.println("brainfuck");
            return new BrainfuckCompiler();
        } else if(filePath.endsWith("doublefuck")){
            System.out.println("doublefuck");
            return new DoublefuckCompiler();
        } else {
            System.out.println("Binaryfuck");
            return new BinaryfuckCompiler();
        }
    }
}
