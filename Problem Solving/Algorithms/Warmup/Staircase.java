//https://www.hackerrank.com/challenges/staircase/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static void staircase(int n) {
    
    
    for ( int i = 0; i<n; i++) {
        for ( int j = 1; j<=n; j++) {
            System.out.printf((i+j)<n?" ":"#");
            /*if ((i+j)<n) {
                System.out.printf(" ");
            }
            else {
                System.out.printf("#");
            }*/
            
        }
        System.out.println();
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
