//https://www.hackerrank.com/challenges/anagram/problem

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

    public static int anagram(String s) {
        return isAnagram(s.substring(0, s.length()/2), s.substring(s.length()/2));
    }
    
    public static int isAnagram(String s1, String s2) {
        return (s1.length()==s2.length())?steps(s1, s2):-1;
    }
    
    public static int steps(String s, String t) {
        int[] ar = new int[26];
        int count = 0;
        for(int i=0;i<s.length();i++) {
            ar[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++) {
            if(--ar[t.charAt(i)-'a']<0) {
                count++;
            }
        }
        return count;     
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.anagram(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
