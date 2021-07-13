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

	//Closest Numbers
	//https://www.hackerrank.com/challenges/closest-numbers/problem
    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
        arr.sort(null);
        int sad = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int l = arr.size();
        for(int i=1;i<l;i++) {
        	Integer b = arr.get(i);
        	Integer a = arr.get(i-1);
        	int ad = b-a;
        	if(ad<sad) {
        		result.clear();
        		sad = ad;
        		result.add(a);
        		result.add(b);
        	}else if(ad==sad) {
        		result.add(a);
        		result.add(b);
        	}
        	
        }
    	
    	return result;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.closestNumbers(arr);

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
