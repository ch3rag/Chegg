#ifndef STACK_H
#define STACK_H

#include "Node.h"

// Stack Class
class Stack {
	// Private Attributes
	private:
		// Top Node Pointer
		Node * top;
		// Number Of Nodes On The Stack
		int numNodes;
	// Public Methods
	public:
		// Constructor
		Stack();
		// Push A Person Onto The Stack
		void push(Person *);
		// Pop A Person And Returns It
		Person * pop();
		// Returns The Size Of The Stack
		int size();
		// Return True If The Stack Is Empty, False Otherwise
		bool isEmpty();
		// Returns The Top Item On The Stack Without Removing It
		Person * peek();
};
#endif