public class Lab2 {
	public static void main(String[] args) {
		AddressBook familyBook = new AddressBook("Family");
		familyBook.loadContacts("data/family.csv");
		System.out.println(familyBook);

		AddressBook workBook = new AddressBook("Work Contacts");
		workBook.loadContacts("data/work.csv");
		System.out.println(workBook);
	}
}
