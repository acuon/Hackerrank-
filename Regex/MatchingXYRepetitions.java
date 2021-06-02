/*
w{3,5} : It will match the character w 3, 4 or 5 times.
[xyz]{5,} : It will match the character x, y or z 5 or more times.
\d{1, 4} : It will match any digits 1, 2, 3, or 4 times.

Task

You have a test string S.
Your task is to write a regex that will match S using the following conditions:

  S should begin with 1 or 2 digits.
  After that, S should have 3 or more letters (both lowercase and uppercase).
  Then S should end with up to 3 . symbol(s). You can end with 0 to 3 . symbol(s), inclusively.
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{1,2}[a-zA-Z]{3,}\\.{0,3}$"); // Use \\ instead of using \ 
    
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
