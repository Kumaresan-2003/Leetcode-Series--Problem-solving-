package com.handson;

public class KadaneAlg {
    // Maximum sum subArray
    static int res(int[] arr) {
        int maxsofar = Integer.MIN_VALUE; // Global maximum
        int maxend = 0; // Local maximum

        for (int i : arr) {
            maxend += i; // Add current element to local maximum
            maxsofar = Math.max(maxsofar, maxend); 
            // Update global maximum

            if (maxend < 0) { 
            	// If local sum becomes negative, reset it
                maxend = 0;
            }
        }

        return maxsofar;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans = res(arr);
        System.out.println("Maximum Sum Subarray: " + ans);
    }
}
