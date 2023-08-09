import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class StackJUnitTest {
	private ADTStack<Integer> stack1;
	
	@BeforeEach
	public void setUp() throws Exception {
		stack1 = new AStack<Integer>();
	}

	@Test
	public void test() {
		// Test Initially the Length of Stack Should Be 0
		assertEquals(0, stack1.length());

		// Push 3 Items
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);

		// Now, the Length of Stack Should Be 3
		assertEquals(3, stack1.length());

		// Should Pop 30
		assertEquals(30, (int)stack1.pop());

		// Top Item Should Be 20 Now
		assertEquals(20, (int)stack1.topValue());
		
		// Clear The Stack
		stack1.clear();

		// Now, the Length of Stack Should Be 0
		assertEquals(0, stack1.length());
	}
}
