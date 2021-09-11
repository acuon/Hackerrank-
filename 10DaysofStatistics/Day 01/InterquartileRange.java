//https://www.hackerrank.com/challenges/s10-interquartile-range/problem

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
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY values
     *  2. INTEGER_ARRAY freqs
     */

    public static void interQuartile(List<Integer> values, List<Integer> freqs) {
    int val_size = values.size();
    List<Integer> s = new ArrayList<Integer>();//new arraylist to store the values
    float Q1 = 0;
    float Q3 = 0;
    float Q3_Q1 = 0;
    
    for (int i=0; i<val_size; i++) {
        for (int j=0; j<freqs.get(i); j++) {
            s.add(values.get(i));
            //adding new elements from arr list values with repect to their frequencies in freqs arr list
        }
    }
    Collections.sort(s);
    //System.out.println(Arrays.asList(s));
    int n = s.size();//length of the new array list
    //System.out.println(n);
    if (n%2 == 0) {
        int mid = n/2;
        if (mid%2 == 0) {
            Q1 = (s.get((mid/2)-1) + s.get(mid/2))/2;
            Q3 = (s.get((mid*3)/2-1) + s.get((mid*3)/2))/2;
        }
        else {
            Q1 = s.get((mid-1)/2);
            Q3 = s.get((mid*3-1)/2);
        }
    }
    else {
        int mid = (n-1)/2;
        if (mid%2 == 0) {
            Q1 = (s.get((mid/2)-1) + s.get(mid/2))/2;
            Q3 = (s.get((mid*3)/2) + s.get((mid*3)/2-1))/2;
        }
        else {
            Q1 = s.get((mid-1)/2);
            Q3 = s.get(((mid*3)+1)/2);
        }
    }
    //System.out.println(Q1);
    //System.out.println(Q3);
    Q3_Q1 = Q3 - Q1;
    System.out.println(Q3_Q1);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> val = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> freq = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.interQuartile(val, freq);

        bufferedReader.close();
    }
}
