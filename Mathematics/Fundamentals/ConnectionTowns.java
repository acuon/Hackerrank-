/*
//https://www.hackerrank.com/challenges/connecting-towns/problem

Cities on a map are connected by a number of roads. The number of roads between each city is
in an array and city 0 is the starting location. The number of roads from city 0 to city 1 is the first
value in the array, from city 1 to city 2 is the second, and so on.

How many paths are there from city 0 to the last city in the list, modulo 1234567?

Example

n = 4
routes = [3,4,5]
There are 3 roads to city 1, 4 roads to city 2 and 5 roads to city 3. The total number of roads is
3 x 4 x 5 mod 1234567 = 60.

Note
Pass all the towns Ti for i=1 to n-1 in numerical order to reach Tn.

Function Description

Complete the connectingTowns function in the editor below.

connectingTowns has the following parameters:

    int n: the number of towns
    int routes[n-1]: the number of routes between towns

Returns

    int: the total number of routes, modulo 1234567.

Input Format
The first line contains an integer T, T test-cases follow.

Each test-case has 2 lines.
The first line contains an integer N (the number of towns).
The second line contains N - 1 space separated integers where the ith integer denotes the number of routes, Ni, from the town Ti to Ti+1

Constraints
1 <= T<=1000
2< N <=100
1 <= routes[i] <=1000

Sample Input 1

2
3
1 3
4
2 2 2

Sample Output 1

3
8

Explanation
Case 1: 1 route from T1 to T2, 3 routes from T2 to T3, hence only 3 routes.
Case 2: There are 2 routes from each city to the next, hence 2 * 2 * 2 = 8. 

Sample Input 2

3
95
3 784 945 778 736 252 406 796 252 621 298 513 826 159 396 502 818 820 959 826 880 728 729 26 665 609 31 711 950 908 50 203 940 863 662 476 50 733 825 871 234 133 395 680 95 290 125 909 361 593 946 534 133 798 305 266 683 856 876 446 510 900 947 254 228 101 445 125 729 559 632 978 224 767 151 290 481 912 462 638 892 823 570 718 129 699 602 965 838 943 355 968 779 928

92
657 604 984 644 404 50 432 188 92 111 743 181 577 78 860 819 56 158 769 440 813 957 990 512 837 902 42 973 819 963 25 365 436 784 335 530 550 520 621 913 974 311 406 332 654 538 288 171 365 435 62 787 208 822 881 993 346 553 11 670 791 896 980 917 985 370 229 14 886 643 899 103 947 307 906 990 617 180 531 605 45 962 624 823 657 790 554 959 822 669 1

41
756 547 807 283 355 712 161 816 773 41 380 4 469 598 282 162 843 972 404 737 741 538 698 733 730 343 594 944 776 289 127 91 956 917 363 586 699 941 270 587


Sample Output 2

868553

129779

1121283

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


    public static int connectingTowns(int n, List<Integer> routes) {
        long p = 1;
        for(int i=0; i<n-1; i++) {
            p *= routes.get(i);
            p %= 1234567;
        }
        return (int)p;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> routes = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                int result = Result.connectingTowns(n, routes);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
