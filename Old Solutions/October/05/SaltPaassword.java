import java.util.Random;
import java.util.Scanner;

class SaltPassword {
	public static void main(String[] args) {
		saltAPassword();
	}

	// Method That Salts A Password
	public static void saltAPassword() {
		// Scanner Object For User Input
		Scanner input = new Scanner(System.in);

		// Prompt User For A Seed
		System.out.println("Enter seed:");
		// Input The Seed
		int seed = Integer.parseInt(input.nextLine());

		// Input Initial Password
		System.out.println("Enter a password:");
		String password = input.nextLine();

		// Initialize Salt To An Empty String
		String salt = "";

		// Initialize Random Object For Random Number Generation
		// With The Specified Seed
		Random rand = new Random(seed);

		// Generate A Salt (Sequence Of 5 Random Characters)
		for (int i = 0; i < 5; i++) {
			// Random.nextInt(Max - Min + 1) + Min
			char randomChar = (char)(rand.nextInt('z' - 'A' + 1) + 'A');
			// Append To Salt
			salt += randomChar;
		}

		// Print Salt
		System.out.println("Salt: " + salt);

		// Append Salt To Password
		password += salt;

		// Print Salted Password
		System.out.println("Salted Password: " + password);

		// Clean Up
		input.close();
	}
}