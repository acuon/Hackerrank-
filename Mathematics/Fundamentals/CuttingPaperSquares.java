/*

Mary has an n x m piece of paper that she wants to cut into 1 x 1 pieces according to the
following rules:

    - She can only cut one piece of paper at a time, meaning she cannot fold the paper or layer
      already-cut pieces on top of one another.
    - Each cut is a straight line from one side of the paper to the other side of the paper. For
      example, the diagram below depicts the three possible ways to cut a 3 x 2 piece of paper:
    example-cutting-squares.png

Given n and m, find and print the minimum number of cuts Mary must make to cut the paper
into n.m squares that are 1 x 1 unit in size.

Input Format

  A single line of two space-separated integers denoting the respective values of n and m.

Constraints

  1 <= n,m <= 10^9

Output Format

  Print a long integer denoting the minimum number of cuts needed to cut the entire paper into
  1 x 1 squares.

Sample Input

3 2

Sample Output

5

Explanation

Mary first cuts the 3 x 2 piece of paper into a 3 x 1 and 3 x 1 pieces.
She then cuts 3 x 1 piece of paper into 1 x 1 piece and a 2 x 1 piece.
She then cuts the 2 x 1 piece into two 1 x 1 pieces.
Same steps for the remaining 3 x 1 piece to cut into 1 x 1 pieces.

Because it took her five cuts to get n x m = 6 pieces of size 1 x 1, we print 5 as our answer.
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


    public static long solve(int n, int m) {
        BigInteger cut = new BigInteger("1");
        // cut = cut * n * m;
        cut = cut.multiply(BigInteger.valueOf(n).multiply(BigInteger.valueOf(m)));
        //java.math.BigInteger.longValue() --> to convert big integer to long value
        long c = cut.longValue()-1;
        return (long)c;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        long result = Result.solve(n, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
