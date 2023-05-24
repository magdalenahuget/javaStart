package com.company.loops.guessTheNumber;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        final int number = 500;
        int userInput;
        System.out.println("Guess the number.");

        while ((userInput = reader.nextInt()) != number) {
            if(userInput > number) {
                System.out.println("Provided number is too large, keep guessing!");
            } else {
                System.out.println("Provided number is small, keep guessing!");
            }
        }
        System.out.println("Congrats! You guessed the number!");
        reader.close();
    }
}
