// StudentResultSummary.java

import java.util.ArrayList;
import java.util.List;

public class StudentResultSummary {

	// ArrayList To Hold StudentResults
	private List<StudentResult> summary = new ArrayList<>();


	public void add(StudentResult result) {
		// Add A Single Result To Collection
		summary.add(result);
	}

	public void addAll(StudentResult... results) {
		// Add All StudentResult Objects In The Results To Our Collection
		for (StudentResult studentResult : results) {
			summary.add(studentResult);
		}
	}

	public void reset() {
		// Clear The Collection
		summary.clear();
	}

	public String renderToString() {
		// For No Students
		if (summary.size() == 0) {
			return "No results to show";
		}

		// Count The Frequency Of Each Grade Letter
		int HDCount = 0;
		int DCount = 0;
		int CCount = 0;
		int ZCount = 0;
		int PCount = 0;
		
		// Student With Max Grades
		StudentResult topper = null;
		// Let Max Grades = -1
		double maxGrades = -1;


		// Iterate Through The StudentResults
		for (StudentResult studentResult : summary) {
			// Get Grade Letter Using GradeUtils
			String gradeLetter = GradeUtils.getLetterGrade(studentResult.getGrade());

			// Check If Current Student Has Grade Greater Than Max Grades
			if (studentResult.getGrade() > maxGrades) {
				topper = studentResult;
				maxGrades = topper.getGrade();
			}

			// Count Grade Letter
			if (gradeLetter.equals("HD"))
				HDCount++;
			else if (gradeLetter.equals("D"))
				DCount++;
			else if (gradeLetter.equals("C"))
				CCount++;
			else if (gradeLetter.equals("P"))
				PCount++;
			else if (gradeLetter.equals("Z"))
				ZCount++;
		}

		// Create A PercentFormatter For Rendering
		PercentFormatter percentFormatter = new PercentFormatter();

		// Create A String Builder
		StringBuilder str = new StringBuilder();

		str.append(String.format("HD: %d(%s)\n", HDCount, percentFormatter.format(HDCount, summary.size())));
		str.append(String.format("D: %d(%s)\n", DCount, percentFormatter.format(DCount, summary.size())));
		str.append(String.format("C: %d(%s)\n", CCount, percentFormatter.format(CCount, summary.size())));
		str.append(String.format("P: %d(%s)\n", PCount, percentFormatter.format(PCount, summary.size())));
		str.append(String.format("Z: %d(%s)\n", ZCount, percentFormatter.format(ZCount, summary.size())));
		str.append(String.format("Top student: %s with %s (%s)", topper.getName(), percentFormatter.format(topper.getGrade()),  GradeUtils.getLetterGrade(topper.getGrade())));

		return str.toString();
	}
}