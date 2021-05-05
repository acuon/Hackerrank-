//https://www.hackerrank.com/challenges/s10-geometric-distribution-1/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
    double p = 0.3333333333; //p = 1/3 = 0.333333333
    double q = 1-p;
    int n = 5;
    //System.out.println(p);
    //System.out.println(q);
    double result = 0;
    result = (double)Math.pow(q,(n-1))*p;
    System.out.format("%.3f",result);
    }
}
