package com.company.staticFieldsAndMethods;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String idNumber;
    private static int studentsNumber;

    Student(String firstName, String lastName, String idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        studentsNumber++;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
    }
}
