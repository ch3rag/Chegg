#include <iostream>

using namespace std;

class User {
	public:
		int userId;
		string username;
		string firstname;
		string lastname;
		string dob;
		int age;
		static int totalUsers;

		// Default Constructor
		User() {
			// Assign Some Defaults
			username = "jhonDoe";
			firstname = "John";
			lastname = "Doe";
			dob = "2000-JAN-01";
			age = 21;
			userId = idGenerator;
			idGenerator++;
			totalUsers++;
		}
		
		// Parameterized Constructor
		User(string username_, string firstname_, string lastname_, string dob_, int age_) {
			username = username_;
			firstname = firstname_;
			lastname = lastname_;
			dob = dob_;
			age = age_;

			userId = idGenerator;
			idGenerator++;
			totalUsers++;
		}

		// Copy Constructor
		User(const User& user) {
			username = user.username;
			firstname = user.firstname;
			lastname = user.lastname;
			dob = user.dob;
			age = user.age;
			userId = user.userId;
		}
		// Deconstructor
		~User() {
			// Just Print The Message Since There Is Nothing To Clean Up
			cout << endl << username << " deleted.";
		}

	private:
		static int idGenerator;
};

int User::idGenerator = 10001;
int User::totalUsers = 0;

int main(int argc, char const *argv[])
{
	User users[] {
		User("mLane", "Mary", "Lane", "1997-AUG-27", 23),
		User("alexR", "Alex", "Ray", "2000-FEB-27", 21),
		User("ericM", "Eric", "Max", "1999-MAR-06", 22)
	};

	cout << "Total Users: " << User::totalUsers << endl << endl;

	cout << "---------------------- User Details ----------------------" << endl;
	for (int i = 0; i < 3; i++) {
		cout << "UserId: " << users[i].userId << endl;
		cout << "UserName: " << users[i].username << endl;
		cout << "First Name: " << users[i].firstname << endl;
		cout << "Last Name: " << users[i].lastname << endl;
		cout << "Age: " << users[i].dob << endl;
		cout << "Date Of Birth: " << users[i].age << endl;
		cout << endl;
	}
	return 0;
}


