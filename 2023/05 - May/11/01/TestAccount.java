//************************************************************
// TestAccount.java
//
// A simple driver to test the overloaded methods of
// the Account class.
//************************************************************

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		// Declare Two Accounts
		Account account1;
		Account account2;

		// Scanner Object For User Input
		Scanner input = new Scanner(System.in);

		String name;
		double balance, amount;

		// Input Details Of First Account
		System.out.println("Enter details for the First Account:");
		// Input Name
		System.out.print("Enter account holder's first name: ");
		name = input.nextLine();

		// Input Initial Balance
		System.out.print("Enter initial balance: $");
		balance = Double.parseDouble(input.nextLine());

		// Instantiate First Account
		account1 = new Account(balance, name, 101);

		// Input Details Of Second Account
		System.out.println("\nEnter details for the Second Account:");
		// Input Name
		System.out.print("Enter account holder's first name: ");
		name = input.nextLine();

		// Input Initial Balance
		System.out.print("Enter initial balance: $");
		balance = Double.parseDouble(input.nextLine());

		// Instantiate Second Account
		account2 = new Account(balance, name, 102);

		int choice;

		// Loop
		while (true) {

			// Display Menu
			System.out.println("\n1. Transfer from Account1 to Account2");
			System.out.println("2. Transfer from Account2 to Account1");
			System.out.println("3. Quit");
			System.out.print("Enter choice (1-3): ");

			// Input Choice
			choice = input.nextInt();

			// For Choice = 1, Choice = 2
			if (choice == 1 || choice == 2) {
				// Input Amount To Transfer
				System.out.print("Enter amount: $");
				amount = input.nextDouble();

				// Account1 -> Account2
				if (choice == 1) {
					// Check Balance If Sufficient To Transfer
					if (account1.getBalance() < amount) {
						// If No, Display Error
						System.out.println("Account1 has insufficient funds.");
					} else {
						// Else, Transfer The Amount
						Account.transfer(account1, account2, amount);
					}
					// Account2 -> Account1
				} else {
					// Check Balance If Sufficient To Transfer
					if (account2.getBalance() < amount) {
						// If No, Display Error
						System.out.println("Account2 has insufficient funds.");
					} else {
						// Else, Transfer The Amount
						Account.transfer(account2, account1, amount);
					}
				}

				// Print Balance
				System.out.println("\nUpdated balance after transaction:");
				System.out.println("Account-1: $" + account1.getBalance());
				System.out.println("Account-2: $" + account2.getBalance());
			} else if (choice == 3) {
				// Print Balance
				System.out.println("\nFinal Summary\n-------------------");
				System.out.println("Account-1 Details:");
				System.out.println(account1);

				System.out.println("\nAccount-2 Details:");
				System.out.println(account2);
				// Exit
				System.out.println("\nBye!");
				break;
			} else {
				// Invalid Choice
				System.out.println("Invalid Choice!");
			}

		}
	}
}