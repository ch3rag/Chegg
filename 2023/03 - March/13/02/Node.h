#ifndef NODE_H
#define NODE_H

#include "Person.h"

// Node Class
class Node {
	// Private Attributes
	private:
		// Person's Data
		Person * data;
		// Pointer To Next Node
		Node * next;
	// Public Methods
	public:
		// Constructor
		Node(Person *, Node *);
		// Setter For Next
		void setNext(Node *);
		// Getter For Next
		Node * getNext();
		// Getter For Data
		Person * getData();
};
#endif