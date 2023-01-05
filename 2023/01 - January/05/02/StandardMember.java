// StandardMember.java

// Standard Member Class
public class StandardMember extends Member {

	// Constructor
	public StandardMember(String name, String address) {
		super(name, address);
	}

	@Override
	public double getFee() {
		// Fee For Standard Member is $100 Plus 13% Tax
		return 113.0;
	}
}