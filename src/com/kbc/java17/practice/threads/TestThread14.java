package com.kbc.java17.practice.threads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class TestThread14 {
    public static void main(String... unused) {
        CopyOnWriteArrayList<Integer> cw = new CopyOnWriteArrayList<>(List.of(3, 4, 5));
        System.out.println(cw.hashCode());
        Iterator<Integer> it = cw.iterator();
        while(it.hasNext()){

            System.out.println(it.next());
            cw.add(10);
            System.out.println(cw.hashCode());
        }
        System.out.println(cw.hashCode());
        System.out.println(cw);
    }

}
