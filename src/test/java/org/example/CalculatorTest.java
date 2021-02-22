package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddTwoNumbers() {
        // ARRANGE
        int a=2;
        int b=3;
        Calculator calculator = new Calculator();

        // ACT
        int sum = calculator.add(a,b);

        // ASSERT
        assertEquals(5, sum);
    }
}
