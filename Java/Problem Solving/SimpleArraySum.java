/*
Given an array of integers, find the sum of its elements.

For example, if the array ar = [1,2,3], 1 + 2 + 3 = 6, so return 6.

Function Description

Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.

simpleArraySum has the following parameter(s):

    ar: an array of integers

Input Format

The first line contains an integer,
, denoting the size of the array.
The second line contains

space-separated integers representing the array's elements.

Constraints

0 < n,ar[i] <= 1000

Output Format

Print the sum of the array's elements as a single integer.

Sample Input

6
1 2 3 4 10 11

Sample Output

31

Explanation

We print the sum of the array's elements: 1 + 2 + 3 + 4 + 10 + 11 = 31.
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
import java.util.ArrayList;

class Result {

    public static int simpleArraySum(List<Integer> ar) {
    int sum = 0;
    for (int i = 0; i<ar.size(); i++) {
       
        sum = sum + ar.get(i);
        
    }
    return sum;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
