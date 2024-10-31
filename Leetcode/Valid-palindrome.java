//https://leetcode.com/problems/valid-palindrome/description/
//2
class Solution {
    public boolean isPalindrome(String s) {
      if(s.isEmpty()){
        return false;
      }
      else{
        s=s.toLowerCase();
        int last=s.length()-1;
        int start=0;
        while(start<=last){
            char si=s.charAt(start);
            char t=s.charAt(last);
            if(!Character.isLetterOrDigit(si)){
                start++;
            }
            else if(!Character.isLetterOrDigit(t)){
                last--;
            }
            else{
                if(si!=t){
                    return false;
                }
                start++;
                last--;
            }

        }
        return true;
      }  
    }
}