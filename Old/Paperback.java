public class Paperback extends Book {
    // Pages Field
    private int fontSize;

    // Constructor
    public Paperback(String author, double price, int fontSize) {
        super(author, price);
        this.fontSize = fontSize;
    }

    // Get / Set For Font Size
    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    // To String
    @Override
    public String toString() {
        return String.format("Paperback: [%s, Font Size: %d]", super.toString(), fontSize);
    }
}
