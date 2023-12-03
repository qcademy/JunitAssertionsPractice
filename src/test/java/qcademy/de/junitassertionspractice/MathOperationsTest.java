package qcademy.de.junitassertionspractice;

import de.qcademy.junitassertionspractice.MathOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {

    @Test
    void testAdd() {
        // Test example
        MathOperations calculator = new MathOperations();
        int expectedSum = 42;
        int actualSum = calculator.add(20, 22);
        assertEquals(expectedSum, actualSum, "Addition should give the expected result.");
    }

    @Test
    void testSubtract() {
        // Add your test
    }

    @Test
    void testMultiply() {
        // Add your test
    }

    @Test
    void testDivide() {
        // Add your test
    }

    @Test
    void testDivideByZero() {
        // Add your test
    }

    @Test
    void testSquare() {
        // Add your test
    }

    @Test
    void testIsEven() {
        // Add your test
    }

    // Add more tests below if necessary
}
