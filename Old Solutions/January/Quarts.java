// Quarts.java

public class Quarts {
	// Define A Constant
	public static final int QUARTS_IN_GALLON = 4;
	
	// Main
	public static void main(String[] args) {
		// Define A Variable QuartsNeeded
		int quartsNeeded = 18;

		// Compute Gallons
		int gallons = quartsNeeded / QUARTS_IN_GALLON;

		// Compute Quarts
		int quarts = quartsNeeded % QUARTS_IN_GALLON;

		// Display Result
		System.out.printf("A job that needs %d quarts requires %d gallons plus %d quarts.",
			quartsNeeded, gallons, quarts);
	}
}