package UnitTesting;

public class Student implements Comparable<Student> {
	String name;
	char grade;

	public Student() {}

	public int compareTo(Student other) {
		if (grade > other.grade) {
			return -1;
		} else if (grade < other.grade) {
			return 1;
		} else {
			if (name.charAt(0) < other.name.charAt(0)) {
				return 1;
			} else if (name.charAt(0) > other.name.charAt(0)) {
				return -1;
			}
		}
		return 0;
	}
}
