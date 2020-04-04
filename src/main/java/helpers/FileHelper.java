package helpers;

import java.io.*;
import java.util.Scanner;

public class FileHelper {
    public static String readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);

        StringBuilder builder = new StringBuilder();
        while (sc.hasNextLine()) {
            builder.append(sc.nextLine());
        }

        return builder.toString();
    }

    public static BufferedWriter generateFile(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        return new BufferedWriter(writer);
    }

}
