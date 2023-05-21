package com.company.oneDimensionalArray;

public class ArrayUtils {
    public static int calculateSumOfArrayElements(int[] arr1, int[] arr2) {
        return sumArrayElements(arr1) + sumArrayElements(arr2);
    }

    private static int sumArrayElements(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }
}
