public class Box extends Container {
	protected String filledWith;
	protected boolean isAirTight;

	public Box() {
		super();
		this.filledWith = "Snacks";
		this.isAirTight = false;
	}

	public Box(double capacity, double filled, String color, String material, String filledWith, boolean isAirTight) {
		super(capacity, filled, color, material);
		this.filledWith = filledWith;
		this.isAirTight = isAirTight;
	}

	public void setFilledWith(String filledWith) {
		this.filledWith =  filledWith;
	}

	public String getFilledWith() {
		return this.filledWith;
	}

	public void setIsAirTight(boolean isAirTight) {
		this.isAirTight =  isAirTight;
	}

	public boolean getIsAirTight() {
		return this.isAirTight;
	}

	@Override
	public String toString() {
		return String.format("Type: Box%nCapacity: %f\nFilled: %f%nColor: %s%nMaterial: %s%nFilled With: %s%nIs Air Tight?: %s%n", this.capacity, this.filled, this.color, this.matertial, this.filledWith, this.isAirTight);
	}
}