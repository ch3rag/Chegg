#include <iostream>
#include <string>
#include <string>
using namespace std;

// Separate String By Space
void separate_name_sound(const string input, string& name, string& sound) {
	int c = 1;
	while (input[c] != '\0' && input[c] != ' ') c++;
	if (c < input.length()) {
		name = input.substr(1, c - 1);
		sound = input.substr(c + 1, input.length());
	} else {
		name = input.substr(1, c);
	}
}

// Animal Class
class Animal {
	protected:
		string m_name, m_sound;
	public:
		Animal(string name, string sound) : m_name(name), m_sound(sound) { }
		virtual ~Animal() { }
		virtual void make_sound() = 0;
};


// Cat Class
class Cat : public Animal {
	public:
		// Call Base Class Constructor
		// If Sound Is Empty, Pass Default Sound
		Cat(string name, string sound)
			: Animal(name, (sound.empty()? "Meow" : sound)) { }
		
		void make_sound() {
			cout << m_name << " purrs: " << m_sound << "!" << endl;
		}
};

class Cow : public Animal {
	public:
		// Call Base Class Constructor
		// If Sound Is Empty, Pass Default Sound
		Cow(string name, string sound)
			: Animal(name, (sound.empty()? "Moo" : sound)) { }
		
		void make_sound() {
			cout << m_name << " moos: " << m_sound << "!" << endl;
		}
};

class Dog : public Animal {
	public:
		// Call Base Class Constructor
		// If Sound Is Empty, Pass Default Sound
		Dog(string name, string sound)
			: Animal(name, (sound.empty()? "Woof" : sound)) { }
		
		void make_sound() {
			cout << m_name << " barks: " << m_sound << "!" << endl;
		}
};

class Duck : public Animal {
	public:
		// Call Base Class Constructor
		// If Sound Is Empty, Pass Default Sound
		Duck(string name, string sound)
			: Animal(name, (sound.empty()? "Quack" : sound)) { }
		
		void make_sound() {
			cout << m_name << " quacks: " << m_sound << "!" << endl;
		}
};

class Horse : public Animal {
	public:
		// Call Base Class Constructor
		// If Sound Is Empty, Pass Default Sound
		Horse(string name, string sound)
			: Animal(name, (sound.empty()? "Neigh" : sound)) { }
		
		void make_sound() {
			cout << m_name << " nickers: " << m_sound << "!" << endl;
		}
};

class Pig : public Animal {
	public:
		// Call Base Class Constructor
		// If Sound Is Empty, Pass Default Sound
		Pig(string name, string sound)
			: Animal(name, (sound.empty()? "Oink" : sound)) { }
		
		void make_sound() {
			cout << m_name << " snorts: " << m_sound << "!" << endl;
		}
};

int main() {

	// Input The Number Of Animals
	int num_animals;
	cin >> num_animals;

	// Dynamic Array To Hold Animals
	Animal** animals = new Animal*[num_animals];

	cin.ignore();

	// For Each Animal
	for (int i = 0; i < num_animals; i++) {
		string input;
		// Name Of The Animal
		string name;
		// Sound Of The Animal
		string sound = "";
		// Animal's Number
		int n = 0;
		cin >> n;
		// Read Complete Line
		getline(cin, input);
		separate_name_sound(input, name, sound);

		switch (n) {
			case 1:
				animals[i] = new Cat(name, sound);
				break;
			case 2:
				animals[i] = new Cow(name, sound);
				break;
			case 3:
				animals[i] = new Dog(name, sound);
				break;
			case 4:
				animals[i] = new Duck(name, sound);
				break;
			case 5:
				animals[i] = new Horse(name, sound);
				break;
			case 6:
				animals[i] = new Pig(name, sound);
				break;
		}
	}

	int sounds = 0;
	cin >> sounds;
	for (int i = 0; i < sounds; i++) {
		int s;
		cin >> s;
		animals[s - 1]->make_sound();
	}

	// Free Memory
	// Delete Each Object
	for (int i = 0; i != num_animals; ++i) {
		delete animals[i];
	}
	// Delete Array
	delete[] animals;
}