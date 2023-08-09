// FullTimeEmployee.java

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String name, int salary) {
		super(name, salary);
	}

	@Override
	double getTax() {
		// Health Insurance Tax
		double healthInsuranceTax = 100.0;
		// Income Tax
		double incomeTax = getSalary() * 0.16;
		// Retirement Tax
		double retirementTax = getSalary() * 0.10;
		// Return Total Tax
		return healthInsuranceTax + incomeTax + retirementTax;
	}
}
