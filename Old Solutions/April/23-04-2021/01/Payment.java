public abstract class Payment {
	protected double amount;
	protected boolean isPaid;

	public Payment(double amount) {
		this.amount = amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return this.amount;
	}

	public boolean isPaid() {
		return isPaid;
	}

	abstract void pay();
}
