//https://www.hackerrank.com/challenges/crush/problem

import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long test = sc.nextLong();
        long[] ar = new long[(int)(n+1)];
        long max = Long.MIN_VALUE;
        while(test--!=0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int add = sc.nextInt();
            ar[l-1] += add;
            ar[r] -= add;
        }
        long sum = 0;
        for(int i=0; i<(int)n; i++) {
            sum += ar[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
        
    }
}
