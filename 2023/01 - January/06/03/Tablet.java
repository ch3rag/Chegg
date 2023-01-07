public class Tablet extends Computer {
	private int length;
	private int width;
	private String operatingSystem;

	public Tablet(String man, String pro, int raSize, int diSize, double proSpeed,
		int len, int wid, String os) {
			super(man, pro, raSize, diSize, proSpeed);
			length = len;
			width = wid;
			operatingSystem = os;
		}
	
	public double getArea() {
		return length * width;
	}

	@Override
	public String toString() {
		return "My Tablet is made by: " + getManufacturer()
			+ ", and has a screen area of: " + getArea();
	}

	// Overriding getModel()
	@Override
	public String getModel() {
		return super.getModel() + "_" + width + "_" + length;
	}
}
