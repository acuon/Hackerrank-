//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

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

    public static List<Integer> breakingRecords(List<Integer> scores) {
    ArrayList<Integer> max_min = new ArrayList<Integer>();
    int max = scores.get(0);
    int min = scores.get(0);
    int max_count = 0;
    int min_count = 0;
    for(int i=0; i<scores.size(); i++) {
        if(scores.get(i)>max) {
            max = scores.get(i);
            max_count++;
            //System.out.print(scores.get(i)+" max ");
        }
        //System.out.println();
        if(scores.get(i)<min) {
            min = scores.get(i);
            min_count++;
            //System.out.print(scores.get(i)+" min ");
        }
    }
    max_min.add(max_count);
    max_min.add(min_count);
    
    return max_min;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
