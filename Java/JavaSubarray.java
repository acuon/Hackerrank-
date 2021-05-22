//https://www.hackerrank.com/challenges/java-negative-subarray/problem


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            
        }
        sc.close();
        
        int negative_sums = 0;
        
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int sum = 0;
                for ( int k=i; k<=j; k++) {
                    sum += arr[k];
                }
                if (sum<0) {
                    negative_sums++;
                }
            }
        }
        System.out.println(negative_sums);
    }
}



import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();   
        }
        sc.close();
        int negative = 0;
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=i; j<arr.length; j++) {
                sum = sum + arr[j];
                //System.out.println(sum);
                if(sum<0) {
                    negative++;
                }
            }
        }
        System.out.println(negative);
    }   
}

