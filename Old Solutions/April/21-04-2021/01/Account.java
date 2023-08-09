import java.util.ArrayList;
import java.util.Date;


public class Account {
	private ArrayList<Transaction> transactions;
	private double balance;

	public Account() {
		transactions = new ArrayList<Transaction>();
		balance = 0;
	}

	public synchronized void credit(String agentName, double amount) throws InterruptedException{
		transactions.add(new Transaction(agentName, amount, new Date()));
		balance = getBalance() + amount;
	}

	public double getBalance() {
		return balance;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
}
