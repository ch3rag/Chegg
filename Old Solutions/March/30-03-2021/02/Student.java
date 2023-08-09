public class Student extends Person {
	private double gpa;
	private int creditHours;

	public Student() {
		super();
		this.gpa = 0.0;
		this.creditHours = 0;
	}

	public Student(String id, String fullName, double gpa, int creditHours) {
		super(id, fullName);
		this.gpa = gpa;
		this.creditHours = creditHours;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double getGpa() {
		return this.gpa;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	public int getCreditHours() {
		return creditHours;
	}

	@Override
	public void print() {
		System.out.println("Here is the tuition invoice for " + this.getFullName());
		System.out.println("-----------------------------------------------------");
		System.out.println(this.getFullName() + "\t\t\t\t" + this.getId());
		System.out.println("Credit Hours: " + this.getCreditHours() + " ($236.45/credit hour)");
		System.out.println("Fees: $52");
		double total = this.getCreditHours() * 236.45 + 52.0;
		double discount = 0;
		if (this.getGpa() >= 3.85) {
			discount = total * 0.25;
		}
		System.out.println("Total payment(after discount): $" + (total - discount) + "\t\t\t\t($" + discount + " discount applied)");
		System.out.println("-----------------------------------------------------");
	}	
}
