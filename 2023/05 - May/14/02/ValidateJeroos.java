public class ValidateJeroos {
	public int callValidateJeroos(Jeroo[] jeroos) {
		try {
			validateJeroos(jeroos);
		// If Array Is Null, Catch IllegalArgumentException
		// And Return -1
		} catch (IllegalArgumentException badArray) {
			return -1;
		// If Any Jeroo Is Facing North, Catch IllegalStateException
		// And Return -2
		} catch(IllegalStateException badDirection) {
			return -2;
		}
		return 0;
	}

	// Validates Jeroos
	public void validateJeroos(Jeroo[] jeroos) {
		// If Array Is Null, Throw IllegalArgumentException
		if (jeroos == null) {
			throw new IllegalArgumentException();
		} else {
			// Else, Check Each Jeroo In The Array
			for (Jeroo jeroo : jeroos) {
				// If It's Direction Is North, Throw IllegalStateException
				if (jeroo.getDirection() == Jeroo.Direction.NORTH) {
					throw new IllegalStateException();
				}
			}
		}
	}

	// Test Main
	public static void main(String[] args) {
		// Test Code
		ValidateJeroos validator = new ValidateJeroos();

		// Check For Null
		Jeroo[] jeroos = null;
		System.out.println("For Null Array: " + validator.callValidateJeroos(jeroos));

		jeroos = new Jeroo[2];
		jeroos[0] = new Jeroo(Jeroo.Direction.NORTH);
		jeroos[1] = new Jeroo(Jeroo.Direction.SOUTH);
		// Check For North Direction
		System.out.println("For North Direction: " + validator.callValidateJeroos(jeroos));

		// Check For Normal Execution
		jeroos[0] = new Jeroo(Jeroo.Direction.EAST);
		System.out.println("For Normal Execution: " + validator.callValidateJeroos(jeroos));

	}
}

// MakeShift Jeroo Class
class Jeroo {
	// Enumeration To Represent Direction
	enum Direction {
		NORTH, SOUTH, EAST, WEST;
	}

	// Represents Jeroo's Direction
	private Direction direction;

	// Constructor To Initialize Jeroo's Direction
	public Jeroo(Direction direction) {
		this.direction = direction;
	}

	// Getter For Direction
	public Direction getDirection() {
		return direction;
	}
}
