package com.handson;

import java.util.ArrayList;
import java.util.List;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        int targetSum = 5; // Target sum to find
        List<int[]> result = findAllSubarraysWithGivenSum(arr, targetSum);
        
        // Print the results
        if (result.isEmpty()) {
            System.out.println("No subarray found with the given sum.");
        } else {
            System.out.println("Subarrays with sum " + targetSum + ":");
            for (int[] subarray : result) {
                System.out.print("[ ");
                for (int num : subarray) {
                    System.out.print(num + " ");
                }
                System.out.println("]");
            }
        }
    }

    public static List<int[]> findAllSubarraysWithGivenSum(int[] arr, int k) {
        List<int[]> subarrays = new ArrayList<>();
        int n = arr.length;

        // Loop through each starting point of the subarray
        for (int i = 0; i < n; i++) {
            int sum = 0; // Initialize sum for the current starting index
            
            // Loop through each ending point of the subarray
            for (int j = i; j < n; j++) {
                sum += arr[j]; // Update the sum
                
                // Check if the current sum matches the target sum
                if (sum == k) {
                    // Create a subarray from index i to j and add it to the list
                    int[] subarray = new int[j - i + 1];
                    for (int m = i; m <= j; m++) {
                        subarray[m - i] = arr[m];
                    }
                    subarrays.add(subarray);
                }
            }
        }
        
        return subarrays; // Return the list of found subarrays
    }
}
