//https://www.hackerrank.com/challenges/dynamic-array/problem

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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tests = sc.nextInt();
        List<List<Integer>> ar = new ArrayList<>();
        for(int i=0; i<n; i++) {
            ar.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        int idx = 0,query = 0, x = 0, y = 0;
        while(tests--!=0) {
            query = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            if(query == 1) {
                idx = ((x^lastAnswer)%n);
                ar.get(idx).add(y);
            } else {
                idx = ((x^lastAnswer)%n);
                lastAnswer = ar.get(idx).get(y%ar.get(idx).size());
                System.out.println(lastAnswer);
            }
        }
    }
}
