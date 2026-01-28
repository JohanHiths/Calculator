package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class toDoListTest {

    @Test
    void toDoListEmpty(){
        toDoList list = new toDoList();

        assertThat(list.size(0)).isEqualTo(0);
    }
}
