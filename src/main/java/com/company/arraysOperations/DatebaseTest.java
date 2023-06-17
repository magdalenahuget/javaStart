package com.company.arraysOperations;

public class DatebaseTest {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.add(new Person("Justin", "Bieber", "963"));
        database.add(new Person("Jacek", "Stachurski", "852"));
        database.add(new Person("Maryla", "Rodowicz", "741"));
        database.add(new Person("Robert", "Makłowicz", "963"));
        Person person = database.get(1);
        System.out.println(person);
        System.out.println(database);
        database.remove(new Person("Robert", "Makłowicz", "963"));
        System.out.println(database);
    }
}
