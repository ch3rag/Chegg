#include "Node.h"

// Constructor
Node :: Node(Person * data, Node * next) {
	// Initialize Instance Variables
	this->data = data;
	this->next = next;
}

// Setter For Next
void Node :: setNext(Node * next) {
	this->next = next;
}

// Getter For Next
Node * Node :: getNext() {
	return this->next;
}
// Getter For Data
Person * Node :: getData() {
	return this->data;
}

