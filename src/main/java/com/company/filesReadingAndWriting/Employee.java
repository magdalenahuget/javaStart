package com.company.filesReadingAndWriting;

public class Employee extends Person {

    private int salary;

    public Employee(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name = " + super.getName() + ", " +
                "surname = " + super.getSurname() + ", " +
                "salary = " + this.salary +
                '}';
    }
}
