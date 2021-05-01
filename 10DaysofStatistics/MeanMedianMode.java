

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] values = new double[n];
        for(int i=0;i<n;i++){
            values[i]=sc.nextDouble();
        }
        double mean = 0;
        double median = 0;
        
        double sum = 0;
        double mode = 0;
        Arrays.sort(values);
        
        //mean
        
        for( int j = 0; j<n; j++) {
            sum = sum + values[j];
        }
        mean = sum/n;
        System.out.println(mean);
        
        //median
        
        if (n%2 == 0) {
            int mid = n/2;
            median = ((values[mid] + values[mid-1])/2);    
        }
        else {
            median = values[(n-1)/2];   
        }
        System.out.println(median);
        
        //mode
        
        double max_count = 0;
        for (int i=0; i<n; i++) {
            int count = 0;
            for (int j=0; j<n; j++) {
                if(values[i] == values[j])
                    count = count + 1;
            }
            if (count>max_count) {
                max_count = count;
                mode = values[i];
            }
        }
        System.out.println(mode);
      
        //Max Count
        //int count=1;
        //double max_value=input[0];
        //System.out.println(max_value);
        /* max value
        for(int i=0; i<n; i++){
            if(max_value>=input[i]){
                if(max_value==input[i]){
                    mode=max_value;
                }
            }
            if (input[i]>=max_value){
                max_value=input[i];
                if(max_value==input[i]){
                    // count=count+1;
                    mode=max_value;
                }  
            }
         }*/
        
    }

}
