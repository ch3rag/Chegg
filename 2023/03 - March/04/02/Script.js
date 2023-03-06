/*******************************************************************************
* Problem 1: replace all internal whitespace in a string value with dashes ('-'),
* and make it UPPERCASE.
*
* We want to be able to convert a string to Upper Kebab Case style, so that it
* contains no spaces, tabs, or dots, and all letters are upper case.
*
* The kebab() function should work like this:
*
* kebab('ABC') --> returns 'ABC' (all Upper Case, the string is unchanged)
* kebab(' ABC ') --> returns 'ABC' (all Upper Case, leading/trailing whitespace removed)
* kebab('abc') --> returns 'ABC' (the string was converted to upper case)
* kebab('A BC') --> returns 'A-BC' (uppercase, single space replaced with -)
* kebab('A BC') --> returns 'A-BC' (uppercase, single space replaced with -)
* kebab('A BC') --> returns 'A-BC' (uppercase, multiple spaces replaced with -)
* kebab('A.BC') --> returns 'A-BC' (uppercase, period replaced with -)
* kebab('A.. BC') --> returns 'A-BC' (uppercase, periods/spaces replaced with -)
*
* @param {string} value - a string to be converted
* @return {string}
******************************************************************************/

function kebab(value) {
	// Trim The Ends, Convert To UpperCase And Replace All White Spaces And Dots With Hyphens
	return value.trim().toUpperCase().replaceAll(/[\s\.]+/g, '-');
}

// Test Problem - 1
console.log(`Kebab("ABC") = ${kebab('ABC')}`);
console.log(`Kebab(" ABC ") = ${kebab(' ABC ')}`);
console.log(`Kebab("abc") = ${kebab('abc')}`);
console.log(`Kebab("A BC") = ${kebab('A BC')}`);
console.log(`Kebab("A B C") = ${kebab('A B C')}`);
console.log(`Kebab("A  BC") = ${kebab('A  BC')}`);
console.log(`Kebab("A.BC") = ${kebab('A.BC')}`);
console.log(`Kebab("A.. BC") = ${kebab('A.. BC')}`);
console.log(`Kebab("A.. B.. C") = ${kebab('A.. B.. C')}`);
console.log("-----------------------------------");
/*******************************************************************************
* Problem 2: create an HTML <img> element for the given url and alt text.
*
* In HTML, we use markup syntax to indicate how browsers should format elements
* of a web page. For example, here is a URL to a cat picture:
*
* https://images.unsplash.com/photo-1513451713350-dee890297c4a?width=500
*
* Try navigating to it in your browser. In order for a web page to know how to
* interpret this URL (e.g., should we show the text of the URL itself, or use
* it to load an image?), we have to use special markup. The <img> element
* is how we specify that a URL is to be interpreted as an image, see:
* https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img
*
* Here is how we might use HTML to markup this image:
*
* <img src="https://images.unsplash.com/photo-1513451713350-dee890297c4a?width=500" alt="Cat with ears down">
*
* Our <img> has two attributes:
*
* - src: the URL to use when downloading this image's data
* - alt: the alternative text to display in non-visual browsing environments (e.g., screen readers)
*
* Write the createImg() function to accept a URL and alt text, and return the
* properly formatted img element. For example:
*
* createImg('https://images.unsplash.com/photo-1513451713350-dee890297c4a?width=500', 'Cat with ears down')
*
* should return the following string of HTML:
*
* '<img src="https://images.unsplash.com/photo-1513451713350-dee890297c4a?width=500" alt="Cat with ears down">'
*
* An <img> can also optionally contain a width attribute, for example:
*
* <img src="https://images.unsplash.com/photo-1513451713350-dee890297c4a?width=500" alt="Cat with ears down" width="300">
*
* In this case, the <img> element should use 300 pixels for its width. Therefore,
* your createImg() function should also accept a third argument, width:
*
* // No width given
* createImg('https://images.unsplash.com/photo-1513451713350-dee890297c4a?width=500', 'Cat with ears down')
* // Width of 300 given
* createImg('https://images.unsplash.com/photo-1513451713350-dee890297c4a?width=500', 'Cat with ears down', 300)
*
* The returned <img> HTML string should be formatted as follows:
*
* - Remove leading/trailing whitespace from src and alt values before you use them
* - The src and alt attribute values should be wrapped in double-quotes (e.g., src="...")
* - There should be a single space between the end of one attribute and start of the next (e.g., src="..." alt="...")
* - The width attribute should only be added if a valid integer value (number or string) is passed
* for the third argument. Otherwise ignore it.
*
* @param {string} src - the src URL for the img
* @param {string} alt - the alt text to use for the img
* @param {string|number} width - (optional) the width of the img. Must be a valid integer
* @returns {string}
******************************************************************************/
function createImg(src, alt, width) {
	src = src.trim();
	alt = alt.trim();
	var widthStr = '';
	if (width !== null && Number.isInteger(width)) {
		var widthStr = ' width="' + width + '"';
	}
	// return the image tag
	return '<img src="'+src+'" alt="'+alt+'"'+widthStr+'>';
}

