//https://www.hackerrank.com/challenges/repeated-string/problem

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

    public static long repeatedString(String s, long n) {
        long totalCount = 0;
        long count = 0;
        int len = s.length();
        
        for(int i=0; i<len; i++) {
            if(s.charAt(i) == 'a') {
                count++;
            }
        }
        
        long repeatedCount = n/len;
        totalCount += repeatedCount*count;
        
        for(int i=0; i<n%len; i++) {
            if(s.charAt(i) == 'a') {
                totalCount++;
            }
        }
        
        return totalCount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
