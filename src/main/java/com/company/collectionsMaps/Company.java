package com.company.collectionsMaps;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<String, Employee> employees = new HashMap<>();

    public boolean addEmployee(Employee employee) {
        String key = employee.getName() + " " + employee.getSurname();

        if(employees.containsKey(key)){
            return false;
        }
        employees.put(key, employee);
        System.out.println(employees.toString());
        return true;
    }

    public Employee getEmployee(String name, String surname) {
        String key = name + " " + surname;
        System.out.println(key);
        return employees.get(key);
    }

    public Map<String, Employee> getEmployees() {
        return employees;
    }
}
