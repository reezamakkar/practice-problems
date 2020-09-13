package as;

public class StringRotation {
    static boolean isSubstring(String s1, String s2) {
        if (s2.contains(s1)) {
            return true;
        }
        return false;

    }
    static boolean isRotation(String s1, String s2) {
        String s1s1 = s1 + s1;
        if (s2.length() == s1.length() && isSubstring(s2, s1s1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean var = isRotation("letterboxd", "terboxdlet");
        System.out.println(var);
    }
}
