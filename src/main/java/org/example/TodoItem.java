package org.example;

public class TodoItem {
    private final int id;

    public TodoItem(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id: " + id;
    }
}
