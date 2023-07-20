// MathOperations.java
package de.qcademy.junitpractice;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed!");
        }
        return (double) dividend / divisor;
    }
}
