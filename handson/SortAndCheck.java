package com.handson;
import java.util.Arrays;
import java.util.Comparator;

public class SortAndCheck {
    
    public static int[] sortAndCheck(int[] arr) {
        // Create an array to store the results
        int[] results = new int[arr.length];
        
        // Create a custom comparator that counts comparisons
        Integer[] indices = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            indices[i] = i;
        }
        
        // Sort using a custom comparator
        Arrays.sort(indices, (i1, i2) -> {
            // This is where you would count comparisons
            return Integer.compare(arr[i1], arr[i2]);
        });
        
        // Count comparisons for each element
        int[] comparisonCount = new int[arr.length];
        for (int i = 0; i < indices.length; i++) {
            comparisonCount[indices[i]] = Math.max(0, i - 2); // Simulate comparison count
        }
        
        // Fill results based on comparison counts
        for (int i = 0; i < arr.length; i++) {
            if (comparisonCount[i] < 3) {
                results[i] = arr[indices[i]];
            } else {
                results[i] = -1;
            }
        }
        
        return results;
    }

    public static void main(String[] args) {
        //int[] arr = {5, 2, 4, 1, 3};
        int[] arr = {5, 2, 9, 1, 5, 6};

        int[] result = sortAndCheck(arr);
        
        System.out.println("Results: " + Arrays.toString(result));
    }
}
