package menu.ingredients;

public interface Bases {
	/**
	 * Enum containing the sizes available for the pizza bases type.
	 */
	static enum BaseSize {
		/** SMALL diameter of 6 inches. */
		SMALL,
		/** MEDIUM diameter of 9 inches. */
		MEDIUM,
		/** LARGE diameter of 12 inches. */
		LARGE
	}

	/**
	 * Set (Bases) utilizes an enum with all the types of Bases available for the Bases type.
	 * <br>
	 * BaseSize being (SMALL, MEDIUM, LARGE)
	 * @param size enum type depicting the sizes of each Pizza base type.
	 */
	void set(BaseSize size);
}
