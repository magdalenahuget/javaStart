package com.company.abstractTypes;

import com.company.abstractTypes.shape.Circle;
import com.company.abstractTypes.shape.Square;
import com.company.abstractTypes.shape.Triangle;

import java.util.Scanner;

public class CalculatingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Please provide the shape to calculate area and perimeter:");
        System.out.println("1-CIRCLE, 2-TRIANGLE, 3-SQUARE");
        int shape = scanner.nextInt();
        scanner.nextLine();


        switch (shape) {
            case 1->{
                System.out.println("Please provide radius:");
                double input = scanner.nextDouble();
                scanner.nextLine();
                Circle circle = new Circle(input);
                double area = circle.calculateArea();
                double perimeter = circle.calculatePerimeter();
                System.out.println("Area is: " + area);
                System.out.println("Perimeter is: " + perimeter);
            }
            case 2->{
                System.out.println("Please provide side of the triangle:");
                double a = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Please provide height of the triangle:");
                double h = scanner.nextDouble();
                scanner.nextLine();
                Triangle triangle = new Triangle(a,h);
                double area = triangle.calculateArea();
                double perimeter = triangle.calculatePerimeter();
                System.out.println("Area is: " + area);
                System.out.println("Perimeter is: " + perimeter);
            }
            case 3->{
                System.out.println("Please provide side of the square:");
                double input = scanner.nextDouble();
                scanner.nextLine();
                Square square = new Square(input);
                double area = square.calculateArea();
                double perimeter = square.calculatePerimeter();
                System.out.println("Area is: " + area);
                System.out.println("Perimeter is: " + perimeter);
            }
            default -> System.out.println("Please provide number from 1 to 3.");
        }
    }
}
