// Java program for checking // balanced brackets
import java.util.*;
public class BalancedBrackets {

	// function to check if brackets are balanced
	static boolean areBracketsBalanced(String expr)
	{
		// initialize ds 
		Stack<Character> stack
			= new Stack<Character>();

		// Traversing 
		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

             //opening Parathesis 
			if (x == '(' || x == '[' || x == '{') {
				// Push the element in the stack
				stack.push(x);
				// continue;
			}
			// If current character is not opening 
			if (stack.isEmpty())
				return false;


			// checking for the Closing  the Character
			char ch;
			switch (x) {
	    	case ')':
			  ch=stack.pop();
			  if(ch=='{' || ch=='[')
			    return false;// breaking the loop
			 break;

			case '}':
				ch = stack.pop();
				if (ch == '(' || ch == '[')
					return false;// breaking the loop
				break;
         
			case ']':
				ch = stack.pop();
				if (ch== '(' || ch == '{')
					return false; // breaking the loop
				break;
			}
			// Ending the loping 
		}

		// Check Empty Stack
		return (stack.isEmpty());
	}

	public static void main(String[] args)
	{
// Example 1:
// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]";
// Output: false

		String expr = "([{}])";
		//String expr="(]";
		// Function call
		if (areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}


