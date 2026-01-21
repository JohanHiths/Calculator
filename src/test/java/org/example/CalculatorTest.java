package org.example;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void addTwoNumbersReturnsSum() {
        int result = Calculator.add(2, 3);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void addThreeNumbersReturnsSum() {
        int result = Calculator.add(2, 3, 4);
        assertThat(result).isEqualTo(9);
    }

    @Test
    public void addMultipleNumbersReturnsSum() {
        int result = Calculator.add(2, 3, 4, 5);
        assertThat(result).isEqualTo(14);
    }

    @Test
    public void subtractNumbers() {
        int result = Calculator.subtract(2, 3);
        assertThat(result).isEqualTo(-1);
    }


}