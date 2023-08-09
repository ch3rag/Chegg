import java.util.Scanner;
// RtTriangle.java

public class RtTriangle extends AbstractShape {

    // Base Of The Right Triangle
    private double base = 0;
    // Height Of The Right Triangle
    private double height = 0;

    // Constructors
    // 1. Default Constructor
    // Initializes Shape Name Using Super Constructor
    public RtTriangle() {
        super("RtTriangle");
    }

    // 2. Parameterized Constructor
    // Initializes Shape Name, Base And Height Of The Right Triangle
    public RtTriangle(double base, double height) {
        super("RtTriangle");
        this.base = base;
        this.height = height;
    }

    // Getter For Base
    public double getBase() {
        return base;
    }

    // Setter For Base
    public void setBase(double base) {
        this.base = base;
    }

    //   Setter For Height
    public void setHeight(double height) {
        this.height = height;
    }


    // Computes And Returns The Area Of The Right Triangle
    @Override
    public double computeArea() {
        return (base * height) / 2.0;
    }


    // Computes And Returns The Area Of The Right Triangle
    @Override
    public double computePerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }


    // Reads Shape Data From The User
    @Override
    public void readShapeData() {

        // Scanner For User Input
        Scanner in = null;
        
        try {
            // Initialize The Scanner
            in = new Scanner(System.in);
            // Input Base
            System.out.println("Enter the base of the Right Triangle");
            base = in.nextDouble();
            // Input Height
            System.out.println("Enter the height of the Right Triangle");
            height = in.nextDouble();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        
    }

    // Getter For Width
    // Width Is Same As Base
    @Override
    public double getWidth() {
        return base;
    }

    // Getter For Height 
    @Override
    public double getHeight() {
        return height;
    }

    // Returns String Representation Of The Right Triangle Object
    @Override
    public String toString() {
        return super.toString() + ": base is " + base + ", height is " + height;
    }    
}
