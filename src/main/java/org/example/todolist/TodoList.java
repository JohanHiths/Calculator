package org.example.todolist;

public class TodoList {

    public int nextId = 1;
    public int size = 0;

    public int size(){
        return size();
    }
    public TodoItem add(String text) {
        return new TodoItem(nextId++);
    }
}