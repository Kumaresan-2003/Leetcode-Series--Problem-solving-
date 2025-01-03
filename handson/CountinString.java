package com.handson;

import java.util.*;

class CountinString {
// Function returns word with highest frequency
	static String findWord(String[] arr) {
		HashMap<String, Integer> wd = new HashMap<>();
		for (String word : arr) {
			wd.put(word, wd.getOrDefault(word, 0) + 1);
		}
		String key = "";
		int ct = 0;
		for (Map.Entry<String, Integer> en : wd.entrySet()) {
			if (en.getValue() > ct) {
				ct = en.getValue();
				key = en.getKey();
			}
		}
		return key;
	}

// Driver code
	public static void main(String[] args) {
		String arr[] = { "geeks", "for", "geeks", "a", "portal", "to", "learn", "can", "be", "computer", "science",
				"zoom", "yup", "fire", "in", "be", "data", "geeks", "a", "a" };
		String sol = findWord(arr);
// Print word having highest frequency
		System.out.println(sol);
	}
}