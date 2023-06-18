package com.company.comparableAndComparator;

import java.util.Arrays;

public class SortArrayOfItems {
    public static void main(String[] args) {

        Integer[] numbers = {3, 2, 5, 1, 4, 7, 11, 15, 1, 7, 15, 16, 17, 20, 21, 12, 13, 14, 25, 7};

        System.out.println("-------UNSORTED--------");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, new NumberComparatorDescending());
        System.out.println("-----DESCENDING--------");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, new NumberComparatorAscending());
        System.out.println("------ASCENDING-------");
        System.out.println(Arrays.toString(numbers));
    }
}
