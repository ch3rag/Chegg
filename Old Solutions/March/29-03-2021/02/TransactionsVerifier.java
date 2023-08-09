import java.util.ArrayList;

public class TransactionsVerifier {
	private ArrayList<Account> transactions;

	public TransactionsVerifier() {
		Account a1 = new Account("John", "100");
		Account a2 = new Account("Sara", "95.25");
		Account a3 = new Account("Mat", "225");
		Account a4 = new Account("Kyle", "600");
		transactions = new ArrayList<Account>();
		transactions.add(a1);
		transactions.add(a2);
		transactions.add(a3);
		transactions.add(a4);
	}
	
	public boolean validate(ArrayList<Account> accounts) {
		boolean flag = true;
		for (int i = 0; i < accounts.size(); i++) {
			if(!accounts.get(i).getAmount().equals(transactions.get(i).getAmount())) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
