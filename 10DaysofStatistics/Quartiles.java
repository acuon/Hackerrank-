//https://www.hackerrank.com/challenges/s10-quartiles/copy-from/211531804

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

    /*
     * Complete the 'quartiles' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quartiles(List<Integer> arr) {
    int n = arr.size();
    Collections.sort(arr);
    
    int Q1 = 0;
    int Q2 = 0;
    int Q3 = 0;
    //int[] output = new int[3];
    if (n%2 != 0) {
        int mid = (n-1)/2;
        Q2 = arr.get(mid);
        if (mid%2 == 0) {
            int l = mid/2;
            int r =(mid*3)/2;
            Q1 = (arr.get(l) +arr.get(l-1))/2;
            Q3 = (arr.get(r) + arr.get(r+1))/2;
        }
        else {
            int l = (mid-1)/2;
            int r = l*3/2;
            Q1 = arr.get(l);
            Q3 = arr.get(r);
        }
    }
    else {
        Q2 = (arr.get(n/2) + arr.get(n/2 - 1))/2;
        int mid = n/2;
        if (mid%2 == 1) {
            
            int l = (n/2 - 1)/2;
            int r = l+l+l+1;
            Q1 = arr.get(l);
            Q3 = arr.get(r); 
        }
        else {
            int l = mid/2;
            //int r = (l*3+1)/2;
            Q1 = (arr.get(l-1) + arr.get(l))/2;
            Q3 = (arr.get(mid+l) + arr.get(mid+l-1))/2;
        }
    }
    //output[0]=Q1;
    //output[1]=Q2;
    //output[2]=Q3;
    return Arrays.asList(Q1,Q2,Q3);
    //System.out.println(n);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> data = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> res = Result.quartiles(data);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
