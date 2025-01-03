import java.util.HashMap;
//Check if two given Strings are Isomorphic to each other
public class IsomorphicStringChecker {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) {
                    return false;
                }
            } else {
                if (map2.containsKey(c2)) {
                    return false;
                }
                map1.put(c1, c2);
                map2.put(c2, c1);
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" isomorphic? " + areIsomorphic(str1, str2));
        
        str1 = "aab";
        str2 = "xyz";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" isomorphic? " + areIsomorphic(str1, str2));
    }
}
