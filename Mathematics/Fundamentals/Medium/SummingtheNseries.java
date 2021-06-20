/*
//https://www.hackerrank.com/challenges/summing-the-n-series/problem


There is a sequence whose nth(n^th) term is
               Tn = n^2 - (n - 1)^2
                                  
Evaluate the series
            Sn = T1 + T2 + T3 + ... + Tn
                             
Find Sn mod (10^9 + 7).


Example

n = 3
The series is :
  - first term T1 ==> n^2 - (n-1)^2  ==>  1*1 - (1-1)*(1-1)  ==> 1
  - second term T2 ==>  n^2 - (n-1)^2  ==>  2*2 - (2-1)*(2-1)  ==> 3
  - third term T3 ==> n^2 - (n-1)^2  ==>  3*3 - (3-1)*(3-1)  ==>  5
  
  Sn  ==>  T1 + T2 + T3  ==>  1+3+5 ==>  9

Function Description

Complete the summingSeries function in the editor below.
summingSeries has the following parameter(s):
    - int n: the inclusive limit of the range to sum

Returns

    - int: the sum of the sequence, modulo (10^9 + 7)

Input Format

The first line of input contains t, the number of test cases.
Each test case consists of one line containing a single integer n.

Constraints

1 <= t <= 10
1 <= n <= 10^16

Sample Input 0

2
2
1

Sample Output 0

4
1

Explanation 0

Case 1: We have   4 = 1 + 3

Case 2: We have   1 = 1

*/
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

    public static int summingSeries(long n) {
        n = n%(long)(Math.pow(10,9)+7);
        n = n*n;
      
        n = n%(long)(Math.pow(10,9)+7);
        return (int)n;
    }
  
//----------------- OR -------------------------------
//     public static int summingSeries(long n) {
//         n = n%(long)(Math.pow(10,9)+7);
//         n = n*n;
//
//         BigInteger sum = BigInteger.valueOf(n);
//         sum= sum.mod(BigInteger.valueOf((long)(Math.pow(10,9)+7)));
//         n = sum.longValue();
//         return (int)n;
//     }
//------------------------------------------------------

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                int result = Result.summingSeries(n);

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
