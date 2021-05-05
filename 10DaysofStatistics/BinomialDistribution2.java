//

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //Scanner sc = new Scanner(System.in);

        //int reject_percentage = 12;
        //int x = 2;
        int n = 10;
        
        //double p = reject_percentage/100;
        double p = 0.12;
        double q = 1-p;
        //System.out.println(p);
        //System.out.println(q);
        
        double binomial_result = 0;
        //Atmost 2 rejects
        for (int x=0; x<=2; x++) {
            binomial_result = binomial_result + binomial(n,x,p);
            
        }
        System.out.format("%.3f%n",binomial_result);
        
        //Atleast 2 rejects
        binomial_result = 1 - binomial(n,0,p) - binomial(n,1,p);
        System.out.format("%.3f%n",binomial_result);
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
