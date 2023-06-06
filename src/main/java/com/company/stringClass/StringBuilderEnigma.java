package com.company.stringClass;

import java.util.Scanner;

public class StringBuilderEnigma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the number of words:");
        int wordsNumber = scanner.nextInt();
        scanner.nextLine();

        String[] wordsProvided = new String[wordsNumber];
        for (int i = 0; i < wordsNumber; i++) {
            System.out.println("Please provide word number " + (i + 1) + ":");
            wordsProvided[i] = scanner.nextLine();
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < wordsNumber; i++) {
            builder.append(wordsProvided[i].charAt(wordsProvided[i].length() - 1));
        }
        System.out.println("New word is following: " + builder.toString());

        scanner.close();
    }
}
