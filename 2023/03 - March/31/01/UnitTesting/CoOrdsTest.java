package UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class CoOrdsTest {
	// Two CoOrds For Testing
	CoOrds coOrds1;
	CoOrds coOrds2;

	// Setup
	// Initialize The Instance Variables
	@BeforeEach
	void setup() {
		coOrds1 = new CoOrds();
		coOrds2 = new CoOrds();
	}

	// Test CoOrd X < CoOrd Y
	@Test
	public void testLessThan() {
		// Case 1: When C1.X < C2.X
		coOrds1.x = 3;
		coOrds1.y = 2;

		coOrds2.x = 4;
		coOrds2.y = 6;

		assertEquals(-1, coOrds1.compareTo(coOrds2));
		
		// Case 2: When C1.X == C2.X And C1.Y < C2.Y
		coOrds1.x = 4;
		assertEquals(-1, coOrds1.compareTo(coOrds2));
	}

	// Test CoOrd X > CoOrd Y
	@Test
	public void testGreaterThan() {
		// Case 1: When C1.X > C2.X
		coOrds1.x = 4;
		coOrds1.y = 2;

		coOrds2.x = 3;
		coOrds2.y = 1;

		assertEquals(1, coOrds1.compareTo(coOrds2));
		
		// Case 2: When C1.X == C2.X And C1.Y > C2.Y
		coOrds2.x = 3;
		assertEquals(1, coOrds1.compareTo(coOrds2));
	}

	// Test CoOrd X == CoOrd Y
	@Test
	public void testEquals() {
		// Case 1
		coOrds1.x = 4;
		coOrds1.y = 2;

		coOrds2.x = 4;
		coOrds2.y = 2;

		assertEquals(0, coOrds1.compareTo(coOrds2));
		assertEquals(0, coOrds2.compareTo(coOrds1));
	}
}
