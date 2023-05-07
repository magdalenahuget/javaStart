package com.company.inheritance.zoo;

public class Zoo {
    public static void main (String[] args) {
        Cat cat = new Cat();
        cat.setColor("Black");
        Bird bird = new Bird();
        bird.setColor("Blue");
        System.out.println("Animals make sound:");
        System.out.println("Cat:");
        cat.makeSound();

        System.out.println("Bird:");
        bird.makeSound();
    }
}
