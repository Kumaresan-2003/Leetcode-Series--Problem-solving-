import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        HashSet<Character> uniqueChars = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (uniqueChars.add(ch)) {
                result.append(ch);
            }
        }

        System.out.println("String without duplicates: " + result.toString());
    }
}

