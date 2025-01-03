import java.util.Arrays;
public class Test {
 static String ans(String[] s){

   Arrays.sort(s);
   
   String s1=s[0];
   String s2=s[s.length-1];
   String op=" ";
   for(int i=0;i<s1.length();i++){
     if(s1.charAt(i)==s2.charAt(i)){
       op=op+s1.charAt(i);
     }
     else{
       break;
     }
   }
   return op;
 }

	/* Driver program */
	public static void main(String[] args){
	 String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
	 String res=ans(input);
	 System.out.print("reult is"+res);
	
	}
}
