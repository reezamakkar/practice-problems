package as;

public class CompressedString {

    static String getCompressedString(String str) {
        char[] s = str.toCharArray();

        String compressedString = "";
        int count = 1;
        for (int i=0; i<s.length; i++) {
            if (i+1 < s.length && s[i] == s[i+1]) {
                count++;
            }
            else {
                compressedString += s[i] + "" + count;
                count=1;
            }
        }
        return (compressedString.length() > str.length()) ? str :  compressedString;
    }

    public static void main(String[] args) {
        String var = getCompressedString("aabbcccc");
        System.out.println(var);
    }
}
