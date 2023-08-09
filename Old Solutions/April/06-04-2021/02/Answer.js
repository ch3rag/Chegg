// Function 1A

function removeDuplicates(arr) {
    let unique = [];
    for (let i = 0; i < arr.length; i++) {
        let found = false;
        for (let j = 0; j < arr.length; j++) {
            if (arr[j] == arr[i] && j !== i) {
                found = true;
                break;
            }
        }
        if (!found) {
            unique = [...unique, arr[i]]; // Using Spread Operator
        }
    }
    return unique;
}

// Function 2A

function AverageMarks(marks) {
    let sumFailing = 0,
        countFailing = 0;
    let sumPassing = 0,
        countPassing = 0;

    for (let i = 0; i < marks.length; i++) {
        if (marks[i] < 50) {
            sumFailing += marks[i];
            countFailing++;
        } else {
            sumPassing += marks[i];
            countPassing++;
        }
    }

    let averages = new Array(2);

    if (countFailing == 0) {
        averages[0] = -1;
    } else {
        averages[0] = (Math.round(sumFailing / countFailing));
    }

    if (countPassing == 0) {
        averages[1] = -1;
    } else {
        averages[1] = Math.round(sumPassing / countPassing);
    }

    return averages;
}


console.log(removeDuplicates([33]));
console.log(removeDuplicates([33, 33, 1, 4]));
console.log(removeDuplicates([33, 33, 1, 4, 1]));

console.log(AverageMarks([63, 65, 33]));
console.log(AverageMarks([63, 62, 100, 100]));
console.log(AverageMarks([33, 42, 20, 10]));