import java.util.Scanner;

enum ISBNType {
	ISBN_10,
	ISBN_13
}

public class ISBNValidator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("Please enter the ISBN type: ");
			String input = scanner.nextLine();
			ISBNType type = ISBNType.valueOf(input);
			System.out.print("Please enter the " + type + " number: ");
			input = scanner.nextLine();
			boolean isValid = validate(type, input);
			if (isValid) {
				System.out.println(input + " is a valid " + type + " number");
			} else {
				System.out.println(input + " is an invalid " + type + " number");
			}
		}
		scanner.close();
	}

	public static boolean validate(ISBNType type, String input) {
		int sum, checksum;
		switch (type) {
			case ISBN_10:
				if (input.length() != 10) {
					return false;
				}

				sum = 0;
				for (int i = 0; i < 10; i++) {
					char ch = input.charAt(i);
					if (i < 9 && !Character.isDigit(ch)) {
						return false;
					} else {
						sum += Character.getNumericValue(ch) * (i + 1);
					}
					
					if (i == 9 && ch != 'X') {
						return false;
					}
				}
				checksum = sum % 11;
				if (checksum < 0 || checksum > 10) {
					return false;
				}
				break;

			case ISBN_13:
			if (input.length() != 13) {
				return false;
			}

			sum = 0;
			for (int i = 0; i < 13; i++) {
				char ch = input.charAt(i);
				if (!Character.isDigit(ch)) {
					return false;
				} else if (i % 2 == 1) {
					sum += Character.getNumericValue(ch) * 3;
				} else {
					sum += Character.getNumericValue(ch);
				}
			}
			checksum = sum % 10;
			if (checksum != 0) {
				return false;
			}
			break;
		}
		return true;
	}
}