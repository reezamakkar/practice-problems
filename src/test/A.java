package test;


class C {
    C() {
        System.out.print("hiC");
    }
    void m1() {
        System.out.print("hiC");
    }
}

class B extends C {

    B() {
        System.out.print("hiB");
    }

    void m1() {
        System.out.print("hiB");
    }

    void m2() {
        System.out.print("hiBm2");
    }

}

public class A {
    public static void main(String[] args) {

        B a = (B) new C();

    }
}
