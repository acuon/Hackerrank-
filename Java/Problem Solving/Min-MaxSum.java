//https://www.hackerrank.com/challenges/mini-max-sum/problem

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

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    
    Collections.sort(arr);
   // System.out.print(arr);
    int n = arr.size();
    long min_sum = 0;
    long max_sum = 0;
    int first = arr.get(0);
    int last = arr.get(n-1);
    
    for (int i = 0; i<n; i++) {
        min_sum = min_sum + arr.get(i);
        max_sum = max_sum + arr.get(i);
    }
    max_sum = max_sum - first;
    min_sum = min_sum - last;
    System.out.println(min_sum+" "+max_sum);
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
