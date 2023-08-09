// Part - 1
// Input A Room Number From The User
var input = prompt("Please Enter Your Room Number:");
// Parse Input To Integer
var roomNumber = Number(input);
// Keep Taking Input From The User Until
// A Valid Number is Entered
while (isNaN(roomNumber)) {
    // Take Input
    var input = prompt("Room Numbers Cannot Contain Letters. Please Re-Enter The Room Number:");
    // Parse Input To Integer
    roomNumber = Number(input);
}

// Display Room Number To The User
alert('Your Room Number is: ' + roomNumber);