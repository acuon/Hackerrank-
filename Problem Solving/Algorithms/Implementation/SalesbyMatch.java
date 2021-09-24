//https://www.hackerrank.com/challenges/sock-merchant/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
    //System.out.println(ar);
    //System.out.println(n);
    int[] o =new int[n];
    int v=-1;
    for(int i=0; i<n; i++) {
        int count = 1;
        for(int j=i+1; j<n; j++) {
            if(ar.get(i) == ar.get(j)){
               count++;
               o[j]=v;
            }
        }
            if(o[i]!=v){
                o[i]=count;
            }
        }
        int sum=0;
        for(int k=0;k<o.length;k++){
            if(o[k]!=v){
                int c=o[k]/2;
                sum=sum+c;
                //System.out.println(output.get(k));
            }
        }
    
   /* System.out.println(output);
    int new_n = output.size();
    //System.out.println(new_n);
    
    
    for(int k=1; k<new_n; k++) {
        if(output.get(k-1) == output.get(k)) {
            count++;
        }
    }
    System.out.println(count);
    */
    
    
    return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
