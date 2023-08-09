
public class Ledger {
	
	public Payment head;
	public int id;
	public Ledger next;
	// add attributes as needed
	// needed to implement efficient code
	// tested for `advanced' parts
	public Payment tail;
	// To Keep Track Of Number Of Payments
	private int size;
	/**
	 * Default constructor
	 *
	 * You may modify this constructor if you need to (e.g.
	 * if you want to initialize extra attributes in the class)
	 */
	public Ledger() {
		head = null;
		id = 0;
		next = null;
		// add initialization of added attributes, if needed
		// Initial Number Of Payments is Zero
		size = 0;
	}

	/**
	 * Assign an id to the current Ledger
	 *
	 * @param id
	 */
	public void setId(int id) {
		//
		// Provided - not to be changed
		this.id = id;
	}

	public Ledger(Payment payment, Ledger next) {
		head = payment;
		this.next = next;
	}

	/**
	 *
	 * @return the number of payments in the Ledger
	 */
	public int size() {
		// Return The Size
		return size;
	}

	/**
	* Add a payment at the end of the Ledger list
	*
	* @param payment
	*/
	public void addPayment(Payment payment) {
		// If There Are Currently No Payments
		if (head == null) {
			// Make Head And Tail Point To Same Payment
			head = payment;
			tail = payment;
		} else {
			// Else, Add New Payment Next To Tail
			tail.next = payment;
			// New Payment Is The New Tail
			tail = payment;
		}

		// Increase The Size
		size++;
	}

	// To String
	@Override
	public String toString() {
		// When Ledger Is Empty
		if (size == 0) {
			return "Ledger is empty.";
		}

		// Create StringBuilder For Better Efficiency
		StringBuilder sb = new StringBuilder();
		// Append All Payments In String Builder
		Payment current = head;
		while (current != null) {
			sb.append(String.format("From: %s, To: %s, Amount: %.1f, TimeStamp: %s\n",
			current.fromPerson, current.toPerson, current.amount, current.timestamp));
			current = current.next;
		}
		// Return The String
		return sb.toString();
	}
}