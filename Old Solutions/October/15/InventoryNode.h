#include <iostream>
#include <string>

using namespace std;

class InventoryNode {
	private:
		string item;
		int numberOfItems;
		InventoryNode *nextNodeRef;

	public:
		//Constructor
		InventoryNode() {
			this->item = "";
			this->numberOfItems = 0;
			this->nextNodeRef = NULL;
		}

		//Constructor
		InventoryNode(string itemInit, int numberOfItemsInit) {
			this->item = itemInit;
			this->numberOfItems = numberOfItemsInit;
			this->nextNodeRef = NULL;
		}

		//Constructor
		InventoryNode(string itemInit, int numberOfItemsInit, InventoryNode nextLoc) {
			this->item = itemInit;
			this->numberOfItems = numberOfItemsInit;
			this->nextNodeRef = &nextLoc;
		}


		// TODO: Define an insertAtFront() method that inserts a node at the
		// front of the linked list (after the dummy head node)
		void InsertAtFront(InventoryNode * head, InventoryNode * newNode) {
			// Head's Next Node Is Now NewNode's Next Node
			newNode->nextNodeRef = head->nextNodeRef;
			// Re-Assign Head's Next Node To New Node
			head->nextNodeRef = newNode;
		}


		//Get the next node
		InventoryNode *GetNext() {
			return this->nextNodeRef;
		}

		//Print node data
		void PrintNodeData() {
			cout << this->numberOfItems << " " << this->item << endl;
		}
};