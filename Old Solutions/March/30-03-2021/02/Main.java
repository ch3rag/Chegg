import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Person[] persons = new Person[100];
		Scanner input = new Scanner(System.in);
		int count = 0;

		String fullName, id, rank, department, status;
		int creditHours;
		double gpa;
		boolean flag;

		while (true) {
			System.out.println("Choose one of the options:");
			System.out.println();
			System.out.println("1- Enter the information of a faculty");
			System.out.println("2- Enter the information of a student");
			System.out.println("3- Print tuition invoice for a student");
			System.out.println("4- Print faculty information");
			System.out.println("5- Enter the information of a staff member");
			System.out.println("6- Print the information of a staff member");
			System.out.println();
			System.out.print("\tEnter your selection: ");
			int choice = input.nextInt();
			input.nextLine();
			switch (choice) {
				case 1:
					System.out.println("Enter the faculty info: ");
					System.out.print("\tName of the faculty: ");
					fullName = input.nextLine();
					System.out.print("\tId: ");
					id = input.nextLine();
					while (true) {
						System.out.print("\tRank: ");
						rank = input.nextLine();
						if (rank.equalsIgnoreCase("Adjunct")) {
							rank = "Adjunct";
							break;
						} else if (rank.equalsIgnoreCase("Professor")) {
							rank = "Professor";
							break;
						} else {
							System.out.printf("\t\t\"%s\" is invalid%n", rank);
						}
					}
					while (true) {
						System.out.print("\tDepartment: ");
						department = input.nextLine();
						if (department.equalsIgnoreCase("Mathematics")) {
							department = "Mathematics";
							break;
						} else if (department.equalsIgnoreCase("Engineering")) {
							department = "Engineering";
							break;
						} else if (department.equalsIgnoreCase("Sciences")) {
							department = "Sciences";
							break;
						} else {
							System.out.printf("\t\t\"%s\" is invalid%n", department);
						}
					}
					Faculty faculty = new Faculty(id, fullName, department, rank);
					persons[count++] = faculty;
					System.out.println("Faculty added!");
					break;
				case 2:
					System.out.println("Enter the student info: ");
					System.out.print("\tName of student: ");
					fullName = input.nextLine();
					System.out.print("\tId: ");
					id = input.nextLine();
					System.out.print("\tGpa: ");
					gpa = input.nextDouble();
					input.nextLine();
					System.out.print("\tCredit hours: ");
					creditHours = input.nextInt();
					input.nextLine();
					Student student = new Student(id, fullName, gpa, creditHours);
					persons[count++] = student;
					System.out.println("Student added!");
					break;
				case 3:
					System.out.print("Enter the student's id: ");
					id = input.nextLine();
					flag = false;
					for (int i = 0; i < count; i++) {
						if (persons[i].getId().equalsIgnoreCase(id) && persons[i] instanceof Student) {
							flag = true;
							persons[i].print();
							break;
						}
					}
					if (!flag) {
						System.out.println("No student matched");
					}
					break;
				case 4:
					System.out.print("Enter the faculty's's id: ");
					id = input.nextLine();
					flag = false;
					for (int i = 0; i < count; i++) {
						if (persons[i].getId().equalsIgnoreCase(id) && persons[i] instanceof Faculty) {
							flag = true;
							persons[i].print();
							break;
						}
					}
					if (!flag) {
						System.out.println("No faculty matched");
					}
					break;
				case 5:
					System.out.println("Enter the staff info: ");
					System.out.print("\tName of the staff member: ");
					fullName = input.nextLine();
					System.out.print("\tEnter the Id: ");
					id = input.nextLine();
					while (true) {
						System.out.print("\tDepartment: ");
						department = input.nextLine();
						if (department.equalsIgnoreCase("Mathematics")) {
							department = "Mathematics";
							break;
						} else if (department.equalsIgnoreCase("Engineering")) {
							department = "Engineering";
							break;
						} else if (department.equalsIgnoreCase("Sciences")) {
							department = "Sciences";
							break;
						} else {
							System.out.printf("\t\t\"%s\" is invalid%n", department);
						}
					}
					while (true) {
						System.out.print("\tStatus, Enter P for Part Time, or Enter F for Full Time: ");
						status = input.nextLine();
						if (status.equalsIgnoreCase("f")) {
							status = "Full Time";
							break;
						} else if (status.equalsIgnoreCase("p")) {
							status = "Part Time";
							break;
						} else {
							System.out.printf("\t\t\"%s\" is invalid%n", status);
						}
					}
					
					Staff staff = new Staff(id, fullName, department, status);
					persons[count++] = staff;
					System.out.println("Staff added!");
					break;
				case 6:
					System.out.print("Enter the staff's id: ");
					id = input.nextLine();
					flag = false;
					for (int i = 0; i < count; i++) {
						if (persons[i].getId().equalsIgnoreCase(id) && persons[i] instanceof Staff) {
							flag = true;
							persons[i].print();
							break;
						}
					}
					if (!flag) {
						System.out.println("No staff matched");
					}
					break;
				case 7: 
					System.exit(0);
			}
		}
	}
}
