package as;

public class ReplaceSpaces {

    static String replaceSpacesUtils(String s) {
        String s1 = s.replaceAll("\\s", "%20");
        return s1;
    }

    static String replaceSpaces(String s) {
        int originalLength = s.length();
        int count = 0;
        for (int i=0; i < originalLength; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        char[] str = s.toCharArray();
        int resultant_length = originalLength + count * 2;

        char[] arr = str;
        str = new char[resultant_length];

        for (int j = originalLength-1; j>=0; j--) {
            if (arr[j] == ' ') {
                str[resultant_length-1] = '0';
                str[resultant_length-2] = '2';
                str[resultant_length-3] = '%';

                resultant_length = resultant_length-3;
            }
            else {
                str[resultant_length-1] = arr[j];
                resultant_length--;
            }
        }
        return new String(str);

    }
    public static void main(String[] args) {

        String s =  replaceSpaces("My name is Reeza bla bla  ");
        System.out.println(s);

    }
}
