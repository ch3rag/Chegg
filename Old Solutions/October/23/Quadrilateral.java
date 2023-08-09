import java.util.concurrent.ThreadLocalRandom;
import java.awt.Graphics;

// Quadrilateral.java

public class Quadrilateral {
	// Array Of 4 Points Representing Four Corners
	Point[] points;

	// Returns A Random Value Between Min And Max
	private int random(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

	// No-Arg Constructor
	public Quadrilateral() {
		// Initialize Corners
		points = new Point[4];
		points[0] = new Point(random(50, 400), random(150, 300));
		points[1] = new Point(random(600, 1000), random(150, 300));
		points[2] = new Point(random(600, 1000), random(400, 650));
		points[3] = new Point(random(50, 400), random(400, 650));
	}

	public void draw(Graphics g) {
		// Draw Quad
		for (int i = 0; i < points.length; i++) {
			g.drawLine(points[i].getX(), points[i].getY(),
				points[(i + 1) % points.length].getX(), points[(i + 1) % points.length].getY());
		}
	}
}
