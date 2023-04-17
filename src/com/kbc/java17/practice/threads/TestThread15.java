package com.kbc.java17.practice.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestThread15 {
    public static void main(String... unused) {
        List<String> list = new ArrayList<>(List.of("ABC", "DEF", "MNO"));
        List<String> synchList = Collections.synchronizedList(list);
        System.out.println(list.hashCode());
        System.out.println(synchList.hashCode());
        Iterator<String> it = synchList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            synchList.add("10");
        }
        System.out.println(list);
        System.out.println(synchList);
    }

}
