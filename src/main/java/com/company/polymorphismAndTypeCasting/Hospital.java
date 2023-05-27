package com.company.polymorphismAndTypeCasting;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Person> employees;

    public Hospital() {
        this.employees = new ArrayList<>();
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public void addEmployee(Person employee) {
        employees.add(employee);
    }

    public String printInfo() {
        String info = "";
        System.out.println("Hospital staff:");
        for (int i = 0; i < employees.size(); i++) {
            info = info + employees.get(i).getInfo()+ "\n";
        }
        return info;
    }
}
