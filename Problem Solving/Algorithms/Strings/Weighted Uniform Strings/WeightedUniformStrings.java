//https://www.hackerrank.com/challenges/weighted-uniform-string/problem

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

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        Set<Integer> weights = new HashSet<>();
        ArrayList<String> res = new ArrayList<>();
        
        int curWeight = 0;
        char prev = ' ';
        for(char ch : s.toCharArray()) {
            if(ch != prev) {
                curWeight = ch - 'a' + 1;
            } else {
                curWeight += ch - 'a' + 1;
            }            
            prev = ch;
            weights.add(curWeight);
        }
        
        for(int i=0; i<queries.size(); i++){
            int x = queries.get(i);
            
            if(weights.contains(x)) {
                res.add("Yes");
            } else {
                res.add("No");
            }
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<String> result = Result.weightedUniformStrings(s, queries);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
