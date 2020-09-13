package as;

import java.util.*;
import java.util.regex.*;

public class TokenizedString {

    public static void main(String[] args) {
        String input = "abc hey you \"my name si aish\" okay fine";
        String[] terms = input.split("\"?( |$)(?=(([^\"]*\"){2})*[^\"]*$)\"?");

        for(String it: terms) {
            if (it.contains(" ")) {
                System.out.println("\"" + it + "\"");
            }
            else {
                System.out.println(it);
            }

        }
    }
    public static List<String>  getTokenizedString(String s) {
        List<String> matchList = new ArrayList<String>();
        Pattern regex = Pattern.compile("[^\\s\"']+|\"([^\"])\"|'([^'])'");
        Matcher regexMatcher = regex.matcher(s);
        while (regexMatcher.find()) {
            if (regexMatcher.group(1) != null) {
                matchList.add(regexMatcher.group(0));
            } else if (regexMatcher.group(2) != null) {
                matchList.add(regexMatcher.group(2));
            } else {
                matchList.add(regexMatcher.group());
            }
        }
        return matchList; }
}
