public class Main {

	public static String recursiveAddPaddingCharacter(String string) {

		if (string.isEmpty()) {
			return string;
		}

		char ch = string.charAt(0);
		String output;

		if (Character.isDigit(ch)) {
			output = "$" + ch + "$";	
		} else if (Character.isLetter(ch)) {
			char chUpper = Character.toUpperCase(ch);
			if (chUpper == 'A' || chUpper == 'E' || chUpper == 'I' ||
			chUpper == 'O' || chUpper == 'U') {
					output = "*" + ch + "*";
				} else {
					output = "#" + ch + "#";
				}
		} else {
			output = Character.toString(ch);
		}

		return output +  recursiveAddPaddingCharacter(string.substring(1));
	}

	public static String iterativeAddPaddingCharacter(String string) {
		String output = "";

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isDigit(ch)) {
				output += "$" + ch + "$";	
			} else if (Character.isLetter(ch)) {
				char chUpper = Character.toUpperCase(ch);
				if (chUpper == 'A' || chUpper == 'E' || chUpper == 'I' ||
				chUpper == 'O' || chUpper == 'U') {
						output += "*" + ch + "*";
					} else {
						output += "#" + ch + "#";
					}
			} else {
				output += Character.toString(ch);
			}
		}

		return output;
	}

	public static void main(String[] args) {
		System.out.println("Using recursive method: ");
		System.out.println("Hello, world = " + recursiveAddPaddingCharacter("Hello, world"));
		System.out.println("The number is 5 = " + recursiveAddPaddingCharacter("The number is 5"));
		System.out.println("I need 60 more days = " + recursiveAddPaddingCharacter("I need 60 more days"));

		System.out.println();

		System.out.println("Using iterative method: ");
		System.out.println("Hello, world = " + iterativeAddPaddingCharacter("Hello, world"));
		System.out.println("The number is 5 = " + iterativeAddPaddingCharacter("The number is 5"));
		System.out.println("I need 60 more days = " + iterativeAddPaddingCharacter("I need 60 more days"));
	}
}