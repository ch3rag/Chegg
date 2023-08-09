// InvrtAmp.java

// The InvrtAmp Class Extends Amplifier
public class InvrtAmp extends Amplifier {

	// Constructor Which Simply Passes the Two Parameters for the Registers to the Base Class Constructor
	public InvrtAmp(double r1, double r2) {
		super(r1, r2);
	}

	// Implementation of getGain(), Which Calculates the Gain as -(R2 / R1)
	@Override
	public double getGain() {
		return -(getR2() / getR1());
	}
	// Implementation of getDescription That Returns the String: "Inverting Amplifier: " 
	@Override
	public String getDescription() {
		return  "Inverting Amplifier: ";
	}
	
	// Override of toString() that Returns "Inverting Amplifier: 40, 30" If Register - 1 Is 40 and Register - 2 Is 30
	@Override
	public String toString() {
		return getDescription() + super.toString();
	}
}
