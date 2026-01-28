package org.example.todolist;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoItem {
    private final int id;

    public TodoItem(int id, String buyMilk, LocalDate localDate) {
        this.id = id;

    }

    @Override
    public String toString() {
        return "Id: " + id;
    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return "";
    }

    public LocalDate getDue() {

        return LocalDate.of(2026, 1, 20);

    }
}
