package com.example.java.c05_java_packages;

import com.example.java.c05_java_packages.model.Flower;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.sun.deploy.net.HttpRequest;
import sun.net.www.http.HttpClient;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/com/example/java/c05_java_packages/files/loremipsum.txt";
        String targetFile = "src/com/example/java/c05_java_packages/files/target.txt";

//        try (FileReader fr = new FileReader(filePath);
//             BufferedReader br = new BufferedReader(fr);
//             FileWriter writer = new FileWriter(targetFile);) {
//            while (true) {
//                String line = br.readLine();
//                if (line == null) {
//                    break;
//                }
//                writer.write(line + "\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        List<String> filePathList = Arrays.asList(filePath.split("/"));
//        String directory = String.join("/", filePathList.subList(0, filePathList.size()-1));
//        String sourceFile = filePathList.get(filePathList.size()-1);
//        System.out.println(directory);
//        System.out.println(sourceFile);
//        Path sourcePath = Paths.get(directory, sourceFile);
//        String[] targetPathArray = targetFile.split("/");
//        Path targetPath = Paths.get(directory, targetPathArray[targetPathArray.length-1]);
//        try {
//            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String  json_path = "src/com/example/java/c05_java_packages/files/data.json";
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(json_path);
             JsonReader jsonReader = new JsonReader(reader);) {
            Flower[] data = gson.fromJson(jsonReader, Flower[].class);
            for (Flower flower: data) {
                System.out.println(flower);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
