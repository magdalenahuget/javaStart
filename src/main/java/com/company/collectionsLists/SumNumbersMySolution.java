package com.company.collectionsLists;

import java.util.Objects;
import java.util.Scanner;


public class SumNumbersMySolution {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        collectNumbers();
    }

    public static void collectNumbers() {
        String input;
        int sum = 0;
        StringBuilder turboString = new StringBuilder();

        System.out.println("Hello, please provide numbers to sum. If you provided all, please type 'exit'.");
        do {
            System.out.println("Please provide the number or type 'exit' ");
            input = scanner.nextLine();

            if (Objects.equals(input, "exit")) {
                break;
            }
            sum += Integer.parseInt(input);
            turboString.append(input).append(" + ");
        } while (true);
        System.out.println(turboString + " = " + sum);
    }
}