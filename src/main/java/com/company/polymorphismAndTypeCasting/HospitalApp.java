package com.company.polymorphismAndTypeCasting;

public class HospitalApp {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        hospital.addEmployee(new Doctor("Maciek", "Prefeska", 7500, 1300));
        hospital.addEmployee(new Nurse("Ania", "Dobroszewska", 2200, 6));
        hospital.addEmployee(new Nurse("Marta", "Danielska", 2100, 3));

        System.out.println("Pracownicy szpitala: ");
        System.out.println(hospital.printInfo());
    }
}
