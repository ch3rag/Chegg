// Bottle.java

public class Bottle extends Container {
	protected String beverageType;

	public Bottle() {
		super();
		this.beverageType = "Water";
	}

	public Bottle(double capacity, double filled, String color, String material, String beverageType) {
		super(capacity, filled, color, material);
		this.beverageType = beverageType;
	}

	public void setBeverageType(String beverageType) {
		this.beverageType = beverageType;
	}

	public String getBeverageType() {
		return this.beverageType;
	}

	@Override
	public String toString() {
		return String.format("Type: Bottle%nCapacity: %f\nFilled: %f%nColor: %s%nMaterial: %s%nBeverage Type: %s%n", this.capacity, this.filled, this.color, this.matertial, this.beverageType);
	}
}