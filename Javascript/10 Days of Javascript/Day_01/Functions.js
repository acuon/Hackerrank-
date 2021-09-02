/*
https://www.hackerrank.com/challenges/js10-function/problem
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


//using Recursion
// function factorial(n) {
//     if(n==0) return 1;
//     return n*factorial(n-1);
// }

//using for loop
function factorial(n) {
    var fact = 1;
    for(var i=n; i>=1; i--) {
        fact *= i;
    }
    return fact;
}


function main() {
    const n = +(readLine());
    
    console.log(factorial(n));
}
