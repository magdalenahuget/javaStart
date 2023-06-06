package com.company.stringClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringBuilderFirst {
    public static void main(String[] args) {
        List<String> wordsProvided = new ArrayList<>();
        List<String> stringFromLastLetters = new ArrayList<>();

        System.out.println("Please provide number:");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please provide" + inputNumber + "word/s:");
        for (int i = 1; i <= inputNumber; i++) {
            System.out.println("Please provide word " + i);
            String input = scanner.nextLine();
            wordsProvided.add(input);
        }
        scanner.close();

        for (int i = 0; i < wordsProvided.size(); i++) {
            String word = wordsProvided.get(i);
            String substractedLetter = word.substring(word.length() - 1);
            stringFromLastLetters.add(substractedLetter);
        }
        String result = String.join("", stringFromLastLetters);
        System.out.println("New created word is: " + result);
    }
}
