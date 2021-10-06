//https://www.hackerrank.com/challenges/big-sorting/problem

//Brute Force --> Time Limit Exceeded
//needs optimization
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

    public static List<String> bigSorting(List<String> unsorted) {
        String[] ar = unsorted.toArray(new String[unsorted.size()]);
        for(int i=0; i<ar.length; i++) {
            for(int j=i+1; j<ar.length; j++) {
                if(comparator(ar[i], ar[j])) {
                    String temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return Arrays.asList(ar);
    }
    public static boolean comparator(String s1, String s2) {
        if(s1.length()>s2.length()) return true;
        if(s1.length()<s2.length()) return false;
        if(s1.length() ==  s2.length()) {
            for(int i=0; i<s1.length(); i++) {
                if((int)s1.charAt(i) > (int)s2.charAt(i)) {
                    return true;
                } else if((int)s1.charAt(i) < (int)s2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.bigSorting(unsorted);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
