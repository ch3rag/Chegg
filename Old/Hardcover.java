public class Hardcover extends Book {
    // Pages Field
    private int pages;

    // Constructor
    public Hardcover(String author, double price, int pages) {
        super(author, price);
        this.pages = pages;
    }

    // Get / Set For Pages
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // To String
    @Override
    public String toString() {
        return String.format("HardCover: [%s, Pages: %d]", super.toString(), pages);
    }
}
