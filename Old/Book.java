// Book.java

public class Book {
    // Fields For Author And Price
    private String author;
    private double price;

    // Constructor
    public Book(String author, double price) {
        this.author = author;
        this.price = price;
    }

    // Get / Set Methods
    // Author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // To String
    @Override
    public String toString() {
        return String.format("Author: %s, Price: $%.2f", author, price);
    }
}