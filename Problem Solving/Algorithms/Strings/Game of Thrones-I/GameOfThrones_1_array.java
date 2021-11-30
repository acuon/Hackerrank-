//https://www.hackerrank.com/challenges/game-of-thrones/problem

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

    public static String gameOfThrones(String s) {
        int[] ar = new int[26];
        int oddCount = 0;
        for(char ch: s.toCharArray()) {
            ar[ch-'a']++;
        }
        for(int i=0; i<ar.length; i++) {
            if(ar[i]%2==1) {
                oddCount++;
                if(oddCount>1) return "NO";
            }
        }
        return "YES";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
