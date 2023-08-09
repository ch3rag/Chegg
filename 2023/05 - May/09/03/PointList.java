import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PointList {

	// Declare an array of Point2d objects here.
	private Point2d[] points;

	public PointList(String filename) throws FileNotFoundException {
		// Your constructor code goes here.
		// Read the data from the file
		// and store it in an array of Point2d objects.

		// Create A Scanner To Read File
		Scanner fileInput = new Scanner(new File(filename));
		
		// Read Number Of Points
		int numPoints = fileInput.nextInt();
		
		// Initialize Points Array
		points = new Point2d[numPoints];

		// Read File
		int i = 0;
		while (i < points.length && fileInput.hasNextDouble()) {
			points[i++] = new Point2d(fileInput.nextDouble(), fileInput.nextDouble());
		}
	}

	// Find Closest Point To Another Point Pt
	public Point2d findClosest(Point2d pt) {
		// Your code goes here.
		// Distance To Closest Point
		double distance = Double.MAX_VALUE;
		// Closest Point
		Point2d closestPoint = null;

		// Iterate Over Each Point
		for (Point2d point : points) {
			// If Current Distance Is Less Than New Distance
			if (point.distance(pt) < distance) {
				// Update Distance To New Distance
				distance = point.distance(pt);
				// Update Closest Point To New Point
				closestPoint = point;
			}
		}

		// Return Closest Point
		return closestPoint;
	}

	public Point2d findClosestToOrigin() {
		// Your code goes here.
		// Re-Use findClosest To Find Closest Point To Origin
		return findClosest(new Point2d(0.0, 0.0));
	}
}