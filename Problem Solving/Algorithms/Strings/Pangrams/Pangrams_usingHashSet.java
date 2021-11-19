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
      
        HashSet<Character> set = new HashSet<>();
        for(char ch: s.toCharArray()) {
            if(ch>=65 && ch<=90) {
                set.add(ch);
            } else if(ch>=97 && ch<=122) {
                set.add((char)((int)ch-32));
            }
        }
        if(set.size()<26) return "not pangram";
        return "pangram";
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
