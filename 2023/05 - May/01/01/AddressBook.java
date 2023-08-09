import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


// Address Book Class
public class AddressBook {
	// Name Of The AddressBook
	private String name;
	// An ArrayList Of Contacts To Hold All The Contacts In The AddressBook
	ArrayList <Contact> contacts;

	// Constructor
	public AddressBook(String name) {
		// Initialize Name Of The AddressBook Using Parameter
		this.name = name;
		// Initialize Contacts ArrayList
		this.contacts = new ArrayList <Contact>();
	}

	// Add A Single Contact In The AddressBook
	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}

	// Load A Collection Of Contacts From A File
	public void loadContacts(String fileName) {
		// Create A Buffered Reader To Read The Input File
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			// Stores A Single Line Read From The File
			String line;
			Contact contact = null;
			// Read File Line By Line
			while ((line = br.readLine()) != null) {
				// Split The CSV Line Into Individual Fields
				String[] fields = line.split(",");
				// Get Name And Phone Number
				String name = fields[0];
				String phoneNumber = fields[2];

				// If There Are 4 Fields Then Contact Is Family Contact
				if (fields.length == 4) {
					// If Family Contact Then Get RelationShip And Location Also
					String relationship = fields[1];
					String location = fields[3];
					// Create A New Family Member Contact
					contact = new FamilyMember(name, phoneNumber, relationship, location);
				// If There Are 3 Fields Then Contact Is Work Contact
				} else if (fields.length == 3) {
					// If Work Contact Then Get Title Also
					String title = fields[1];
					// Create A Work Contact
					contact = new WorkContact(name, phoneNumber, title);
				}

				// Add Contact To ArrayList
				addContact(contact);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	// Setter For Name
	public void setName(String name) {
		this.name = name;
	}

	// Getter For Name
	public String getName() {
		return name;
	}

	// Override ToString
	@Override
	public String toString() {
		// Name
		String result = name + "\n---------------\n";
		// Append Each Contact In The Arraylist In New Line
		for (Contact contact : contacts) {
			result += "- " + contact + "\n";
		}
		// Return The Result String
		return result;
	}
}
