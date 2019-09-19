package streamsjava9.ch03_functionalinterfaces;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.function.Consumer;

public class ComposingConsumer {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("filename.txt");
        Consumer<String> logger = writer::println;
        Consumer<String> screener = System.out::println;

        Consumer<String> both = screener.andThen(logger);

        both.accept("Program started");
    }

}
