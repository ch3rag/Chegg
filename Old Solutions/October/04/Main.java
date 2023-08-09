// Main.java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Scanner For STDIN Input
		Scanner input = new Scanner(System.in);

		// Initialize Number Of Attempts And N
		int n, attempts = 0;
		do {
			System.out.print("Enter a number divisible 5 & 10 both: ");
			n = Integer.parseInt(input.nextLine());
			attempts++;
		} while (!(n % 5 == 0 && n % 10 == 0));

		// Display N And The Number Of Attempts Taken
		System.out.printf("The number entered is : %d\n.", n);
		System.out.printf("The number of attempts taken is : %d.", attempts);

		// Clean Up
		input.close();
	}
}