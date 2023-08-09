// Person Class
public class Person {
	// Properties
	// Name Of The Person
	public string Name { get; set; }
	// Address Of The Person
	public string Address { get; set; }
	// Phone Number Of The Person
	public string PhoneNumber { get; set; }
	// Email Of The Person
	public string Email { get; set; }

	// Constructor
	public Person(string name, string address, string phoneNumber, string email) {
		// Assign Args To Instance Data
		Name = name;
		Address = address;
		PhoneNumber = phoneNumber;
		Email = email;
	}

	// Return Person Details
	public override string ToString() {
		// this.GetType().Name Returns Name Of The Class As String
		return $"{this.GetType().Name} Details\n----------------\nName: {Name}\nAddress: {Address}\nPhone: {PhoneNumber}\nEmail: {Email}";
	}
}