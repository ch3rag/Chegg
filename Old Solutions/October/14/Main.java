import java.util.Stack;

public class Main {
	/**
	 * Checks If a Character Is an Operator.
	 * @param ch Character to Check.
	 * @return A Boolean Indicating Whether the Character Is an Operator.
	 */
	public static boolean isOperator(char ch) {
		return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
	}

	/**
	 * Returns the Precedence of an Operator.
	 * @param ch The Operator Whose Precedence Is Needed.
	 * @return	An Integer Indicating the Precedence of the Operator.
	 */
	public static int precedence(char ch) {
		switch(ch) {
			case '+':
			case '-':
				return 1;
			case '/':
			case '*':
				return 2;
			case '^':
				return 3;
			default:
				return 0;
		}
	}

	/**
	 * Convert an Infix Expression to a Postfix Expression.
	 * @param infix A Valid Infix Expression Container 0-9 Digits as Operands, +,-,*,/,^ as Operators, and the Parenthesis '(', ')'.
	 * @return The Corresponding Postfix Expression with the Same Characters but Order to Postfix.
	 */
	public static String infixToPostfix(String infix) {
		//  Create an Empty Result String
		String result = "";
		// Create a Stack of Characters (These Will Be the Collection of Operators and Operands)
		Stack<Character> stack = new Stack<Character>();
		// Sequentially Loop through All Characters in the Infix
		for (int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);
			// When the Current Character Is an Operator
			if (isOperator(ch)) {
				// Loop While (The Stack Is Not Empty) And (Precedence(Stack.Peek()) >= Precedence(current Loop Character))
				while (!stack.empty() && precedence(stack.peek()) >= precedence(ch)) {
					// In This Loop, Pop One Character from Stack and Append It to Result
					result += stack.pop();
				}
				// After This Loop, Push the Current Character to the Stack.
				stack.push(ch);
			} else if (ch == '(') {
				// When the Current Character Is Left-Parenthesis Push the Parenthesis onto the Stack.
				stack.push(ch);
			} else if (ch == ')') {
				// When the Current Character Is Right-Parenthesis
				// Pop One Character Called "Item" From Stack
				char item = stack.pop();
				// Loop While the "Item" Is Not a Left-Parenthesis:
				while (item != '(') {
					// Append the "Item" To the Result
					result += item;
					// Pop One Character Called "Item" From Stack
					item = stack.pop();
				}
			} else {
				// Otherwise, Append Current Character to the Result
				result += ch;
			}
		}

		// Create a Subsequent Loop That Ranges from 0 to the Size of the Stack
		while (!stack.empty()) {
			// in This Loop, Pop Each Item from the Stack and Append to Result
			result += stack.pop();
		}

		return result;
	}

	/**
	 * Given a Postfix Expression Calculate the Value.
	 * @param postfix The Given Expression
	 * @return The Resulting Calculation
	 */
	public static int computePostfix(String postfix) {
		// Create a Stack of Integers
		Stack<Integer> stack = new Stack<Integer>();
		// Sequentially Loop through All Characters in the Postfix
		for (int i = 0; i < postfix.length(); i++) {
			char ch = postfix.charAt(i);
			// If Current Character Is an Digit
			if (Character.isDigit(ch)) {
				// Push the Operand to the Stack
				stack.push(Integer.parseInt(String.valueOf(ch)));
			} else {
				// Else
				// Pop Operand1 from the Stack
				int opOne = stack.pop();
				// Pop Operand2 from the Stack
				int opTwo = stack.pop();
				// with Assumed Current Character as the Operator, Process Each Operator
				switch(ch) {
					case '+':
						// Push Result of Adding Operands
						stack.push(opOne + opTwo);
						break;
					case '-':
						// Push Result of Subtracting Operands (Order Matters)
						stack.push(opTwo - opOne);
						break;
					case '*':
						// Push Result of Multiplying Operands
						stack.push(opOne * opTwo);
						break;
					case '/':
						// Push Result of Dividing Operands (Order Matters)
						stack.push(opTwo / opOne);
						break;
					case '^':
						// Push Cast Result of Math.Pow(Operand2, Operand1)
						stack.push((int)Math.pow(opTwo, opOne));
						break;
					
				}
			}
		}

		// After the Loop, If the Stack Is Empty, Return 0 Else Return the Top Item on the Stack
		if (stack.isEmpty()) {
			return 0;
		} else {
			return stack.pop();
		}
	}

	public static void main(String[] args) {
		// Test Expression
		String expression = "((1+2)*5)/3-2+2^3";
		String postfix = infixToPostfix(expression);
		int value = computePostfix(postfix);
		System.out.printf("Infix: %s\n", expression);
		System.out.printf("Postfix: %s\n", postfix);
		System.out.printf("Value: %d\n", value);
	}
}
