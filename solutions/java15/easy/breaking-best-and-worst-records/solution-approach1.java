// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
// Problem     Breaking the Records
// Difficulty  Easy
// Subdomain   Implementation
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-29, 04:29 p.m.
// ──────────────────────────────────────────────────

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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    int min=scores.get(0);
    int max=scores.get(0);
    int minc=0;
    int maxc=0;
    for(int c:scores){
        if (c<min){
            min=c;
            minc++;
        }
        if(c>max){
            max=c;
            maxc++;
        }}
       List<Integer> list = new ArrayList<>();
       list.add(maxc);
       list.add(minc);
       
       return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

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
