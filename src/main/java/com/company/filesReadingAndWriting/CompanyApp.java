package com.company.filesReadingAndWriting;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CompanyApp {

    static Scanner scanner = new Scanner(System.in);
    static String fileName = "src/main/java/com/company/filesReadingAndWriting/company.txt";

    public static void main(String[] args) {

        Company company = createCompany();
        writeFile(company);

        System.out.println("Press 'r' to read from the file the list of employees.");
        String r  = scanner.nextLine();
        if(r.equals("r")){
            readFile();
        }

    }

    private static void writeFile(Company company) {
        String fileName = "src/main/java/com/company/filesReadingAndWriting/company.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write(company.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File writing failed.");
        }
    }

    private static void readFile() {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File writing failed.");
        }
    }

    static Company createCompany() {
        Company company = new Company();
        int i = 0;
        while (i < 3) {
            System.out.println("Please provide name:");
            String name = scanner.nextLine();
            System.out.println("Please provide surname:");
            String surname = scanner.nextLine();
            System.out.println("Please provide salary:");
            int salary = scanner.nextInt();
            scanner.nextLine();
            Person employee4 = new Employee(name, surname, salary);
            company.add(employee4);
            i++;
        }
        return company;
    }
}
