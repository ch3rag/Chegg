// Post.H

#ifndef POST_H
#define POST_H

#include <iostream>
using namespace std;
// Represents A Single Post
class Post {
	// Private Data Members
	private:
		// Main Content/Body Of The Post
		string body_;

		// The Author Of The Post
		string post_author_;

		// Number of Likes The Post Has Received
		int num_likes_ = 0;

		// The Date Of The Post
		string date_;

		// Declaring The Public, "Accessible", Functions & Strings
		public:
			// Default Constructor
			Post();

			// Parameterized Constructor
			Post(string body, string author, int likes, string date);

			// Returns the body_ of the post
			string getPostBody();
			
			// Sets new body_ for post
			void setPostBody(string post_body);

			// Returns the post_author of the post
			string getPostAuthor();

			// Sets the new post_author_ for the post
			void setPostAuthor(string post_author);

			// Returns the num_likes that the post has received
			int getPostLikes();

			// Sets num_likes data member to likes if likes is a positive integer or 0
			void setPostLikes(int num_likes_);

			// Returns the date of the post
			string getPostDate();

			// Sets new date_ for the post
			void setPostDate(string date_);
};
#endif
