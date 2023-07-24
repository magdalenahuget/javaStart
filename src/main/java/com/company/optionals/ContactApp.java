package com.company.optionals;

import java.util.Optional;
import java.util.Scanner;

class ContactApp {
    public static void main(String[] args) {
        String fileName = "src/main/java/com/company/optionals/contacts.csv";
        ContactReader.readFile(fileName)
                .ifPresentOrElse(ContactApp::findByEmail, ContactApp::fileNotFoundMessage);
    }

    private static void findByEmail(ContactManager contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide email address to search contact details:");
        String email = scanner.nextLine();
        contactManager.findByEmail(email)
                        .ifPresentOrElse(ContactApp::showShortInfo, ContactApp::contactNotFoundMessage);
    }

    private static void fileNotFoundMessage() {
        System.out.println("There is no file.");
    }

    private static void showShortInfo(Contact contact) {
        System.out.println("Here is a searched contact number:");
        System.out.println(contact.getShortInfo());
    }

    private static void contactNotFoundMessage(){
        System.out.println("There is no contact details for pointed address email.");
    }
}