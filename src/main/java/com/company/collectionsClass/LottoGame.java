package com.company.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LottoGame {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lotto lotto = new Lotto();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbersGenerated;
        List<Integer> numbersShuffled;



        numbersGenerated = lotto.generate();
        System.out.println("After generation");
        System.out.println(numbersGenerated);
        numbersShuffled = lotto.randomize(numbersGenerated);
        System.out.println("After shuffle:");
        System.out.println(numbersShuffled);

        numbersShuffled = lotto.takeFirstSixNumbers(numbersShuffled);
        System.out.println(numbersShuffled);
        System.out.println("-------");


        int input = 0;
        int counter = 0;
        do {
            System.out.println(counter);
            System.out.println("Please provide 6 numbers:");
            input = scanner.nextInt();
            numbers.add(input);
            System.out.println(numbers.toString());
            counter++;
        } while (counter < 6);
        System.out.println(numbers.toString());


        System.out.println(lotto.checkResult(numbersShuffled, numbers));
        System.out.println("The end");
    }
}
