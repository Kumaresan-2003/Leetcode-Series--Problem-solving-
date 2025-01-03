package com.handson;

public class SuperAscii {
//	Input: S = “bba” 
//			Output: Yes
//			Explanation:
//			The count of character ‘b’ is 2 and the ASCII value of ‘b’ is also 2.
//			The count of character ‘a’ is 1. and the ASCII value of ‘a’ is also 1. 
//			Hence, string “bba” is super ASCII String.
	static void res(String s) {
		s=s.toLowerCase();
		int b[]=new int[26];
		for(int i=0;i<s.length();i++) {
			int ind=(int)s.charAt(i)-96;
			b[ind-1]++;
		}
		for(int i=0;i<s.length();i++) {
			int ind =(int)s.charAt(i)-96;
			if(b[ind-1]!=ind) {
				System.out.print("No");
				return;
			}
		}
		System.out.print("Yes");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bba";
		res(s);
	}

}
