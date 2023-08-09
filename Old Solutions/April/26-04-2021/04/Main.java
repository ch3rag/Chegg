class Employee {
	private String fName, lName;
	
	public Employee(String f, String l) {
		fName = f;
		lName = l;
	}
}

class Manager extends Employee {
	private short level;
	
	public Manager (String f, String l, short lvl) {
		// Syntax Error
		// Employee(f, l); 

		// Proper Syntax To Call Base Class Constructor (Using super Keyword)
		super(f, l);
		level = lvl;
	}

	public Manager(String f, String l) {
		// Error
		// 10 Is A Integer Literal (Default)
		// You Have To Cast It To Short
		// this(f, l, 10);

		this (f, l, (short)10);
	}
}

public class Main {
	public static void main(String[] args) {
		Employee e = new Manager("John", "Doe");
		// fName = John
		// lName = Doe
		// lvl = 10 (Though You Can't Access It Using 'e')
	}
}