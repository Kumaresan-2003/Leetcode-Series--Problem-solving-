package com.handson;

public class Zoho1 {
    public static void main(String[] args) {
        String input = "LOVE2CODE";
        int n = input.length();
        int mid = n / 2;

        // Print the top half of the cross
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1) {
                    System.out.print(input.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Print the bottom half of the cross
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1) {
                    System.out.print(input.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}