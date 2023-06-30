package com.company.collectionsQueues.model;

public enum Option {

    EXIT(0, "EXIT"),
    ADD(1, "Add a new task"),
    TAKE(2, "Show and do the next task"),
    DISPLAY_ALL(3, "Display todo list");

    int option;
    String description;

    Option(int option, String description) {
        this.option = option;
        this.description = description;
    }

    public static Option createFromInt(int option) {
        return values()[option];
    }

    @Override
    public String toString() {
        return option + "-" + description;
    }
}