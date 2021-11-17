//https://www.hackerrank.com/challenges/caesar-cipher-1/problem

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

    public static String caesarCipher(String s, int k) {
        StringBuilder str = new StringBuilder();
        for(char ch: s.toCharArray()) {
            if(ch>='a' && ch<='z') {
                int ascii = ((ch-'a')+k)%26;
                char c = (char)(ascii + 'a');
                str.append(c);
            } else if(ch>='A' && ch<='Z') {
                int ascii = ((ch-'A')+k)%26;
                char c = (char)(ascii + 'A');
                str.append(c);
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
