package com.company.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoremipsumBest {

    public static void main(String[] args) {

        final String fileName= "src/main/java/com/company/streams/loremipsumText";

        List<String> words = null;
        try{
            words = readFile(fileName);
            showWordStats(words);

        } catch (IOException e){
            System.err.println("Błąd odczytu pliku " + fileName);
        }

    }

    private static void showWordStats(List<String> words) {
        long countWordsWithS = words.stream()
                .filter(word-> word.startsWith("s"))
                .count();

        long count5Letters= words.stream()
                .filter(word-> word.length() == 5)
                .count();

        System.out.println("Start with S: " + countWordsWithS);
        System.out.println("5 letters words: " + count5Letters);
    }

    private  static List<String> readFile (String fileName) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
        List<String> words = new ArrayList<>();
        return reader.lines()
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .map(element-> element.replaceAll(",", "".replaceAll("\\.", "")))
                .collect(Collectors.toList());
        }
    }
}
