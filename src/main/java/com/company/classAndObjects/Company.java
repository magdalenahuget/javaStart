package com.company.classAndObjects;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Roman";
        employee1.surname = "Romanski";
        employee1.birthYear = 1990;
        employee1.seniority = 3;

        Employee employee2 = new Employee();
        employee2.name = "Romana";
        employee2.surname = "Romanska";
        employee2.birthYear = 1999;
        employee2.seniority = 2;

        Employee employee3 = new Employee();
        employee3.name = "Romuald";
        employee3.surname = "Rogal";
        employee3.birthYear = 1980;
        employee3.seniority = 1;

        System.out.println("Company workers: ");
        System.out.println(employee1.name + " " + employee1.surname + ", birth year: " + employee1.birthYear + ", seniority: "
                + employee1.seniority);
        System.out.println(employee2.name + " " + employee2.surname + ", birth year: " + employee2.birthYear + ", seniority: "
                + employee2.seniority);
        System.out.println(employee3.name + " " + employee3.surname + ", birth year: " + employee3.birthYear + ", seniority: "
                + employee3.seniority);
    }
}
