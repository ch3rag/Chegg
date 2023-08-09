package HW4_Skeleton;

public class DoublyLinkedList {

	private DoublyLinkedNode head;
	private int size;

	public DoublyLinkedList() {
		this.head = null;
		this.size = 0;
	}

	// add a new node at the beginning of the list
	public void addAtBeginning(int value) {

		DoublyLinkedNode newNode = new DoublyLinkedNode(value);
		if (size == 0) {
			this.head = newNode;
			this.size++;
			return;
		}

		DoublyLinkedNode curr = this.head;

		newNode.setNextNode(curr);
		newNode.setPrevNode(curr.getPrevNode());
		curr.setPrevNode(newNode);
		this.head = newNode;

		this.size++;

	}

	public void reverse() {
		// Previous Node
		DoublyLinkedNode prev = null;
		// Current Node
		DoublyLinkedNode curr = head;
		// Next Node
		DoublyLinkedNode next = head.getNextNode();

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

	public DoublyLinkedNode getHead() {
		return this.head;
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		String str = "";
		DoublyLinkedNode curr = this.head;
		while (curr != null) {
			str += "->" + curr.getData();
			curr = curr.getNextNode();
		}
		return str;
	}
}