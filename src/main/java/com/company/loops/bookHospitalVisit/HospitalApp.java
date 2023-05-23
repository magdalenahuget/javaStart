package com.company.loops.bookHospitalVisit;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        runApp(scanner, hospital);
    }

    private static void runApp(Scanner scanner, Hospital hospital) {
        while (true) {
            displayMenuChoice();
            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> registrationProcedure(scanner, hospital);
                case 2 -> hospital.getAllPatientsToPrint();
            }
        }
    }

    private static void displayMenuChoice() {
        System.out.println("Press 0 - to exit");
        System.out.println("Press 1 - to register");
        System.out.println("Press 2 - to display list of patients");
    }

    private static void registrationProcedure(Scanner scanner, Hospital hospital) {
        System.out.println("Welcome in patients registration!");
        System.out.println("Please provide your first name: ");
        String firstName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Please provide your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Please provide your pesel: ");
        String peselId = scanner.nextLine();
        Patient patient1 = new Patient(firstName, lastName, peselId);
        hospital.addPatientToQueue(patient1);
        System.out.println("Patient registered successfully!");
    }
}
