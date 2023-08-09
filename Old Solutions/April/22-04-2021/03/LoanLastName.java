public class LoanLastName {
	private String firstName;
	private String lastName;
	private double amount;
	private ReportLastName financialReport;
	private static int loanCount = 0;

	public LoanLastName() {
		this.firstName = "John";
		this.lastName = "Doe";
		this.amount = 0.0;
		loanCount++;
	}

	public LoanLastName(String firstName, String lastName, double amount, ReportLastName financialReport) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.amount = amount;
		this.financialReport = financialReport;
		loanCount++;
	}

	@Override
	public String toString() {
		String str = "Loan Application:\n";
		str += "\tFirst Name: " + firstName + "\n";
		str += "\tLast Name: " + lastName + "\n";
		str += String.format("\tDesired Loan Amount: $%,.2f\n", amount);
		str += financialReport.toString();
		str += "Risk Level: " + financialReport.getRisk(amount)  + "\n";
		return str;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAmount() {
		return this.amount;
	}

	public ReportLastName getFinancialReport() {
		return this.financialReport;
	}

	public static int getLoanCount() {
		return loanCount;
	}
}
