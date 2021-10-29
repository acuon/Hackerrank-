//https://www.hackerrank.com/challenges/30-nested-logic/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] rDate = new int[3];
        int[] eDate = new int[3];
        int fine = 0;
        
        for(int i=0; i<6; i++) {
            if(i<3) {
                rDate[i] = sc.nextInt();
            } else {
                eDate[i%3] = sc.nextInt();
            }
        }
        // System.out.println(rDate[0] + " " + rDate[1] + " " + rDate[2]);
        // System.out.println(eDate[0] + " " + eDate[1] + " " + eDate[2]);
        if(rDate[2]>eDate[2]) {
            
            fine = 10000;
            
        } else if(rDate[2] == eDate[2]) {
            
            if(rDate[1] > eDate[1]) {
                
                fine = 500 * (rDate[1]-eDate[1]);
                
            } else if(rDate[1] == eDate[1]){
                
                if(rDate[0] > eDate[0]) {
                    
                    fine = 15 * (rDate[0]-eDate[0]);
                    
                }
                
            }
        }
        
        System.out.println(fine);
        
    }
}
