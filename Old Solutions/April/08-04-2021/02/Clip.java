public class Clip {
	private final int capacity;
	private int bullets;

	public Clip(int capacity) {

		if (capacity < 1) {
			capacity = 30;
		}

		this.capacity = capacity;
	}

	public boolean fire() {
		if (bullets <= 0) {
			return false;
		} else {
			bullets--;
			return true;
		}
	}

	public int getBullets() {
		return bullets;
	}

	public void setBullets(int bullets) {
		if (bullets > capacity ) {
			bullets = capacity;
		} else if (bullets < 0) {
			bullets = 0;
		}
		this.bullets = bullets;
	}

	public int getCapacity() {
		return capacity;
	}

	// completely fills the clip
	public void fill() {
		this.bullets = this.capacity;
	}
}
