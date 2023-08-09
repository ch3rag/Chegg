import java.util.Scanner;

public class ComputeAreaAndPerim {

    public static void main(String[] args) {
        AbstractShape myShape;    
        double perimeter;
        double area;

        myShape = getShape();

        myShape.readShapeData();

        perimeter = myShape.computePerimeter();

        area = myShape.computeArea();

        displayResult(area, perimeter);

        System.exit(0);
    }

    public static AbstractShape getShape() {
        @SuppressWarnings("resource")
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Right Triangle");
        String figType = in.next();

        switch(figType) {
            case "C": case "c":
                return new Circle();
            case "R": case "r":
                return new Rectangle();
            // Uncommented Below Two Lines Only
            case "T": case "t":
                return new RtTriangle();
            default:
                return null;
        }
    }

    private static void displayResult(double area, double perim) {
        System.out.printf("%nThe area is %.2f%nThe perimeter is %.2f%n",
            area, perim);
    }
}
