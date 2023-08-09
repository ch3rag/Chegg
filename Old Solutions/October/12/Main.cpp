#include <iostream>
#include "Queue.h"

using namespace std;

// Test Code
int main() {
	Queue<int, 3> queue;

	queue.dequeue();

	cout << "-------------------------" << endl;
	
	queue.enqueue(1);
	queue.enqueue(2);
	queue.enqueue(3);

	cout << "Front: " << queue.front() << endl;
	cout << "Back: " << queue.back() << endl;
	queue.print();

	cout << "-------------------------" << endl;

	queue.enqueue(4);
	cout << "Front: " << queue.front() << endl;
	cout << "Back: " << queue.back() << endl;
	queue.print();
	cout << "-------------------------" << endl;

	queue.dequeue();
	cout << "Front: " << queue.front() << endl;
	cout << "Back: " << queue.back() << endl;
	queue.print();
	cout << "-------------------------" << endl;

	queue.dequeue();
	cout << "Front: " << queue.front() << endl;
	cout << "Back: " << queue.back() << endl;
	queue.enqueue(10);
	queue.enqueue(20);
	cout << "Front: " << queue.front() << endl;
	cout << "Back: " << queue.back() << endl;
	queue.print();

	return 0;
}