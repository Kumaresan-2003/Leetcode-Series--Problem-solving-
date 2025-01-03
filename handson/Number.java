package com.handson;

public class Number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1   1
//		 2 2 
//		  3  
//		 4 4 
//		5   5
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || (i + j == n + 1)) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
