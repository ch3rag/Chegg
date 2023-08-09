// Point2D is a class name
// A class is a "blueprint" that is used to create object
public class Point2D {

	double x, y; // x and y are attributes

	public Point2D() {
	} // Constructor - to create an object

	public Point2D(int _x, int _y) { // Constructor - to create an object
		x = _x;
		y = _y;
	}

	// Method - without the keyword static means an object is required
	// to call this method
	// This method sets the coordinate of a point
	public void setCoordinate(int _x, int _y) {
		x = _x;
		y = _y;
	}

	// Method - with the keyword static means an object is NOT required
	// to call this method
	// This method computes the distance of 2 points
	public static double distance(Point2D a, Point2D b) {
		double dist = Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
		return dist;
	}
}