// Tree Class
public class Tree {
    // Height Of The Tree
    private int height;

    // Char To Draw Tree
    private char myChar;

    // Constructor
    public Tree(int height) {
        // If Height Is Less Than 0
        // Set Heght To 0
        if (height < 0) {
            height = 0;
        }
        this.height = height;
        this.myChar = 'V';
    }

    // Setter For MyChar
    public void setMyChar(char myChar) {
        this.myChar = myChar;
    }

    // Grow The Tree
    // Takes In The Amount Of Rain In Millimeters
    public void grow(double mmRain) {
        if (mmRain > 12) {
            height++;
            System.out.println("We are growing!");
        }
    }

    // Draw The Tree
    public void drawMe() {
        // For Each Row, Say, i Where 1 <= i <= Height
        for (int i = 1; i <= height; i++) {
            // Draw (Height - i) / 2 Spaces
            for (int j = 1; j <= (height - i) / 2; j++) {
                System.out.print(' ');
            }

            // Draw i myChar
            for (int j = 1; j <= i; j++) {
                System.out.print(myChar);
            }
            System.out.println();
        }
    }
}
