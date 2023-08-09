// Staff Class
public class Staff : Employee {

	// Title Of The Staff
	public string Title { get; set; }
	// Constructor
	public Staff(string name, string address, string phoneNumber, string email, string office, double salary, MyDate dateHired, string title) 
		: base(name, address, phoneNumber, email, office, salary, dateHired) {
			Title = title;
	}

	// To String
	public override string ToString() {
		return base.ToString() + $"\nTitle: {Title}";
	}
}
