// Question - 1: printName()
console.log('Question - 1: printName()');

// Function To Print Full Name
function printName(title, firstName, middleName, lastName) {
	// Print Full Name
	console.log(title + ' ' + firstName + ' ' + middleName + '. ' + lastName);
}

// Test printName()
printName('Sir', 'Spongebob', 'M', 'Squarepants');

console.log();

// Question - 2: count()
console.log('Question - 2: count()');

// Counts Numbers From Low Bound To High Bound
function count(low, high) {
	// Numbers
	const numbers = [];
	// Loop From Low To High
	for (let i = low; i <= high; i++) {
		// Add Number To List of Numbers
		numbers.push(i);
	}

	// Print List
	console.log(numbers.join(', '));
}

// Test Count
count(4, 10);

console.log();

// Question - 3: formatDate()
console.log('Question - 3: formatDate()');

// Formats Date In MM/DD/YYYY Format
function formatDate(dd, mm, yyyy) {
	return mm + '/' + dd + '/' + yyyy;
}

// Test formatDate()
let myDateString = formatDate(21, 10, 1999);
console.log(myDateString);

console.log();

// Question - 4: printSport()
console.log('Question - 4: printSport()');

// Prints Major League Abbreviation's Full Form
function printSport(abbreviation) {
	switch(abbreviation.toUpperCase()) {
		case 'NBA':
			console.log('National Basketball Association');
			break;
		case 'NFL':
			console.log('National Football League');
			break;
		case 'MLS':
			console.log('Major League Soccer');
			break;
		default:
			console.log('I don\'t know that league');
	}
}

// Test printSport()
printSport('nfl');
printSport('nba');
printSport('mls');
printSport('msl');

console.log();

// Question - 5: typeOfNumber()
console.log('Question - 5: typeOfNumber()');

// Returns Whether Number Is Positive, Negative Or Zero
function typeOfNumber(num) {
	if (num > 0) {
		return "Positive";
	} else if (num < 0) {
		return "Negative";
	} else {
		return "Zero";
	}
}

// Test typeOfNumber()
let myNumType = typeOfNumber(16);
console.log(myNumType);