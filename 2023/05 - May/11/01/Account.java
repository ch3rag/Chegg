//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************
public class Account {

	private double balance;
	private String name;
	private long acctNum;
	
	// -------------------------------------------------
	// Constructor -- initializes balance, owner, and account number
	// -------------------------------------------------
	public Account(double initBal, String owner, long number) {
		balance = initBal;
		name = owner;
		acctNum = number;
	}
	
	// -------------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	// -------------------------------------------------
	public void withdraw(double amount) {
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}

	// -------------------------------------------------
	// Adds deposit amount to balance.
	// -------------------------------------------------
	public void deposit(double amount) {
		balance += amount;
	}

	// -------------------------------------------------
	// Returns balance.
	// -------------------------------------------------
	public double getBalance() {
		return balance;
	}

	// -------------------------------------------------
	// Returns a string containing the name, account number, and balance.
	// -------------------------------------------------
	public String toString() {
		return "Name: " + name +
				"\nAccount Number: " + acctNum +
				"\nBalance: $" + balance;
	}

	// -------------------------------------------------
	// Transfers funds from this account to another account
	// -------------------------------------------------
	public void transfer(Account acct, double amount) {
		// Only perform transfer if this account have sufficient funds
		if (balance >= amount) {
			// Withdraw the amount to we transferred
			withdraw(amount);
			// Deposit that amount to another account
			acct.deposit(amount);
		}
	}

	// -------------------------------------------------
	// Transfers funds from this account to another account
	// -------------------------------------------------
	public static void transfer(Account acct1, Account acct2, double amount) {
		// Only perform transfer if this account have sufficient funds
		if (acct1.getBalance() >= amount) {
			// Withdraw the amount to we transferred
			acct1.withdraw(amount);
			// Deposit that amount to another account
			acct2.deposit(amount);
		}
	}
}
