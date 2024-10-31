public class RemoveBrackets {
    public static String removeBrackets(String expression) {
        StringBuilder result = new StringBuilder();
        int openBrackets = 0;
 // valid brackest 
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                openBrackets++;
                // Skip the opening bracket
            } else if (ch == ')') {
                openBrackets--;
                // Skip the closing bracket
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String expression = "(a+b)*(c-d)";
        String result = removeBrackets(expression);
        System.out.println(result); // Output: a+b*c-d
    }
}
