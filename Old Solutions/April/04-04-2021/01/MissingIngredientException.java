// MissingIngredientException.java

public class MissingIngredientException extends RuntimeException {
	public MissingIngredientException(String ingredient) {
		super("We are currently out of " + ingredient + ".");
	}
}