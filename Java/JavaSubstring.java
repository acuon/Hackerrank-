/*
Given a string, s, and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end-1.

Sample Input

Helloworld
3 7

Sample Output

lowo
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));    }
}
