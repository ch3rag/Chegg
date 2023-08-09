// VDivAmp.java

// The VDivAmp Class Extends Amplifier
public class VDivAmp extends Amplifier {

	// Constructor Which Simply Passes the Two Parameters for the Registers to the Base Class Constructor
	public VDivAmp(double r1, double r2) {
		super(r1, r2);
	}

	// Implementation of getGain(), Which Calculates the Gain as R2 / (R1 + R2)
	@Override
	public double getGain() {
		return getR2() / (getR1() + getR2());
	}
	// Implementation of getDescription That Returns the String: "Voltage Divider Amplifier: " 
	@Override
	public String getDescription() {
		return  "Voltage Divider Amplifier: ";
	}
	
	// Override of toString() that Returns "Voltage Divider amplifier: 40, 30" If Register - 1 Is 40 and Register - 2 Is 30
	@Override
	public String toString() {
		return getDescription() + super.toString();
	}
}
