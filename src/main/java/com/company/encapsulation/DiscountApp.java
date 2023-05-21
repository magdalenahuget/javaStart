package com.company.encapsulation;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Anna", "Kowalska", true);
        double price1 = 1100;

        Client client2 = new Client("Roman", "Sienkiewicz", false);
        double price2 = 1100;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        System.out.println("Welcome " + client1.getFirstName() + " " + client1.getLastName());
        System.out.println("Price before discount: " + price1);
        System.out.println("Amount to pay (after discount): " + priceDiscount1);

        PrintService printService1 = new PrintService();
        printService1.printDetails(client1, price1, priceDiscount1);

        PrintService printService2 = new PrintService();
        printService2.printDetails(client2, price2, priceDiscount2);
    }
}
