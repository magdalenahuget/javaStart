package com.company.abstractTypes.shape;

public class Square implements Shape {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
