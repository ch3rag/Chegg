"use strict";

// Declare Vars
var highestScore = -Infinity;
var lowestScore = Infinity;
var total = 0;
var numScores = 0;

// Elements
var btnAdd = document.getElementById('btnAdd');
var btnResults = document.getElementById('btnResult');
var txtInput = document.getElementById('txtInput');
var lblError = document.getElementById('lblError');
var resultsDiv= document.getElementById('results');

// Assign Listeners To Add Button
btnAdd.addEventListener('click', () => {
	// Fetch Entered Value
	var input = parseInt(txtInput.value);
	// Check If Value Is Valid
	if (isNaN(input) || input < 0 || input > 100) {
		// Display Error Label
		lblError.style.visibility = 'visible';
	} else {
		// Valid Input
		// Hide Error Label
		lblError.style.visibility = 'hidden';

		// Add Input To Total
		total += input;

		// Update Highest And Lowest Scores
		if (input > highestScore) {
			highestScore = input;
		}

		if (input < lowestScore) {
			lowestScore = input;
		}

		// Increment Number Of Scores
		numScores++;
	}
	// Clear Text Box
	txtInput.value = '';
});

// Assign Listeners To Result Button
btnResults.addEventListener('click', () => {
	if (numScores > 0) {
		// Display Stats
		var results = 'Results <br />Number Of Scores: ' + numScores + '<br />Average Score: ' + total / numScores +
					  '<br />Lowest Score: ' + lowestScore + '<br />Highest Score: ' + highestScore;
		resultsDiv.innerHTML = results;
	} else {
		// No Scores Entered Yet
		// Display Appropriate Message
		resultsDiv.innerText = 'No Scores Entered.';
	}
});
