import java.util.Scanner;

public class TextMsgAbbreviation {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Input Abbreviation For The User
		System.out.print("Input an abbreviation: ");
		String abbreviation = scnr.nextLine();

		// Use Switch Case To Match Unabbreviated Form
		switch(abbreviation.toUpperCase()) {
			case "LOL":
				System.out.println("laughing out loud");
				break;
			case "IDK":
				System.out.println("I don't know");
				break;
			case "BFF":
				System.out.println("best friend forever");
				break;
			case "IMHO":
				System.out.println("in my humble opinion");
				break;
			case "TMI":
				System.out.println("too much information");
				break;
			default:
				// Unknown Abbreviation
				System.out.println("Unknown");
		}
	}
}
