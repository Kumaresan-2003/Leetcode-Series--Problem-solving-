import java.util.Scanner;

public class CapitalizeFirstLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s+");

        for (String word : words) {
            if (word.length() > 1) {
                char first = Character.toUpperCase(word.charAt(0));
                char last = Character.toUpperCase(word.charAt(word.length() - 1));
                result.append(first).append(word.substring(1, word.length() - 1)).append(last).append(" ");
            } else {
                result.append(word.toUpperCase()).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}