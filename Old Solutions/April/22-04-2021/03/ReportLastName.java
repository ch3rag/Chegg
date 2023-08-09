public class ReportLastName {
	private double income;
	private int latePayments;

	public ReportLastName() {
		this.income = 0.0;
		this.latePayments = 0;
	}

	public ReportLastName(double income, int latePayments) {
		this.income = income;
		this.latePayments = latePayments;
	}

	public double getIncome() {
		return income;
	}

	public int getLatePayments() {
		return latePayments;
	}

	public void increaseLatePayments() {
		latePayments++;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getRisk(double loanAmount) {
		if (loanAmount < 100000) {
			if (latePayments <= 1) {
				return "Low";
			} else {
				return "Medium";
			}
		} else if (loanAmount <= 200000) {
			if (latePayments <= 1) {
				return "Medium";
			} else {
				return "High";
			}
		} else {
			if (latePayments <= 1) {
				return "High";
			} else {
				return "Very High";
			}
		}
	}

	@Override
	public String toString() {
		String str = "Financial Report:" + "\n";
		str += String.format("\tIncome Amount: $%,.2f\n", income);
		str += "\tLate Payments: " + latePayments  + "\n";
		return str;
	}
}
