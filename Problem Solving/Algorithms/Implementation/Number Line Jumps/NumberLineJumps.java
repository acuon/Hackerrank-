//https://www.hackerrank.com/challenges/kangaroo/problem

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

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    
    int d1 = x1 + v1;
    int d2 = x2 + v2;
    String s1 = "NO";
    if ((x1>x2 && v1>v2)||(x2>x1 && v2>v1)){
        System.out.println("NO");
    }
    else {
        for (int i = 1; i<10000; i++) {
            
            if ( d1 == d2 ) {
                s1 = "YES";
            }
            d1 = d1 + v1;
            d2 = d2 + v2;
        }
        
    }
    return s1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
