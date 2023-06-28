package com.company.collectionsMaps.view;

import com.company.collectionsMaps.model.Company;
import com.company.collectionsMaps.model.Employee;

import java.util.Scanner;

public class CompanyUi {
    Scanner scanner = new Scanner(System.in);

    public void displayInfoAboutEmployeeProvided(Company company) {
        System.out.println("Please provide name:");
        String name = scanner.nextLine();
        System.out.println("Please provide surname:");
        String surname = scanner.nextLine();
        Employee employee = company.getEmployee(name, surname);
        System.out.println(employee.toString());
    }

    public void displayAllEmployees(Company company) {
        System.out.println(company.getEmployees().toString());
    }
}
