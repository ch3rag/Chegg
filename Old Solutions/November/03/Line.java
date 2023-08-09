// Line.java

// Line Class
public class Line {
	// Attributes
	private Point2D coordinate1;
	private Point2D coordinate2;

	// Constructor
	public Line(Point2D coordinate1, Point2D coordinate2) {
		this.coordinate1 = coordinate1;
		this.coordinate2 = coordinate2;
	}

	// Returns The Slope Of The Line
	public double Slope() {
		// Using M = (Y2 - Y1) / (X2 - X1)
		double dy = coordinate2.y - coordinate1.y;
		double dx = coordinate2.x - coordinate1.x;
		return dy / dx;
	}

	// Checks If The Two Line Will Intersect On Infinite Extension
	public static boolean CheckIntersect(Line line1, Line line2) {
		return line1.Slope() != line2.Slope();
	}

	// Checks If The Two Lines Are Perpendicular To Each Other
	public static boolean CheckPerpendicular(Line line1, Line line2) {
		return line1.Slope() * line2.Slope() == -1;
	}
}
