package com.company.collectionsLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    public static final String EXIT = "exit";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillList(numbers);
        printData(numbers);
    }

    static void fillList(List<Double> list) {
        System.out.println("Please provide the number to sum (or type \"exit\"):");

        String input = scanner.nextLine();
        if (input.equals(EXIT)){
            return;
        }
        try {
            Double num = Double.valueOf(input);
            list.add(num);
        } catch (NumberFormatException e){
            System.err.println("Liczba w niepoprawnym formacie");
        }
        fillList(list);
    }

    static void printData(List<Double> list){
        StringBuilder stringBuilder = new StringBuilder();
        double sum = 0;
        for(double d: list){
            stringBuilder.append(d);
            stringBuilder.append(" + ");
            sum += d;
        }

        stringBuilder.replace(stringBuilder.length()-2, stringBuilder.length(), "= ");
        stringBuilder.append(sum);
        System.out.println(stringBuilder.toString());
    }
}
