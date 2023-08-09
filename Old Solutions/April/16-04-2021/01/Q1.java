import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {

		// Variable Declarations And Initialization
		Scanner scanner = new Scanner(System.in);
		boolean valid = true;
		String branchName = "", accountNo = "", branchNo = "";

		// Input The Account Number
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		
		if (input.length() == 8) {

			// Extract The Branch Number And Account Number Parts
			branchNo = input.substring(0, 2);
			accountNo = input.substring(2);

			// Set Branch Name According To The Branch Number
			if (branchNo.equals("00")) {
				branchName = "Beirut";
			} else if (branchNo.equals("01")) {
				branchName = "Saida";
			} else if (branchNo.equals("02")) {
				branchName = "Tripoli";
			} else {
				valid = false;
			}
		} else {
			valid = false;
		}

		// Print Result Based Of The Validity Of The User Input
		if (valid) {
			System.out.println("Branch: " + branchName);
			System.out.println("Customer Number: " + accountNo);
		} else {
			System.out.println("Not Valid");
		}

		scanner.close();
	}
}