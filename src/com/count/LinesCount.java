package com.count;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LinesCount {

    public static void main(String[] args) {

        String fileName = "src/main/resources/test.txt";
        long noOfLines = -1;


        try (Stream<String> fileStream = Files.lines(Paths.get(fileName))) {
            noOfLines = (int) fileStream.count();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(noOfLines);
    }
}
