package com.company.exceptionsTryCatchAndThrow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        String operator = null;

        boolean readDataComplete = false;
        while (!readDataComplete) {
            try {
                System.out.println("Please provide the first number:");
                a = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Please provide operator (+, -, * or /):");
                operator = scanner.nextLine();
                System.out.println("Please provide second number:");
                b = scanner.nextDouble();
                readDataComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong data provided.");
                scanner.nextLine();
            }
        }
        try{
            double result = calculator.calculate(a,b,operator);
            System.out.println(a + operator + b + " = " + result);

        } catch (UnknownOperatorException | ArithmeticException e){
            System.err.println(e.getMessage());
            System.err.println("Calculation failed " + a + operator + b);
        }
    }
}