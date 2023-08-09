public class ExceptionHandling {
	// For Any Checked Exception, The Function Must Declare That It Throws It
	public static int strLength(String str) throws Exception {
		if (str == null) {
			throw new Exception();
		} else {
			return str.length();
		}
	}

	public static void main(String[] args) {
		// In Main, We Have To Wrap The Statements That May Throw A Checked Exception
		// In A Try-Catch Block
		try {
			System.out.println(strLength(null));
		} catch (Exception e)  {
			// Print Error Message If Exception Is Caught
			System.err.println("Error: String must not be null.");
		}
		
		System.out.println("end of main");
	}
}