/*
https://www.hackerrank.com/challenges/js10-arrays/problem
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

function getSecondLargest(nums) {
    var max = nums[0], smax = nums[0];
    
    for(let i of nums) {
        if(i>max) {
            smax = max;
            max = i;
            continue;
        }
        if(i>smax && i<max) {
            smax = i;
        }
    }
    
    return smax;
    
}


function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);
    
    console.log(getSecondLargest(nums));
}
