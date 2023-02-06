// GradeUtils.java

public class GradeUtils {
	// Holds All Grades
	public static final String[] GRADES = {"HD", "D", "C", "P", "Z"};

	// Returns Grade Letter Index Based On Grade
	public static int getLetterGradeIndex(double grade) {
		if (grade >= 85) {
			return 0;
		} else if (grade >= 75) {
			return 1;
		} else if (grade >= 65) {
			return 2;
		} else if (grade >= 50) {
			return 3;
		} else {
			return 4;
		}
	}

	// Returns Grade Letter Based On Grade
	public static String getLetterGrade(double grade) {
		return GRADES[getLetterGradeIndex(grade)];
	}
}
