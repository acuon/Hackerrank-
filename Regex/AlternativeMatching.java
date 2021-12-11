/*
//https://www.hackerrank.com/challenges/alternative-matching/problem



Alternations, denoted by the | character, match a single item out of several possible items separated by the vertical bar.
When used inside a character class, it will match characters; when used inside a group, it will match entire expressions
(i.e., everything to the left or everything to the right of the vertical bar). We must use parentheses to limit the use of alternations.


For example:
    (Bob|Kevin|Stuart) will match either Bob or Kevin or Stuart.
    ([a-f]|[A-F]) will match any of the following characters: a, b, c, d, e, f, A, B, C, D, E, or F.

Task

Given a test string, S, write a RegEx that matches S under the following conditions:
    -S must start with Mr., Mrs., Ms., Dr. or Er..
    -The rest of the string must contain only one or more English alphabetic letters (upper and lowercase).

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^(Mr\\.|Mrs\\.|Ms\\.|Dr\\.|Er\\.)[a-zA-Z]+$"); // dot(.) is a special operator
    
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
