// Course.java

public class Course {
	// Short Code Of Course
	private String code;
	// Credit Obtained
	private int credit;
	// Corresponding Letter Grade
	private String letterGrade;

	// Constructor
	public Course(String code, int credit, String letterGrade) {
		this.code = code;
		this.credit = credit;
		this.letterGrade = letterGrade;
	}

	// Returns Points
	public double getPoints() {
		switch (letterGrade) {
			case "A+": return 4.3;
			case "A" : return 4.0;
			case "A-": return 3.7;
			case "B+": return 3.3;
			case "B" : return 3.0;
			case "B-": return 2.7;
			case "C+": return 2.3;
			case "C" : return 2.0;
			case "C-": return 1.7; 
			case "D+": return 1.3; 
			case "D":  return 1.0; 
			case "F":  return 0.0; 
			default :  return 0.0;
		}
	}

	// Returns Credit
	public int getCredit() {
		return credit;
	}

	// Returns String Representation Of Course
	@Override
	public String toString() {
		return String.format("%s(%d Credit): %s", code, credit, letterGrade);
	}


}
