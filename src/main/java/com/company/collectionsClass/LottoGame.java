package com.company.collectionsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lotto lotto = new Lotto();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbersGenerated;
        List<Integer> numbersShuffled;

        System.out.println("---This is a Lotto Game!---");

        System.out.println("---This is a simply generated list---");
        numbersGenerated = lotto.generate();
        System.out.println(numbersGenerated);
        System.out.println("---This is shuffled list---");
        numbersShuffled = lotto.randomize(numbersGenerated);
        System.out.println(numbersShuffled);
        System.out.println("---This are 6 drawn numbers---");
        numbersShuffled = lotto.takeFirstSixNumbers(numbersShuffled);

        int input = 0;
        int counter = 0;
        do {
            System.out.println("Welcome, now choose your 6 numbers for today!");
            System.out.println("Please provide the number:");
            input = scanner.nextInt();
            numbers.add(input);
            counter++;
        } while (counter < 6);
        System.out.println("---Your 6 chosen numbers---");
        System.out.println(numbers.toString());

        System.out.println("You hit " + lotto.checkResult(numbersShuffled, numbers) + " numbers today!");
        System.out.println("Thank you!");
    }
}
