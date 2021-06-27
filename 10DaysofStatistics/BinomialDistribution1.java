//https://www.hackerrank.com/challenges/s10-binomial-distribution-1/problem

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double b = 1.09;
        double g = 1;
        double p = b/(b+g);
        double q = g/(b+g);
        int x = 3;
        int n = 6;
        /*      
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double g = sc.nextDouble();
        int x = sc.nextInt();
        int n = sc.nextInt();
        double p = b/(b+g);
        double q = g/(b+g);
        */
        
        double binomial_result = 0;
        for (x=3; x<=n; x++) {
            binomial_result = binomial_result + binomial(n,x,p);
            
        }
        System.out.format("%.3f",binomial_result);
        //binomial = summation of binomial(x,n,p)
        //where x is starting point
        //n is last
        //p is probability of success
        //binomial(x,n,p) = combination(n,x)*Math.pow(p,x)*Math.pow(q,n-x)
        //combination(n,x) = factorial(n)/(factorial(x)*factorial(n-x))
        //factorial(n) = n*(n-1)*(n-2)*...*(n-(n-1))
        //System.out.println(factorial(n));
        
        
    }
    private static double binomial(int n, int x, double p) {
        if (p<0||p>1||x<0||x>n||n<0) {
            return 0;
        }
        
        return combination(n,x)*Math.pow(p,x)*Math.pow(1-p,n-x);
        
    }
    private static double combination(int n, int x) {
        if(n<0||x>n||x<0){
            return 0;
        }
        return factorial(n)/(factorial(x)*factorial(n-x));
        
    }
    private static long factorial(int n) {
        if (n<0) {
            return 0;
        }
        
        long fact = 1;
        while(n>0) {
            fact = fact*n;
            n--;
        }
        return fact;
        
        
    }
}
