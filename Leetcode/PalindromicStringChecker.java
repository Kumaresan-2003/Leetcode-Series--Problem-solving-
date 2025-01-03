import java.util.*;
// 6.Make Palindrome
// https://www.geeksforgeeks.org/problems/make-palindrome--170647/1?page=2&category=Strings&difficulty=Easy&sortBy=submissions

public class PalindromicStringChecker {
    public static String canMakePalindromicString(int n, String[] arr) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count the frequency of each character in the concatenated string
        for (String s : arr) {
            for (char c : s.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        
        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 == 1) {
                oddCount++;
            }
        }
        
        return oddCount <= 1 ? "YES" : "NO";
    }
    
    public static void main(String[] args) {
        int n1 = 4;
        String[] arr1 = {"djfh", "gadt", "hfjd", "tdag"};
        
        int n2 = 3;
        String[] arr2 = {"jhjdf", "sftas", "fgsdf"};
        
        System.out.println("Output for Example 1: " + canMakePalindromicString(n1, arr1));
        System.out.println("Output for Example 2: " + canMakePalindromicString(n2, arr2));
    }
}

