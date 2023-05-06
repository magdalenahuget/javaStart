package com.company.methodsAndConstructors.constuctors;

public class Computer {
    String processor;
    int memory;

    Computer(String proc, int mem){
        processor = proc;
        memory = mem;
        System.out.println("Właśnie tworzę nowy komputer.");
    }

    void printInfo(){
        System.out.println(processor + " " + memory);
    }
}
