// BCEmployee.java

public class BCEmployee extends Employee {
	// Constructors
	// 1. No-Arg Constructor
	public BCEmployee() {
		this("Unknown", 0.0);
	}

	// 2. Single Parameter Constructor For Name
	public BCEmployee(String name) {
		this(name, 0.0);
	}

	// 3. Single Parameter Constructor For Hourly Pay
	public BCEmployee(double hourlyPay) {
		this("Unknown", hourlyPay);
	}

	// 4. Two-Param Constructor
	public BCEmployee(String name, double hourlyPay) {
		super(name, hourlyPay);
		// Verify Pay
		verifyPay();
	}

	// Set Hourly Pay To Zero
	public void volunteer() {
		setHourlyPay(0.0);
	}
}
