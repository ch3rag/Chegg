import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int peanuts, walnuts, almonds;
		
		peanuts = 0;
		walnuts = 0;
		almonds = 0;

		while(true) {
			System.out.print("> ");
			String input = scanner.nextLine();
			input = input.trim().toLowerCase();

			if (input.equals("bye") || input.equals("exit")) {
				break;
			}

			int equalsPosition = input.indexOf('=');
			
			// '=' Not Found
			if (equalsPosition == -1) {
				System.out.println("Syntax Error...");
				continue;
			}

			String part1 = input.substring(0, equalsPosition);
			String part2 = input.substring(equalsPosition + 1, input.length());

			part1 = part1.trim();
			part2 = part2.trim();

			if (!(part1.equals("peanuts") || part1.equals("walnuts") || part1.equals("almonds"))) {
				System.out.println("Sorry, we do not stock up on " + part1);
				continue;
			}

			int part2Int = Integer.parseInt(part2);

			if (part1.equals("peanuts")) {
				peanuts += part2Int;
			} else if (part1.equals("walnuts")) {
				walnuts += part2Int;
			} else {
				almonds += part2Int;
			}

			System.out.println("Our current stocks are: " + peanuts + " peanuts, " + walnuts + " walnuts, " + almonds + " almonds");
		}
	}
}