import java.util.*;

class Stringbuffer{
// 2
static void ans2 (String s){
  String res=" ";
  for(int i=0;i<s.length();i++){
    int j=0;
    for( j=0;j<s.length();j++){
      if(s.charAt(i)==s.charAt(j)){
        break;
      }
    }
    if(i==j){
      res+=s.charAt(i);
    }
  }
  System.out.println(res);
  
}
static int cntDistinct(String str)
{
    

    HashSet<Character> s = new HashSet<Character>();

    for(int i = 0; i < str.length(); i++)
    {
        
    
        s.add(str.charAt(i));
    }
    System.out.print(s);
    
    return s.size();
}

public static void main(String args[])
{
    String str = "prepbytes";
    ans("prepbytes");
    ans2("prepbytes");
    System.out.print(cntDistinct(str));
}
}