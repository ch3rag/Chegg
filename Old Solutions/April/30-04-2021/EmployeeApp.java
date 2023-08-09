import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeApp
 {
	static Scanner s = new Scanner(System.in);

	static String getString(String prompt, String onEmpty) {
		while (true) {
			System.out.print(prompt);
			String input = s.nextLine();
			try {
				if (input.isEmpty()) {
					throw new IllegalArgumentException(onEmpty);
				}
				return input;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	static int getInt(String prompt, String onError) {
		while (true) {
			try {
				System.out.print(prompt);
				String userInput = s.nextLine();
				int result = Integer.parseInt(userInput);
				return result;
			} catch (NumberFormatException ex) {
				System.out.println(onError);
			}
		}
	}

	static double getDouble(String prompt, String onError) {
		while (true) {
			try {
				System.out.print(prompt);
				String userInput = s.nextLine();
				double result = Double.parseDouble(userInput);
				return result;
			} catch (NumberFormatException ex) {
				System.out.println(onError);
			}
		}
	}

	public static void main(String[] args) {

		char keepGoing = 'Y';
		ArrayList<Employee> arl = new ArrayList<Employee>();

		while (keepGoing == 'Y' || keepGoing == 'y') {
			// Get Name
			String name = getString("Enter employee's name: ", "Employee name can not be blank, please re enter");

			// Get ID
			String id = getString("Enter " + name + "'s ID#: ", "ID is required. Please re-enter");

			// Get EmpType
			char employeeType;
			while (true) {
				employeeType = getString(
						"Is the employee Salaried or Hourly? (enter S for salaried and H for hourly): ",
						"Employee Type is required. Please re-enter").toUpperCase().charAt(0);
				if (employeeType != 'H' && employeeType != 'S') {
					System.out.println("Employee type can only be H or S, please re-enter");
				} else
					break;
			}
			// Get Pay/Annual Salary
			int annualSalary;
			double payRate;
			Employee employee1;
			if (employeeType == 'S') {
				annualSalary = getInt("Enter " + name + "'s yearly salary: ",
						"No chars or decimals allowed. Enter integers only.");
				employee1 = new Employee(name, id, employeeType, annualSalary);
			} else {
				payRate = getDouble("Enter " + name + "'s pay rate: ", "No characters allowed. Enter doubles only.");
				employee1 = new Employee(name, id, employeeType, payRate);
			}
			arl.add(employee1);

			System.out.print("Would you like to add anoyher employee?(Y for yes or N for no): ");
			keepGoing = s.nextLine().charAt(0);
			System.out.println();
		}

		// Print All The Employees
		System.out.println("Current contents of ArrayList...");
		for (Employee employee : arl) {
			System.out.println();
			System.out.println(employee.getName() + "\nID #" + employee.getidNumber());
			if (employee.getemployeeType() == 'H') {
				double hoursWorked = getDouble("Enter " + employee.getName() + "'s hours worked : ",
						"No characters allowed. Enter doubles only.");
				System.out.printf("Weekly Gross Pay - $%.2f", employee.getGrossPay(hoursWorked));
			} else {
				System.out.printf("Weekly Gross Pay - $%.2f", employee.getGrossPay());
			}
			System.out.println();
		}

		// Deleting
		char deleteMore = 'Y';
		while (deleteMore == 'y' || deleteMore == 'Y') {
			String idToBeDeleted = getString("Enter an ID number to delete corresponding record: ",
					"ID is required. Please re-enter");
			Employee employeeToBeDeleted = null;
			for (Employee employee : arl) {
				if (idToBeDeleted.equalsIgnoreCase(employee.getidNumber())) {
					employeeToBeDeleted = employee;
				}
			}

			if (employeeToBeDeleted != null) {
				arl.remove(employeeToBeDeleted);
				System.out.println("Employee with ID# " + idToBeDeleted + " has been removed from the ArrayList.");
			} else {
				System.out.println("ERROR - ID# not found. Please try again.");
				continue;
			}

			// Print All The Employees
			System.out.println("Current contents of ArrayList...");
			for (Employee employee : arl) {
				System.out.println();
				System.out.println(employee.getName() + "\nID #" + employee.getidNumber());
				System.out.println();
			}

			System.out.print("Do you wish to delete any other employees?(Y/N): ");
			deleteMore = s.nextLine().charAt(0);
		}
	}
}