// Test Problem - 2
console.log("createImg('https://images.unsplash.com/photo-1513451713350-dee890297c4a?width=500', 'Cat with ears down')");
console.log(createImg('https://images.unsplash.com/photo-1513451713350-dee890297c4a?width=500', 'Cat with ears down'));
console.log();
console.log("createImg('https://images.unsplash.com/photo-1513451713350-dee890297c4a?width=500', 'Cat with ears down', 300)");
console.log(createImg('https://images.unsplash.com/photo-1513451713350-dee890297c4a?width=500', 'Cat with ears down', 300));
console.log("-----------------------------------");
/*******************************************************************************
* Problem 3: extract Date from date string
*
* A date string is expected to be formatted as follows:
*
* YYYY-DD-MM
*
* Meaning, Year (4 digits), Day (2 digits), Month (2 digits).
*
* January 1, 2021 would therefore be the following date string:
*
* 2021-01-01
*
* Similarly, September 29, 2021 would be:
*
* 2021-29-09
*
* Write a function, parseDateString() that accepts a date string of the format
* specified above, and returns a Date object, set to the correct day.
*
* To help developers using your function, you are asked to provide detailed error
* messages when the date string is formatted incorrectly. We will use the throw
* statement to throw an error when a particular value is not what we expect, see:
* https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/throw
*
* For example: parseDateString('01-01-01') should fail, because the year is
* not 4 digits. Similarly, parseDateString('2021-1-01') should fail because
* the day is not 2 digits, and parseDateString('2021-01-1') should fail because
* the month is not 2 digits. Also, a totally invalid date string should also
* cause an exception to be thrown, for example parseDateString(null) or
* parseDateString("this is totally wrong").
*
* @param {string} value - a date string
* @returns {Date}
******************************************************************************/

function parseDateString(value) {
	if (typeof value === 'string') {
		// Split Date String
		var fields = value.split('-');
		// Check If Their Are Exactly 3 Fields
		if (fields.length === 3) {
			// Validate Each Field
			// Check The Lengths
			if (fields[0].length != 4 || fields[1].length != 2 || fields[2].length != 2) {
				throw "Error: Year must be 4 digits long, Day and Month must be 2 digits long.";
			}

			// Parse To Ints
			var year = parseInt(fields[0]);
			var day = parseInt(fields[1]);
			var month = parseInt(fields[2]);

			// Check For NaNs
			if (isNaN(year) || isNaN(month) || isNaN(day)) {
				throw "Error: Year, Day and Month must be integer numbers.";
			}
			
			// Check Month Validity
			if (month < 1 || month > 12) {
				throw "Error: Invalid Month.";
			}

			// Day In Each Month
			var monthLength = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
			// Leap Years
			if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
    			monthLength[1] = 29;
			}

			// Check Day
			if (day > monthLength[month - 1] || day < 1) {
				throw "Error: Invalid Day."
			}

			return new Date(`${fields[0]}-${fields[2]}-${fields[1]}`);
		} else {
			throw "Error: Malformed date string."
		}
	} else {
		throw "Error: parseDateString accepts only strings."
	}
}

