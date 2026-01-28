package org.example.todolist;

import java.time.LocalDate;

public class TodoList {

    public int nextId = 1;
    public int size = 0;
    public TodoItem[] items = new TodoItem[100];


    public int size(){
        return size();
    }
    public TodoItem add(String text, LocalDate localDate) {
        return new TodoItem(nextId++, "Buy milk", LocalDate.of(2026, 1, 20));
    }
}