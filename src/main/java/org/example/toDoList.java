package org.example;
//
public class toDoList {


    private int nextId = 1;


    public TodoItem add(String text) {
        return new TodoItem(nextId++);
    }

    public int size(int size){
        return size = 0;
    }

    }

