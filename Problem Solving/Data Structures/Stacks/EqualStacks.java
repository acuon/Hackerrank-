//https://www.hackerrank.com/challenges/equal-stacks/problem

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

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        
        for(int i=h1.size()-1; i>=0; i--) {
            if(!s1.isEmpty()) {
                s1.push(s1.peek() + h1.get(i));
            } else {
                s1.push(h1.get(i));
            }
        }
        for(int i=h2.size()-1; i>=0; i--) {
            if(!s2.isEmpty()) {
                s2.push(s2.peek() + h2.get(i));
            } else {
                s2.push(h2.get(i));
            }
        }
        for(int i=h3.size()-1; i>=0; i--) {
            if(!s3.isEmpty()) {
                s3.push(s3.peek() + h3.get(i));
            } else {
                s3.push(h3.get(i));
            }
        }
        int fHeight=0, sHeight=0, tHeight=0;
        while(!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()) {
            fHeight=s1.peek();
            sHeight=s2.peek();
            tHeight=s3.peek();
            if(fHeight==sHeight && sHeight==tHeight) {
                return fHeight;
            }
            if(fHeight>sHeight || fHeight>tHeight) {
                s1.pop();
            }
            if(sHeight>tHeight || sHeight>fHeight) {
                s2.pop();
            }
            if(tHeight>fHeight || tHeight>sHeight) {
                s3.pop();
            }
        }
        return 0;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
