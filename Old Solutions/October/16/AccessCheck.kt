import java.util.Scanner

// Person Class
class Person {
	// Age Field
	var age: Int = -1
		// Getter For Age
		get() = field
		// Setter For Age
		set(value: Int) {
			field = value
		}

		// Has Access Function
		// Returns If The Age Greater Or Equals 18
		fun hasAccess() : Boolean {
			return age >= 18
		}
}

// Main
fun main() {
	// Create A Scanner
	val input = Scanner(System.`in`);

	// Input Age
	print("Please Enter Your Age: ")
	val age: Int = input.nextInt()

	// Display User Input
	println("You Entered $age")

	// Crate A New Person Object
	val myPerson = Person()

	// Set The Age
	myPerson.age = age

	// Display The User Has Access To The Theater
	if (myPerson.hasAccess()) {
		println("The User Can Enter The Theather!")
	} else {
		println("The User Can NOT Enter The Theather!")
	}
}