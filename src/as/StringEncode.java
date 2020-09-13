package as;

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
     * Complete the 'collapseString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING inputString as parameter.
     */

    public static String collapseString(String inputString) {
            char[] s = inputString.toCharArray();

            String compressedString = "";
            int count = 1;
            for (int i=0; i<s.length; i++) {
                if (i+1 < s.length && s[i] == s[i+1]) {
                    count++;
                }
                else {
                    compressedString += count + "" + s[i];
                    count=1;
                }
            }
            return compressedString;
    }

}
public class StringEncode {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String inputString = bufferedReader.readLine();

        String result = Result.collapseString("GGGGGGffffft");
       System.out.print(result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
