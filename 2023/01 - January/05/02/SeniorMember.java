// SeniorMember.java

// Senior Member Class
public class SeniorMember extends Member {
	// Private Attributes
	private double fee;

	// Constructor
	public SeniorMember(String name, String address, double fee) {
		super(name, address);
		this.fee = fee;
	}

	@Override
	public double getFee() {
		return fee;
	}
	
	// No Description Mentioned About This Method
	public void operation() { }
}
