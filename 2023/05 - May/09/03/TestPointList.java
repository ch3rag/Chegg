import java.io.FileNotFoundException;

public class TestPointList {

	private static String showPoint(Point2d pt) {
		return String.format("(%.3f,%.3f)", pt.getX(), pt.getY());
	}

	public static void main(String[] args) throws FileNotFoundException {

		PointList pl = new PointList(args[0]);

		Point2d pt = pl.findClosestToOrigin();
		System.out.printf("Closest to origin: %s\n", showPoint(pt));

		pt = pl.findClosest(new Point2d(1, 1));
		System.out.printf("Closest to (1,1): %s\n", showPoint(pt));

		pt = pl.findClosest(new Point2d(-0.5, -0.5));
		System.out.printf("Closest to (-0.5,-0.5): %s\n", showPoint(pt));
	}
}