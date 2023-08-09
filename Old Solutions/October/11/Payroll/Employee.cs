// Employee.cs
// Employee Abstract Base Class
using System;

namespace Payroll {
	abstract class Employee {
		// Private Class Attributes For FirstName, LastName And SSN
		private string _firstName;
		private string _lastName;
		private string _ssn;
		private DateTime _birthDate;

		// Read/Write Properties For FirstName, LastName
		public string FirstName {
			get { return _firstName; }
			set { _firstName = value; }
		}
		public string LastName {
			get { return _lastName; }
			set { _lastName = value; }
		}

		// Read Only Property For SSN
		public string SSN { get => _ssn; }

		// Birth Date Of The Employee
		public DateTime BirthDate {
			get { return _birthDate; }
			set { _birthDate = value; }
		}


		// Constructor
		public Employee(string firstName, string lastName, string ssn, DateTime birthDate) {
			_firstName = firstName;
			_lastName = lastName;
			_ssn = ssn;
			_birthDate = birthDate;
		}

		// Abstract Earning Method
		public abstract double Earning();

		// To String Method
		public override string ToString() {
			return String.Format("{0} {1}\nsocial security number: {3}",
				FirstName, LastName, SSN);
		}
	}
}