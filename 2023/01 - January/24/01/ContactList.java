import java.util.Iterator;
import java.util.Scanner;

public class ContactList {
	public static char sortBy;

	public ContactList(Person[] contacts, char sortBy) {
		ArrayOrderedList<Person> sortedContacts = new ArrayOrderedList<Person>();
		
		ContactList.sortBy = sortBy;

		for (int i = 0; i < contacts.length; i++) {
			sortedContacts.add(contacts[i]);
		}

		printContacts(sortedContacts);
	}

	// Prints Contacts On The Console
	public static void printContacts(ArrayOrderedList<Person> list) {
		for (Iterator<Person> itr = list.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		Person[] contacts = new Person[] {
				new Person("Artem Kyrzikov", "the.art.guy@gmail.com", "Toronto"),
				new Person("Tina Lawson", "tlawson@uwo.ca", "London"),
				new Person("Clara Kinkaid", "kinkaid_1997@msn.com", "Vancouver"),
				new Person("Johnny Smith", "jsmith57@uwo.ca", "London"),
				new Person("Rebecca Cortez", "beckybrowneyes@gmail.com", "London"),
				new Person("Ahmed Morrah", "king_ahmed_83@gmail.com", "Toronto"),
				new Person("Vanessa Hedberg", "vlhedberg14@hotmail.com", "Vancouver"),
				new Person("Megan McIssac", "mandm_madness@gmail.com", "Toronto"),
				new Person("Ann Hoffer", "ahoffe61@uwo.ca", "London"),
				new Person("Robert Kane", "rkane79@uwo.ca", "London")
		};
		

		String msg = "Type 'n' to sort by name, 'e' to sort by email, or 'c' to sort by city. Type any other letter to quit.";

		// Scanner For User Input
		Scanner input = new Scanner(System.in);

		// Loop
		while(true) {
			// Print Message
			System.out.println(msg);
			// Input Char
			char c = input.next().charAt(0);

			// If C Is One Of N/E/C
			if (c == 'n' || c == 'e' || c == 'c') {
				new ContactList(contacts, c);
				System.out.println();
			} else {
				break;
			}
		}
		// Clean Up
		input.close();
	}
}
