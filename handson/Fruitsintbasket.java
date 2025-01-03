package com.handson;

import java.util.*;

public class Fruitsintbasket {
	class Solution {
		public int totalFruit(int[] fruits) {
			int maxlen = 0, n = fruits.length;
			for (int i = 0; i < n; i++) {
				Set<Integer> st = new HashSet<>();
				for (int j = i; j < n; j++) {
					st.add(fruits[i]);
					if (st.size() <= k) {
						maxlen = Math.max(maxlen, j - i + 1);
					} else {
						break;
					}
				}
			}
			return maxlen;
		}

		public int total(int[] fruits) {
			Map<Integer, Integer> mp = new HashMap<>();
			int j = 0, i = 0;
			int res = 0;
			for (i = 0; i < fruits.length; i++) {
				mp.put(fruits[i], mp.getOrDefault(fruits[i], 0) + 1);
				while (mp.size() > 2) {
					mp.put(fruits[j], mp.get(fruits[j]) - 1);
					mp.remove(fruits[j], 0);
					j++;
				}
				res = Math.max(res, i - j + 1);
			}

			return res;
		}
	}
}
