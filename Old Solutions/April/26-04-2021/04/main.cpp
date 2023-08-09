

class X {
	public:
		int m;
		X (int mm) : m(mm) { }

		void foo() {
			cout << "X's foo invoked" << endl;
		};
};

class Y : public X {
	public:
		int m;
		Y (int a, int b) : X(a), m(b) { }
		
		void foo() {
			cout << "Y's foo invoked" << endl;
		}
};

int main() {
	X xobj(10);
	xobj.foo();

	Y yobj(10, 20);
	yobj.foo();

	yobj.X::foo();

	return 0;
}