#include <iostream>
using namespace std;

struct Node {
	int marks;
	Node * next;
};

class MarkList {
	private:
		Node * head;

	public: 
		MarkList() {
			head = NULL;
		}
	
		void insert(int marks) {
			Node * newNode = new Node();
			newNode->marks = marks;
			if (head == NULL) {
				head = newNode;
				return;
			} else if (newNode->marks < head->marks) {
				newNode->next = head;
				head = newNode;
			} else {
				Node * current = head;
				while (current->next != NULL && newNode->marks > current->next->marks) {
					current = current->next;
				}
				newNode->next = current->next;
				current->next = newNode;
			}
		}

		void print() {
			cout << "Marks: ";
			Node * current = head;
			while (current != NULL) {
				cout << current->marks << " ";
				current = current->next;
			}
			cout << endl;
		}

		int count() {
			Node * current = head;
			int count = 0;
			while (current != NULL) {
				count++;
				current = current->next;
			}
			return count;
		}

		void deleteBelowAverge() {
			double avg = average();

			while (head->marks < avg) {
				Node * temp = head;
				head = head->next;
				delete temp;	
			}
		}

		double average() {
			Node * current = head;
			double sum = 0;
			while (current != NULL) {
				sum += current->marks;
				current = current->next;
			}
			return sum / count();
		}

		~MarkList() {
			Node * current = head;
			while (current != NULL) {
				Node * temp = current;
				current = current->next;
				delete temp;
			}
		}
};

int main() {
	int choice, marks;
	MarkList list;
	while (true) {
		cout << "-----------------------------" << endl;
		cout << "      Marks Linked List      " << endl;
		cout << "-----------------------------" << endl;
		cout << endl;
		cout << "1. Add A New Mark" << endl;
		cout << "2. Print All Marks" << endl;
		cout << "3. Print Average Marks" << endl;
		cout << "4. Delete All The Marks Below Average" << endl;
		cout << "5. Exit" << endl;
		cout << "Enter Your Choice: ";
		cin >> choice;
		
		switch (choice) {
			case 1:
				cout << "Enter Marks: ";
				cin >> marks;
				list.insert(marks);
				cout << "Inserted!" << endl;
				break;
			case 2: 
				list.print();
				break;
			case 3:
				cout << "Average Marks: " << list.average() << endl;
				break;
			case 4:
				list.deleteBelowAverge();
				list.print();
				break;
			case 5:
				return 0;
			default:
				cout << "Invalid Choice!";
		}
	}
}