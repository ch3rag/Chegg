// Employee.java

public abstract class Employee {
	// Attributes
	private String name;
	private int salary;

	// Constructor
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	// Getter And Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Returns Amount Of Tax Paid
	abstract double getTax();
}
