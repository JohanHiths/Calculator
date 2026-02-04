package org.example.todolist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private int nextId = 1;
    private int size = 0;
    private final List<TodoItem> items = new ArrayList<>();
    private TodoItem item;
    private boolean done = false;



    public int size(){
        return items.size();

    }
    public TodoItem add(String task, LocalDate due) {

        TodoItem item = new TodoItem(nextId++, task, due);
        items.add(item);
        return item;
    }
    public TodoItem get(int index){
        return items.get(index);
    }
    public TodoItem add() {
        items.add(item);
        return item;
    }

    public boolean markDone(int id) {
        for (TodoItem item : items) {
            if (item.getId() == id) {
                item.markDone();
                return true;
            }
        }
        return false;
    }
}