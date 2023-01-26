public class Person implements Comparable<Person> {
	/* Attribute Declarations */
	private String name;
	private String city;
	private String email;

	/**
	 * Constructor Initializes The Person Name, City, And Email
	 */
	public Person(String name, String email, String city) {
		this.name = name;
		this.city = city;
		this.email = email;
	}

	/**
	 * toString To Display Person's Info In A Clean Format
	 * return String Of The Person's Info
	 */
	public String toString() {
		String s = String.format("%10s\t\t%30s\t\t%10s", name, email, city);
		return s;
	}

	/**
	 * compareTo Determines The Other Of The Contacts
	 */
	public int compareTo(Person other) {
		switch (ContactList.sortBy) {
			case 'c':
				return sortByCity(other);
			case 'n':
				return sortByName(other);
			case 'e':
				return sortByEmail(other);
			default:
				return 0;
		}
	}

	/**
	 * Compares One Person With Other By Name
	 */
	public int sortByName(Person other) {
		return name.compareTo(other.name);
	}

	/**
	 * Compares One Person With Other By Email
	 */
	public int sortByEmail(Person other) {
		return email.compareTo(other.email);
	}

	/**
	 * Compares One Person With Other By City
	 */
	public int sortByCity(Person other) {
		return city.compareTo(other.city);
	}

} 
