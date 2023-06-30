package com.company.collectionsQueues.service;

import com.company.collectionsQueues.model.Option;
import com.company.collectionsQueues.model.Priority;
import com.company.collectionsQueues.model.Task;
import com.company.collectionsQueues.model.ToDoList;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {

    Scanner scanner = new Scanner(System.in);
    ToDoList toDoList = new ToDoList();

    public static void printOptions() {
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value);
        }
    }

    public void addTask() {
        System.out.println("Please provide task name:");
        String name = scanner.nextLine();
        System.out.println("Please provide task description:");
        String description = scanner.nextLine();
        System.out.println("Please provide task priority:");
        System.out.println("1-HIGH\n 2-MODERATE\n 3-LOW");
        int range = scanner.nextInt();
        Priority priority = null;
        switch (range) {
            case 1:
                priority = Priority.HIGH;
                break;
            case 2:
                priority = Priority.MODERATE;
                break;
            case 3:
                priority = Priority.LOW;
                break;
        }

        Task task = new Task(name, description, priority);
        toDoList.addNewTask(task);
        System.out.println(toDoList.getToDoList());
    }
}
