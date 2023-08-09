#include <iostream>
#include <iomanip>

using namespace std;

struct Node {
	int year;
	float balance;
	Node * next;
};

class ProfitLossList {
	private:
		Node * head;

	public: 
		ProfitLossList() {
			head = NULL;
		}
	
		void insert(int year, float balance) {
			Node * newNode = new Node();
			newNode->year = year;
			newNode->balance = balance;
			if (head == NULL) {
				head = newNode;
				return;
			} else if (newNode->year == head->year) {
				head->balance = newNode->balance;
				delete newNode;
			} else if (newNode->year < head->year) {
				newNode->next = head;
				head = newNode;
			} else {
				Node * current = head;
				while (current->next != NULL && newNode->year >= current->next->year) {
					current = current->next;
				}
				if (newNode->year == current->year) {
					current->balance = newNode->balance;
					delete newNode;
				} else {
					newNode->next = current->next;
					current->next = newNode;
				}
			}
		}

		void print() {
			cout << "List = ";
			Node * current = head;
			while (current != NULL) {
				cout << "[" << current->year << " " << fixed << setprecision(1) << current->balance << "] -> ";
				current = current->next;
			}
			cout << "NULL" << endl;
		}

		void removeLast() {
			Node * current;
			if (head == NULL) {
				cout << "List is empty!" << endl;
			} else if (head->next == NULL) {
				cout << "After removing [" << head->year << " " << head->balance << "]" << endl;
				delete head;
				head = NULL;
			} else {
				current = head;
				while (current->next->next != NULL) {
					current = current->next;
				}
				cout << "After removing [" << current->next->year << " " << current->next->balance << "]" << endl;
				delete current->next;
				current->next = NULL;
			}
			
		}
		
		~ProfitLossList() {
			Node * current = head;
			while (current != NULL) {
				Node * temp = current;
				current = current->next;
				delete temp;
			}
		}
};

int main() {
	ProfitLossList list;
	int year;
	double balance;

	while (true) {
		cout << "Enter a year and balance: ";
		cin >> year >> balance;
		if (year > 0) {
			list.insert(year, balance);
		} else {
			list.removeLast();
		}
		list.print();
	}
}