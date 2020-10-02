import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	//Two Strings
	//https://www.hackerrank.com/challenges/two-strings/problem
    // Complete the twoStrings function below.
    static String twoStrings(char[] s1, char[] s2) {
        
        HashSet<Character> h = new HashSet<Character>(); 
        for(int i=0;i<s1.length;i++) {
            h.add(s1[i]);
        }
        for(int i=0;i<s2.length;i++) {
            if(h.contains(s2[i])) {
                return "YES";
            }
        }
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1.toCharArray(), s2.toCharArray());

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
