package UnitTesting;

public class CoOrds implements Comparable<CoOrds> {
	int x, y;
	public CoOrds() {

	}

	public int compareTo(CoOrds other) {
		if (x > other.x) {
			return 1;
		} else if (x < other.x) {
			return -1;
		} else {
			if (y > other.y) {
				return 1;
			} else if (y < other.y) {
				return -1;
			}
		}
		return 0;
	}
}
