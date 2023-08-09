// VerifyString.java

public class VerifyString {
	// Verifies That InfoString Is Not Missing Any Information
	// Returns True If No Information Is Missing, False Otherwise
	public static boolean verify(String infoString) {
		// First Remove Starting And Ending Braces
		String trimmed = infoString.substring(1, infoString.length() - 1);
		// Split The String At Commas
		String[] fields = trimmed.split(",");

		// Flag
		boolean isValid = true;

		// For Each Field
		for (String field : fields) {
			// Trim The Field
			field = field.trim();
			// Split At "="
			String[] pair = field.split("=");
			// Get Key And Value Of Pair
			String key = pair[0];
			String value = pair[1];

			// Check If Value Is Empty
			if (value.equals("{}")) {
				// Debug Output
				System.out.printf("The %s field is empty.\n", key);
				// Unset Flag
				isValid = false;
			}
		}

		return isValid;
	}
	public static void main(String[] args) {
		// Test - 1
		String infoString = "{name={}, address={2235 57th Av}, spouse={}}";
		System.out.printf("Verifying %s\n", infoString);
		boolean result =  verify(infoString);
		System.out.printf("Result: %s\n\n", result);

		// Test - 2
		infoString = "{name={Steve}, address={2235 57th Av}, spouse={Mary}}";
		System.out.printf("Verifying %s\n", infoString);
		result =  verify(infoString);
		System.out.printf("Result: %s\n", result);
		
	}
	
}
