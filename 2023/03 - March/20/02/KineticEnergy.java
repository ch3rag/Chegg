import java.util.Scanner;

// KineticEnergy.java

// Kinetic Energy Class
public class KineticEnergy {
	// Constant For Density Of Iron
	public static final double IRON_DENSITY = 7.8;

	// Computes Liner Energy
	public static double linearEnergy(double radius, double velocity) {
		// Compute Volume Of Ball
		double volume = (4 / 3.0) * Math.PI * Math.pow(radius, 3);
		// Compute Mass Of Ball
		double mass = IRON_DENSITY * volume;
		// Compute And Return Linear Energy
		return 0.5 * mass * velocity * velocity;
	}

	// Computes Angular Energy
	public static double angularEnergy(double radius, double velocity) {
		// Compute Volume Of Ball
		double volume = (4 / 3.0) * Math.PI * Math.pow(radius, 3);
		// Compute Mass Of Ball
		double mass = IRON_DENSITY * volume;
		// Compute Inertia Of Ball
		double inertia = 0.4 * mass * radius * radius;
		// Compute Angular Velocity Of Ball
		double angularVelocity = velocity / radius;
		// Compute And Return Angular Energy
		return 0.5 * inertia * angularVelocity;
	}

	// Main Entry Point
	public static void main(String[] args) {
		// Scanner Object For User Input
		Scanner input = new Scanner(System.in);

		// Print Welcome Message
		System.out.println("*** Kinetic energy calculation ****\n");

		// Input Values
		System.out.println("Enter the following parameters:");
		
		// Input Radius Of The Ball
		System.out.print(" - Radius of the ball (m): ");
		double radius = Double.parseDouble(input.nextLine());
		
		// Input Linear Velocity Of The Ball
		System.out.print(" - Linear velocity of the ball (m/s): ");
		double velocity = Double.parseDouble(input.nextLine());

		// Compute Linear Kinetic Energy Using Method
		double linearKineticEnergy = linearEnergy(radius, velocity);
		// Compute Angular Kinetic Energy Using Method
		double angularKineticEnergy = angularEnergy(radius, velocity);

		// Compute Total Kinetic Energy
		double totalKineticEnergy = linearKineticEnergy + angularKineticEnergy;

		// Print The Result
		System.out.printf("\nThe total kinetic energy is %.2f (J)\n", totalKineticEnergy);
		
		// Clean Up
		input.close();
		System.out.print("The program has terminated");
	}
}
