//https://www.hackerrank.com/challenges/the-love-letter-mystery/problem

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

    public static int theLoveLetterMystery(String s) {
        int count = 0;
        int n = s.length();
        for(int i=0; i<n/2; i++) {
            if(s.charAt(i) != s.charAt(n-i-1)) {
                char st = s.charAt(i);
                char en = s.charAt(n-i-1);
                if(st > en) {
                    count += (int)((st-'a') - (en-'a'));
                } else {
                    count += (int)((en-'a') - (st-'a'));
                }
            }
        }
        System.out.println("end");
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

                int result = Result.theLoveLetterMystery(s);

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
