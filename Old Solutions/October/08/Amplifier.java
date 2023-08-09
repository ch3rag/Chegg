// Amplifier.java
public abstract class Amplifier {
	// Private Variable of Type Double That Will Hold the Ohm Rating of Register - 1
	private double r1;
	// Private Variable of Type Double That Will Hold the Ohm Rating of Register = 2
	private double r2;

	// Public Constructor That Will Take Two Doubles and Use Them to Initialize the Two Registers
	public Amplifier(double r1, double r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	// Getter Methods for the Register Variables
	public double getR1() {
		return r1;
	}

	public double getR2() {
		return r2;
	}

	// Public Abstract Method getGain() which Returns a Double
	public abstract double getGain();

	// Public Abstract Method getDescription() which Returns a String
	public abstract String getDescription();

	// Overriding of the toString() that Returns the Two Register Values as a String
	@Override
	public String toString() {
		return String.format("%.1f, %.1f", r1, r2);
	}
}
