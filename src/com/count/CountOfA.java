package com.count;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOfA {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/test.txt"));
        int count = 0;
        while (reader.ready()) {
            for (char symbol : reader.readLine().toCharArray()) {
                if (symbol == 'a') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
