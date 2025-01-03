package com.handson;

public class RemoveK {
	static void Remov(String num,int k) {
		int n=num.length();
		
		String s=num.substring(k, n);
		StringBuilder sb=new StringBuilder();
		int ct=0;
		for(int i=0;i<num.length();i++) {
			int res=num.charAt(i)-'0';
			if(res>4 && ct<=k) {
				ct++;
			}
			else {
				sb.append(Integer.toString(res));
			}
		}
		System.out.println(sb.toString());
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "1432219";
		int k = 3;
		Remov(num,k);


	}

}
