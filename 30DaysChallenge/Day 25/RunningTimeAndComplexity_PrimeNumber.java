//https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test--!=0) {
            int num = sc.nextInt();
            System.out.println(isPrime(num)?"Prime":"Not prime");
        }
    }
    
    //Time Complexity - O(Sqrt(n))
    public static boolean isPrime(int num) {
        if(num<2) return false;
        for(int i=2; i*i<=num; i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
    //Time Complexity - O(n/2)
    public static boolean isPrime(int num) {
        if(num<2) return false;
        for(int i=2; i<=num/2; i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}
