// StringUtilsTest.java
package de.qcademy.junitpractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    void testReverse() {
        String original = "JUnit";
        String reversed = StringUtils.reverse(original);
        assertEquals("tnUJ", reversed, "Reversed word should match the original.");
    }

    @Test
    void testCapitalize() {
        String input = "java";
        String capitalized = StringUtils.capitalize(input);
        assertEquals("Java", capitalized, "First character should be capitalized.");
    }
}
