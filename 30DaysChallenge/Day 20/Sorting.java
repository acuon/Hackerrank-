//https://www.hackerrank.com/challenges/30-sorting/problem

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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int swaps = 0;
        for(int i=0; i<a.size(); i++) {
            for(int j=0; j<a.size()-1; j++) {
                if(a.get(j) > a.get(j+1)) {
                    Swap(j, j+1, a);
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+a.get(0));
        System.out.println("Last Element: "+a.get(a.size()-1));

        bufferedReader.close();
    }
    public static void Swap(int i, int j, List<Integer> ar) {
        int temp = ar.get(i);
        ar.set(i, ar.get(j));
        ar.set(j, temp);
    }
}
