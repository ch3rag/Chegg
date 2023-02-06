#include "Post.H"

Post::Post() {
	// Here, we will set our private variables from our class to "" (empty space), and set num_likes = to 0.
	string post_author_ = "";
	string date_ = "";
	int num_likes_ = 0;
}

// Giving our private variables values
Post::Post(string body, string author, int num) {
	body_ = body;
	post_author_ = author;
	num_likes_ = num;
}

// Now we will declare our getter methods using the functions we previously declared and defined from Post.h

string Post::getPostBody() { return body_; }

string Post::getPostAuthor() { return post_author_; }

int Post::getPostLikes() { return num_likes_; }

// After declaring our getter methods, we will now declare our setter methods. These will give new variables in the post

void Post::setPostBody(string body) { body_ = body; }

void Post::setPostAuthor(string author) { post_author_ = author; }

void Post::setPostLikes(int likes) {
	// Creating an if function to ensure no negative values are allowed as a value for likes
	if (likes >= 0)
		num_likes_ = likes;
}
