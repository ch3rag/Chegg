import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calc;

	@Before
	public void setUp() {
		calc = new Calculator();
	}

	/**
	 * Check That A New Calculator Starts Off With A Zero Value.
	 */
	@Test
	public void initial() {
		// fail("Define Your Test");
		assertEquals(0, calc.getValue());
	}

	/**
	 * Check setValue/getValue.
	 */
	@Test
	public void setValue() {
		// fail("Define Your Test");
		calc.setValue(5);
		assertEquals(5, calc.getValue());
	}

	/**
	 * Check That Clear Returns The Accumulator To Zero.
	 */
	@Test
	public void clear() {
		// fail("Define Your Test");
		calc.setValue(5);
		assertEquals(5, calc.getValue());
		// Clear
		calc.clear();
		assertEquals(0, calc.getValue());
	}

	/**
	 * Check That Add Works On Zero And Non-Zero Accumulators
	 */
	 @Test
	 public void addition() {
		// fail("Define Your Test");
		calc.add(5);
		assertEquals(5, calc.getValue());
		calc.add(7);
		assertEquals(12, calc.getValue());
	}

	/**
	 * Check That Subtract Works On Zero And Non-Zero Accumulators
	 */
	@Test
	public void subtraction() {
		// fail("Define Your Test");
		calc.subtract(5);
		assertEquals(-5, calc.getValue());
		calc.subtract(-7);
		assertEquals(2, calc.getValue());
	}

	/**
	 * Check That MultiplyBy Works On Zero And Non-Zero Accumulators
	 */
	@Test
	public void multiplication() {
		// fail("Define Your Test");
		calc.multiplyBy(5);
		assertEquals(0, calc.getValue());
		calc.setValue(6);
		calc.multiplyBy(5);
		assertEquals(30, calc.getValue());
	}

	/**
	 * Check That DivideBy Works On Zero And Non-Zero Accumulators
	 */
	@Test
	public void division() {
		// fail("Define Your Test");
		calc.divideBy(5);
		assertEquals(0, calc.getValue());
		calc.setValue(12);
		calc.divideBy(2);
		assertEquals(6, calc.getValue());
	}
}
