package test;

import java.util.HashSet;

public class User {
    String name;
    int age;
    User(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        User u1 = new User("John", 20);
        User u2 = new User("John", 20);
        HashSet <User> set = new HashSet<>();
        set.add(u1);
        set.add(u2);
        System.out.print(set.size());
    }
}
