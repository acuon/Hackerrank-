//

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
    
    public static int gemstones(List<String> arr) {
        Set<Character> gemstones = stringToSet(arr.get(0));
        for(int i=1; i<arr.size() ;i++) {
          //retainAll only takes common elements
            gemstones.retainAll(stringToSet(arr.get(i)));
        }
        return gemstones.size();
    }
    
    public static Set<Character> stringToSet(String s) {
        Set<Character> set = new HashSet<Character>(26);
        for (char ch : s.toCharArray())
            set.add(Character.valueOf(ch));
        return set;
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
