import java.util.Date;

public class Transaction {
	private String agentName;
	private double amount;
	private Date time;

	public String getAgentName() {
		return this.agentName;
	}

	public double getAmount() {
		return this.amount;
	}

	public Date getTime() {
		return this.time;
	}

	public Transaction(String agentName, double amount, Date time) {
		this.agentName = agentName;
		this.amount = amount;
		this.time = time;
	}
}
