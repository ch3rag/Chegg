public class SnowMan {
	// Coordinates of Upper Left Corner of the SnowMan
	private int x;
	private int y;

	// Constructor
	public SnowMan(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Constants
	public static final int HAT_SIZE = 20;
	public static final int HAT_BRIM_SIZE = 10;
	public static final int SMALL_DIAMETER = 20;
	public static final int DIAMETER_INCREMENT = 20;
	public static final int RADIUS_INCREMENT = 10;

	// Draws the SnowMan
	public void draw() {
		
		// Hat
		Rectangle hat = new Rectangle(x, y, HAT_SIZE, HAT_SIZE);
		hat.draw();
		hat.fill();
		
		// Brim
		Line brim = new Line(x - HAT_BRIM_SIZE, y + HAT_SIZE, x + HAT_SIZE + HAT_BRIM_SIZE, y + HAT_SIZE);
		brim.draw();

		// Small Circle
		Ellipse smallCircle = new Ellipse(x, y + HAT_SIZE, SMALL_DIAMETER, SMALL_DIAMETER);
		smallCircle.draw();

		// Middle Circle
		Ellipse middleCircle = new Ellipse(x - RADIUS_INCREMENT, y + HAT_SIZE + SMALL_DIAMETER, SMALL_DIAMETER + DIAMETER_INCREMENT, SMALL_DIAMETER + DIAMETER_INCREMENT);
		middleCircle.draw();

		// Large Circle
		Ellipse largeCircle = new Ellipse(x - RADIUS_INCREMENT * 2, y + HAT_SIZE + SMALL_DIAMETER * 2 + DIAMETER_INCREMENT, SMALL_DIAMETER + DIAMETER_INCREMENT * 2, SMALL_DIAMETER + DIAMETER_INCREMENT * 2);
		largeCircle.draw();
	}
}
