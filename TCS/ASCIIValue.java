import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int asciiValue = ch;

        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
    }
}