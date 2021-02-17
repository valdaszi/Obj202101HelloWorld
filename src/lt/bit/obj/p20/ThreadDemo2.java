package lt.bit.obj.p20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadDemo2 {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            inc();
            for (int i = 0; i < 1_000_000; i++) {
                inc();
            }
        });

        Thread t2 = new Thread(() -> {
            dec();
            for (int i = 0; i < 1_000_000; i++) {
                dec();
            }
        });

        long start = System.currentTimeMillis();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long end = System.currentTimeMillis() - start;
        System.out.println("listo dydis: " + listas.size());
        System.out.println("c=" + c + " in " + end + "ms");
    }

    static List<Integer> listas = Collections.synchronizedList(new ArrayList<>());
    static int c;

    static void inc() {
        synchronized (ThreadDemo2.class) {
            c++;
        }
        listas.add(c);
    }

    static void dec() {
        synchronized (ThreadDemo2.class) {
            c--;
        }
        listas.add(c);
    }
}


