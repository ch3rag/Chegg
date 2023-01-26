// Artwork.java

// Represents An Artwork
public class Artwork {
	// Declaring Required Variables
	private String title;
	private int yearCreated;
	private Artist artist;

	// Default Constructor
	public Artwork() {
		title = "unknown";
		yearCreated = -1;
		artist = new Artist();
	}

	// Getters For Title
	public String getTitle() {
		return title;
	}

	// Getters For Year Created
	public int getYearCreated() {
		return yearCreated;
	}

	// Parameterized Constructor
	public Artwork(String title, int yearCreated, Artist artist) {
		this.title = title;
		this.yearCreated = yearCreated;
		this.artist = artist;
	}

	// Printing Information
	public void printInfo() {
		// Call Artist Print Method
		artist.printInfo();
		System.out.println("Title: " + title + ", " + yearCreated);
	}
}
