#include <stdio.h>
#include <malloc.h>

// Node Struct
struct Node {
	double data;
	struct Node * next;
} * head;


// Insert A Node In The Linked List At Beginning
void insert(double data) {
	struct Node * newNode;
	newNode = malloc(sizeof(struct Node));
	newNode->data = data;
	newNode->next = head;
	head = newNode;
}

// Displays The LinkedList
void display() {
	struct Node * itr = head;
	while (itr != NULL) {
		printf("%.1f -> ", itr->data);
		itr = itr->next;
	}
	printf("NULL\n");
}

// Function To Add Average Nodes Between Each Consecutive Integer In The Linked List
void addAverageNodes() {
	// If Length Of LinkedList Is < 2
	if (head == NULL || head->next == NULL) {
		// Return, Not Enough Nodes
		return;
	}
	// Create A Iterator
	struct Node * itr = head;
	// Iterate Over Linked List
	while (itr->next != NULL) {
		// Next Node
		struct Node * next = itr->next;
		// Calculate Average
		double average = (itr->data + next->data) / 2;
		// Create New Node
		struct Node * newNode = malloc(sizeof(struct Node));
		// Set It's Data
		newNode->data = average;
		// Insert It In Between Itr And Next
		itr->next = newNode;
		newNode->next = next;

		// Goto Next Node
		itr = next;
	}
}

// Main
int main() {

	// Add Some Nodes
	insert(15);
	insert(78);
	insert(56);
	insert(34);
	insert(12);

	// Display List Before Inserting Average Nodes
	printf("Linked List Before Average Nodes Are Added:\n");
	display();

	printf("\n");

	// Add Average Nodes
	addAverageNodes();

	// Display List After Inserting Average Nodes
	printf("Linked List After Average Nodes Are Added:\n");
	display();

	return 0;
}