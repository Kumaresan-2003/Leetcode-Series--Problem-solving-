import java.util.Scanner;

public class RemoveNonAlphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String result = str.replaceAll("[^a-zA-Z]", "");

        System.out.println("String with only alphabets: " + result);
    }
}