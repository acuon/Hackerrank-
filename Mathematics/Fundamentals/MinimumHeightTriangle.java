/*
https://www.hackerrank.com/challenges/lowest-triangle/problem

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

    public static int lowestTriangle(int trianglebase, int area) {
        /*
        a = 100
        b = 17
        double h = 2*(double)area/(double)trianglebase --> will give 11.7647058824 ---> after rounding --> 12.0
        double h = 2*area/trianglebase --> will give 11.0 ---> after rounding --> 11.0
        */
        double h = Math.round(2*(double)area/(double)trianglebase);     //we have to convert it to double otherwise it will divide in int form 
        return (int)h;

    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int trianglebase = Integer.parseInt(firstMultipleInput[0]);

        int area = Integer.parseInt(firstMultipleInput[1]);

        int height = Result.lowestTriangle(trianglebase, area);

        bufferedWriter.write(String.valueOf(height));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
