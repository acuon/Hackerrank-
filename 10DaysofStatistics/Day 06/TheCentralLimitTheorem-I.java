/*
https://www.hackerrank.com/challenges/s10-the-central-limit-theorem-1/problem
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int boxes = sc.nextInt();
        int mean = sc.nextInt();
        int sd = sc.nextInt();
        System.out.println(digitScale(CLT(weight, boxes, mean, sd),4));
    }
    public static double normalDis(double x, double mean, double stdDev){
        return 0.5*(1+erf((x-mean)/(stdDev*Math.sqrt(2))));
    }
    public static double CLT(int x,int n, int mean, int stdDev){
        return normalDis(x,n * mean,Math.sqrt(n) * stdDev);
    }
    public static double digitScale(double d, int scale ){
        double factor = Math.pow(10,scale);
        return Math.round(d * factor) / factor; 
    }
    
     public static double erf(double z) {
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

        // use Horner's method
        double ans = 1 - t * Math.exp( -z*z   -   1.26551223 +
                                            t * ( 1.00002368 +
                                            t * ( 0.37409196 + 
                                            t * ( 0.09678418 + 
                                            t * (-0.18628806 + 
                                            t * ( 0.27886807 + 
                                            t * (-1.13520398 + 
                                            t * ( 1.48851587 + 
                                            t * (-0.82215223 + 
                                            t * ( 0.17087277))))))))));
        if (z >= 0) return  ans;
        else        return -ans;
    }
}
