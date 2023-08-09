public class Triangle {
	public static void main(String[] args) {
		// Initialize 3 Points
		Point v1 = new Point(0, 0);
		Point v2 = new Point(3, 0);
		Point v3 = new Point(0, 4);

		// Compute The Length Of Line Segment A, B, C
		LineSegment lineSegment = new LineSegment();

		double a = lineSegment.length(v1, v2);
		double b = lineSegment.length(v2, v3);
		double c = lineSegment.length(v3, v1);

		// Compute Half Parameter
		double s = (a + b + c) / 2;

		// Compute Area
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		System.out.println(area);
		//Area of the triangle is 6 with the defined points (0,0), (3,0) and (0,4).
	}
}