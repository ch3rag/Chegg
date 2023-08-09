// SalariedEmployee.cs
// Salaried Employee Class
using System;

namespace Payroll {
	class SalariedEmployee : Employee {

		// Private Attribute To Store WeeklySalary of The Employee
		private double _weeklySalary;

		// Public Double Property WeeklySalary To Store 
		// Weekly Salary of The Employee
		public double WeeklySalary {
			get { return _weeklySalary; }
			set { _weeklySalary = value; }
		}

		// Constructor
		public SalariedEmployee(string firstName, string lastName, string ssn, DateTime birthDate, double weeklySalary)
			: base(firstName, lastName, ssn, birthDate) {
				WeeklySalary = weeklySalary;
		}

		// To String Method
		public override string ToString() {
			return String.Format("salaried employee: {0} {1}\nsocial security number: {2}\nweekly salary: {3}",
				FirstName, LastName, SSN, WeeklySalary);
		}

		// Earning Method
		public override double Earning() {
			return WeeklySalary;
		}
	}
}