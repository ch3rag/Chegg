package HW4_Skeleton;

public class SinglyLinkedNode {
	private int item;
	private SinglyLinkedNode next;

	public SinglyLinkedNode(int data, SinglyLinkedNode nextNode) {
		this.item = data;
		this.next = nextNode;
	}

	public SinglyLinkedNode(int data) {
		this(data, null);
	}

	public int getData() {
		return item;
	}

	public SinglyLinkedNode getNextNode() {
		return next;
	}

	public void setData(int data) {
		this.item = data;
	}

	public void setNextNode(SinglyLinkedNode nextNode) {
		this.next = nextNode;
	}

	@Override
	public String toString() {
		return "" + this.item;
	}
}
