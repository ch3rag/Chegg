package main

import "fmt"

// Date Struct To Store Date Data
// Day, Month And Year
type Date struct {
	day   int
	month int
	year  int
}

// Child Struct
type Child struct {
	firstName     string
	lastName      string
	dateOfBirth   Date
	gender        string
	yearLevel     int
	currentSchool string
	ethnicity     string
}

// Performs Linear Search On The List On Children
// FullName Is The Key Value To Search
// Returns True Is Key Is Found Otherwise False
func linearSearchName(children []Child, fullName string) bool {
	// Iterate Through Chilren List
	for _, childItem := range children {
		// Get Current Item's Full Name
		currentName := childItem.firstName + " " + childItem.lastName
		// Compare Key With Current Item's Full Name
		if currentName == fullName {
			// Return True If They Match
			return true
		}
	}
	// Key Not Found, Return False
	return false
}

// Main
func main() {
	// Initialize Some Childs For Testing Purpose
	alex := Child{"Alex", "Lane", Date{29, 8, 1997}, "Male", 3, "ABC", "American"}
	john := Child{"John", "Doe", Date{1, 9, 1998}, "Male", 2, "ABC", "American"}
	mary := Child{"Mary", "Jane", Date{21, 6, 1995}, "Female", 3, "ABC", "American"}
	sunder := Child{"Sunder", "Pichai", Date{18, 11, 1992}, "Male", 1, "ABC", "American Indian"}

	// Create A List Child Objects
	children := []Child{alex, john, mary, sunder}

	// Perform Linear Search And Print The Result On The Console
	fmt.Printf("Alex Lane? %t\n", linearSearchName(children, "Alex Lane"))
	fmt.Printf("John Doe? %t\n", linearSearchName(children, "John Doe"))
	fmt.Printf("Peter Parker? %t\n", linearSearchName(children, "Peter Parker"))
	fmt.Printf("Sunder Pichai? %t\n", linearSearchName(children, "Sunder Pichai"))
}
