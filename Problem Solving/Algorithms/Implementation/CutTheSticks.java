//https://www.hackerrank.com/challenges/cut-the-sticks/problem

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

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> res = new ArrayList<>();
        while(arr.size() >= 1) {
            res.add(arr.size());
            int min = getMin(arr);
            arr = newArray(arr, min);
        }
        return res;
    }
    
    public static int getMin(List<Integer> ar) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<ar.size(); i++) {
            min = Math.min(min, ar.get(i));
        }
        return min;
    }
    
    public static List<Integer> newArray(List<Integer> ar, int min) {
        List<Integer> newArr = new ArrayList<>();
        for(int i=0; i<ar.size(); i++) {
            if(ar.get(i) != min) newArr.add(ar.get(i));
        }
        return newArr;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.cutTheSticks(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
