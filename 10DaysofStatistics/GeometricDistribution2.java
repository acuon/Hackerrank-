//https://www.hackerrank.com/challenges/s10-geometric-distribution-2/problem

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int numerator = sc.nextInt();
    int denominator = sc.nextInt();
    int n = sc.nextInt();
    sc.close();
    
    double p = (double)numerator/denominator;
    //double p = 1d/3d; 
    //double p = (double)1/3; 
    //double p = 0.3333333333; //p = 1/3 = 0.333333333
    double q = 1-p;
    double result = 0;
    //System.out.println(p);
    //System.out.println(q);
    for(int i =1; i<=5; i++) {
        result = result + geometric(q,i,p);
    }
    System.out.format("%.3f",result);
    //result = (double)Math.pow(q,(n-1))*p;
    }
    private static double geometric(double q, int n, double p) {
        return Math.pow(q,n-1)*p;
    }
}
