#include <iostream>
using namespace std;

class LispExpression {
	private:
		std :: string exp;
	public:
		friend ostream& operator << (ostream& out, const LispExpression& exp) {

		}
		
		friend istream& operator >> (istream& in, const LispExpression& exp) {
			this->exp = exp;
		}
};