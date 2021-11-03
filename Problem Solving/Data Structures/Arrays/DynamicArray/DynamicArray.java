//https://www.hackerrank.com/challenges/dynamic-array/problem

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
    
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> ar = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int lastAnswer = 0;
        for(int i=0; i<n; i++) {
            ar.add(new ArrayList<Integer>());
        }
        int idx = 0;
        for(int i=0; i<queries.size(); i++) {
            List<Integer> query = queries.get(i);
            if(query.get(0) == 1) {
                idx = ((query.get(1)^lastAnswer)%n);
                ar.get(idx).add(query.get(2));
            } else {
                idx = ((query.get(1)^lastAnswer)%n);
                List<Integer> curr = ar.get(idx);
                lastAnswer = curr.get(query.get(2)%curr.size());
                res.add(lastAnswer);
            }
        }
        return res;     
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

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
