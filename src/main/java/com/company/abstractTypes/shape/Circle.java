package com.company.abstractTypes.shape;

import java.util.PrimitiveIterator;

public class Circle implements Shape {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(r, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * r;
    }
}
