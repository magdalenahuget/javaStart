package com.company.streams;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsToCollection {

    private static final int DIVIDER = 10;

    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);
        // lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = numStream.map(x -> x * x)
                .limit(100)
                //      .collect(Collectors.toList()); -> to co niżej to to samo
                .toList();

        // zbiór kwadratów liczb
        Set<Integer> biggerThan5 = squareNumbers.stream()
                .filter(x -> x % 10 == 0)
                .map(x -> x / 10)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List");
        squareNumbers.forEach(x -> System.out.print(x + " ; "));
        System.out.println("\nSet");
        biggerThan5.forEach(x -> System.out.print(x + " ; "));


        // ZASTAPIENIE LAMBDY FUNKCJAMI

        Stream<Integer> numStream1 = Stream.iterate(0, x -> x + 1);
        // lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers1 = numStream1.map(StreamsToCollection::square)
                .limit(100)
                .toList();
        //zbiór kwadratów liczb
        Set<Integer> biggerThan55 = squareNumbers1.stream()
                .filter(StreamsToCollection::isDividedBy)
                .map(StreamsToCollection::divide)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List");
        squareNumbers.forEach(x -> System.out.print(x + " ; "));
        System.out.println("\nSet");
        biggerThan55.forEach(x -> System.out.print(x + " ; "));
    }

    private static int square(int x) {
        return x * x;
    }

    private static boolean isDividedBy(int x) {
        return x % DIVIDER == 0;
    }

    private static int divide(int x) {
        return x / DIVIDER;
    }
}

