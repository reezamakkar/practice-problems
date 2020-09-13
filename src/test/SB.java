package test;

public class SB {

    public static void main(String[] args) {
        StringBuilder orig = new StringBuilder("ABC");
        StringBuilder other = orig;
        orig.append("DEF");

        orig = edit(other);

        orig.append("XYZ");
//        System.out.print(orig);
        System.out.print(other);


    }

    static StringBuilder edit(StringBuilder str) {
        return str.delete(2, 3);
    }

}
