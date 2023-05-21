package com.company.scanner;

public class Calculator {

    public double calculate(double a, double b, String operator) {
        double sum = 0;
        //else-if
//        if (operator.equals("+")){
//            sum = a+b;
//        }
//         else if (operator.equals("-")){
//            sum = a-b;
//        }
//        else if (operator.equals("*")){
//            sum = a*b;
//        }
//        else if (operator.equals("/")){
//            sum = a/b;
//        }
//        return sum;

        //switch
        switch (operator) {
            case "+" -> sum = a + b;
            case "-" -> sum = a - b;
            case "*" -> sum = a * b;
            case "/" -> sum = a / b;
        }
        return sum;
    }
}
