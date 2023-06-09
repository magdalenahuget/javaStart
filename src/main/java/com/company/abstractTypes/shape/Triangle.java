package com.company.abstractTypes.shape;

public class Triangle implements Shape {
    private final double a;
    private final double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return a * h / 2;
    }

    @Override
    public double calculatePerimeter() {
        return a * 3;
    }
}
