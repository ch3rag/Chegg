// Faculty Class
public class Faculty : Employee {

	// Office Hours Of The Faculty
	public string OfficeHours { get; set; }

	// Rank Of The Faculty
	public string Rank { get; set; }

	// Constructor
	public Faculty(string name, string address, string phoneNumber, string email, string office, double salary, MyDate dateHired, string officeHours, string rank) 
		: base(name, address, phoneNumber, email, office, salary, dateHired) {
			OfficeHours = officeHours;
			Rank = rank;

	}

	// To String
	public override string ToString() {
		return base.ToString() + $"\nOffice Hours: {OfficeHours}\nRank: {Rank}";
	}
}
