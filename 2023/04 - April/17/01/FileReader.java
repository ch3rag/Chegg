import java.io.IOException;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

// FileReader.java
// Description: A Helper Class To Read Book Objects From A File
// Attributes: FileReader Does Not Contain Any Attributes
// Methods: FileReader Class Contains 2 Methods
// Book[] readBooks(String fileName):
//   Returns A Book Array Containing All The Books Objects In The Given File
// Book[] readBooks(String fileName, String searchTerm):
//  Returns A Book Array Containing Only The Books Objects Whose Title Contains The Search Term In The Given File
public class FileReader {
	//   Returns A Book Array Containing All The Books Objects In The Given File
	public Book[] readBooks(String fileName) throws IOException {
		// Use Overloaded readBooks()
		return readBooks(fileName, null);
	}

	// Returns A Book Array Containing Only The Books Objects Whose Title Contains The Search Term In The Given File
	public Book[] readBooks(String fileName, String searchTerm) throws IOException {
		// Create A File Input Stream
		FileInputStream inFile = new FileInputStream(fileName);
		// Create A Scanner For File Input Stream
		Scanner fileScanner = new Scanner(inFile);
		// Read The Number Of Records In The File
		int numRecords = fileScanner.nextInt();
		fileScanner.nextLine();
		// Create A New Array With Size = Number Of Records In The File
		Book[] books =  new Book[numRecords];
		// Number Of Books Actually Stored In The File
		int numStored = 0;
		// Iterate Number Of Record In The File Times
		for (int i = 0; i < numRecords; i++) {
			// Read All The Four Attributes
			// Title
			String title = fileScanner.nextLine();
			// Author
			String author = fileScanner.nextLine();
			// Pages
			int pages = fileScanner.nextInt();
			// Price
			double price = fileScanner.nextDouble();
			fileScanner.nextLine();
			// If Search Term Is Null Or Title Contains Search Term
			if (searchTerm == null || title.contains(searchTerm)) {
				// Instantiate A Book And Add It To Array
				Book book = new Book(title, author, pages, price);
				books[numStored++] = book;
			}
		}
		// Close Scanner
		fileScanner.close();
		// Resize Array Of Perfect Size
		if (numRecords != numStored) {
			return Arrays.copyOf(books, numStored);
		} else {
			return books;
		 }
	}
}
