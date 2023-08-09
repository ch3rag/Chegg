// Employee Class

public class Employee : Person {
	// Office Name
	public string Office { get; set; }

	// Salary Of The Employee
	public double Salary { get; set; }

	// Date Hired
	public MyDate DateHired { get; set; }
	// Constructor
	public Employee(string name, string address, string phoneNumber, string email, string office, double salary, MyDate dateHired) 
		: base(name, address, phoneNumber, email) {
		Office = office;
		Salary = salary;
		DateHired = dateHired;
	}

	// Return Employee Details
	public override string ToString() {
		return base.ToString() 
			+ $"\nOffice: {Office}\nSalary: ${Salary:F2}\nDate Hired: {DateHired}";
	}
}