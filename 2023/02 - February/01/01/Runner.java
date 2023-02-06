/**
 * Provides an entry point for running the code.
 * You do not need to alter this class in any way (unless you want to).
 */
public class Runner {

	/*
	 * Note: Feel free to change this main method to test different
	 * parts of your code and check that it is behaving correctly.
	 *
	 * The automatic marking will work regardless of what you do to this method
	 * (as long as the code still compiles, obvs.)
	 */
	public static void main(String[] args) throws Exception {

		StudentResult[] allResults = StudentResult.readFile("results.csv");

		// Create summaries for each subject
		String[] subjects = {
				"Programming Fundamentals",
				"Communication for IT Professionals",
				"Introduction to Information Systems"
		};

		StudentResultSummary[] subjectSummaries = new StudentResultSummary[subjects.length];
		for (int i = 0; i < subjects.length; i++) {
			subjectSummaries[i] = new StudentResultSummary();
		}

		// Go through each result, adding it to the appropriate summary
		for (StudentResult result : allResults) {

			// add result to appropriate subject summary
			for (int i = 0; i < subjects.length; i++) {
				// if the current result is for the current subject
				if (result.getSubject().equals(subjects[i])) {
					// add it to the corresponding summary
					subjectSummaries[i].add(result);
				}
			}
		}

		// print subject histograms
		for (int i = 0; i < subjects.length; i++) {
			System.out.println("Results for " + subjects[i]);
			System.out.println(subjectSummaries[i].renderToString());
		}
	}
}
