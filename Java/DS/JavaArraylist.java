/*
//https://www.hackerrank.com/challenges/java-arraylist/problem

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output

74
52
37
ERROR!
ERROR!

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<m; j++) {
                temp.add(sc.nextInt());
            }
            //System.out.println(temp);
            ar.add(temp);
        }
        //System.out.println(ar.size());
        int test = sc.nextInt();
        for(int t=0; t<test; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            //System.out.println(i+" "+j);
            try {
                System.out.println(ar.get(i-1).get(j-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
