/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.

Sample Input

madam

Sample Output

Yes
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /*
        
        String B = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(result) ? "Yes" : "No");*/
        int len_string=A.length();
       // System.out.println(len_string);
       /*
       string b =""
        i=4
        m
        char_string=
        result=m
        i=3
        char_string=a
        rresult=ma
       */
        String result="";
        for(int i=len_string-1;i>=0;i--){
           // char char_string=A.charAt(i);
        
            String char_string=A.substring(i,i+1);
            result=result+char_string;
            
        }
        //System.out.println(result);
        
        System.out.println(A.equals(result) ? "Yes" : "No");
    }
}



