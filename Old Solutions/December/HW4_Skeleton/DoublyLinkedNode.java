package HW4_Skeleton;

public class DoublyLinkedNode {
	private int item;
	private DoublyLinkedNode next;
	private DoublyLinkedNode prev;

	public DoublyLinkedNode(int data, DoublyLinkedNode nextNode, DoublyLinkedNode prevNode) {
		this.item = data;
		this.next = nextNode;
		this.prev = prevNode;
	}

	public DoublyLinkedNode(int data) {
		this(data, null, null);
	}

	public int getData() {
		return this.item;
	}

	public DoublyLinkedNode getNextNode() {
		return this.next;
	}

	public DoublyLinkedNode getPrevNode() {
		return this.prev;
	}

	public void setData(int data) {
		this.item = data;
	}

	public void setNextNode(DoublyLinkedNode nextNode) {
		this.next = nextNode;
	}

	public void setPrevNode(DoublyLinkedNode prevNode) {
		this.prev = prevNode;
	}

	@Override
	public String toString() {
		return "" + this.item;
	}

}