package com.company.collectionsMaps.service;

import com.company.collectionsMaps.model.Company;
import com.company.collectionsMaps.model.Employee;

import java.util.Scanner;

public class EmployeeService {
    Scanner scanner = new Scanner(System.in);

    public void getUserInputAndAddEmployee(Company company) {
        Employee employee = createEmployeeWithUserInput();

        boolean isAlreadyAdded = company.addEmployee(employee);
        if (isAlreadyAdded) {
            System.out.println("Employee is already in the company.");
        } else {
            System.out.println("Employee added successfully.");
        }
    }

    private Employee createEmployeeWithUserInput() {
        System.out.println("Please provide name:");
        String name = scanner.nextLine();
        System.out.println("Please provide surname:");
        String surname = scanner.nextLine();
        System.out.println("Please provide salary:");
        double salary = scanner.nextDouble();

        scanner.nextLine();
        return new Employee(name, surname, salary);
    }
}
