package UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class StudentTest {
	// Two Students For Testing
	Student student1;
	Student student2;

	// Setup
	// Initialize The Instance Variables
	@BeforeEach
	void setup() {
		student1 = new Student();
		student2 = new Student();
	}

	// Test Student X < Student Y
	@Test
	public void testLessThan() {
		// Case 1: S1.GRADE < S2.GRADE
		student1.grade = 'B';
		student1.name = "Katie";
		
		student2.grade = 'A';
		student2.name = "John";

		assertEquals(-1, student1.compareTo(student2));
		
		// Case 1: S1.GRADE == S2.GRADE, S1.NAME[0] > S2.NAME[0]
		student1.grade = 'A';
		assertEquals(-1, student1.compareTo(student2));
	}

		// Test Student X > Student Y
		@Test
		public void testGreaterThan() {
			// Case 1: S1.GRADE > S2.GRADE
			student1.grade = 'B';
			student1.name = "John";
			
			student2.grade = 'D';
			student2.name = "Katie";
	
			assertEquals(1, student1.compareTo(student2));
			
			// Case 1: S1.GRADE == S2.GRADE, S1.NAME[0] < S2.NAME[0]
			student1.grade = 'D';
			assertEquals(1, student1.compareTo(student2));
		}

		@Test
		public void testEquals() {
			// Case 1: S1.GRADE == S2.GRADE And S1.NAME[0] == S2.Name[0]
			student1.grade = 'B';
			student1.name = "John";
			
			student2.grade = 'B';
			student2.name = "Jeremy";

			assertEquals(0, student1.compareTo(student2));
			assertEquals(0, student2.compareTo(student1));
		}

}
