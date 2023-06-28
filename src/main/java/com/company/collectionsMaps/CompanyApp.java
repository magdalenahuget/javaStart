package com.company.collectionsMaps;

public class CompanyApp {

    public static void main(String[] args) {
        Company company = new Company();
        EmployeeService employeeService = new EmployeeService();
        CompanyUI companyUI = new CompanyUI();
        CompanyController companyController = new CompanyController(
                company, employeeService, companyUI);
        companyController.handleCompany();
    }
}
