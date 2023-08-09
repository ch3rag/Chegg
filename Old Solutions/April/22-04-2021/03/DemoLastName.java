import java.util.ArrayList;
import java.util.Scanner;

public class DemoLastName {
	public static void main(String[] args) {
		
		ArrayList<LoanLastName> loans = new ArrayList<LoanLastName>();
		Scanner input = new Scanner(System.in);
		String choice = "n";
		String title = "Loan Application Report";

		while (true) {
			
			System.out.print("What is the applicant's first name? ");
			String firstName = input.nextLine();
			
			System.out.print("What is the applicant's last name? ");
			String lastName = input.nextLine();
			
			double amount;
			while (true) {
				System.out.print("What is the applicant's desired loan amount? ");
				amount = input.nextDouble(); input.nextLine();
				if (amount > 300000) {
					System.out.println("Loan amount must not exceed $300,000!");
				} else {
					break;
				}
			}
			
			System.out.print("What is the applicant's income amount? ");
			double income =  input.nextDouble(); input.nextLine();
			
			System.out.print("How many late payments has the applicant made? ");
			int latePayments = input.nextInt(); input.nextLine();

			ReportLastName financialReport = new ReportLastName(income, latePayments);
			LoanLastName loan = new LoanLastName(firstName, lastName, amount, financialReport);
			loans.add(loan);

			System.out.print("Do you wish to enter information for another loan application (Y/N)? ");
			choice = input.nextLine().toLowerCase();
			if (choice.charAt(0) != 'y') {
				break;
			}
		}
		System.out.println(title);
		for(LoanLastName loan : loans) {
			System.out.print(loan);
		}
		System.out.println("Total Number of Loan Applications:" + LoanLastName.getLoanCount());

		input.close();
	}
}