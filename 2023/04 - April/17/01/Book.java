// Book.java
// Description: Represents A Single Book Entity
// Attributes: A Book Contains Four Attributes
// 1. Title: Private String
// 2. Author: Private String
// 3. Pages: Private Integer
// 4. Price: Private Double
// Methods: Book Class Contains 2 Methods
// 1. Book() Constructor: Instantiate A Book Instance Using The Arguments
// 2. String toString(): Returns The String Representation Of The Book Object

public class Book {
	// Private Attributes
	private String title;
	private String author;
	private int pages;
	private double price;

	// Constructor
	// Instantiate A Book Instance Using The Arguments
	public Book(String title, String author, int pages, double price) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}

	// ToString()
	// Returns The String Representation Of The Book Object
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-8s%s\n", "Title :", title));
		sb.append(String.format("%-8s%s\n", "Author:", author));
		sb.append(String.format("%-8s%d\n", "Pages :", pages));
		sb.append(String.format("%-8s%.2f\n", "Price :", price));
		return sb.toString();
	}
}
