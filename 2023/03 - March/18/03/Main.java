
// Main
public class Main {
	public static void main(String[] args) {
		// Create A Test Ledger
		Ledger ledger = new Ledger();

		// Print Number Of Payments
		System.out.println("Size Of Ledger: " + ledger.size());
		System.out.println(ledger);

		System.out.println();

		// Add Some Payments
		ledger.addPayment(new Payment("Bob", "Sue", 1000, null));
		ledger.addPayment(new Payment("Jane", "Bob", 2000, null));

		// Print Number Of Payments
		System.out.println("Size Of Ledger: " + ledger.size());
		System.out.println(ledger);
	}
}
