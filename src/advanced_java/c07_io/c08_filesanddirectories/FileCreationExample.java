package advanced_java.c07_io.c08_filesanddirectories;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileCreationExample {
    public static void main(String[] args) {

        FilenameFilter filter = (file, fileName) -> fileName.contains(".");
        String[] contents = new File(".").list(filter);
        Arrays.stream(contents)
                .forEach(System.out::println);

        new File("myDirectory").mkdir();
    }
}
