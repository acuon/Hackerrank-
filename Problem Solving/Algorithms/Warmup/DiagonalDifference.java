/*
https://www.hackerrank.com/challenges/diagonal-difference/problem
*/

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

    public static int diagonalDifference(List<List<Integer>> arr) {
    int row= arr.size();
    int left_sum = 0;
    int right_sum = 0;
    
    for (int i = 0; i<row; i++){
        left_sum = left_sum + arr.get(i).get(i); 
        right_sum = right_sum + arr.get(i).get(row-i-1);             
        /*
        for (int j = 0; j<row; j++){
            
            if(i == j) {
                left_sum = left_sum + arr.get(i).get(j);
                
            }
            if((i+j) == (row-1)) {
                right_sum = right_sum + arr.get(i).get(j);
            }
        }
        */
        
        
    }
    return Math.abs(left_sum - right_sum);
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
