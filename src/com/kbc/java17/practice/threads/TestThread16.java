package com.kbc.java17.practice.threads;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class TestThread16 {
    public static void main(String... unused) {
        ConcurrentSkipListSet<String> connSet = new ConcurrentSkipListSet<>(Set.of("ABC", "DEF", "MNO"));
        System.out.println(connSet.hashCode());
        Iterator<String> it = connSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            connSet.add("10");
            System.out.println(connSet.hashCode());
        }
        System.out.println(connSet);
        System.out.println(connSet.hashCode());
    }

}
