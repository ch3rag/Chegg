#include <iostream>
using namespace std;

class Node {
public:
	int item;
	Node *next;
	Node(int d = 0)
	{
		item = d;
		next = NULL;
	}
};

// To print the list of nodes from head to tail
void print(Node *head) {
	Node *node = head;
	while (node) {
		cout << node->item << "\t";
		node = node->next;
	}
	cout << endl
		 << endl;
}

int main() {
	Node *head, *tail;
	head = tail = new Node(10);
	for (int n = 20; n <= 50; n += 5) {
		tail->next = new Node(n);
		tail = tail->next;
	}

	print(head);

	Node *node;

	//-------------------------------------------------
	// Task 1: Insert a new node (with the item = 55) at
	// the end of the list (3 marks)
	// Create A New Node With Value = 55
	node = new Node(55);
	// Insert It Next To Tail
	tail->next = node;
	// Make It The New Tail Node
	tail = node;
	print(head);

	//-------------------------------------------------
	// Task 2: Insert a new node (with the item = 32 ) between
	// node 30 and node 35 (7 marks)
	// Create A New Node With Value = 32
	node = new Node(32);
	// Find The Node With Value 30
	Node * current = head;
	while (current->item != 30) {
		current = current->next;
	}
	// Make 32's Next Node 35
	node->next = current->next;
	// Insert 32 Next To 30
	current->next = node;
	print(head);

	//-------------------------------------------------
	// Task 3: Delete the head node from the list (3 marks) and no with item 20 will become head
	// Backup Head Node
	node = head;
	// Make Head's Next Node, The New Head Node
	head = head->next;
	// Delete Previous Head
	delete node;


	print(head);
	// Task 4: Move head node to tail and make second node become head
	// Backup Head
	node = head;
	// Make Head's Next Node, The New Head Node
	head = head->next;
	// Make Next Pointer Of Previous Head To Null
	node->next = NULL;
	// Make Previous Head, The New Tail
	tail->next = node;
	tail = node;

	print(head);

	//-------------------------------------------------
	// Task 5: Get an average for all item in nodes and display the value (average) (8 marks)
	// Hint : need to count the number of nodes in the linked list
	// Sum Of Nodes
	int sum = 0;
	// Count of Nodes
	int count = 0;
	// Iterate Over Nodes
	node = head;
	while (node != NULL) {
		sum += node->item;
		count++;
		node = node->next;
	}

	// Print Average
	cout << "Average: " << sum / count;
	return 0;
} // End main