var prevCalc = 0;
var calc = "";

// Applying separation of concerns
window.onload = function() {
	// Get the form
	var form = document.getElementById('frmCalc');
	// Add Event Handlers To Each Number Button
	form["btn1"].onclick = showNum;
	form["btn2"].onclick = showNum;
	form["btn3"].onclick = showNum;
	form["btn4"].onclick = showNum;
	form["btn5"].onclick = showNum;
	form["btn6"].onclick = showNum;
	form["btn7"].onclick = showNum;
	form["btn8"].onclick = showNum;
	form["btn9"].onclick = showNum;
	form["btn0"].onclick = showNum;
	form["btnDecimal"].onclick = showNum;

	// Add Event Handler To Operation Buttons
	form["btnPlus"].onclick = add;
	form["btnMinus"].onclick = subtract;
	form["btnDecrement"].onclick = decrement;
	form["btnSqrt"].onclick = sqrt;
	form["btnReset"].onclick = clear;
	form["btnCalc"].onclick = calculate;

	
}
// The following function displays a number in the textfield when a number is clicked.
// Note that it keeps concatenating numbers which are clicked. 
function showNum() {
	document.frmCalc.txtNumber.value += this.value;
}

// The following function decreases the value of displayed number by 1.
// isNaN method checks whether the value passed to the method is a number or not.
function decrement() {
	var num = parseFloat(document.frmCalc.txtNumber.value);
	if (!(isNaN(num))) {
		num--;
		document.frmCalc.txtNumber.value = num;
	}
}

// The following function is called when "Add" button is clicked.
// Note that it also changes the values of the global variables.
function add() {
	var num = parseFloat(document.frmCalc.txtNumber.value);
	if (!(isNaN(num))) {
		prevCalc = num;
		document.frmCalc.txtNumber.value = "";
		calc = "Add";
	}
}

function subtract() {
	var num = parseFloat(document.frmCalc.txtNumber.value);
	if (!(isNaN(num))) {
		prevCalc = num;
		document.frmCalc.txtNumber.value = "";
		calc = "Subtract";
	}
}
function sqrt() {
	var num = parseFloat(document.frmCalc.txtNumber.value);
	if (!(isNaN(num))) {
		var sqrtvalue = Math.sqrt(num);
		document.frmCalc.txtNumber.value = sqrtvalue;
	}
}

//The following function is called when "Calculate" button is clicked.
//Note that this function is dependent on the value of global variable.        
function calculate() {
	var num = parseFloat(document.frmCalc.txtNumber.value);
	var total = 0;
	if (!(isNaN(num))) {
		if (calc == "Add") {
			total = prevCalc + num;
			document.frmCalc.txtNumber.value = total;
		} else if (calc == "Multiplication") {
			total = prevCalc * num;
			document.frmCalc.txtNumber.value = total;
		} else if (calc == "Subtract") {
			total = prevCalc - num;
			document.frmCalc.txtNumber.value = total;
		}
	}
}

function clear() {
	document.frmCalc.txtNumber.value = "";
	prevCalc = 0;
	calc = "";
}