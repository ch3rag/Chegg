import java.util.Stack;

public class JsonValidator {
	// Checks If The JSON String Has Balanced Braces
	public static boolean isValidJson(String JSON) {
		Stack<Character> stack = new Stack<Character>();
		// Iterate Through Each Character In The JSON String
		for (int i = 0; i < JSON.length(); i++) {
			// Get The Current Character
			char ch = JSON.charAt(i);
			// If Character Is An Opening Brace
			if (ch == '(' || ch == '{' || ch == '[') {
				// Push It Onto Stack
				stack.add(ch);
			}

			// If Character Is Opening Brace Then
			if (ch == ')' || ch == '}' || ch == ']') {
				// If Stack Is Empty, JSON Is Invalid
				if (stack.isEmpty()) {
					return false;
				}

				// Pop The Top Element Of The Stack
				char top = stack.pop();
				// Check If The Closing Brace Is Matching It's Opening Brace
				if (top == '(' && ch != ')' ||
					top == '{' && ch != '}' ||
					top == '[' && ch != ']') {
						// Mismatching Braces!
						return false;
					}
			}
		}
		// Stack Must Be Empty At The End
		return stack.isEmpty();
	}

	// Test In Main
	public static void main(String[] args) {
		String[] tests = {
			"[]", "{}", "()", "[{}]", "[{()}]",
			"A: {X: 1, B: [1, 2, 3], C: 'Hello'}",
			"[(()]}", "A: { B: (1, C: 2}" 
		};
		for (String test : tests) {
			System.out.printf("Input = %s, isValid? %s\n", test, isValidJson(test));
		}
			
	}
}
