package com.company.objectClassAndMethods;

public class DataStore {
    private static final int MAX_COMPUTERS = 100;

    Computer[] computers = new Computer[MAX_COMPUTERS];
    int computersNumber;

    void add(Computer computer) {
        if (computersNumber < MAX_COMPUTERS && computer != null) {
            computers[computersNumber] = computer;
            computersNumber++;
        }
    }

    public int getComputersNumber() {
        return computersNumber;
    }

    public void setComputersNumber(int computersNumber) {
        this.computersNumber = computersNumber;
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        for (int i = 0; i < computersNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    int checkAvailability (Computer find){
            if (find == null)
                return 0;

            int count = 0;
            for (int i = 0; i < computersNumber; i++) {
                if (find.equals(computers[i]))
                    count++;
            }
            return count;
        }
    }