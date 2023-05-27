package com.company.polymorphismAndTypeCasting;

public class Doctor extends Person {
    private int bonus;

    public Doctor(String name, String surname, int salary, int bonus) {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    public String getInfo() {
        return super.getInfo() + ", Bonus: " + bonus;
    }
}
