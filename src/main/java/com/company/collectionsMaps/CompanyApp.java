package com.company.collectionsMaps;

import java.util.Scanner;

public class CompanyApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        Company company = new Company();
        EmployeeService employeeService = new EmployeeService();
        CompanyUI companyUI = new CompanyUI();

        Employee employeeTest1 = new Employee("Zbigniew", "Wodecki", 10000);
        Employee employeeTest2 = new Employee("Justin", "Bieber", 2500);
        company.addEmployee(employeeTest1);
        company.addEmployee(employeeTest2);

        do {
            System.out.println("Please choose \n1 to add employee, \n2 to search info about employee, \n3 to display all employees or \n4 to exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    employeeService.getUserInputAndAddEmployee(company);
                    break;
                case 2:
                    companyUI.displayInfoAboutEmployeeProvided(company);
                    break;
                case 3:
                    companyUI.displayAllEmployees(company);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong input.");
            }
        } while (choice != 4);
    }
}
