package advanced_java.c07_io.bufferedreaderexample;

import java.io.*;

public class BufferedInputExample {
    public static void main(String[] args) {
        String filePath = "src/advanced_java/c07_io/example.txt";
        String outputFile = "src/advanced_java/c07_io/output.txt";
        File file = new File(filePath);
        File out = new File(outputFile);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader reader = new BufferedReader(fileReader);
             FileWriter wr = new FileWriter(out, true)) {
            reader.lines()
                    .forEach(System.out::println);
            reader.lines()
                    .forEach(str -> {
                        try {
                            wr.write(str);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
