public class SushiRestaurant {
	private String[] rolls;
	private String[] supplies;

	public SushiRestaurant(String[] supplies) {
		this.supplies = supplies;
		rolls = new String[] { "California", "Spicy Tuna", "JB Tempura" };
	}

	public void makeRoll(String[] ingredients) throws MissingIngredientException {
		for (String ingredient : ingredients) {
			boolean found = false;
			for (String supply : supplies) {
				if (supply.equals(ingredient)) {
					found = true;
					break;
				}
			}
			if (!found) {
				throw new MissingIngredientException(ingredient);
			}
		}
	}

	public void makeCaliforniaRoll() {
		String[] ingredients = new String[] { "avocado", "imitation crab", "cucumber", "rice", "seaweed" };
		this.makeRoll(ingredients);
	}

	public void makeSpicyTunaRoll() {
		String[] ingredients = new String[] { "tuna", "sriracha", "rice", "seaweed" };
		this.makeRoll(ingredients);
	}

	public void makeJBTempuraRoll() {
		String[] ingredients = new String[] { "salmon", "cream cheese", "scallions", "rice", "seaweed" };
		this.makeRoll(ingredients);
	}

	public void orderRoll(String order) throws NotARollException {
		switch (order) {
			case "California":
				makeCaliforniaRoll();
				System.out.println("California roll is coming right up!");
				break;
			case "Spicy Tuna":
				makeSpicyTunaRoll();
				System.out.println("Spicy Tuna roll is coming right up!");
				break;
			case "JB Tempura":
				makeJBTempuraRoll();
				System.out.println("JB Tempura roll is coming right up!");
				break;
			default:
				throw new NotARollException();
		}
	}

	public static void main(String[] args) {
		
		String[] supplies = new String[] {
			"cucumber", "avocado", "salmon", "imitation crab",
			"rice", "seaweed"
		};

		SushiRestaurant sushiRestaurant = new SushiRestaurant(supplies);

		try {
			sushiRestaurant.orderRoll("California");
		} catch (NotARollException ex) {
			System.out.println(ex.getMessage());
		} catch (MissingIngredientException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			sushiRestaurant.orderRoll("a");
		} catch (NotARollException ex) {
			System.out.println(ex.getMessage());
		} catch (MissingIngredientException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			sushiRestaurant.orderRoll("Spicy Tuna");
		} catch (NotARollException ex) {
			System.out.println(ex.getMessage());
		} catch (MissingIngredientException ex) {
			System.out.println(ex.getMessage());
		}

	}
}
