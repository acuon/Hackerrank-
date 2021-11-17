//https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=false

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
    
    public static int minimumNumber(int n, String password) {
        boolean num = false;
        boolean lower = false;
        boolean upper = false;
        boolean special = false;
        boolean length = false;
        int count = 0;
        for(char ch: password.toCharArray()) {
            if(isNum(ch)) num = true;
            else if(isLower(ch)) lower = true;
            else if(isUpper(ch)) upper = true;
            else special = true;
        }
        if(!num) count++;
        if(!lower) count++;
        if(!upper) count++;
        if(!special) count++;
        if((n+count)<6) return 6-n;
        return count;
    }
    public static boolean isNum(char ch) {
        return (ch>='0' && ch<='9');
    }
    public static boolean isLower(char ch) {
        return (ch>='a' && ch<='z');
    }
    public static boolean isUpper(char ch) {
        return (ch>='A' && ch<='Z');
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
