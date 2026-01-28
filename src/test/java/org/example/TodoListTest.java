package org.example;

import org.example.todolist.TodoItem;
import org.example.todolist.TodoList;
import org.example.todolist.TodoListTask;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TodoListTest {


    @Test
    void toDoListIsEmpty(){
        TodoList todo = new TodoList();

        assertThat(todo.size()).isZero();
    }

    @Test
    void toDoListId() {
        TodoList list = new TodoList();

        TodoItem item = list.add("Milk");

        assertThat(item.toString()).isEqualTo("Id: 1");

    }

    @DisplayName("När jag lägger till items får de id1 och id2")
    void toDoListTwoIds(){
        TodoList list = new TodoList();

        TodoItem item = list.add("Milk");
        TodoItem item2 = list.add("Bread");

        assertThat(item.toString()).isEqualTo("Id: 1");
        assertThat(item2.toString()).isEqualTo("Id: 2");

    }

    @Test
    void todoListRemembersItems() {
        TodoList list = new TodoList();

        list.add("Milk");
        list.add("Bread");

        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    void testingTasks() {
        TodoListTask task = new TodoListTask();

    }



    }
