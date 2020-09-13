package as;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountFreq {

    static Character maxFreq(String str) {
        Map <Character, Integer> hmap= new HashMap<>();
        for (int i=0; i <str.length(); i++) {
            if (hmap.containsKey(str.charAt(i))) {
                hmap.put(str.charAt(i), hmap.get(str.charAt(i)) + 1);
            }
            else {
                hmap.put(str.charAt(i), 1);
            }
        }

        System.out.println("The frequency is "+hmap.entrySet());
//        Set<Character> st = hmap.keySet();
//        for (Character it: st) {
//
//        }
        int max_count=0;
        char res = '\0';
        for (Map.Entry<Character, Integer> it : hmap.entrySet() ) {
            if (it.getValue() > max_count) {
                max_count = it.getValue();
                res = it.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char s = maxFreq("geeksforgeeks");

        System.out.print(s);
    }

}
