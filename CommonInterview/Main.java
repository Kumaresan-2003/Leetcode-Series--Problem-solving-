import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      String s="beekeeper";
     
     int ct[] = new int[26];
     for(char c :s.toLowerCase().toCharArray())
     {
       ct[c -'a']++;
     }
     
     for(int i=0;i<26;i++){
       for(int j=0;j<ct[i];j++){
         System.out.print((char)(i+'a'));
         
       }
     }
  }
}