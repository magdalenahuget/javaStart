package com.company.loops.sumNumbers;

import java.util.Scanner;

public class sumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide how many numbers you want to sum: ");
        int length = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= length; i++) {
            System.out.println("Please provide record nr: " + i);
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Sum of the provided numbers is: " + sum);

        scanner.close();


        // second solution

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Podaj ile liczb chcesz zsumować: ");
//        int numbers = sc.nextInt();
//
//        int sum = 0;
//        while (numbers-- > 0) {
//            System.out.println("Podaj kolejną liczbę: ");
//            sum = sum + sc.nextInt();
//        }
//
//        System.out.println("Suma wszystkich podanych liczb to: " + sum);
//        sc.close();
    }
}
