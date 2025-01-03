package com.handson;

import java.util.*;

public class PermuationofStrinf {
	static void printpermut(String str, String ans, ArrayList<String> hs) {
		if (str.length() == 0) {
			hs.add(ans);
			// System.out.print(ans+" ");
			return;
		} else {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				String ros = str.substring(0, i) + str.substring(i + 1);
				printpermut(ros, ans + ch, hs);
			}
		}

	}

	static void NumberPermutation(int[] nums) {
		int n = nums.length;
		List<List<Integer>> ans = new ArrayList<>();
		int sub = 1 << n;
		for (int i = 0; i < sub; i++) {
			List<Integer> li = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					li.add(nums[j]);
				}
			}
			ans.add(li);
		}
		Collections.sort(ans, (list1, list2) -> {
			int size = Math.min(list1.size(), list2.size());
			for (int i = 0; i < size; i++) {
				if (!list1.get(i).equals(list2.get(i))) {
					return Integer.compare(list1.get(i), list2.get(i)); // Compare elements
				}
			}
			return Integer.compare(list1.size(), list2.size()); // Compare by size if prefixes are equal
		});
		System.out.print(ans);
	}

	public static void main(String[] args) {
		String str = "abc";
		int k = 3;
		ArrayList<String> hs = new ArrayList<>();
		printpermut(str, " ", hs);
		System.out.print(hs);
		Collections.sort(hs);
		System.out.print(hs.get(k));
		int arr[] = { 1, 23, 3 };
		NumberPermutation(arr);
	}
}
