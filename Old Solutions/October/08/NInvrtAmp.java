// NInvrtAmp.java

// The NInvrtAmp Class Extends Amplifier
public class NInvrtAmp extends Amplifier {

	// Constructor Which Simply Passes the Two Parameters for the Registers to the Base Class Constructor
	public NInvrtAmp(double r1, double r2) {
		super(r1, r2);
	}

	// Implementation of getGain(), Which Calculates the Gain as 1 + (R2 / R1)
	@Override
	public double getGain() {
		return 1 + (getR2() / getR1());
	}
	// Implementation of getDescription That Returns the String: "Noninverting Amplifier: " 
	@Override
	public String getDescription() {
		return  "Noninverting Amplifier: ";
	}
	
	// Override of toString() that Returns "Noninverting amplifier: 40, 30" If Register - 1 Is 40 and Register - 2 Is 30
	@Override
	public String toString() {
		return getDescription() + super.toString();
	}
}
