package org.example.todolist;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoItem {
    private final int id;
    private final String task;
    private final LocalDate due;


    public TodoItem(int id,  String task, LocalDate due) {
        this.id = id;
        this.task = task;
        this.due = due;
    }



    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public LocalDate getDue() {

        return due;

    }
    @Override
    public String toString() {
        return "Id: " + id;
    }
}
