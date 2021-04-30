//https://www.hackerrank.com/challenges/time-conversion/problem

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


    public static String timeConversion(String s) {
    int hh = Integer.parseInt(s.substring(0,2));
    int mm = Integer.parseInt(s.substring(3,5));
    int ss = Integer.parseInt(s.substring(6,8));
    String m = s.substring(8,9);
    //System.out.println(m);
    //System.out.printf("%02d:%02d:%02d",hh,mm,ss);
    if (hh==12 && m.equals("A")) {
        hh = 00;
        //System.out.printf("%02d:%02d:%02d",hh,mm,ss);
    }
    if (hh<12 && m.equals("P")) {
        hh = hh + 12;
        //System.out.printf("%02d:%02d:%02d",hh,mm,ss);
    }
    String s1 = String.format("%02d:%02d:%02d",hh,mm,ss);
    return s1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
