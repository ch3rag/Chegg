package HW4_Skeleton;

public class SinglyLinkedList {

	private SinglyLinkedNode head;
	private int size;

	public SinglyLinkedList() {
		this.head = null;
		this.size = 0;
	}

	// add a new node at the beginning of the list
	public void addAtBeginning(int value) {
		SinglyLinkedNode newNode = new SinglyLinkedNode(value);

		newNode.setNextNode(this.head);
		this.head = newNode;

		this.size++;
	}

	public void reverse() {
		// Previous Node
		SinglyLinkedNode prev = null;
		// Current Node
		SinglyLinkedNode curr = head;
		// Next Node
		SinglyLinkedNode next = head.getNextNode();

		// Head Will Be New Tail
		head.setNextNode(null);

		// Loop Through Linked List And Swap Pointers B/W Adjacent Nodes
		while (next != null) {
			prev = curr;
			curr = next;
			next = next.getNextNode();
			curr.setNextNode(prev);
		}

		// Assign New Head
		head = curr;
	}

	public SinglyLinkedNode getHead() {
		return this.head;
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		String str = "";
		SinglyLinkedNode curr = this.head;
		while (curr != null) {
			str += "->" + curr.getData();
			curr = curr.getNextNode();
		}
		return str;
	}
}
