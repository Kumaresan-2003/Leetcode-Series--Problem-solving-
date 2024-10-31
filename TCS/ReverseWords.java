import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String[] words = str.split("\\s+");
        StringBuilder reversedStr = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedStr.append(reversedWord).append(" ");
        }

        System.out.println("Reversed string: " + reversedStr.toString().trim());
    }
}