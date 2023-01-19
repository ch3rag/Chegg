// Barcode.java

public class Barcode {
	// Returns Postal Code Plus Checksum
	public static int detCheckSum(int code) {
		// Sum Of Digits
		int sum = 0;
		// Sum Each Digit
		for (int i = code; i > 0; i /= 10) {
			sum += i % 10;
		}
		// Compute Checksum
		int checksum = 10 - (sum % 10);

		// Append Checksum To The End
		return (code * 10) + checksum;
	}

	// Checks If Code Plus Checksum Is Valid
	public static boolean isCodeValid(int code) {
		// Find CheckSum For All Digits Except Last
		int checksum = detCheckSum(code / 10) % 10;
		// Check If Last Digit Equals Check Sum
		return checksum == code % 10;
	}

	// Returns Corresponding Barcode For Digit
	public static String genBarDigit(int nVal) {
		switch(nVal) {
			case 1:
				return ":::||";
			case 2:
				return "::|:|";
			case 3:
				return "::||:";
			case 4:
				return ":|::|";
			case 5:
				return ":|:|:";
			case 6:
				return ":||::";
			case 7:
				return "|:::|";
			case 8:
				return "|::|:";
			case 9:
				return "|:|::";
			case 0:
				return "||:::";
			default:
				return "";
		}
	}

	public static String genBarCode(int nCode) {
		// Final Result
		String barCode = "|";
		// Get Code With Checksum As String
		String nCodeCheckStr = detCheckSum(nCode) + "";
		// Loop Through Each Digit
		for (int i = 0; i < nCodeCheckStr.length(); i++) {
			// Append BarCode For Corresponding Digit
			barCode += genBarDigit(Integer.parseInt(nCodeCheckStr.charAt(i) + ""));
		}
		// Append Framing Bar
		barCode += "|";
		return barCode;
	}

	public static void main(String[] args) {
		int code = 95014;
		System.out.printf("Code: %d\n", code);
		System.out.printf("Code With Checksum: %d\n", detCheckSum(code));
		System.out.printf("Bar Code: %s\n", genBarCode(code));
		
	}
}