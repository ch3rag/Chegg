// HourlyEmployee.cs
// Hourly Employee Class
using System;

namespace Payroll {
	class HourlyEmployee : Employee {

		// Private Attributes To Store Wage And Number of Hours
		private double _wage;
		private int _hours;

		// Public Double Property Wage To Get/Set
		// Hourly Wage Of The Employee
		public double Wage {
			get { return _wage; }
			set { _wage = value; }
		}
		// Public Int Property Hours To Get/Set
		// Number Of Hours Worked
		public int Hours {
			get { return _hours; }
			set { _hours =  value; }
		}

		public HourlyEmployee(string firstName, string lastName, string ssn, DateTime birthDate double wage, int hours)
			: base(firstName, lastName, ssn, birthDate) {
				Wage = wage;
				Hours = hours;
		}

		// To String Method
		public override string ToString() {
			return String.Format("hourly employee: {0} {1}\nsocial security number: {2}\nweekly salary: {3}",
				FirstName, LastName, SSN, );
		}
	}
}