package com.company.collectionsClass;

import java.util.*;

public class Lotto {
    private List<Integer> numbersGenerated;

    public List<Integer> generate() {
        numbersGenerated = new ArrayList<>();
        for (int i = 0; i < 49; i++) {
            numbersGenerated.add(i);
        }
        return numbersGenerated;
    }

    public List<Integer> randomize(List<Integer> numbersGenerated) {
        Collections.shuffle(numbersGenerated);
        return numbersGenerated;
    }

    public int checkResult(List<Integer> numbers, List<Integer> drawnNumbers) {
        int matched = 0;
        for (int i = 0; i < drawnNumbers.size(); i++) {
            for (Integer num : numbers) {
                if (num.equals(drawnNumbers.get(i))) {
                    matched++;
                    System.out.println("bingo" + num);
                }
            }
        }
        return matched;
    }

    public List<Integer> takeFirstSixNumbers(List<Integer> numbers) {
        int n = 6;
        ArrayList<Integer> firstSixElements = new ArrayList<>();
        for (int i = 0; i < n; i++)
            firstSixElements.add(numbers.get(i));
        System.out.println(firstSixElements);
        return firstSixElements;
    }
}