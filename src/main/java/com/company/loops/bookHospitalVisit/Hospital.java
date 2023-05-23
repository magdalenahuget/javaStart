package com.company.loops.bookHospitalVisit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital {
    private List<Patient> allPatients;

    public Hospital() {
        this.allPatients = new ArrayList<>();
    }

    public List<Patient>getAllPatients(){
        return allPatients;
    }

    public void getAllPatientsToPrint(){
        int counter = 1;
        for (Patient pat:allPatients) {
            System.out.printf("--------------------------------------------%n");
            System.out.printf("%s. %s %s - %s %n", counter, pat.getLastName(), pat.getLastName(), pat.getPesel());
            System.out.printf("--------------------------------------------%n");
            counter++;
        }
    }

    public void addPatientToQueue(Patient patient) {
        if(allPatients.size() < 11){
            allPatients.add(patient);
        } else {
            System.out.println("List of patients is fully booked.");
        }
    }
}
