package com.handson;

//Input: n = 4
//
//Output: "1211"

public class Countandsay {
	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		String s = countAndSay(n - 1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int ct = 1;
			char ch = s.charAt(i);
			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				ct++;
				i++;
			}
			sb.append(ct).append(ch);
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
