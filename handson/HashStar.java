package com.handson;

import java.util.Scanner;

public class HashStar {
	// function that Count of #,* in String
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int count_of_hash = 0, count_of_star = 0;
		for (char i : S.toCharArray()) {
			if (i == '#') {
				count_of_hash++;
			} else {
				count_of_star++;
			}
		}
		if (count_of_star > count_of_hash) {
			System.out.println(count_of_star - count_of_hash);
		} else if (count_of_hash > count_of_star) {
			System.out.println(count_of_hash - count_of_star);
		} else {
			System.out.println(0);
		}
	}
}
