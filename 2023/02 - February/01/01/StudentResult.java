import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class StudentResult {
	private String name;
	private String subject;
	private double grade;

	public StudentResult(String name, String subject, double grade) {
		this.name = name;
		this.subject = subject;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public double getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return name + " (" + subject + ") " + grade + "%";
	}

	public static StudentResult[] readFile(String path) throws Exception {
		ArrayList<StudentResult> results = new ArrayList<>();
		File file = new File(path);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		while ((line = reader.readLine()) != null) {
			String[] values = line.split(",");
			StudentResult result = new StudentResult(values[0], values[1], Double.valueOf(values[2]));
			results.add(result);
		}
		reader.close();
		return results.toArray(new StudentResult[results.size()]);
	}

	public static void main(String args[]) throws Exception {
		StudentResult[] results = readFile("results.csv");
		for (StudentResult result : results) {
			System.out.println(result);
		}
	}
}
