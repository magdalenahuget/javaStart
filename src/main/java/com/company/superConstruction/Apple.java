package com.company.superConstruction;

public class Apple extends Fruit {
    String variety;

    Apple(double weight, String type, String variety) {
        super(weight, type);
        this.variety = variety;
    }

    @Override
    String getInfo(){
        return  super.getInfo() + ", its variety is: " + variety;
    }
}
