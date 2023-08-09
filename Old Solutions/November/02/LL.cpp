#include <iostream>
using namespace std;

typedef struct node * NodePtr;

class node {
	public:
		int data;
		NodePtr link;
};

void print(NodePtr head) {
	for (NodePtr ptr = head; ptr != NULL; ptr = ptr->link) {
		cout << ptr->data << " ";
	}
}

int main() {
	int A[10] = { 4, 3, 6, 1, 10, 9, 5, 8, 7, 2 };
	
	// Head Of The Linked List
	NodePtr head = NULL;

	// For Each Item In The Array 'A'
	for (int i = 0; i < 10; i++) {
		
		// Create A New Node With That Item
		NodePtr newNode = new node;
		newNode->data = A[i];
		newNode->link = NULL;


		// If Head of The LinkedList Is Null
		if (head == NULL) {
			// Assign New Node To Head
			head = newNode;
		// If Value Of New Node Is Less Than Head
		} else if (newNode->data < head->data) {
			// Add New Node To The Beginning Of The Linked List
			newNode->link = head;
			// Make New Node The New Head
			head = newNode;
		} else {
			// We Need To Find Correct Position Of New Node
			// Create A Iterator Node
			NodePtr x;

			// Iterate Until We Reach Last Node (New Node's Value > All Nodes)
			// OR
			// Find A Node Whose Next Node's Value > New Node Value
			for (x = head;
				x->link != NULL && (x->link->data < newNode->data);
				x = x->link
			);
			// Insert New Node Next To X
			newNode->link = x->link;
			x->link = newNode;
		}

		// Print Linked List
		print(head);
		cout << endl;
	}
	return 0;
}