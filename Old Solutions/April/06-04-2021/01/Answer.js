function daysBetween(start, end) {


    const startSplit = splitDate(start);

    const startMonth = getMonth(startSplit[0]);
    const startDate = parseInt(startSplit[1]);
    const startYear = parseInt(startSplit[2]);

    const endSplit = splitDate(end);

    const endMonth = getMonth(endSplit[0]);
    const endDate = parseInt(endSplit[1]);
    const endYear = parseInt(endSplit[2]);

    const monthDays = [31, 28, 31,
        30, 31, 30,
        31, 31, 30,
        31, 30, 31
    ];

    let startNumOfDays = startDate + startYear * 365;


    for (let i = 0; i <= startMonth; i++) {
        startNumOfDays += monthDays[i];
    }

    startNumOfDays += countLeapYears(startMonth, startYear);

    let endNumOfDays = endDate + endYear * 365;


    for (let i = 0; i <= endMonth; i++) {
        endNumOfDays += monthDays[i];
    }

    endNumOfDays += countLeapYears(endMonth, endYear);

    return endNumOfDays - startNumOfDays;
}

// Helper Functions
// Converts "June 14, 2021" To ["June", "14", "2021"]
function splitDate(date) {
    let temp = '';
    let parts = new Array(3);
    let counter = 0;
    for (let i = 0; i < date.length; i++) {
        if ((date[i] == ' ' || date[i] == ',') && temp !== '') {
            parts[counter++] = temp;
            temp = '';
        } else {
            temp += date[i];
        }
    }
    parts[counter] = temp;
    return parts;
}

// Converts "June" To 5
// Converts "January" To 0
// Converts "December" To 11 & So On.
function getMonth(month) {
    var months = [
        'January',
        'February',
        'March',
        'April',
        'May',
        'June',
        'July',
        'August',
        'September',
        'October',
        'November',
        'December'
    ];
    for (let i = 0; i < months.length; i++) {
        if (months[i] === month) {
            return i;
        }
    }
}

function countLeapYears(month, year) {
    // If It Isn't Past February Don't Consider Current Year
    if (month <= 2) {
        year--;
    }

    // An Year Is A Leap Year 
    // If Is A Multiple Of 4 & Multiple Of 400
    // And Not A Multiple of 100
    return parseInt(year / 4 + year / 400 - year / 100);
}

console.log(daysBetween("June 14, 2021", "June 20, 2021"));
console.log(daysBetween("December 29, 2021", "January 1, 2022"));
console.log(daysBetween("July 20, 2021", "July 30, 2021"));