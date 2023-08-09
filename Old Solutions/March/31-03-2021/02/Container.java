public abstract class Container {
	protected double capacity;
	protected double filled;
	protected String color;
	protected String matertial;

	// default constructor
	public Container() {
		capacity = 10;
		color = "Orange";
		matertial = "Plastic";
		filled = 0;
	}

	public Container(double capacity, double filled, String color, String material) {
		if (capacity <= 0) {
			capacity = 1;	
		}

		if (filled > capacity) {
			filled = capacity;
		}

		this.capacity = capacity;
		this.filled = filled;
		this.color = color;
		this.matertial = material;
	}

	public void setCapacity(double capacity) {
		if (capacity <= 0) {
			capacity = 1;
		}

		this.capacity = capacity;

		if (this.filled > capacity) {
			this.filled = capacity;
		}
	} 

	public double getCapacity() {
		return this.capacity;
	}

	public void setFilled(double filled) {
		if (filled > this.capacity) {
			filled = this.capacity;
		}

		this.filled = filled;
	}

	public double getFilled() {
		return this.filled;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setMaterial(String material) {
		this.matertial = material;
	}

	public String getMaterial() {
		return this.matertial;
	}

	@Override
	public String toString() {
		return String.format("Type: Generic Container%nCapacity: %f\nFilled: %f%nColor: %s%nMaterial: %s%n", this.capacity, this.filled, this.color, this.matertial);
	}
}