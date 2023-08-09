// Intern.java

public class Intern extends Employee {

	public Intern(String name, int salary) {
		super(name, salary);
	}

	@Override
	double getTax() {
		// If Salary Less Than 350, No Tax
		if (getSalary() >= 350) {
			return getSalary() * 0.16;
		}

		return 0.0;
	}
}
