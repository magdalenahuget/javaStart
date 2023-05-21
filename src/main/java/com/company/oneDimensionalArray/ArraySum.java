package com.company.oneDimensionalArray;

public class ArraySum {

    public static void main(String[] args) {
        int[] myFirstDimensionalArray = {1, 5, 10};
        int[] mySecondDimensionalArray = {2, 6, 11};

        int finalSum = ArrayUtils.calculateSumOfArrayElements(myFirstDimensionalArray, mySecondDimensionalArray);
        System.out.println("The final sum is: " + finalSum);
    }
}
