package com.company.algorythmics;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        int input;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Please provide the number");
        while ((input = scanner.nextInt()) <= 100) {
            System.out.println("Please provide the next number");
            sum += input;
        }
        isEvenOrOdd(sum);
    }

    private static void isEvenOrOdd(int sum) {
        if (sum % 2 == 0) {
            System.out.println("Sum is: " + sum);
            System.out.println("EVEN");
        } else {
            System.out.println("Sum is: " + sum);
            System.out.println("ODD");

        }
    }
}

