public class LineSegment extends Point {
	Point v1;
	Point v2;

	// Returns The Length Between Two Points
	public double length(Point v1, Point v2) {
		return Math.sqrt(Math.pow(v1.getX() - v2.getX(), 2) + Math.pow(v1.getY() - v2.getY(), 2));
	}
}