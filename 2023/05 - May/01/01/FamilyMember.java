// Family Member Class
public class FamilyMember extends Contact {
	// Relationship Of The Contact With The Holder
	private String relationship;
	// Location Of The Person
	private String location;

	// Constructor
	public FamilyMember(String name, String phoneNumber, String relationship, String location) {
		// Initialize Name And PhoneNumber Using Super Class Constructor
		super(name, phoneNumber);
		// Initialize Relationship And Location With Parameters
		this.relationship = relationship;
		this.location = location;
	}

	// Setter For Relationship
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	// Setter For Location
	public void setLocation(String location) {
		this.location = location;
	}

	// Getter For Relationship
	public String getRelationship() {
		return relationship;
	}

	// Getter For Location
	public String getLocation() {
		return location;
	}
	
	// Override ToString()
	@Override
	public String toString() {
		// Return Contact Information In A Well-Formatted String
		return String.format("%s (%s, %s): %s",
		getName(), relationship, location, getPhoneNumber());
	}
}
