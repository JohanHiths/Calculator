package org.example.todolist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private int nextId = 1;
    private int size = 0;
    private List<TodoItem> items = new ArrayList<>();



    public int size(){
        return size;

    }
    public TodoItem add(String task, LocalDate due) {
        size++;
        return new TodoItem(nextId++, task, due);
    }
    public TodoItem get(int index){
        return items.get(index);
    }

}