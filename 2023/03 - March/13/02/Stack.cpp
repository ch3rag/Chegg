#include "Stack.h"

// Constructor
Stack :: Stack() {
	// Initialize Instance Variables
	this->top = NULL;
	this->numNodes = 0;
}

// Push A Person Onto The Stack
void  Stack :: push(Person * person) {
	// Create A New Node
	Node * newNode = new Node(person, top);
	// New Node Is The New Top
	this->top = newNode;
	// Increment The Number Of Nodes
	this->numNodes++;
}

// Pop A Person And Returns It
Person * Stack :: pop() {
	if (isEmpty()) {
		return NULL;
	}
	// Get Data Of Top Node
	Person * data = top->getData();
	// Backup Top Reference
	Node * backup = top;
	// Advance Top Node
	this->top = top->getNext();
	// Delete Top Node
	delete backup;
	// Decrement The Number Of Nodes
	numNodes--;
	// Return Data
	return data;
}

// Returns The Size Of The Stack
int Stack :: size() {
	return numNodes;
}
// Return True If The Stack Is Empty, False Otherwise
bool Stack :: isEmpty() {
	return numNodes == 0;
}
// Returns The Top Item On The Stack Without Removing It
Person * Stack :: peek() {
	if (isEmpty()) {
		return NULL;
	}
	return top->getData();
}