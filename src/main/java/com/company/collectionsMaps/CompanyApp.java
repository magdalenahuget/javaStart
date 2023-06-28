package com.company.collectionsMaps;

import com.company.collectionsMaps.controller.CompanyController;
import com.company.collectionsMaps.model.Company;
import com.company.collectionsMaps.service.EmployeeService;
import com.company.collectionsMaps.view.CompanyUi;

public class CompanyApp {

    public static void main(String[] args) {
        Company company = new Company();
        EmployeeService employeeService = new EmployeeService();
        CompanyUi companyUI = new CompanyUi();
        CompanyController companyController = new CompanyController(
                company, employeeService, companyUI);
        companyController.handleCompany();
    }
}
