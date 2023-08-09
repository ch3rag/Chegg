public class Bag extends Container {
	protected int pockets;
	protected String bagType;

	public Bag() {
		super();
		this.pockets = 1;
		this.bagType = "School Bag";
	}

	public Bag(double capacity, double filled, String color, String material, int pockets, String bagType) {
		super(capacity, filled, color, material);
		this.pockets = pockets;
		this.bagType = bagType;
	}

	public void setBagType(String bagType) {
		this.bagType =  bagType;
	}

	public String getBagType() {
		return this.bagType;
	}

	public void setPockets(int pockets) {
		if (pockets <= 0) {
			pockets = 1;
		}
		this.pockets = pockets;
	}

	public int getPockets() {
		return this.pockets;
	}

	@Override
	public String toString() {
		return String.format("Type: Bag%nCapacity: %f\nFilled: %f%nColor: %s%nMaterial: %s%nBag Type: %s%nPockets: %d%n", this.capacity, this.filled, this.color, this.matertial, this.bagType, this.pockets);
	}
}