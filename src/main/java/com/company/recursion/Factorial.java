package com.company.recursion;

import com.company.filesReadingAndWriting.Employee;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

    public static void main(String[] args) {

        //0! = 1
        //3! = 1 * 2 * 3
        int factorialArgument = 3;
        int result = factorial(factorialArgument);
        System.out.println("Silnia " + factorialArgument + " = " + result);
    }

    static int factorial(int n) {
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}
