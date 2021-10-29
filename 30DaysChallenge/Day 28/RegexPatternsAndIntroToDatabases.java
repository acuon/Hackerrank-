//https://www.hackerrank.com/challenges/30-regex-patterns/problem

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "[a-z]+@gmail\\.com$";
        Pattern p = Pattern.compile(regex);
        int test = sc.nextInt();
        ArrayList<String> ar = new ArrayList<>();
        while(test--!=0) {
            String name = sc.next();
            String email = sc.next();
            Matcher m = p.matcher(email);
            if(m.find()) {
                ar.add(name);
            }
        }
        Collections.sort(ar);
        for(String name: ar) {
            System.out.println(name);
        }
    }
}
