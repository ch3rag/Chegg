// PartTimeEmployee.java

public class PartTimeEmployee extends Employee {

	public PartTimeEmployee(String name, int salary) {
		super(name, salary);
	}

	@Override
	double getTax() {
		// Health Insurance Tax
		double healthInsuranceTax = 100.0;
		// Income Tax
		double incomeTax = getSalary() * 0.16;
		// Retirement Tax
		double retirementTax = getSalary() * 0.05;
		// Return Total Tax
		return healthInsuranceTax + incomeTax + retirementTax;
	}
}
