//https://www.hackerrank.com/challenges/day-of-the-programmer/problem

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

    public static String dayOfProgrammer(int year) {
        String date = "";
        if(year<1918) {
            if(year%4==0) {
                date += "12.09."+year;
            } else {
                date += "13.09."+year;
            }
        } else if(year==1918) {
            date += "26.09."+year;
        } else {
            if(year%4==0 && (year%400==0 || year%100!=0)) {
                date += "12.09."+year;
            } else {
                date += "13.09."+year;
            }
        }
        return date;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        
    }
}
