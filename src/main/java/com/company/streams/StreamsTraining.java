package com.company.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamsTraining {
    public static void main(String[] args) {


        int[] numbers = IntStream.iterate(0, x -> x + 1)
                .filter(x -> x > 100 && x < 1000 && x % 5 == 0)
                .limit(11)
                .map(x -> x * 3)
                .toArray();
        System.out.println(Arrays.toString(numbers));


    }
}
