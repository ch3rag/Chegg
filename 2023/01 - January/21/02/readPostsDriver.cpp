#include "Post.h"
#include <iostream>
#include <fstream>
#include <string>
#include <assert.h>
using namespace std;

// Splits The String Into Individual Fields
int split(string inputString, char separator, string arr[], int size) {
	int i = 0;
	int length = inputString.length();
	int index = 0;
	string data = "";
	while (i < length && index < size) {
		if (inputString[i] == separator || i == length - 1) {
			if (data != "") {
				arr[index++] = data;
				data = "";
			}
		} else {
			data += inputString[i];
		}
		i++;
	}
	if (i != length && index == size) {
		return -1;
	} else {
		return index;
	}
}

// Reads Posts From A File And Stores Them Into An Array
int readPosts(string file_name, Post posts[], int num_posts_stored, int posts_arr_size = 50) {
	// Check If There Is Empty Spaces In The Array
	if (num_posts_stored == posts_arr_size) {
		return -2;
	}

	// Input File Stream
	ifstream in;
	// Open File For Reading
	in.open(file_name);
	// If File Opened Successfully
	if (in.is_open()) {
		// Single Line Read From The File
		string line;
		// Data Read From The File
		string fields[4];
		// Read File Line By Line
		while (num_posts_stored < posts_arr_size && getline(in, line)) {
			// If Line Isn't Empty Then Only We'll Process It
			if (!line.empty()) {
				// Process The Line!
				// Check If 4 Fields Are Read From The Line
				if (split(line, ',', fields, 4) == 4) {
					// If Yes, Create A New Post Instance
					posts[num_posts_stored++] = Post(fields[0], fields[1], stoi(fields[2]), fields[3]);
				}
			}
		}
		// Close The File After We Are Done
		in.close();

		// Return The Total Number Of Posts
		return num_posts_stored;
	} else {
		// Failed To Open The File
		return -1;
	}
}

int main() {
	// Test
	Post posts[10];
	int numRead = readPosts("posts.txt", posts, 0, 10);
	cout << "Number Of Post Read: " << numRead << endl;

	// Code To Print The Values
	for (int i = 0; i < numRead; i++) {
		cout << posts[i].getPostAuthor() << endl;
	}

	// Code To Print The Values
	for (int i = 0; i < numRead; i++) {
		cout << posts[i].getPostDate() << endl;
	}

	// Assert Tests
	assert(numRead == 3);
	assert(readPosts("NoFile.txt", posts, numRead, 10) == -1);
	assert(posts[0].getPostAuthor() == "user1");
	assert(posts[1].getPostAuthor() == "user2");
	assert(posts[2].getPostAuthor() == "user3");
	assert(posts[0].getPostLikes() == 10);
	assert(posts[1].getPostLikes() == 2);
	assert(posts[2].getPostLikes() == 30);
	
	return 0;
}