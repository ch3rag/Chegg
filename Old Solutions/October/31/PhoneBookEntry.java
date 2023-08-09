// PhoneBookEntry.java

public class PhoneBookEntry {
	// Name Of The Person
	private String name;
	// Phone Number
	private String phoneNumber;

	// Constructor
	public PhoneBookEntry(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// ToString()
	@Override
	public String toString() {
		return String.format("PhoneBookEntry [Name: %s, Phone Number: %s]",
			getName(), getPhoneNumber());
	}
}
