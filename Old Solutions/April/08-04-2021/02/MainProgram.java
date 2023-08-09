import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Range Of The Weapon: ");
		
		int effectiveRange = Integer.parseInt(scanner.nextLine());

		System.out.print("Enter Magazine Capacity: ");

		int magazineCapacity = Integer.parseInt(scanner.nextLine());

		System.out.print("Enter Target Range: ");

		int targetRange = Integer.parseInt(scanner.nextLine());

		Clip clip = new Clip(magazineCapacity);
		clip.fill();

		Gun gun = new Gun(effectiveRange, clip);

		boolean fireResult = gun.fire(targetRange);

		if (fireResult) {
			System.out.println("Gun Fired Successfully!");
		} else {
			System.out.println("Gun Fire Failed!");
		}
	}
}