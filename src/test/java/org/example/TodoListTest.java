package org.example;

import org.example.todolist.TodoItem;
import org.example.todolist.TodoList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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

        TodoItem item = list.add("Milk", LocalDate.of(2026, 1, 20));

        assertThat(item.toString()).isEqualTo("Id: 1");

    }

    @DisplayName("När jag lägger till items får de id1 och id2")
    void toDoListTwoIds(){
        TodoList list = new TodoList();

        TodoItem item = list.add("Milk", LocalDate.of(2026, 1, 20));
        TodoItem item2 = list.add("Bread", LocalDate.of(2026, 1, 20));

        assertThat(item.toString()).isEqualTo("Id: 1");
        assertThat(item2.toString()).isEqualTo("Id: 2");

    }

    @Test
    void todoListRemembersItems() {
        TodoList list = new TodoList();

        list.add("Milk", LocalDate.of(2026, 1, 20));
        list.add("Bread", LocalDate.of(2026, 1, 20));

        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    void addStoresTaskAndDueInItem() {
        TodoList list = new TodoList();

        TodoItem item = list.add("Buy milk", LocalDate.of(2026, 1, 20));

        assertThat(item.getTask()).isEqualTo("Buy milk");
        assertThat(item.getDue()).isEqualTo(LocalDate.of(2026, 1, 20));
    }



    }
