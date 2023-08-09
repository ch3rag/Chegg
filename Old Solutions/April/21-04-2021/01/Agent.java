public class Agent extends Thread {
	private String agentName;
	private Account account;
	private double amount;
	
	public Agent(String agentName, Account account, double amount) {
		this.account = account;
		this.agentName = agentName;
		this.amount = amount;
	}

	public void run() {
		try {
			account.credit(agentName, amount);
		} catch (InterruptedException ex) {
			System.out.println(agentName + " is interrupted.");
		}

	}
}
