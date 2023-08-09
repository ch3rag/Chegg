// Contact Abstract Class
public abstract class Contact {
	// Name Of The Person
	private String name;
	// Phone Number Of The Person
	private String phoneNumber;

	// Constructor
	public Contact(String name, String phoneNumber) {
		// Initialize Name And Phone Number With Parameters
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	// Setter For Name
	public void setName(String name) {
		this.name = name;
	}

	// Setter For Phone Number
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	// Getter For Name
	public String getName() {
		return name;
	}

	// Getter For Phone Number
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
