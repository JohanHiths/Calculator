package org.example;
//
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ToDoListTest {

    @Test
    void toDoListEmpty(){
        toDoList list = new toDoList();

        assertThat(list.size(0)).isZero();
    }

    @Test
    void toDoListId(){
        toDoList list = new toDoList();

        TodoItem item = list.add("Milk");

        assertThat(item.toString()).isEqualTo("Id: 1");

    }
}
