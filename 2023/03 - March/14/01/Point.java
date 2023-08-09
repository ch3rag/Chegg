public class Point {
	private double x;
	private double y;
	
	// Default Constructor
	public Point() {
		this(0, 0);
	}

	// Parameterized Constructor
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}


	// Getters And Setters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// Setters
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
}
