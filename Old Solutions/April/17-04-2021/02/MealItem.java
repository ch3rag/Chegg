public class MealItem {
	String itemName;
	double itemCost;

	public MealItem(String itemName, double itemCost) {
		this.itemName = itemName;
		this.itemCost = itemCost;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemCost() {
		return this.itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	
}
