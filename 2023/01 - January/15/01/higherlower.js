// Ask User What Should Be Maximum Number
let max = -1;
while (max < 1) {
	let userInput = prompt("Enter the value of maximum number:");
	if (userInput.length > 0 && !isNaN(userInput)) {
		// User Input Is A Valid Number
		max = Math.round(parseFloat(userInput));
		// Check If Max Is Positive
		if (max < 1) {
			alert('The maximum number should a positive number!')
		}
	} else {
		// Input Is Not A Number
		alert('That is not a number!');
	}
}

// Update Max Value In HTML
document.getElementById('max').innerText = max;

// Generate A Random Number B/W 1 To MAX
let num = Math.floor(Math.random() * max) + 1;

// Debug Purpose!
console.log(num);

// Fetch The Message Element
let messageElem = document.getElementById("message");
// Guesses Array
let guesses = [];

// Plays The Actual Guess Game
function do_guess() {
	// Fetch The Value Of Guess TextBox
	let userInput = document.getElementById("guess").value;

	// Debug!
	console.log(userInput);

	// Check If Input Is Valid Number
	if (isNaN(userInput) || userInput.length == 0) {
		messageElem.innerHTML = "That is not a number!";
	} else {
		// Parse The Input
		guess = Math.round(parseFloat(userInput));

		// Compare With The NUM
		if (guesses.includes(guess)) {
			// User Already Guessed This Number
			messageElem.innerHTML = 'You have already guessed that number.';
		} else if (guess == num) {
			// User Has Guessed The Correct Number
			guesses.push(guess);
			// Display Number Of Tries And Array Of Guesses
			messageElem.innerHTML = "You got it! It took you " + guesses.length
				+ " tries and your guesses were " + guesses.join(', ') + ".";
		} else if (guess > max || guess < 1) {
			// Guess Is Not In Range
			messageElem.innerHTML = "That number is not in range, try again.";
		} else if (guess > num) {
			// Guess Is More Than NUM
			messageElem.innerHTML = "No, try a lower number.";
			guesses.push(guess);
		} else {
			// Guess Is Less Than NUM
			messageElem.innerHTML = "No, try a higher number.";
			guesses.push(guess);
		}
	}
}
