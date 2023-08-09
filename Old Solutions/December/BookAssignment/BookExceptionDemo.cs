// Program.cs

class BookExceptionDemo {
	static void Main() {
		// Create An Array Of 5 Books
		Book[] books = new Book[5];

		// Ask User To Input Information Of 5 Books
		for (int i = 0; i < books.Length; i++) {
			Console.WriteLine("Book - {0}", i + 1);
			// Input Title
			Console.Write("Title: ");
			String title = Console.ReadLine();
			// Input Author
			Console.Write("Author: ");
			String author = Console.ReadLine();

			// Input Price
			Console.Write("Price: ");
			double price = Double.Parse(Console.ReadLine());

			// Input Number Of Pages
			Console.Write("Number Of Pages: ");
			int numberOfPages = Int32.Parse(Console.ReadLine());

			// Create A New Book Instance
			try {
				books[i] = new Book(title, author, price, numberOfPages);
			} catch (BookException exp) {
				// Invalid Price Page Ratio
				Console.WriteLine("Error: {0}", exp.Message);
				// Set Price Of The Book To Maximum 10 Cents Per Page
				books[i] = new Book(title, author, 0.10 * numberOfPages, numberOfPages);
			}
			Console.WriteLine();
		}

		// Display All Books
		foreach (Book book in books) {
			Console.WriteLine(book);
		}
	}
}