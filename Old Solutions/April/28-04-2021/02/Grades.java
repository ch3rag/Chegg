import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Grades {
	// For index = 0 => F
	// For index = 1 => D-
	// For inde = 12 => A+
	public static String getGradeString(int index) {
		String gradeString;
		if (index == 0) {
			gradeString = "F";
		} else {
			gradeString = (char)(69 - Math.ceil((double)index / 3)) + "";
			if (index % 3 == 1) {
				gradeString += "-";
			} else if (index % 3 == 0) {
				gradeString += "+";
			}
		}
		return gradeString;
	}

	public static void main(String[] args) throws IOException {
		// Declarations
		// grades[0] = F, grades[1] = D-, grades[2] = D, grades[3] = D+...
		int[] grades = new int[13];
		int lowest = Integer.MAX_VALUE;
		int highest = Integer.MIN_VALUE;
		int total = 0;

		// Read Grades From The File
		// Populate grades[], lowest, highest and total
		Scanner scanner = new Scanner(new File("Grades.txt"));
		while(scanner.hasNextInt()) {
			int grade  = scanner.nextInt();
			if (grade == -1) {
				break;
			}
			grades[(grade - 49) / 4]++;

			if (lowest > grade) {
				lowest = grade;
			}

			if (highest < grade) {
				highest = grade;
			}

			total++;
		}

		// Display The Output
		System.out.println("Total number of grades = " + total);
		System.out.println("The highest grade = " + highest);
		System.out.println("The lowest grade = " + lowest);
		for(int i = grades.length - 1; i >= 0; i--) {
			System.out.printf("Number of %s's = %d%n",  getGradeString(i), grades[i]);
		}


		// Draw The Graph
		System.out.printf("   ");
		for(int i = 0; i <= 20; i++) {
			System.out.printf("%-5d", (i) * 5);
			
		}
		System.out.println("%");
		
		System.out.printf("   ");
		for(int i = 0; i <= 20; i++) {
			System.out.print("|    ");
		}
		System.out.println();

		System.out.printf("   ");
		for(int i = 0; i < 20; i++) {
			System.out.print("|++++");
		}
		System.out.println("|");

		for (int i = grades.length - 1; i >= 0; i--) {
			System.out.printf("%-3s|", getGradeString(i));
			int average = (int)Math.round(((double)grades[i] / total) * 100);
			for (int j = 0; j < average; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}