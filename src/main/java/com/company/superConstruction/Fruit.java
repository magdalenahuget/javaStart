package com.company.superConstruction;

public class Fruit {
    double weight;
    String type;

    Fruit(double weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    String getInfo() {
        return "This fruit has weight: " + weight + " g, its type is: " + type;
    }
}

