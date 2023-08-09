// Car.java
// Car Class
public class Car {
	// Private Attributes
	// Model Year
	private int modelYear;
	// New Purchase Price
	private int purchasePrice;
	// Current Value After Depreciation
	private int currentValue;

	// Setter For Model Year
	public void setModelYear(int userYear) {
		modelYear = userYear;
	}

	// Getter For Model Year
	public int getModelYear() {
		return modelYear;
	}

	// Setter For Purchase Price
	public void setPurchasePrice(int userPurchasePrice) {
		purchasePrice = userPurchasePrice;
	}

	// Getter For Purchase Price
	public int getPurchasePrice() {
		return purchasePrice;
	}

	// Calculates Current Value Of The Car
	public void calcCurrentValue(int currentYear) {
		double depreciationRate = 0.15;
		int carAge = currentYear - modelYear;

		// Car Depreciation Formula
		currentValue = (int)Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
	}

	// Print Car's  Information
	public void printInfo() {
		System.out.println("Car's information:");
		System.out.println("  Model year: " + modelYear);
		System.out.println("  Purchase price: $" + purchasePrice);
		System.out.println("  Current value: $" + currentValue);
	}
}
