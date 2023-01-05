// Member.java

// Member Class
public abstract class Member {
	// Private Attributes
	private String name;
	private String address;

	// Public Methods
	// Constructor
	public Member(String name, String address) {
		this.name = name;
		this.address = address;
	}

	// Getter For Name
	public String getName() {
		return name;
	}

	// Getter For Address
	public String getAddress() {
		return address;
	}

	// Abstract Method For Returning The Fee Of MemberShip
	public abstract double getFee();
}
