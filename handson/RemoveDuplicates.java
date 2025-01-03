package com.handson;

import java.util.*;

//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]
public class RemoveDuplicates {
	public List<Integer> findDuplicates(int[] nums) {
		Set<Integer> st = new HashSet<>();
		List<Integer> li = new ArrayList<>();
		for (int i : nums) {
			if (!st.add(i)) {
				li.add(i);
			}
		}

		return li;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
