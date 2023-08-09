public abstract class Employee extends Person {
	private String department;

	public Employee() {
		super();
		// Default Value
		this.department = "Mathematics";
	}

	public Employee(String id, String fullName, String department) {
		super(id, fullName);
		this.department = department;
	}

	public void setDepartent(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return this.department;
	}
}
