// Question - 2
// Create A Array InputTable With Numbers 1 To 10 Inclusive
const inputTable = Array(10).fill().map((_, i) => i + 1);
console.log(`Input Table: ${inputTable}\n`);

// 3 - A
// Set Of Multiples Of 5 Between 1 And 51
const fiveTable = inputTable.map(e => e * 5);
console.log(`Five Table: ${fiveTable}`);

// 3 - B
// Set Of Multiples Of 13 Between 1 And 131
const thirteenTable = inputTable.map(e => e * 13);
console.log(`Thirteen Table: ${thirteenTable}`);

// 3 - C
// Set Of Squares Of Input Table
const squaresTable = inputTable.map(e => e * e);
console.log(`Squares Table: ${squaresTable}\n`);

// 4. Get The Odd Multiples Of 5 Between 1 And 100
const fiveOddMultiples = Array(Math.round(50 / 5)).fill().map((_, i) => i * 2 + 1).map(e => e * 5);
console.log(`Five Odd Multiples: ${fiveOddMultiples}`);

// 5. Get The Sum Of Even Multiples Of 7 Between 1 And 100
const sumSevenEvenMuliples = Array(Math.round(50 / 7)).fill().map((_, i) => (i + 1) * 2).map(e => e * 7).reduce((sum, e) => sum + e, 0);
console.log(`Sum Of Seven Even Multiples: ${sumSevenEvenMuliples}\n`);

// 6. Currying
function cylinderVolume(r) {
    return function (h) {
        return 3.14 * r * r * h;
    }
}

console.log(`Calling CyclinderVolume() With R = 5 & H = 10: ${cylinderVolume(5)(10)}\n`)

// 7. Closure To Create A HTML Wrapper
const makeTag = function(beginTag, endTag) {
    return function(textContent) {
        return beginTag + textContent + endTag;
    }
}

// Let's See It In Action
const tableWarpper = makeTag('<table>', '</table>');
const rowWrapper = makeTag('<tr>', '</tr>');
const cellWrapper = makeTag('<td>', '</td>');
const content = 'Hello World!';
const table = tableWarpper(rowWrapper(cellWrapper(content)));
console.log(`Table: ${table}\n`);
// 8. Did Not Understand!
// 9. Generic Functions For 3, 4
// 9. A) Generic 3 A/B/C
const generateTable = (x) => Array(10).fill().map((_, i) => (i + 1) * x)

console.log(`Table Of 7: ${generateTable(7)}`);
console.log(`Table Of 12: ${generateTable(12)}`);
console.log(`Table Of 2: ${generateTable(2)}`);
console.log(`Table Of 15: ${generateTable(15)}\n`);


// 9. B) Generic 4
const Multiples = {ODD: 0, EVEN: 1}
const getMultiples = (type, x) => Array(Math.round(50 / x)).fill().map((_, i) => ((i * 2 + type) + 1)).map(e => e * x);

console.log(`Even Multiples Of 6: ${getMultiples(Multiples.EVEN, 6)}`);
console.log(`Even Multiples Of 12: ${getMultiples(Multiples.EVEN, 12)}`);
console.log(`Odd Multiples Of 9: ${getMultiples(Multiples.ODD, 9)}`);
console.log(`Odd Multiples Of 4: ${getMultiples(Multiples.ODD, 4)}`);