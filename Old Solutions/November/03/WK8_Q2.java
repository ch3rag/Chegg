public class WK8_Q2 {
	public static void main(String[] args) {

		// ptA, ptB, and ptC are object of class Point2D
		Point2D ptA = new Point2D(1, 3);
		Point2D ptB = new Point2D(3, 1);
		Point2D ptC = new Point2D(0, 0);
		Point2D ptD = new Point2D(2, 2);
		Point2D ptE = new Point2D(2, 6);
		Point2D ptF = new Point2D(6, 2);

		Line l1 = new Line(ptA, ptB);
		Line l2 = new Line(ptC, ptD);
		Line l3 = new Line(ptE, ptF);

		System.out.println("Slope of l1 is " + String.format("%.2f", l1.Slope()));
		System.out.println("Slope of l2 is " + String.format("%.2f", l2.Slope()));
		System.out.println("Slope of l3 is " + String.format("%.2f", l3.Slope()));

		if (Line.CheckIntersect(l1, l2)) {
			System.out.println("Line 1 and Line 2 will intersect.");
		} else {
			System.out.println("Line 1 and Line 2 are parallel.");
		}

		if (Line.CheckIntersect(l1, l3)) {
			System.out.println("Line 1 and Line 3 will intersect.");
		} else {
			System.out.println("Line 1 and Line 3 are parallel.");
		}

		if (Line.CheckPerpendicular(l1, l2)) {
			System.out.println("Line 1 and Line 2 are perpendicular to each other.");
		} else {
			System.out.println("Line 1 and Line 2 are not perpendicular to each other.");
		}
	}
}