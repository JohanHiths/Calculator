package org.example;
//
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class todoListTest {

    @Test
    void toDoListEmpty(){
        toDoList list = new toDoList();

        assertThat(list.size(0)).isZero();
    }

    @Test
    void toDoListId(){
        toDoList list = new toDoList();

        assertThat(list.Id(1)).isNotNull();

    }
}
