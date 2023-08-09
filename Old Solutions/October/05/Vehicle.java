public class Vehicle {
	int distance;
	Vehicle (int x) {
		this.distance = x;
	}

	public void increSpeed(int time) {
		int timeTravel = time;						// N1
		class Car {
			int value = 0;
			public void speed() {
				value = distance / timeTravel;		// N2
				System.out.println("Velocity with new speed " + value + " kmph");;
			}
		}
		speed();									// N3
	}
}