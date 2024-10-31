import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int wordCount = 0;
        boolean wordStarted = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && !wordStarted) {
                wordStarted = true;
                wordCount++;
            } else if (!Character.isLetter(str.charAt(i))) {
                wordStarted = false;
            }
        }

        System.out.println("The number of words in the string is: " + wordCount);
    }
}