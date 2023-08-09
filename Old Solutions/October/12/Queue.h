#ifndef QUEUE_H
#define QUEUE_H

#include <iostream>
using namespace std;

// Class Template For Circular Queue Using Array
template <class T, int max_size>
class Queue {
	private:
		// Array To Hold Items
		T arr[max_size];
		// Index Pointing To First Item In The Queue
		int index_start;
		// Index Pointing To Last Item In The Queue
		int index_end;
		// Number Of Items In The Queue
		int num_elem;
	public:
		// Default Constructor
		Queue();
		// Enqueues An Item In The Queue
		void enqueue(T);
		// Dequeues An Item From The Queue
		T dequeue();
		// Returns First Item In The Queue
		T front();
		// Returns Last Item In The Queue
		T back();
		// Returns Is Queue Is Full
		bool isFull();
		// Returns Is Queue Is Empty
		bool isEmpty();
		// Prints The Queue Onto Console
		void print();
};

// Default Constructor
template <class T, int max_size>
Queue<T, max_size> :: Queue() {
	index_start = index_end = -1;
	num_elem = 0;
}

// Enqueues An Item In The Queue
template <class T, int max_size>
void Queue<T, max_size> :: enqueue(T elem) {
	if (isFull()) {
		// Queue Is Full
		cout << "Error: Queue is Full!" << endl;
	} else if (index_start == -1) {
		// Queue Is Empty
		index_start = index_end = 0;
		arr[index_end] = elem;
		num_elem++;
	} else {
		// Queue Is Neither Empty Nor Full
		index_end = (index_end + 1) % max_size;
		arr[index_end] = elem;
		num_elem++;
	}
}

// Dequeues An Item From The Queue
template <class T, int max_size>
T Queue<T, max_size> :: dequeue() {
	if (isEmpty()) {
		// Queue Is Empty
		cout << "Error: Queue is Empty!" << endl;
	} else if (index_start == index_end) {
		// Queue Has Only One Item
		T elem = arr[index_start];
		index_start = index_end = -1;
		num_elem--;
		return elem;
	} else {
		// Queue Is Not Empty And It Has More Than One Item
		T elem = arr[index_start];
		index_start = (index_start + 1) % max_size;
		num_elem--;
		return elem;
	}
}


// Returns First Item In The Queue
template <class T, int max_size>
T Queue<T, max_size> :: front() {
	if (isEmpty()) {
		// Queue Is Empty
		cout << "Error: Queue is Empty!" << endl;
	} else {
		return arr[index_start];
	}
}

// Returns Last Item In The Queue
template <class T, int max_size>
T Queue<T, max_size> :: back() {
	if (isEmpty()) {
		// Queue Is Empty
		cout << "Error: Queue is Empty!" << endl;
	} else {
		return arr[index_end];
	}
}

// Prints The Queue Onto Console
template <class T, int max_size>
void Queue<T, max_size> :: print() {
	if (isEmpty()) {
		// Queue Is Empty
		cout << "Error: Queue is Empty!" << endl;
	} else if (index_end >= index_start) {
		// Starting Index <= Ending Index
		for (int i = index_start; i <= index_end; i++) {
			cout << arr[i] << " ";
		}
		cout << endl;
	} else {
		// Starting Index > Ending Index
		for (int i = index_start; i < max_size; i++) {
			cout << arr[i] << " ";
		}

		for (int i = 0; i <= index_end; i++) {
			cout << arr[i] << " ";
		}
		cout << endl;
	}
}

// Returns Is Queue Is Empty
template <class T, int max_size>
bool Queue<T, max_size> :: isEmpty() {
	return num_elem == 0;
}

// Returns Is Queue Is Full
template <class T, int max_size>
bool Queue<T, max_size> :: isFull() {
	return num_elem == max_size;
}

#endif