// FinancialAid.java

import javax.swing.JOptionPane;

public class FinancialAid {
	public static void main(String[] args) {
		final int NUM_MIN_DEPENDENTS = 0;
		final int NUM_MAX_DEPENDENTS = 9;

		/*
		 * #1: Create Code That Will Call The Method You Created In
		 * #3 Below To Get The Number Of Dependents, Factoring In The Minimum And Maximum
		 * Number Of Dependents Allowed.
		 */
		int numDependents = getNumDependents(NUM_MIN_DEPENDENTS, NUM_MAX_DEPENDENTS);

		/*
		 * #2: Create Code That Will Call The Method You Created In #4 Below
		 * To Calculate The Amount Of Aid That Will Earned Based On The Number Of Dependents
		 * Gathered.
		 */
		double aid = calcFinancialAid(numDependents);
		
		// Print Financial Aid Amount
		printFinancialAid(aid);
	}

	/*
	 * #3: Create A Method To Get And Return The Number Of Dependents,
	 * Factoring In The Minimum And Maximum Number Of Dependents Allowed.
	 */

	public static int getNumDependents(final int NUM_MIN_DEPENDENTS, final int NUM_MAX_DEPENDENTS) {
		// Infinite Loop
		while (true) {
			// Input The Number Of Dependents As String
			String userInput = JOptionPane.showInputDialog(null, String.format("Input the number of dependents between %d and %d: ", NUM_MIN_DEPENDENTS, NUM_MAX_DEPENDENTS));
			try {
				// Parse String To Int
				int numDependents = Integer.parseInt(userInput);
				// Check If The Dependents Are In Valid Range
				if (numDependents >= NUM_MIN_DEPENDENTS && numDependents <= NUM_MAX_DEPENDENTS) {
					// If Yes, Return To The Caller
					return numDependents;
				}
				// Out Of Range
				// Display Error
				JOptionPane.showMessageDialog(null,String.format("Error: Value must be between %d and %d!", NUM_MIN_DEPENDENTS, NUM_MAX_DEPENDENTS), "Error", JOptionPane.ERROR_MESSAGE);
			} catch (NumberFormatException ex) {
				// Non-Integer Input, Display Error
				JOptionPane.showMessageDialog(null, "Error: Only Integers are allowed!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/*
	 * #4: Create A Method To Calculate And Return The Amount Of Financial Aid That Will Be Earned Based On
	 * The Number Of Dependents Gathered
	 */
	public static double calcFinancialAid(int numDependents) {
		if (numDependents == 2) {
			// If There Are 2 Dependents Then The Family Is Eligible For $1,500 Per Dependent
			return 1500.0 * 2;
		} else if (numDependents == 3) {
			// If There Are 3 Dependents Then The Family Is Eligible For $2,500 Per Dependent
			return 2500.0 * 3;
		} else if (numDependents == 4) {
			// If There Are 4 Dependents Then The Family Is Eligible For $3,000 Per Dependent
			return 3000 * 4;
		} else {
			// In All Other Situations, Family Is Not Eligible For Any Financial Aid
			return 0.0;
		}
	}

	public static void printFinancialAid(double aid) {
		JOptionPane.showMessageDialog(null, "The amount of financial aid you family is eligible for is: $" + String.format("%.2f", aid));
	}

}
