// TestBook.java

// Test Book Program
public class TestBook {
    // Entry Point
    public static void main(String[] args) {
        // Array To Hold 4 Books
        Book[] books = new Book[4];
        // Create 2 Hard Cover Books
        books[0] = new Hardcover("Stan Lee", 12.5, 250);
        books[1] = new Hardcover("Peter Parker", 6.25, 120);
        // Create 2 Paperbacks
        books[2] = new Paperback("John Doe", 15.00, 14);
        books[3] = new Paperback("Alan Wake", 8.5, 18);

        // Display All Books Using Loop
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
