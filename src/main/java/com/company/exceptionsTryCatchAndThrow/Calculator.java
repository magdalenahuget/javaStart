package com.company.exceptionsTryCatchAndThrow;

public class Calculator {

    public double calculate(double a, double b, String operation) {

        if (operation.equals("+")) {
            return a + b;
        }
        if (operation.equals("-")) {
            return a - b;
        }
        if (operation.equals("*")) {
            return a * b;
        }
        if (operation.equals("/")) {
            if (b == 0) {
                throw new ArithmeticException("You can not divide by 0.");
            }
            return a / b;
        } else {
            throw new UnknownOperatorException("Unknown operator.");
        }
    }
}
