public class Main {
	public static void main(String[] args) {
		// Create An Array Of 6 Employees
		Employee[] employees = new Employee[6];

		// Add 2 Full Time Employees
		employees[0] = new FullTimeEmployee("Joe", 2000);
		employees[1] = new FullTimeEmployee("Karen", 920);
		// Add 2 Part Time Employees
		employees[2] = new PartTimeEmployee("Johnny", 800);
		employees[3] = new PartTimeEmployee("Janine", 920);
		// Add 2 Full Interns
		employees[4] = new Intern("Heather", 300);
		employees[5] = new Intern("Kathy", 500);

		// Accumulator For Total Tax
		double totalTax = 0.0;
		// For Each Employee
		for (Employee employee : employees) {
			// Discard Value After Decimal Point (To Match Output)
			double tax = (int)employee.getTax();

			// Print Name, Salary And Tax Paid
			System.out.printf("%s earned %d and payed $%.1f total in tax\n",
				employee.getName(), employee.getSalary(), tax);

			// Accumulate Tax
			totalTax += tax;
		}

		// Print Total Tax Paid By All Employees
		System.out.printf("Total taxes paid by all employees: $%.1f\n", totalTax);
	}
}
