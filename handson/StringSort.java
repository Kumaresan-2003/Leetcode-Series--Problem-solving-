package com.handson;

import java.util.*;

public class StringSort {
	// sort based on the Given value of P

	public static void main(String[] args) {
		Map<Character, Integer> mp = new HashMap<>();
		int p = 3;
		String S = "okumaresaasaptyukls";

		for (char c : S.toCharArray()) {
			mp.put(c, mp.getOrDefault(c, 0) + 1);
		}

		StringBuilder temp = new StringBuilder();
		for (Map.Entry<Character, Integer> en : mp.entrySet()) {
			if (en.getValue() >= p) {
				temp.append(en.getKey());
			}
		}
		char c[] = temp.toString().toCharArray();
		Arrays.sort(c);

		// System.out.println(temp.toString());
		System.out.println(c[0]);
	}
}
