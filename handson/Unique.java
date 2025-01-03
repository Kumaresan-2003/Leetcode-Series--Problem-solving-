package com.handson;

public class Unique {
	static int index(String s) {
		int [] arr=new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<s.length();i++) {
			if(arr[s.charAt(i)-'a']==1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abac";
		int res=index(s);
		System.out.print(res);

	}

}
