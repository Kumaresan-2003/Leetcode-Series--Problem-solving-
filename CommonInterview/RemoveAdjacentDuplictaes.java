import java.util.*;

public class Main {
  static void duplicates(String s){
    // Edge Case
     if(s==null|| s.isEmpty()){
      System.out.print("-1");
      return ;
    }
    else{
      int i=0;
      StringBuilder res=new StringBuilder();
      while(i<s.length()-1){
        if(s.charAt(i)==s.charAt(i+1)){
          //res.append(s.charAt(i));
          while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
            i++;
          }
        }
        else{
          res.append(s.charAt(i));
        }
        i++;
      }
      // adding the Last charster
      if (i < s.length()) {
            res.append(s.charAt(i));
        }
      System.out.print(res);
    }
  }
  
  
    public static void main(String[] args) {
     String str="Hello, my name is John";
     String ans=" ";
     String ans1="geeksforgeeg";
    
     //WithoutMethod(ans);
     duplicates(ans1);
     }
}
