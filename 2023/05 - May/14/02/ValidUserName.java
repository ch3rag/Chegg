// ValidUserName.java

public class ValidUserName {
public String validUserName(String userName) {
	String result = userName;
	String suffix = ".user";
	try {
		validateUser(userName);
	} catch (IllegalArgumentException badUser) {
		while (result.length() < 3) {
			result += "*";
		}
	// Finally Block
	} finally {
		// Add ".user" Onto The End Of Each User Name
		result += suffix;
	}
	return result;
}

	// Throws IllegalArgumentException If Length Of UserName < 3
	public void validateUser(String userName) {
		if (userName.length() < 3) {
			throw new IllegalArgumentException();
		}
	}

	// Main
	public static void main(String[] args) {
		System.out.println(new ValidUserName().validUserName("C"));	
	}
	
}
