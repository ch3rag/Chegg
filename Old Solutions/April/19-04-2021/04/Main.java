import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Your Name: ");
		
		String name = input.nextLine();
		int credit = inputInteger("Enter Your Credit: $");
		int age = inputInteger("Enter Your Age: ");
		
		System.out.println("Name: " + name);
		System.out.println("Credit: $" + credit);
		System.out.println("Age: " + age);

	}

	public static int inputInteger(String prompt) {
		System.out.print(prompt);
		while (!input.hasNextInt()) {
			System.out.println("Please Enter A Valid Number");	
			// Consume Next Line
			input.nextLine();
			System.out.print(prompt);
		}
		int output = input.nextInt();	
		// Consume Next Line
		input.nextLine();
		return output;
	}
}