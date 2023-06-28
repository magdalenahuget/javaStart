package com.company.collectionsMaps.controller;

import com.company.collectionsMaps.model.Company;
import com.company.collectionsMaps.model.Employee;
import com.company.collectionsMaps.service.EmployeeService;
import com.company.collectionsMaps.view.CompanyUi;

import java.util.Scanner;

public class CompanyController {

    private Scanner scanner = new Scanner(System.in);
    private Company company;
    private EmployeeService employeeService;
    private CompanyUi companyUI;
    private static final int ADD_EMPLOYEE = 1;
    private static final int FIND_EMPLOYEE = 2;
    private static final int DISPLAY_EMPLOYEES = 3;
    private static final int EXIT = 4;

    public CompanyController(Company company, EmployeeService employeeService, CompanyUi companyUI) {
        this.company = company;
        this.employeeService = employeeService;
        this.companyUI = companyUI;
    }


    public void handleCompany() {

        addTestData();

        int choice;
        do {
            System.out.println("Please choose \n1 to add employee, \n2 to search info about employee, \n3 to display all employees or \n4 to exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case ADD_EMPLOYEE:
                    employeeService.getUserInputAndAddEmployee(company);
                    break;
                case FIND_EMPLOYEE:
                    companyUI.displayInfoAboutEmployeeProvided(company);
                    break;
                case DISPLAY_EMPLOYEES:
                    companyUI.displayAllEmployees(company);
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("Wrong input.");
            }
        } while (choice != 4);
    }

    private void addTestData() {
        Employee employeeTest1 = new Employee("Zbigniew", "Wodecki", 10000);
        Employee employeeTest2 = new Employee("Justin", "Bieber", 2500);
        company.addEmployee(employeeTest1);
        company.addEmployee(employeeTest2);
    }
}
