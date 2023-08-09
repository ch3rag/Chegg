using System;

public class Program {
	static void Main() {
		// Create A Person
		Person person = new Person("Peter Parker", "New York", "111-222-333", "peter.parker@gmail.com");
		// Create A Student
		Student student = new Student("Ryan", "Washington", "222-333-444", "ryan@yahoo.com", Student.StudentStatus.Sophomore);
		// Create A Employee
		Employee employee = new Employee("James", "LA", "444-555-666", "james@microsoft.com", "Microsoft", 100_000, new MyDate(24, 02, 2021));
		// Create A Faculty
		Faculty faculty = new Faculty("Ted", "LV", "222-888-999", "ted@aol.com", "MIT", 200_000, new MyDate(22, 01, 2015), "9AM to 6PM", "Professor");
		// Create A Staff
		Staff staff = new Staff("Jimmy", "SF", "252-858-929", "jimmy@aol.com", "MIT", 125_000, new MyDate(16, 12, 2018), "Assistant");


		// Display Person Details
		Console.WriteLine(person);

		Console.WriteLine();

		// Display Student Details
		Console.WriteLine(student);

		Console.WriteLine();

		// Display Employee Details
		Console.WriteLine(employee);

		Console.WriteLine();

		// Display Faculty Details
		Console.WriteLine(faculty);

		Console.WriteLine();

		// Display Staff Details
		Console.WriteLine(staff);
	}
}