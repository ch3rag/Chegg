using System;

namespace Payroll {
	class Program {
		static void Main() {
			Employee employee = new SalariedEmployee("Alex", "Lane", "ABC123", 20);
			System.Console.WriteLine(employee);
		}
	}
}