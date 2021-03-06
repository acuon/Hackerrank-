/*
https://www.hackerrank.com/challenges/js10-try-catch-and-finally/problem
*/

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function reverseString(s) {
    
    try {
        console.log(s.split("").reverse().join(""));
    } catch(e) {
        //e will print all the extra information along with the error message
        console.log(e.message); //e.message will only show the error message
        console.log(s);
    }
    
}


function main() {
    const s = eval(readLine());
    
    reverseString(s);
}
