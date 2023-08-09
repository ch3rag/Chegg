import java.util.ArrayList;

// PhoneBookEntryTest.java

public class PhoneBookEntryTest {
	// Main
	public static void main(String[] args) {
		ArrayList<PhoneBookEntry> entries = new ArrayList<PhoneBookEntry>();

		// Add 5 PhoneBookEntry Objects
		entries.add(new PhoneBookEntry("Alex", "1234567890"));
		entries.add(new PhoneBookEntry("John", "9998887776"));
		entries.add(new PhoneBookEntry("James", "5544332211"));
		entries.add(new PhoneBookEntry("Larry", "0099887766"));
		entries.add(new PhoneBookEntry("Jenny", "9876543210"));

		// Display All Entries
		for (PhoneBookEntry entry : entries) {
			System.out.println(entry);
		}
	}
}
