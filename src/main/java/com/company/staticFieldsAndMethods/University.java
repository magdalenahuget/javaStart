package com.company.staticFieldsAndMethods;

public class University {
    public static void main(String[] args) {

        Student student1 = new Student("Zbigniew", "Wodecki", "123");
        Student student2 = new Student("Jacek", "Stachurski", "321");

        System.out.println("Number of enrolled students: "+Student.getStudentsNumber());
    }

}
