package as;

public class CamelToSnake {

    int n =10;
    public static String convertCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            char nc = Character.toLowerCase(c);
            if (Character.isUpperCase(c)) {
                stringBuilder.append('_').append(nc);
            } else {
                stringBuilder.append(nc);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
//        System.out.println(convertCase("FedEx"));
//
//        String regex = "([a-z])([A-Z]+)";
//        String replacement = "$1_$2";
//        System.out.println("FedEx"
//                .replaceAll(regex, replacement)
//                .toLowerCase());
        CamelToSnake a = new CamelToSnake();
        System.out.println(a.n);
    }
}
