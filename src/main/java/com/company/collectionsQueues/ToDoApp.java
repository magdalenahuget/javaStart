package com.company.collectionsQueues;

import com.company.collectionsQueues.controller.TaskController;

public class ToDoApp {
    public static void main(String[] args) {

        TaskController taskController = new TaskController();
        taskController.addTestData();
        taskController.handleToDoList();
    }
}
