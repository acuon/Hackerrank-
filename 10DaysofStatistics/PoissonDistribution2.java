//https://www.hackerrank.com/challenges/s10-poisson-distribution-2/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    /*
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    
    */
    double dailyCostA = 0;
    double dailyCostB = 0;
    double lambdaA = 0.88;
    double lambdaB = 1.55;
    dailyCostA = 160 + 40*(lambdaA + (lambdaA * lambdaA));
    dailyCostB = 128 + 40*(lambdaB + (lambdaB * lambdaB));
    System.out.format("%.3f%n",dailyCostA);
    System.out.format("%.3f",dailyCostB);
    
    }
}
