package com.company.methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingleStringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ola", "Ala", "Ula", "Ela", "Ewa");

//        Collections.sort(names, (name1, name2) -> name1.compareToIgnoreCase(name2));
        Collections.sort(names, String::compareToIgnoreCase);

        //interfejs Comparator jest interfejsem funkcyjnym, to w jego miejsce można przekazać
        // wyrażenie lambda lub referencję do metody albo konstruktora. Tu przekazuję referencję
        // do statycznej metody compareToIgnoreCase().

//        Comparator<String> comp = (String s1, String s2) -> s1.compareToIgnoreCase(s2);
//        Collections.sort(names, comp);

//        for (String name : names) {
//            System.out.println(name);
//        }

        names.forEach(System.out::println);
    }
}
