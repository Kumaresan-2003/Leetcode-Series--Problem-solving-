package com.handson;

public class Stringcount {
	static void  stringCt(String str) {
		int vo=0,co=0,sp=0,d=0;
		String digits="0123456789";
		String vowels="aeiouAEIOU";
		String Special="!@#$%^&*(){}";
		for(char i: str.toCharArray()) {
			if(vowels.contains(Character.toString(i))) {
				vo++;
			}
			if(Special.contains(Character.toString(i))) {
				sp++;
			}
			if(digits.contains(Character.toString(i))) {
				d++;
			}
			else {
				
			}
		}
		System.out.println("Vowesl:"+vo);
		System.out.println("digits:"+d);
		System.out.println("Special"+sp);
		System.out.println("Constant"+(str.length()-(vo+sp+d)));
	}
	public static void main(String[] args) {
		String str="kumasrean123*&$kuma";
		stringCt(str);
	}

}
