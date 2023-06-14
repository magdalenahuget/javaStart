package com.company.filesReadingAndWriting;

import java.util.Arrays;

public class Company {

    public final int MAX_EMPLOYEES = 3;
    private Person[] employees;
    private int index = 0;

    public Company() {
        this.employees = new Person[MAX_EMPLOYEES];
    }

    public void add(Person employee) {
        employees[index] = employee;
        index++;
    }

    public Person[] getEmployees() {
        return employees;
    }

    public void setEmployees(Person[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
                StringBuilder builder = new StringBuilder();
        for (Person employee : employees ) {
            builder.append(employee.toString());
            builder.append("\n");
        }
               return builder.toString();
    }
}
