import java.util.Arrays;

// Task3.java

public class Task3 {
	// Main
	public static void main(String[] args) {
		// Check For The Number of Args
		if (args.length == 0) {
			System.out.println("Usage: Task3 <String>");
			System.exit(1);
		}

		// Get The String From Command Line Args
		String input = args[0];

		// Split Into Tokens
		String[] tokens = input.split("[\\s!'_\\-\\?\\.,]+");

		// Print All The Tokens
		System.out.printf("All the tokens: %d %s\n",
			tokens.length, Arrays.toString(tokens));

		// Print The Longest Token(s)
		// Find The Token With Max Length
		int maxLength = tokens[0].length();
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].length() > maxLength) {
				maxLength = tokens[i].length();
			}
		}
		// Print All Tokens With MaxLength
		String largestTokens = "";
		int count = 0;
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].length() == maxLength) {
				largestTokens += tokens[i] + ", ";
				count++;
			}
		}
		System.out.printf("Largest tokens: %d [%s]\n",
			count, largestTokens.substring(0, largestTokens.length() - 2));

		// Now Let's Sort The Array Alphabetically
		Arrays.sort(tokens, String.CASE_INSENSITIVE_ORDER);

		// Print Smallest And Largest Token Alphabetically
		System.out.printf("Alphabetically smallest token: %s\n", tokens[0]);
		System.out.printf("Alphabetically largest token: %s\n", tokens[tokens.length - 1]);
	}
} 