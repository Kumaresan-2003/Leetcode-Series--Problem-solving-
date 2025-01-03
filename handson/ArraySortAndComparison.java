package com.handson;

import java.util.*;
//Given an array of size n,you need to sort the array.For each element in the sorted array,if the number of comparisons made to place that element in its position is less than 3,return that element;otherwise,return-1

public class ArraySortAndComparison {
	// Helper function to perform selection sort and count comparisons
	public static List<Integer> selectionSortAndCountComparisons(int[] arr) {
		int n = arr.length;
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			int comparisons = 0;

			for (int j = i + 1; j < n; j++) {
				comparisons++;
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Swap the found minimum element with the first element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

			// After sorting, if the number of comparisons is less than 3, add the element
			// to result
			if (comparisons < 3) {
				result.add(arr[i]);
			} else {
				result.add(-1);
			}
		}

		// For the last element, we don't compare it, so add it directly if it's valid
		if (n > 0) {
			result.add(arr[n - 1] < 3 ? arr[n - 1] : -1);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 5, 6 };

		// Sort the array and get the result
		List<Integer> sortedElements = selectionSortAndCountComparisons(arr);

		// Print the sorted elements with the conditions applied
		System.out.println("Sorted elements or -1 based on comparisons: " + sortedElements);
	}
}
