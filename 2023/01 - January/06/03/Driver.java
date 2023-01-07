// Driver.java

// Test Class
public class Driver {
	public static void main(String[] args) {
		Computer computer = new Computer("MAN", "Intel", 8, 512, 5.5);
		System.out.print("Computer Model: ");
		System.out.println(computer.getModel());

		Computer tablet = new Tablet("MAN", "Intel", 8, 512, 5.5, 11, 9, "Android");
		System.out.print("Tablet Model: ");
		System.out.println(tablet.getModel());
	}
}
