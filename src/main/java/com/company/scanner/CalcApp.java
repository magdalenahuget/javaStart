package com.company.scanner;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide first value:");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Provide operator: +,-,* or /");
        String operator = scanner.nextLine();
        System.out.println("Provide second value:");
        double b = scanner.nextDouble();
        Calculator calculator = new Calculator();
        double result = calculator.calculate(a, b, operator);
        System.out.println("The result is: " + result);

        scanner.close();
    }
}
