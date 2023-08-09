public class Point2d {

	final private double x;
	final private double y;

	public Point2d(double ax, double ay) {
		x = ax;
		y = ay;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance(Point2d pt) {
		double dx = pt.x - x;
		double dy = pt.y - y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public String toString() {
		return String.format("(%.3f,%.3f)", x, y);
	}

	public static void main(String[] args) {

		Point2d p1 = new Point2d(0, 0);
		assert (p1.getX() == 0.0);
		assert (p1.getY() == 0.0);
		assert (p1.toString().equals("(0.000,0.000)"));
		assert (p1.distance(p1) == 0.0);

		Point2d p2 = new Point2d(3, 4);
		assert (p2.getX() == 3.0);
		assert (p2.getY() == 4.0);
		assert (p2.toString().equals("(3.00,4.00)"));
		assert (p1.distance(p2) == 5.0);
	}
}
