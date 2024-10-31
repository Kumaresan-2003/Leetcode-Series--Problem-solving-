import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String result = str.replaceAll("[aeiouAEIOU]", "");

        System.out.println("String without vowels: " + result);
    }
}