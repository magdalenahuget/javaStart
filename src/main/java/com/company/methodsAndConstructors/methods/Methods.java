package com.company.methodsAndConstructors.methods;

import com.company.methodsAndConstructors.methods.Calculator;

public class Methods {
    public static void main(String[] args) {

        double x = 15;
        double y = 5.5;

        Calculator calculator = new Calculator();
        double add = calculator.add(x, y);
        System.out.println(x + "+" + y + "="+ add);
        System.out.println("A = " + x + ", B = " + y);
        System.out.println("A+B = " + calculator.add(x, y));
        System.out.println("A-B = " + calculator.subtract(x, y));
        System.out.println("A*B = " + calculator.multiply(x, y));
        System.out.println("A/B = " + calculator.divide(x, y));
    }
}