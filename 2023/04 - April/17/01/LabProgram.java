import java.util.Scanner;

public class LabProgram {
	// Main
	public static void main(String[] args) {
		FileReader fr = new FileReader();
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the name of the file:");
			String filename = scanner.nextLine();
			Book[] books = fr.readBooks(filename, "thor");
			for (int i = 0; i < books.length; i++) {
				System.out.println(books[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}