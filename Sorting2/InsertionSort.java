package Sorting2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class InsertionSort implements Cloneable {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\Personal\\navya\\test.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                // Print each line
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        Path file = Path.of("D:\\Personal\\navya\\test.txt");
        Stream<String> strm = Files.lines(file);
        strm.forEach(System.out::println);
    }
}

