//https://www.hackerrank.com/challenges/balanced-brackets/problem

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

    public static String isBalanced(String s) {
        if(s.length()%2==1) {
            System.out.print("first ");
            return "NO";
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(')');
            } else if(s.charAt(i) == '[') {
                stack.push(']');
            } else if(s.charAt(i) == '{') {
                stack.push('}');
            } else {
                if(!stack.isEmpty()) {
                    if(stack.pop() != s.charAt(i)) {
                        return "NO";
                    }
                } else {
                    return "NO";
                }
            }
            // System.out.println(i+" "+stack);
        }
        if(!stack.isEmpty()) return "NO";
        return "YES";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
