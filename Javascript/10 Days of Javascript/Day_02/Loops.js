/*
https://www.hackerrank.com/challenges/js10-loops/problem?h_r=next-challenge&h_v=zen
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


//function 1
function vowelsAndConsonants(s) {
    var str = "";
    for(var i=0; i<s.length; i++) {
        if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u') {
            console.log(s[i]);
        } else {
            str += s[i]+"\n";
        }
    }
    console.log(str);
}

//function 2
function vowelsAndConsonants(s) {
    const vowels = 'aeiou';
    var consonants = '';
    
    for(var i = 0; i < s.length; i++) {
       if (vowels.includes(s[i])) {
           console.log(s[i]);
       }
       else {
           consonants += s[i] + '\n';
       }
    }
    
    console.log(consonants.trim());
}




function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}
