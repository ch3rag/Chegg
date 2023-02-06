package recursion.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import recursion.Recursion;

public class HarmonicTest {

	// One Billionth
	private static final double DELTA = 0.000_000_001;

	@Test
	public void shouldThrowExceptionForZero() {
		// Harmonic(N) Should Throw IllegalArgumentException When N == 0
		assertThrows(IllegalArgumentException.class, () -> {
			Recursion.harmonic(0);
		});
	}

	@Test
	public void shouldWorkForBaseCondition() {
		// Harmonic(N) Should Return 1 For N == 1 (Base Condition)
		assertEquals(1.0, Recursion.harmonic(1), DELTA);
		// Harmonic(N) Should Return -1 For N == -1 (Base Condition)
		assertEquals(-1.0, Recursion.harmonic(-1), DELTA);
	}

	@Test
	public void shouldWorkForPositiveValues() {
		// Harmonic(N) Should Work N > 1
		assertEquals(1.833_333_333, Recursion.harmonic(3), DELTA);
		assertEquals(2.45, Recursion.harmonic(6), DELTA);
	}

	@Test
	public void shouldWorkForNegativeValues() {
		// Harmonic(N) Should Work N < 1
		assertEquals(-1.833_333_333, Recursion.harmonic(-3), DELTA);
		assertEquals(-2.45, Recursion.harmonic(-6), DELTA);
	}

	@Test
	public void shouldReturnAdditiveInverseForNegativeValues() {
		// Harmonic(-N) Should Be Equal To -Harmonic(N)
		assertEquals(Recursion.harmonic(-7), -Recursion.harmonic(7), DELTA);
		assertEquals(Recursion.harmonic(-100), -Recursion.harmonic(100), DELTA);
	}
}