// Test Problem - 3
console.log(`parseDateString("2021-01-01") = ${parseDateString("2021-01-01")}`);

try {
	console.log();
	console.log('parseDateString("this is totally wrong")');
	parseDateString("this is totally wrong");
} catch (e) {
	console.log("\t" + e);
}

try {
	console.log();
	console.log('parseDateString(null)');
	parseDateString(null);
} catch (e) {
	console.log("\t" + e);
}

try {
	console.log();
	console.log('parseDateString("ABCD-EF-IJ")');
	parseDateString("ABCD-EF-IJ");
} catch (e) {
	console.log("\t" + e);
}

try {
	console.log();
	console.log('parseDateString("2022-99-99")');
	console.log(parseDateString("2022-99-99"));
} catch (e) {
	console.log("\t" + e);
}

console.log(`parseDateString("2020-29-02") = ${parseDateString("2020-29-02")}`);
console.log("-----------------------------------");
/*******************************************************************************
* Problem 4: convert Date to date string with specified format.
*
* As above, a date string is expected to be formatted as follows:
*
* YYYY-DD-MM
*
* Meaning, Year (4 digits), Day (2 digits), Month (2 digits).
*
* Write a function, toDateString() that accepts a Date object, and returns a
* date string formatted according to the specification above. Make sure your
* day and month values are padded with a leading '0' if necessary (e.g., 03 vs. 3).
*
* NOTE: it should be possible to use parseDateString() from the previous question
* and toDateString() to reverse each other. For example:
*
* toDateString(parseDateString('2021-29-01')) should return '2021-29-01'
*
* @param {Date} value - a date
* @returns {string}
******************************************************************************/
function toDateString(value) {
	if (value instanceof Date) {
		// Get Year, Month, Day
		var year = value.getFullYear();
		var month = (value.getMonth() + 1).toString().padStart(2, '0');
		var day = value.getDate().toString().padStart(2, '0');
		// Return String
		return `${year}-${day}-${month}`;
	} else {
		// Throw Error
		throw "Error: toDateString accepts only Date objects.";
	}
}

// Test Problem - 4
try {
	console.log("toDateString(null)");
	toDateString(null);
} catch (e) {
	console.log("\t" + e);
}
console.log(`toDateString(new Date()) = ${toDateString(new Date())}`)
console.log(`toDateString(new Date(1997, 7, 29)) = ${toDateString(new Date(1997, 7, 29))}`)
console.log(`parseDateString(toDateString(new Date(1997, 7, 29))) = ${parseDateString(toDateString(new Date(1997, 7, 29)))}`)
console.log("-----------------------------------");
/*******************************************************************************
* Problem 5: validate a coordinate
*
* Coordinates are defined as numeric, decimal values of Latitude and Longitude.
* A example, the Seneca College Newnham campus is located at:
*
* Latitude: 43.7955 (positive number means North)
* Longitude: -79.3496 (negative number means West)
*
* Write a function, validateCoord(), which accepts a latitude and longitude,
* and returns true if they are both valid, or false if one or both are invalid.
*
* Valid Latitude values are decimal numbers between -90 and 90.
*
* Valid Longitude values are decimal numbers between -180 and 180.
*
* @param {number} lat - the latitude
* @param {number} lng - the longitude
* @returns {boolean}
******************************************************************************/
function validateCoord(lat, lng) {
	return lat >= -90.0 && lat <= 90 && lng >= -180.0 && lng <= 180;
}

