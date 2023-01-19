// MyLinkedListTester.java

public class MyLinkedListTester {

	// Prints The Linked List
	public static void print(MyLinkedList ll) {
		MyListIterator itr = ll.getIterator();
		System.out.print("Linked List: ");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("\n");
	}

	// Main
	public static void main(String[] args) {
		// Create A Linked List
		MyLinkedList ll = new MyLinkedList();
		
		// Add Some Items
		ll.append(1);
		ll.append(2);
		ll.append(3);

		// Print 
		System.out.println("Adding 1, 2, 3");
		print(ll);

		// Add 99 At Index 1
		System.out.println("Adding 99 At Index - 1");
		ll.insertAt(1, 99);
		print(ll);

		// Remove From Index - 1
		System.out.println("Removing Item At Index - 1");
		ll.removeAt(1);
		print(ll);

		// Get Item At Index - 1
		System.out.println("Getting Item At Index - 1: " + ll.getAt(2) + "\n");

		// Getting Size Of LL
		System.out.println("Size Of The Linked List: " + ll.getSize());
	}	
}
