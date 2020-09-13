package javaTst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class IterateList {
    public static void main(String[] args) {
        List <Integer> ll = Collections.synchronizedList(new ArrayList<>());
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);

        Runnable r = () -> {
            synchronized (ll) {
                Iterator<Integer> it = ll.iterator();

                while (it.hasNext()) {
                    System.out.println(it.next());
                }
            }
        };

        new Thread(r, "t1").start();
        new Thread(r, "t2").start();
//        new Thread(r, "t1");

    }
}
