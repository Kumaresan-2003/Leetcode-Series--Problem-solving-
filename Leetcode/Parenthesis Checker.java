import java.util.*;
public class Main {
  static boolean ans(String x){
 Stack<Character> stk = new Stack<>();
 
       for(int i=0;i<x.length();i++){
        
           char c = x.charAt(i);
           if( c == '{') stk.push('}');
           else if( c == '(') stk.push(')');
           else if( c == '[') stk.push(']');
           else {
               if(!stk.isEmpty() && stk.peek() == c) stk.pop();
               else return false;
           }
       }
       if(!stk.isEmpty()) return false;
       return true;
       }
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      boolean res=ans("{([])}");
      System.out.print(res);
  }
}
