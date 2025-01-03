package com.handson;

import java.util.ArrayList;
import java.util.List;

public class NumericStringToAlphabet {
//	Possible alphabetical strings:
//		aabcc
//		aawc
//		alcc
//		kbcc
//		kwc

    public static void main(String[] args) {
        String str = "11233"; // Input numeric string
        List<String> result = new ArrayList<>();
        generateCombinations(str, 0, "", result);
        
        // Print the results
        System.out.println("Possible alphabetical strings:");
        for (String combination : result) {
            System.out.println(combination);
        }
    }

    private static void generateCombinations(String str, int index, String current, List<String> result) {
        // Base case: if we reach the end of the string
        if (index == str.length()) {
            result.add(current);
            return;
        }

        // Single digit decoding
        int singleDigit = str.charAt(index) - '0'; // Convert char to int
        if (singleDigit >= 1 && singleDigit <= 26) {
            char letter = (char) ('a' + singleDigit - 1); // Convert to corresponding letter
            generateCombinations(str, index + 1, current + letter, result);
        }

        // Double digit decoding
        if (index + 1 < str.length()) {
            int doubleDigit = Integer.parseInt(str.substring(index, index + 2)); // Get two digits
            if (doubleDigit >= 10 && doubleDigit <= 26) {
                char letter = (char) ('a' + doubleDigit - 1); // Convert to corresponding letter
                generateCombinations(str, index + 2, current + letter, result);
            }
        }
    }
}
