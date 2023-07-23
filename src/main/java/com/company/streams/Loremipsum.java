package com.company.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Loremipsum {
    public static void main(String[] args) throws IOException {

        final String fileName = "src/main/java/com/company/streams/loremipsumText";
        FileReader filereader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(filereader);
        List<String> words = new ArrayList<>();
        String textElement = null;

        while ((textElement = bufferedReader.readLine()) != null){
            words.addAll(Arrays.asList(textElement.split(" ")));
        }

        words = words.stream()
                .map(s -> s.replaceAll(",",""). replaceAll("\\.", ""))
                .collect(Collectors.toList());

        long countWords = words.stream().filter(word -> word.startsWith("s"))
                .peek(word-> System.out.println(word+ " "))
                .count();
        System.out.println();

        long fiveLetters =  words.stream()
                .filter(word -> word.length() == 5)
                .peek(word -> System.out.println(word + " "))
                .count();
        System.out.println();

        System.out.println("Liczba wyrazów na 's':" + countWords);
        System.out.println("Liczba wyrazów na na 5 liter: " + fiveLetters);

        bufferedReader.close();
    }
}
