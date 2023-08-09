public class Staff extends Employee {
	private String status;
	
	public Staff() {
		super();
		this.status = "Full Time";
	}

	public Staff(String id, String fullName, String department, String status) {
		super(id, fullName, department);
		this.status = status;
	}

	public void setStatus(String rank) {
		this.status = rank;
	}

	public String getStatus() {
		return this.status;
	}

	@Override
	public void print() {
		System.out.println("-----------------------------------------------------");
		System.out.println(this.getFullName() + "\t\t\t\t" + this.getId());
		System.out.println(this.getDepartment() + " Department, " + this.getStatus());
		System.out.println("-----------------------------------------------------");	
	}
}