// Test Part - 5
console.log(`validateCoord(43.7955, -79.3496) = ${validateCoord(43.7955, -79.3496)}`);
console.log(`validateCoord(26.8467, 80.9462) = ${validateCoord(26.8467, 80.9462)}`);
console.log(`validateCoord(-92.990, 190.23) = ${validateCoord(-92.990, 190.23)}`);
console.log("-----------------------------------");
/*******************************************************************************
* Problem 6, Part 1: format a coordinate as a string
*
* As above, coordinates are defined as numeric, decimal values of Latitude and Longitude.
* Write a function, formatCoord(), which accepts a latitude and longitude,
* and returns a string formatted as follows:
*
* (lat, lng)
*
* For example:
*
* formatCoord(43.7955, -79.3496) should return the string '43.7955,-79.3496'.
*
* An optional third param, includeBrackets, determines whether or not to include
* parenthesis around the formatted coordinate:
*
* formatCoord(43.7955, -79.3496) should return the string '43.7955,-79.3496'.
* formatCoord(43.7955, -79.3496, true) should return the string '[43.7955,-79.3496]'.
*
* Use your validateCoord() function from Problem 5 to determine if the coordinate
* is valid before you attempt to format it. If the coordinate is not valid, throw
* an exception.
*
* @param {number} lat - the latitude
* @param {number} lng - the longitude
* @param {boolean} includeBrackets - (optional) whether to include the square brackets
* @returns {string}
******************************************************************************/
function formatCoord(lat, lng, includeBrackets) {
	if (validateCoord(lat, lng)) {
		if (includeBrackets) {
			return `[${lat},${lng}]`;
		} else {
			return `${lat},${lng}`;
		}
	} else {
		throw "Error: Invalid coordinates.";
	}
}

// Test Problem 6 (A)
try {
	console.log('formatCoord(-92.990, 190.23)');
	formatCoord(-92.990, 190.23);
} catch (e) {
	console.log("\t" + e);
}

console.log(`formatCoord(43.7955, -79.3496) = ${formatCoord(43.7955, -79.3496)}`);
console.log(`formatCoord(43.7955, -79.3496, true) = ${formatCoord(43.7955, -79.3496, true)}`);
console.log("-----------------------------------");
/*******************************************************************************
* Problem 6, Part 2: format any number of coordinates as a string
*
* Similar to Problem 6 Part 1, you are asked to format lat, lng coordinates
* into a string. However, where formatCoord() formats a single lat, lng pair,
* the formatCoords() function (note the `s` suffix) is able to format any
* number of lag, lng pairs.
*
* For example:
*
* formatCoords(43.7955, -79.3496) should return '[[43.7955,-79.3496]]'
* formatCoords(43.7955, -79.3496, 43.7953, -79.3491) should return '[[43.7955,-79.3496], [43.7953,-79.3491]]'
*
* In your solution for formatCoords, use the formatCoord function you wrote above.
*
* The formatCoords() function can take any number of arguments, but they must all be numbers,
* there must be an even number of them, and all lat, lng pairs should be valid.
*
* If any of these conditions are not met, throw an exception.
*
* @param {number} arguments - any number of arguments can be passed, but there must be an even number
* @returns {string}
******************************************************************************/
function formatCoords(...values) {
	result = '[';
	if (values.length % 2 == 0) {
		for (var i = 0; i < values.length; i += 2) {
			var lat = values[i];
			var lng = values[i + 1];
			if (isNaN(lat) || isNaN(lng)) {
				throw "Error: All Latitude and Longitude pairs must be numbers.";
			}
			result += formatCoord(lat, lng, true);
		}
	} else {
		throw "Error: formatCoords only accept even number of arguments";
	}

	return result += ']';
}


// Test Problem - 6 (B)
try {
	console.log("formatCoords(43.7955, -79.3496, 43.7953)");
	formatCoords(43.7955, -79.3496, 43.7953);
} catch (e) {
	console.log("\t" + e);
}

try {
	console.log("formatCoords(43.7955, -79.3496, 43.7953, 'ABC')");
	formatCoords(43.7955, -79.3496, 43.7953, "ABC");
} catch (e) {
	console.log("\t" + e);
}

console.log(`formatCoords(43.7955, -79.3496, 43.7953, -79.3491) = ${formatCoords(43.7955, -79.3496, 43.7953, -79.3491)}`);
console.log(`formatCoords(43.7955, -79.3496) = ${formatCoords(43.7955, -79.3496)}`);
console.log("-----------------------------------");
/*****************************************************************************/