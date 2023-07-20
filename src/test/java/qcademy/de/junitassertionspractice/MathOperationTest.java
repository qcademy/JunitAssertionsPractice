// MathOperationsTest.java
package de.qcademy.junitpractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathOperationsTest {

    @Test
    void testAddition() {
        MathOperations calculator = new MathOperations();
        int expectedSum = 42;
        int actualSum = calculator.add(20, 22);
        assertEquals(expectedSum, actualSum, "Addition should give the expected result.");
    }

    @Test
    void testDivisionByZero() {
        MathOperations calculator = new MathOperations();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0),
            "Division by zero should throw an IllegalArgumentException.");
    }
}
