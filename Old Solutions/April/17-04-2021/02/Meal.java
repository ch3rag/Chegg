public class Meal {
	private MealItem appetizer;
	private MealItem entree;
	private MealItem dessert;

	public Meal(MealItem appetizer, MealItem entree, MealItem dessert) {
		this.dessert = dessert;
		this.appetizer = appetizer;
		this.entree = entree;
	}

	public MealItem getAppetizer() {
		return this.appetizer;
	}

	public void setAppetizer(MealItem appetizer) {
		this.appetizer = appetizer;
	}

	public MealItem getEntree() {
		return this.entree;
	}

	public void setEntree(MealItem entree) {
		this.entree = entree;
	}

	public MealItem getDessert() {
		return this.dessert;
	}

	public void setDessert(MealItem dessert) {
		this.dessert = dessert;
	}

	@Override
	public String toString() {
		double total = appetizer.getItemCost() + entree.getItemCost() + dessert.getItemCost();
		double tip = total * 0.20;
		return String.format("%-50s$%-5.2f%n%-50s$%-5.2f%n%-50s$%-5.2f%n%-50s$%-5.2f%n%-50s$%-5.2f%n", 
			appetizer.getItemName(), appetizer.getItemCost(),
			entree.getItemName(), entree.getItemCost(),
			dessert.getItemName(), dessert.getItemCost(),
			"20% Tip", tip,
			"Total With Tip", total + tip);
	}

	public boolean contains(String item) {
		String itemLower = item.toLowerCase();
		return (appetizer.getItemName().toLowerCase().contains(itemLower)
				|| entree.getItemName().toLowerCase().contains(itemLower)
				|| dessert.getItemName().toLowerCase().contains(itemLower));
	}
}