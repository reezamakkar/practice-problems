package as;

public class ReverseString {

    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] arr = s.split("\\s");
        String ans = "";
        for (int i=arr.length-1; i>=0; i--) {
            ans += arr[i] + " ";
        }
        System.out.print(ans);
    }
}
