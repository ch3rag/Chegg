// Book.cs

using System.Globalization;


class Book {
	// Private Fields
	private string title;
	private string author;
	private double price;
	private int numberOfPages;

	
	// Properties
	// Title
	public string Title {
		get { return title; }
		set { title = value; }
	}

	// Author
	public string Author {
		get { return author; }
		set { author = value; }
	}

	// Price
	public double Price {
		get { return price; }
		set { price = value; }
	}

	// Number Of Pages
	public int NumberOfPages {
		get { return numberOfPages; }
		set { numberOfPages = value; }
	}

	// Constructor
	public Book(string title, string author, double price, int numberOfPages) {
		// Assign Instance Variables
		Title = title;
		Author = author;
		Price = price;
		NumberOfPages = numberOfPages;
		
		// Compute Price Per Page
		double pricePerPage = price / numberOfPages;

		// If Price Per Page Exceeds 10 Cents Per Page
		// Throw BookException
		if (pricePerPage > 0.10) {
			String errorMsg = String.Format("For {0}, ratio is invalid.\n", Title);
			errorMsg += String.Format("Price is {0} for  {1} page(s).",
				Price.ToString("C", CultureInfo.GetCultureInfo("en-US")), NumberOfPages);
			throw new BookException(errorMsg);
		}
	}

	// Returns String Representation Of The Book
	public override string ToString() {
		return String.Format("Title: {0}, Author: {1}, Price: {2}, Number Of Pages: {3}",
			Title, Author, Price.ToString("C", CultureInfo.GetCultureInfo("en-US")), NumberOfPages);
	}
}