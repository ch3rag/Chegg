public class Employee {
	private String name;
	private String idNumber;
	private char employeeType;
	private double payRate;
	private int yearlySalary;
	double WEEKS_IN_YEAR = 52.0;

	public Employee(String name, String idNumber, char employeeType, double payRate) {
		this.name = name;
		this.idNumber = idNumber;
		this.employeeType = employeeType;
		this.payRate = payRate;
	}

	public Employee(String name, String idNumber, char employeeType, int yearlySalary) {
		this.name = name;
		this.idNumber = idNumber;
		this.employeeType = employeeType;
		this.yearlySalary = yearlySalary;
	}

	public String getName() {
		return name;
	}

	public String getidNumber() {
		return idNumber;
	}

	public char getemployeeType() {
		return employeeType;
	}

	public double getpayRate() {
		return payRate;
	}

	public int getyearlySalary() {
		return yearlySalary;
	}

	public double getGrossPay(double hoursWorked) {
		double overtimeHours;
		double weeklySalary;
		if (hoursWorked > 40) {
			overtimeHours = hoursWorked - 40;
			weeklySalary = (overtimeHours) * (payRate * 1.5) + (40 * payRate);
		} else {
			weeklySalary = hoursWorked * payRate;
		}
		return weeklySalary;
	}

	public double getGrossPay() {
		double weeklySalary;
		weeklySalary = yearlySalary / WEEKS_IN_YEAR;

		return weeklySalary;
	}

}