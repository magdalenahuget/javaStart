package com.company.iterators;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PeopleIterator {
    public static void main(String[] args) {
        Map<String, Person> people = new TreeMap<>();

        people.put("Bieber", new Person("Justin", "Bieber", 30));
        people.put("Mars", new Person("Bruno", "Mars", 40));
        people.put("Martin", new Person("Rickie", "Martin", 30));
        people.put("Iglessias", new Person("Enrique", "Iglessias", 50));
        people.put("Krawczyk", new Person("Krzysztof", "Krawczyk", 70));

        Collection<Person> values = people.values();
        Iterator<Person> iterator = values.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
