package com.company.collectionsMaps;

import java.util.Scanner;

public class EmployeeService {
    Scanner scanner = new Scanner(System.in);

    public void getUserInputAndAddEmployee(Company company) {
        Employee employee = createEmployeeWithUserInput();

        company.addEmployee(employee);
        System.out.println("Employee added successfully.");
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
