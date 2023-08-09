public class Calculator {
	private int value;
	
	public Calculator() {
		value = 0;
	}

	public int getValue() {
		return value;
	}

	void setValue(int val) {
		value = val;
	}

	void clear() {
		setValue(0);
	}

	void add(int val) {
		setValue(getValue() + val);
	}

	void subtract(int val) {
		setValue(getValue() - val);
	}

	/**
	 * Update The Accumulator By Mutliplying It By A Number
	 * @param val The Number To Multiply By
	 */
	void multiplyBy(int val) {
		setValue(getValue() * val);
	}

	/**
	 * Update The Accumulator By Dividing It By A Number
	 * @param val The Number To Divide By
	 */
	void divideBy(int val) {
		setValue(getValue() / val);
	}
}