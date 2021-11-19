//https://www.hackerrank.com/challenges/save-the-prisoner/problem

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

    public static int saveThePrisoner(int n, int m, int s) {
        // Accepted -->
        return ((m-1) + (s-1))%n + 1;
    }
    
    public static int saveThePrisoner(int n, int m, int s) {
        // TLE-->
        // while(m>1) {
        //     m--;
        //     s++;
        //     if(s>n) {
        //         s=s%n;
        //     }
        // }
        // return s;
        
        // Accepted -->
        int prisoner = 0;
        prisoner = m+s-1;
        prisoner = prisoner%n;
        if(prisoner == 0) return n;
        return prisoner;
    }
}
/*
input
2
7 19 2
3 7 3

output
6
3
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int s = Integer.parseInt(firstMultipleInput[2]);

                int result = Result.saveThePrisoner(n, m, s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
