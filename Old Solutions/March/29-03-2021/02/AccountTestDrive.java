import java.util.ArrayList;

public class AccountTestDrive {
	public static void main(String[] args) {
		ArrayList<Account> accounts = new ArrayList<Account>();
		Account accountOne = new Account("Mat", "1000");
		Account accountTwo = new Account("Sara", "5000");
		Account accountThree = new Account("Lee", "20000");

		accounts.add(accountOne);
		accounts.add(accountTwo);
		accounts.add(accountThree);

		for (Account account : accounts) {
			System.out.printf("Account Name: %s, Amount: %s%n", account.getName(), account.getAmount().toString());
		}
	}	
}

