//https://www.hackerrank.com/challenges/append-and-delete/problem

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

    public static String appendAndDelete(String s, String t, int k) {
        return isPossible(s, t, k)?"Yes":"No";
    }
    
    private static boolean isPossible(String a, String b, int moves) {

        if(a.length()==0) return moves<=b.length();
        if(b.length()==0) return moves<=a.length();

        ArrayList<Character> from = new ArrayList<>();
        ArrayList<Character> to = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) from.add(a.charAt(i));
        for (int i = 0; i < b.length(); i++) to.add(b.charAt(i));

        int steps;
        int idx = Integer.MAX_VALUE;

        if (a.length() < b.length()) {
            for(int i=0; i<from.size(); i++) {
                if(from.get(i)!=to.get(i)) {
                    idx = i;
                    break;
                }
            }
            steps = remove(from, idx);
            int remain = to.size() - from.size();
            
            steps = steps + remain;
            if(steps>moves) return false;
            if(steps==moves) {
                return true;
            } else if((moves-steps)%2==0) {
                return true;
            } else {
                steps = steps - remain;
                steps = steps + from.size();
                return (steps + to.size())<=moves;
            }
        } else if (a.length() > b.length()) {
            for(int i=0; i< to.size(); i++) {
                if(from.get(i)!=to.get(i)) {
                    idx = i;
                    break;
                }
                if(i==to.size()-1) idx = i+1;
            }
            steps = remove(from, idx);

            int remain = to.size() - from.size();
            steps = steps + remain;
            if(steps>moves) return false;
            if(steps==moves) {
                return true;
            } else if((moves-steps)%2==0) {
                return true;
            } else {
                steps = steps - remain;
                steps = steps + from.size();
                return (steps + to.size())<=moves;
            }

        } else {
            for(int i = 0; i < from.size(); i++) {
                if(from.get(i) != to.get(i)) {
                    idx = i;
                    break;
                }
            }
            steps = remove(from, idx);
            
            if(steps*2>moves) return false;
            if(steps*2 == moves) {
                return true;
            } else if((moves-(steps*2))%2==0) {
                return true;
            } else {
                steps = steps + from.size();
                return (steps+to.size()) <= moves;
            }
        }
    }

    private static int remove(ArrayList<Character> ar, int idx) {
        if(idx == Integer.MAX_VALUE) return 0;
        int steps = 0;
        idx = ar.size() - idx;
        while(idx--!=0) {
            steps++;
            ar.remove(ar.size()-1);
        }
        return steps;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
