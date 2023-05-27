package com.company.polymorphismAndTypeCasting;

public class Nurse extends Person {
    private int overtime;

    public Nurse(String name, String surname, int salary, int overtime) {
        super(name, surname, salary);
        this.overtime = overtime;
    }

    public String getInfo() {
        return super.getInfo() + ", Overtime: " + overtime;
    }
}
