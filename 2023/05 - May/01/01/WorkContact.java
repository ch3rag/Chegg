// Work Contact Class
public class WorkContact extends Contact {
	
	// Work Title Of The Contact (Designation)
	private String title;

	// Constructor
	public WorkContact(String name, String phoneNumber, String title) {
		// Initialize Name And PhoneNumber Using Super Class Constructor
		super(name, phoneNumber);
		// Initialize Title Using Parameters
		this.title = title;
	}

	// Setter For Title
	public void setTitle(String title) {
		this.title = title;
	}
	
	// Getter For Title
	public String getTitle() {
		return title;
	}

	// Override ToString()
	@Override
	public String toString() {
		// Return Contact Information In A Well-Formatted String
		return String.format("%s (%s): %s",
			getName(), title, getPhoneNumber());
	}
}
