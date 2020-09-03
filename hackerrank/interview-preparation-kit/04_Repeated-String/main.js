'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}



// Complete the repeatedString function below.
function repeatedString(s, n) {
    function getACount(s) {
      return (s.match(/a/g) || []).length;
    }

    const repeatingCount = parseInt(n / s.length);
    const remainingCount = n % s.length;

    const aCountInString = getACount(s)
    const aCountInRepeating = repeatingCount * aCountInString;
    const aCountInRemaining = getACount(s.substring(0, remainingCount));

    return aCountInRepeating + aCountInRemaining;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const s = readLine();

    const n = parseInt(readLine(), 10);

    let result = repeatedString(s, n);

    ws.write(result + "\n");

    ws.end();
}
