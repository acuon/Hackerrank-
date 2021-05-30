/*
//https://www.hackerrank.com/challenges/excluding-specific-characters/problem

You have a test string S.
Your task is to write a regex that will match S with the following conditions:

  -S must be of length 6.
  -First character should not be a digit (1,2,3,4,5,6,7,8,9 or 0).
  -Second character should not be a lowercase vowel (a,e,i,o or u).
  -Third character should not be b, c, D or F.
  -Fourth character should not be a whitespace character ( \r, \n, \t, \f or <space> ).
  -Fifth character should not be a uppercase vowel (A,E,I,O or U).
  -Sixth character should not be a . or , symbol.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^[^\\d][^aeiou][^bcDF][^\\W][^AEIOU][^.,]$"); // Use \\ instead of using \ 
        //tester.checker("^\\D[^aeiou][^bcDF][^\\W][^AEIOU][^.,]$");
    
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
