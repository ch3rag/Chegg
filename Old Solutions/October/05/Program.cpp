#include <iostream>
using namespace std;

class myPartClass {
	private:
		double d;

	public:
		myPartClass() {
			d = 0;
		}
		
		myPartClass(double inD) {
			d = inD;
		}
		
		double getD() {
			return d;
		}
		
		void setD(double inD) {
			d = inD;
		}
};

class myWholeClass {
	private:
		int x;
		myPartClass Part1;

	public:
		void setPart1D(double inD) {
			Part1.setD(inD);
		}

		double getPart1D() {
			return Part1.getD();
		}

		int getX() {
			return x;
		}

		void setX(int inX) {
			x = inX;
		}

		myPartClass Part2;

		myWholeClass() {
			x = 0;
		}

		myWholeClass(int inX, double inD1, double inD2) {
			x = inX;
			Part1.setD(inD1);
			Part2.setD(inD2);
		}
};

int main() {
	myWholeClass Whole1;
	cout << "Whole 1 - default constructor - whole X = " << Whole1.getX() << endl;
	cout << "Whole 1 - default constructor - Part 1 d = " << Whole1.getPart1D() << endl;
	cout << "Whole 1 - default constructor - Part 2 d = " << Whole1.Part2.getD() << endl;

	Whole1.setX(20);
	cout << "Whole 1 - set whole X = " << Whole1.getX() << endl;

	Whole1.setPart1D(21);
	cout << "Whole 1 - set Part 1 d = " << Whole1.getPart1D() << endl;

	Whole1.Part2.setD(22);
	cout << "Whole 1 - set Part 2 d = " << Whole1.Part2.getD() << endl;

	myWholeClass Whole2(91, 92, 93);
	cout << "Whole 2 - Parm constructor - whole X = " << Whole2.getX() << endl;
	cout << "Whole 2 - Parm constructor - Part 1 d = " << Whole2.getPart1D() << endl;
	cout << "Whole 2 - Parm constructor - Part 2 d = " << Whole2.Part2.getD() << endl;

	Whole2.setX(51);
	cout << "Whole 2 - set whole X = " << Whole2.getX() << endl;

	Whole2.setPart1D(52);
	cout << "Whole 2 - set Part 1 d = " << Whole2.getPart1D() << endl;

	Whole2.Part2.setD(53);
	cout << "Whole 2 - set Part 2 d = " << Whole2.Part2.getD() << endl;

	system("pause");
	return 0;
}