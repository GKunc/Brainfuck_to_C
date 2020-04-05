import BCDfuck.BCDfuckCompiler;
import brainfork.BrainforkCompiler;
import brainfuck.BrainfuckCompiler;
import doublefuck.DoublefuckCompiler;
import helpers.FileHelper;
import interfaces.ICompiler;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        String inputFilePath = args[0];
        String outputFilePath = args[1];
        String fileContent;

        BufferedWriter bufferedWriter;

        FileHelper fileHelper = new FileHelper();
        ICompiler compiler = createCompiler(inputFilePath);

        if(inputFilePath == null) {
            System.out.println("Nie podano ścieżki do pliku wejściowego!");
            return;
        }
        if(outputFilePath == null) {
            System.out.println("Nie podano ścieżki do pliku wyjściowego!");
            System.out.println("Rezultat zostanie zapisany w katalogu języka jako 'compiledFile.c'!");
        }

        try {
            fileContent = fileHelper.readFile(inputFilePath);
        } catch (FileNotFoundException exception) {
            System.out.println("Nie można znaleźć pliku pod podaną ścieżką" + "'" + inputFilePath + "'!");
            return;
        }

        try {
            bufferedWriter = fileHelper.createBufferWriter(outputFilePath);
        } catch (IOException e) {
            System.out.println("Błąd przy tworzeniu bufora do zapisu pliku: '" + args[1] + "'!");
            return;
        }

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
            return new BCDfuckCompiler();
        } else if(filePath.endsWith("brainfork")) {
            return new BrainforkCompiler();
        } else if(filePath.endsWith("brainfuck")) {
            return new BrainfuckCompiler();
        } else {
            return new DoublefuckCompiler();
        }
    }
}
