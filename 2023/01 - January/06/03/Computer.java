public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;

	public Computer(String man, String pro, int raSize, int diSize, double proSpeed) {
		manufacturer = man;
		processor = pro;
		ramSize = raSize;
		diskSize = diSize;
		processorSpeed = proSpeed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getRamSize() {
		return ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public String getModel() {
		return this.getManufacturer() + "_" + this.getProcessorSpeed();
	}
}

