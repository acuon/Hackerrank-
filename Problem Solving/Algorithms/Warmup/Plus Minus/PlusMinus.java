//https://www.hackerrank.com/challenges/plus-minus/problem

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

    public static void plusMinus(List<Integer> arr) {
    double n = arr.size();
    double positive = 0;
    double negative = 0;
    double zero = 0;
    
    for (int i =0; i<n; i++) {
        if (arr.get(i) > 0) {
            positive += 1;
        }
        if (arr.get(i) < 0) {
            negative += 1;
        }
        if (arr.get(i) == 0) {
            zero += 1;
        }
        
        
    }
    double p1 = positive/n;
    double n1 = negative/n;
    double z1 = zero/n;
    System.out.printf("%.6f\n", p1);
    System.out.printf("%.6f\n", n1);
    System.out.printf("%.6f\n", z1);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
