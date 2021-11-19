//https://www.hackerrank.com/challenges/pangrams/problem

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

    public static String pangrams(String s) {
        int[] ar = new int[26];
        for(char ch: s.toCharArray()) {
            if(ch>=65 && ch<=90) {
                ar[ch-'A']++;
            } else if(ch>=97 && ch<=122) {
                ar[ch-'a']++;
            }
        }
        for(int i=0; i<ar.length; i++) {
            if(ar[i] == 0) {
                return "not pangram";
            }
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
