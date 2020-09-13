package as;

public class OneEditAway {

    static boolean isReplace(String s1, String s2) {
        int replaceCount = 0;
        for(int i=0; i<s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                replaceCount++;
            }
        }
        if (replaceCount==1) {
            return true;
        }
        return false;
    }

    static boolean isInsertorRemove(String first, String second) {

        String s1 = (first.length() > second.length()) ? first : second;
        String s2 = (first.length() > second.length()) ? second : first;

        int i1=0;
        int i2=0;

        while (i1<s1.length() && i2<s2.length()) {
            if (s1.charAt(i1) != s2.charAt(i2)) {
                if (i1 != i2) {
                    return false;
                }
                i1++;
            }
            else {
                i1++;
                i2++;
            }
        }
        return true;
    }
    boolean isOneEdit(String str, String modifiedStr) {
        if (str.length() == modifiedStr.length()) {
            return isReplace(str, modifiedStr);
        }
        else if (Math.abs(modifiedStr.length() - str.length() ) == 1) {
            //insert
            return isInsertorRemove(str, modifiedStr);
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        OneEditAway ob = new OneEditAway();
        if(ob.isOneEdit("pale", "bake")) {
            System.out.println("The string is one edit away");
        }
        else {
            System.out.println("The string is not one edit away");
        }
    }
}
