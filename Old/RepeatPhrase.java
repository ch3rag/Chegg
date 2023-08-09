import java.util.Scanner;

// RepeatPhrase.java

public class RepeatPhrase {
	public static void main(String[] args) {
		// Scanner for User Input
		Scanner input = new Scanner(System.in);
		// Input Phrase from the User
		System.out.print("Enter A Phrase: ");
		String phrase = input.nextLine();

		// Input How Many Times User Wants to Repeat It
		System.out.print("Enter The Times To Repeat: ");
		int repeat = input.nextInt();

		// Repeat the Phrase Using a Loop
		for (int i = 0; i < repeat; i++) {
			System.out.print(phrase + " ");
		}
		
		// Clean Up
		input.close();
	}
}
