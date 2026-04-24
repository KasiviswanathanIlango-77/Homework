
package com.mycompany.calculator;

import java.util.*;

public class StringOperations {
     // Find duplicate characters
    public static Set<Character> findDuplicates(String str) {
        Set<Character> duplicates = new HashSet<>();
        Set<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.add(c) && c != ' ') {
                duplicates.add(c);
            }
        }
        return duplicates;
    }

    // Remove spaces
    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }

    // Reverse string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
