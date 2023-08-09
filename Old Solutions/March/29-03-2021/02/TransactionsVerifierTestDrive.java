import java.util.ArrayList;

public class TransactionsVerifierTestDrive {
	public static void main(String[] args) {
		ArrayList<Account> accounts = new ArrayList<Account>();
		
		Account a1 = new Account("John", "100");
		Account a2 = new Account("Sara", "95.25");
		Account a3 = new Account("Mat", "225");
		Account a4 = new Account("Kyle", "600");
		accounts = new ArrayList<Account>();
		accounts.add(a1);
		accounts.add(a2);
		accounts.add(a3);
		accounts.add(a4);

		TransactionsVerifier verifier = new TransactionsVerifier();
		System.out.println("Validation Result: " + verifier.validate(accounts));
	}
}
