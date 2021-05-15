//https://www.hackerrank.com/challenges/java-primality-test/problem

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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        
        bufferedReader.close();
        //int m = Integer.parseInt(n);
        //System.out.println(m);
        BigInteger m = new BigInteger(n);
        boolean b = m.isProbablePrime(1);
        if(b) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
