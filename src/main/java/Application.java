import Ook.OokCompiler;
import binaryfuck.BinaryfuckCompiler;
import brainfork.BrainforkCompiler;
import brainfuck.BrainfuckCompiler;
import brainloller.BrainlollerCompiler;
import doublefuck.DoublefuckCompiler;
import helpers.FileHelper;
import interfaces.ICompiler;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

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
            if(inputFilePath.endsWith("png")) {
                fileContent = convertImageToString(inputFilePath);
            } else {
                fileContent = fileHelper.readFile(inputFilePath);
            }
            System.out.println("FileContent: " + fileContent + "\n\n\n");
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
        System.out.println("Kompilacja zakonczona!");
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Błąd przy zamykaniu bufora do pliku!");
            return;
        }
    }

    private static ICompiler createCompiler(String filePath) {
        if(filePath.endsWith("Ook")) {
            System.out.println("Ook");
            return new OokCompiler();
        } else if(filePath.endsWith("brainfork")) {
            System.out.println("brainfork");
            return new BrainforkCompiler();
        } else if(filePath.endsWith("brainfuck")) {
            System.out.println("brainfuck");
            return new BrainfuckCompiler();
        } else if(filePath.endsWith("doublefuck")){
            System.out.println("doublefuck");
            return new DoublefuckCompiler();
        } else if(filePath.endsWith("png")){
            System.out.println("brainloller");
            return new BrainlollerCompiler();
        } else {
            System.out.println("binaryfuck");
            return new BinaryfuckCompiler();
        }
    }

    private static String convertImageToString(String inputFilePath) throws IOException {
        File file = new File(inputFilePath);
        BufferedImage image = ImageIO.read(file);
        int iw = image.getWidth();
        int ih = image.getHeight();

        int widthCells = 14;
        int heightCells = 12;
        String result = "";
        for (int y = 0; y < heightCells; y++) {
            for (int x = 0; x < widthCells; x++) {
                int pixel = image.getRGB((iw/widthCells)*x + 5, (ih/heightCells)*y + 5);
                int R = (pixel >> 16) & 0xFF;
                int G = (pixel >> 8) & 0xFF;
                int B = pixel & 0xFF;
                result += String.format("(%d, %d, %d) ", R, G, B);
            }
            result += "\n";
        }

        return result;
    }
}
