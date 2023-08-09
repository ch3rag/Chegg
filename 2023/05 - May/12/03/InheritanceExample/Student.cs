// Student Class
public class Student : Person {
	//  Enum To Hold Valid Student Status Values
	public enum StudentStatus {
		FreshMan, Sophomore, Junior, Senior
	};

	// Status Of The Student
	public StudentStatus Status { get; set; } 

	// Constructor
	public Student(string name, string address, string phoneNumber, string email, StudentStatus status) : base(name, address, phoneNumber, email) {
		Status = status;
	}

	// Return Student Details
	public override string ToString() {
		return base.ToString() + $"\nStatus: {Status}";
	}
}