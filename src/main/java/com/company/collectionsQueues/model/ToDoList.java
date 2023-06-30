package com.company.collectionsQueues.model;

import java.util.PriorityQueue;
import java.util.Queue;

public class ToDoList {

    private Queue<Task> toDoList = new PriorityQueue<>();

    public Queue<Task> getToDoList() {
        return toDoList;
    }

    public void addNewTask(Task task) {
        toDoList.offer(task);
        System.out.println("Task added" + task);
    }

    public Task takeTheHigherImportantTask() {
        return toDoList.poll();
    }

    public void display() {
        Queue<Task> toDoList = getToDoList();
        int counter = 1;
        for (Task task: toDoList) {
            System.out.println(counter + ". " + task.toString());
            counter++;
        }
    }
}

