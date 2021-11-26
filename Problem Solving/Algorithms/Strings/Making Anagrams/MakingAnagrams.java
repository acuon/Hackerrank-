//https://www.hackerrank.com/challenges/making-anagrams/problem

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
    
    public static int makingAnagrams(String s1, String s2) {
        int[] ar = new int[26];
        int deletion = 0;
        for(char ch: s1.toCharArray()) {
            ar[ch-'a']++;
        }
        for(char ch: s2.toCharArray()) {
            ar[ch-'a']--;
        }
        for(int i: ar) {
            if(i!=0) {
                deletion += Math.abs(i);
            }
        }
        return deletion;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result.makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
