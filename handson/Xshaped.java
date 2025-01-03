package com.handson;

public class Xshaped {
	static void XShape(int n) {
//		1   5
//		 2 4 
//		  3  
//		 4 2 
//		5   1
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(i);
                } else if (i + j == n + 1) {
                    System.out.print(n - i + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		XShape(n);

	}

}
