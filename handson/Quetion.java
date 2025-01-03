package com.handson;

public class Quetion {
   public static void main(String[] args) {
	   int a=8;
	   System.out.println(a);
	   a+=++a;
	   System.out.println(a);
	   System.out.println(++a);
	   
	   String str1="ENDHU";
	   String str2="UNDHU";
	   int res=str1.compareTo(str2);
	   
	   if(res<0) {
		   System.out.println(str1+"Comes before"+str2);
	   }
	   else if(res>0) {
		   System.out.println(str1+"Comes After"+str2);

	   }
	   else {
		   System.out.println(str1+"is equal to"+str2);

	   }
	   
	   String s="Codebegun";
	   s.replace('e','Z').trim().concat("Aa");
	   System.out.println(s);
	   s.substring(0,2);
	   System.out.println(s);
	   
	   
	   
   }
   
}
