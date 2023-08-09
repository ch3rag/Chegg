package HW4_Skeleton;

public class SinglyLinkedListStarter {
	public static void main(String args[]) {

		SinglyLinkedList myLinkedList = new SinglyLinkedList();

		myLinkedList.addAtBeginning(4);
		myLinkedList.addAtBeginning(7);
		myLinkedList.addAtBeginning(1);
		myLinkedList.addAtBeginning(2);

		System.out.println(myLinkedList.toString());
		System.out.println(myLinkedList.getSize());
		System.out.println(myLinkedList.getHead());

		myLinkedList.reverse();

		System.out.println(myLinkedList.toString());
		System.out.println(myLinkedList.getSize());
		System.out.println(myLinkedList.getHead());
	}
}