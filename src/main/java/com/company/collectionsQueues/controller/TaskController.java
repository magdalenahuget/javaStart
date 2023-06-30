package com.company.collectionsQueues.controller;

import com.company.collectionsQueues.TaskManager;
import com.company.collectionsQueues.model.Option;
import com.company.collectionsQueues.model.Priority;
import com.company.collectionsQueues.model.Task;
import com.company.collectionsQueues.model.ToDoList;

import java.util.Scanner;

public class TaskController {

    TaskManager taskManager = new TaskManager();
    Scanner scanner = new Scanner(System.in);
    ToDoList toDoList = new ToDoList();

    public void handleToDoList() {
        Option option;
        do {
            System.out.println("Please choose option:");
            TaskManager.printOptions();
            option = Option.createFromInt(scanner.nextInt());
            scanner.nextLine();
            switch (option) {
                case EXIT:
                    System.out.println("Bye!");
                    break;
                case ADD:
                    taskManager.addTask();
                    break;
                case TAKE:
                    Task mostImportantTask = toDoList.takeTheHigherImportantTask();
                    System.out.println("Next task to do is: " + mostImportantTask);
                    break;
                case DISPLAY_ALL:
                    toDoList.display();
                    break;
            }
        } while (option != Option.EXIT);
    }

    public void addTestData(){
        Task task1 = new Task("Eat breakfast", "8 o'clock", Priority.HIGH);
        Task task2 = new Task("Drink water", "8 glasses", Priority.HIGH);
        Task task3 = new Task("Water plants", "Balcony", Priority.LOW);
        Task task4 = new Task("Buy milk", "1,5%", Priority.LOW);
        Task task5 = new Task("Learn java", "2h", Priority.MODERATE);

        toDoList.addNewTask(task4);
        toDoList.addNewTask(task3);
        toDoList.addNewTask(task2);
        toDoList.addNewTask(task1);
        toDoList.addNewTask(task5);
    }
}
