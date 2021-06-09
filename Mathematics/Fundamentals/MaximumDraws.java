/*
//https://www.hackerrank.com/challenges/maximum-draws/problem

A person is getting ready to leave and needs a pair of matching socks. If there are n colors of socks in the drawer, how many socks need to be removed to be certain of having a matching pair?

Example n=2
There are 2 colors of socks in the drawer. If they remove 2 socks, they may not match. The minimum number to insure success is 3.

Function Description

Complete the maximumDraws function in the editor below.

maximumDraws has the following parameter:

    int n: the number of colors of socks

Returns

    int: the minimum number of socks to remove to guarantee a matching pair.

Input Format
The first line contains the number of test cases, t.
Each of the following t lines contains an integer n.

Sample Input

2             --> testcases
1
2

Sample Output

2
3

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

    public static int maximumDraws(int n) {
        return n+1;
        /*
        there are n number of pairs 
        means n*2 number of socks
        even if we are unlucky to get all n number of unequivalent socks in a row after nth draw there surely be the repetetion of any one colour in (n+1)th draw
        thats why maximum number of steps required is n+1
        */

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.maximumDraws(n);

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
