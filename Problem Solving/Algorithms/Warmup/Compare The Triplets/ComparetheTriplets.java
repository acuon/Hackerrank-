/*
for question
https://www.hackerrank.com/challenges/compare-the-triplets/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/

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

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    
    int ar1 = 0;
    int ar2 = 0;
    
    for (int i = 0; i<a.size(); i++){
        
        if (a.get(i)<b.get(i)){
            ar2 += 1;
            
        }
        else if (a.get(i)>b.get(i)){
            ar1 += 1;
        }
        else{
        }
        
        
    }
    return Arrays.asList(ar1,ar2);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

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
