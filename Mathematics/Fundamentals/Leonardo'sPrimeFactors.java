/*
//https://www.hackerrank.com/challenges/leonardo-and-prime/problem


Leonardo loves primes and created q queries where each query takes the form of an integer, n.
For each n, count the maximum number of distinct prime factors of any number in the inclusive
range |1,n|.

Note: Recall that a prime number is only divisible by1 and itself, and 1 is not a prime number.

Example

n=100

The maximum number of distinct prime factors for values less than or equal to 100 is 3. One
value with 3 distinct prime factors is 30. Another is 42.

Function Description

Complete the primeCount function in the editor below.

primeCount has the following parameters:

    int n: the inclusive limit of the range to check

Returns

    int: the maximum number of distinct prime factors of any number in the inclusive range |0-n|.

Input Format

  The first line contains an integer, q, the number of queries.
  Each of the next q lines contains a single integer, n.

Constraints

1 <= q <= 10^5
1 <= n <= 10^18

Sample Input

6
1
2
3
500
5000
10000000000

Sample Output

0
1
1
4
5
10

Explanation

  - 1 is not prime and its only factor is itself.
  - 2 has prime factor, 2.
  - The number 3 has 1 prime factor, 3, 2 has 1 and 1 has 0 prime factors.
  - The product of the first four primes is 2 x 3 x 5 x 7 = 210. While higher value primes may
    be a factor of some numbers, there will never be more than distinct prime factors for a
    number in this range. 

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


    public static int primeCount(long n) {
        long num = ar[0];
        //long num = 2;
        long ar[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
        int count = 0;
        for(int i=1; i<ar.length && n!=1; i++) {
            num*=ar[i];
            if(num<=n) count++;
        }
        return count;

    }
    /*public static int primeCount(long n) {
        long num = 1;
        long ar[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
        int count = 0;
        for(int i=0; i<ar.length && n!=1; i++) {
            num*=ar[i];
            if(num<=n) count++;
        }
        return count==0?0:count-1;

    }*/

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                int result = Result.primeCount(n);

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
