package com.company.enumType;

import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        System.out.println("Available pizzas in our pizzeria:");
        for (Pizza pizza : Pizza.values()) {
            System.out.println(pizza);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your pizza:");
        String choice = scanner.nextLine();
        Pizza choosenPizza = Pizza.valueOf(choice);

        System.out.println("Thanks for ordering " + choosenPizza + "! We will prepare it ASAP!");
        scanner.close();
    }
}
