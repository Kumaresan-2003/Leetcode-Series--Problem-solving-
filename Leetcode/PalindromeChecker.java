//5.write a java program to check a string can e\we covert into palindrome String or not

public class PalindromeChecker {
    public static boolean canConvertToPalindrome(String s) {
        int[] charCount = new int[26];
        
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        // Check if at most one character has an odd frequency
        boolean hasOddChar = false;
        for (int count : charCount) {
            if (count % 2 == 1) {
                if (hasOddChar) {
                    return false;
                }
                hasOddChar = true;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String s1 = "abab";
        String s2 = "abcde";
        
        System.out.println("Can \"" + s1 + "\" be converted to a palindrome? " + canConvertToPalindrome(s1));
        System.out.println("Can \"" + s2 + "\" be converted to a palindrome? " + canConvertToPalindrome(s2));
    }
}
