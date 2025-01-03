package com.handson;

import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two strings from input
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        
        // Get lengths of both strings
        int len1 = s1.length();
        int len2 = s2.length();
        
        // Check if lengths are different
        if (len1 != len2) {
            System.out.println("No");
        } else {
            // Concatenate s1 with itself
            String temp = s1 + s1;
            // Check if s2 is a substring of temp
            if (temp.contains(s2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        scanner.close(); // Close the scanner
    }
}

