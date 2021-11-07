//https://www.hackerrank.com/challenges/30-review-loop/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String even = "";
        String odd = "";
        for (int i = 0; i<n; i++) {
            String s = sc.nextLine();
            for (int j =0; j<s.length(); j++) {//runs the loop w.r.t. string length
                if (j%2 == 0) {
                    even = even + s.substring(j,j+1);//starting index = j ; ending index j+1
                }
                else {
                    odd = odd + s.substring(j,j+1);//starting index = j ; ending index j+1
                }
                //System.out.println(even+" "+odd);
            }
            System.out.println(even+" "+odd);
            even = "";
            odd = "";
        }
    }
}

