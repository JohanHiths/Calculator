package org.example.todolist;

public class TodoListTask {
    String task;
    boolean done;


    public String TodoListTask(String task) {
        return task;
    }
    public TodoListTask task(String text) {
        return new TodoListTask();
    }
}
