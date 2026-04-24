
package com.mycompany.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Set;
public class StringOperationsTest {
    @Test
    void testFindDuplicates() {
        Set<Character> result = StringOperations.findDuplicates("programming");

        assertTrue(result.contains('r'));
        assertTrue(result.contains('g'));
        assertTrue(result.contains('m'));
    }

    @Test
    void testRemoveSpaces() {
        String result = StringOperations.removeSpaces("hello world");

        assertEquals("helloworld", result);
    }

    @Test
    void testReverseString() {
        String result = StringOperations.reverseString("hello");

        assertEquals("olleh", result);
    }

    @Test
    void testNoDuplicates() {
        Set<Character> result = StringOperations.findDuplicates("abc");

        assertTrue(result.isEmpty());
    }
}
