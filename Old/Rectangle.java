import java.util.Scanner;

public class Rectangle extends AbstractShape {

    private double width = 0;
    private double height = 0;

    public Rectangle() {
        super("Rectangle");
    }

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double computeArea() {
        return height * width;
    }

    @Override
    public double computePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public void readShapeData() {
        Scanner in = null;
        
        try {
            in = new Scanner(System.in);

            System.out.println("Enter the width of the Rectangle");
            width = in.nextDouble();
            System.out.println("Enter the height of the Rectangle");
            height = in.nextDouble();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ": width is " + width + ", height is " + height;
    }    
}
