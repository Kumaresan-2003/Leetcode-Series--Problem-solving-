import java.util.Scanner;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with numbers: ");
        String str = scanner.nextLine();

        int sum = 0;
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                number.append(ch);
            } else {
                if (number.length() > 0) {
                    sum += Integer.parseInt(number.toString());
                    number.setLength(0);
                }
            }
        }

        // Check for a number at the end of the string
        if (number.length() > 0) {
            sum += Integer.parseInt(number.toString());
        }

        System.out.println("Sum of numbers: " + sum);
    }
}