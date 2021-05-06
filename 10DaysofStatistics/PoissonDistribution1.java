

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    /*
    Scanner sc = new Scanner(System.in);
    double lambda = sc.nextDouble();
    int k = sc.nextInt();
    
    */
    double lambda = 2.5;
    int k = 5;
    double result = 0;
    result = poisson(k,lambda);
    System.out.format("%.3f",result);
    
    }
    private static double poisson(int k, double lambda) {
        return (Math.pow(lambda,k)*Math.exp(-1*lambda))/factorial(k);
    }
    private static long factorial(int k) {
        long fact = 1;
        while(k>0) {
            fact = fact*k;
            k--;
        }
        return fact;
    }
}
