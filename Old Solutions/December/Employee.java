// Employee.java

public class Employee {
	// Private Fields
	// Name Of The Employee
	private String name;
	// Hourly Pay Of The Employee
	private double hourlyPay;

	// Constructors
	// 1. No-Arg Constructor
	public Employee() {
		this("Unknown", 0.0);
	}

	// 2. Single Parameter Constructor For Name
	public Employee(String name) {
		this(name, 0.0);
	}

	// 3. Single Parameter Constructor For Hourly Pay
	public Employee(double hourlyPay) {
		this("Unknown", hourlyPay);
	}

	// 4. Two-Param Constructor
	public Employee(String name, double hourlyPay) {
		this.name = name;
		this.hourlyPay = hourlyPay;
		// Verify Pay
		verifyPay();
	}

	// Accessors
	public String getName() {
		return name;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	// Mutators
	public void setName(String name) {
		this.name = name;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
		// Verify Pay
		verifyPay();
	}

	// Verifies Hourly Pay
	void verifyPay() {
		// Convert Hourly Pay To String
		String payAsString = Double.toString(hourlyPay);
		// Extract Fractional Part
		String fractionalString = payAsString.split("\\.")[1];
		// Covert Extracted  Fractional Part To Int
		int fractional = Integer.parseInt(fractionalString);
		// Sum All Digits
		int sum = 0;
		while (fractional > 0) {
			sum += fractional % 10;
			fractional /= 10;
		}

		// Check If Sum is Modulo Of 10
		if ((sum % 10) != 0) {
			// Throw Illegal Argument Exception
			throw new IllegalArgumentException("Digit sum pay violation.");
		}
	}

	// ToString
	@Override
	public String toString() {
		return String.format("Name: %s, Hourly Pay: $%.2f", name, hourlyPay);
	}

}
