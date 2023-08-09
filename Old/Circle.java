import java.util.Scanner;

public class Circle extends AbstractShape {

    private double radius = 0;

    public Circle() {
        super("Circle");
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void readShapeData() {
        Scanner in = null;
        
        try {
            in = new Scanner(System.in);
            System.out.println("Enter the radius of the Circle");
            radius = in.nextDouble();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        
    }

    @Override
    public double getWidth() {
        return 2 * radius;
    }

    @Override
    public double getHeight() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ": radius is " + radius;
    }    
}
