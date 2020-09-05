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

function getSumByIndex(arr, { row, col }) {
    let sum = 0;

    for (let i = 0; i <= 2; i++) {
        sum += arr[row][col + i];
        sum += arr[row + 2][col + i];
    }

    return sum + arr[row + 1][col + 1];
}

// Complete the hourglassSum function below.
function hourglassSum(arr) {
    const startingIndices = [];

    for (let i = 0; i <= 3; i++) {
        for (let j = 0; j <= 3; j++) {
            startingIndices.push({ row: i, col: j })
        }
    }

    let max = 0;

    for (let i = 0; i < startingIndices.length; i++) {
        if (i === 0) {
            max = getSumByIndex(arr, startingIndices[i]);
            continue;
        }
        const sum = getSumByIndex(arr, startingIndices[i]);
        if (sum > max) {
            max = sum;
        }
    }

    return max;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    let arr = Array(6);

    for (let i = 0; i < 6; i++) {
        arr[i] = readLine().split(' ').map(arrTemp => parseInt(arrTemp, 10));
    }

    let result = hourglassSum(arr);

    ws.write(result + "\n");

    ws.end();
}

module.exports = hourglassSum;
