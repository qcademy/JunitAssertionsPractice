package qcademy.de.junitassertionspractice;

import de.qcademy.junitassertionspractice.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    void testReverse() {
        // Test example
        StringUtils stringUtils = new StringUtils();
        String original = "JUnit";
        String reversed = stringUtils.reverse(original);
        assertEquals("tinUJ", reversed, "Reversed word should match the original.");
    }

    @Test
    void testCapitalize() {
        // Add your test
    }

    @Test
    void testConcatenate() {
        // Add your test
    }

    @Test
    void testSplitIntoWords() {
        // Add your test
    }

    // Add more tests below if necessary
}
