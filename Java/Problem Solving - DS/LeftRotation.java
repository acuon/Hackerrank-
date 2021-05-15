//https://www.hackerrank.com/challenges/array-left-rotation/problem

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
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    
    // for(int i=0; i<d; i++) {                     //time limit exceeded for this code
    //     int temp = arr.get(0);
    //     //System.out.print(temp+" temp");
    //     for(int j=0; j<arr.size()-1; j++) {
    //         //System.out.print(arr.get(j));
            
    //         arr.set(j,arr.get(j+1));
    //         //System.out.print(arr.get(j)+ " arr");
    //     }
    //     //System.out.println();
    //     arr.set(arr.size()-1,temp);
    // }
    //System.out.println(arr);
    while(d!=0){
        arr.add(arr.remove(0));//in list any element is added to the last index
        //System.out.println(arr);
        --d;
    }
//     for(int i=0; i<d; i++) {                 //this will also work same as while loop;
//         arr.add(arr.remove(0));
//     }
    return arr;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

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
