#include <iostream>
#include <sstream>
using namespace std;

// Square Class
class Square {
	private:
		// Length Of The Side
		double side;

	public:
		// Constructor
		Square(double side) {
			this->side = side;
		}

		// Getter For Side
		double getSide() const {
			return side;
		}

		// Setter For Side
		void setSide(double side) {
			this->side = side;
		}

		// Calculates The Area Of The Square
		double calculateArea() {
			return side * side;
		}

		// Destructor
		~Square() {
			cout << "Square destroyed." << endl;
		}
		// == Overload
		bool operator==(const Square& other) const {
			return side == other.getSide();
		}

		// ToString()
		string toString() {
			stringstream ss;
			ss << "[Side: " << side << ", Area: " << calculateArea() << "]";
			return ss.str();
		}
};

// Main
int main() {
	// Tests
	Square s1(10);
	Square s2(20);
	Square s3(10);

	cout << "Square 1 " << s1.toString() << endl;
	cout << "Square 2 " << s2.toString() << endl;
	cout << "Square 3 " << s3.toString() << endl;

	cout << "Square 1 == Square 2? " << (s1 == s2) << endl;
	cout << "Square 2 == Square 3? " << (s2 == s3) << endl;
	cout << "Square 3 == Square 1? " << (s3 == s1) << endl;

	cout << "Set Square 3's Side To 30" << endl;
	s3.setSide(30);
	cout << "Square 3 " << s3.toString() << endl;

}