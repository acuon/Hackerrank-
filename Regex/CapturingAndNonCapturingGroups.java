/*
//https://www.hackerrank.com/challenges/capturing-non-capturing-groups/problem


(?: ) can be used to create a non-capturing group. It is useful if we do not need the group to capture its match.

Task

You have a test String S.
Your task is to write a regex which will match S with the following condition:
  -S should have or more consecutive repetitions of ok.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(ok){3,}");
        //tester.checker("(ok){3,}?");
        //tester.checker("(?:ok){3,}");
    
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
