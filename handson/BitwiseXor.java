package com.handson;

import java.util.Scanner;

public class BitwiseXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numbits = Integer.toBinaryString(n).length();
		System.out.println(numbits);
		int bits = (1 << numbits) - 1;

		System.out.println(bits);

		int res = n ^ bits;
		System.out.print(res);

	}

}
