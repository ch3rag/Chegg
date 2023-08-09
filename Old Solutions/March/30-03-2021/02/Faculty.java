public class Faculty extends Employee {
	private String rank;
	
	public Faculty() {
		super();
		this.rank = "Adjunct";
	}

	public Faculty(String id, String fullName, String department, String rank) {
		super(id, fullName, department);
		this.rank = rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getRank() {
		return this.rank;
	}

	@Override
	public void print() {
		System.out.println("-----------------------------------------------------");
		System.out.println(this.getFullName() + "\t\t\t\t" + this.getId());
		System.out.println(this.getDepartment() + " Department, " + this.getRank());
		System.out.println("-----------------------------------------------------");	
	}
}
