package com.company.methodsAndConstructors.constuctors;

public class Constructors {
    public static void main(String[] args) {

        Computer comp1 = new Computer("Intel i10", 1234);
        Computer comp2 = new Computer("AMD Ryzen 1200", 5678);

        comp1.printInfo();
        comp2.printInfo();
    }
}