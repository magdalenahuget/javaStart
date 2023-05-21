package com.company.encapsulation;

public class PrintService {

    public void printDetails(Client client, double price, double discount){
        System.out.println("Welcome " + client.getFirstName()+ " " + client.getLastName());
        System.out.println("Price before discount: " + price);
        System.out.println("Amount to pay (after discount): " + discount);
    }
}
