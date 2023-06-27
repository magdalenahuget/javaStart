package com.company.collectionsSets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();
        String fileName = "src/main/java/com/company/collectionsSets/namespl.txt";

        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
        ) {
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null) {
                names.add(nextLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        displayInfo(names);
    }

    public static void displayInfo(TreeSet<String> names) {
        System.out.println(names);
        System.out.println("Number of names: " + names.size());
        System.out.printf("First name in the set: %s\n" , names.first());
        System.out.println("Last name in the set: " + names.last());
    }
}
