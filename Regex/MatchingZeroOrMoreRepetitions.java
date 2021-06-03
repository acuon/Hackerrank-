/*
//https://www.hackerrank.com/challenges/matching-zero-or-more-repetitions/problem

w* : It will match the character w 0 or more times.
[xyz]* : It will match the characters x, y or z 0 or more times.
\d* : It will match any digit 0 or more times.


Task

You have a test string S.
Your task is to write a regex that will match S using the following conditions:

  -S should begin with 2 or more digits.
  -After that, S should have 0 or more lowercase letters.
  -S should end with 0 or more uppercase letters

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{2,}[a-z]*[A-Z]*$"); // Use \\ instead of using \ 
    
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}
