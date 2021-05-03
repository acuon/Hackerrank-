//https://www.hackerrank.com/challenges/s10-standard-deviation/problem

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

    /*
     * Complete the 'stdDev' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void stdDev(List<Integer> arr) {
    int n = arr.size();
    long sum = 0;//we have to use long(64bit) to store big numbers instead of int(32bit)
    double mean = 0;
    double SD = 0;
    
    for (int i=0; i<n; i++) {
        sum = sum + arr.get(i);
    }
    mean = sum/n;
    //System.out.println(mean);
    long square_sum = 0;//we have to use long(64bit) to store big numbers instead of int(32bit)
    for (int i=0; i<n; i++) {
        //int square = (arr.get(i)-(int)mean)*(arr.get(i)-(int)mean);
        long square = (long)Math.pow((arr.get(i)-(int)mean),2);//we have to use long(64bit) to store big numbers instead of int(32bit)
        //square_sum = square_sum + (int)Math.pow((arr.get(i)-(int)mean),2);
        square_sum = square_sum + square;
    }
    //System.out.println(square_sum);
    double v = square_sum/n;
    //System.out.println(v);
    SD = (float)Math.sqrt(v);
    System.out.printf("%.1f",SD);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.stdDev(vals);

        bufferedReader.close();
    }
}
