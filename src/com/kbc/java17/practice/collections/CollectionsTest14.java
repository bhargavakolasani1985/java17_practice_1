package com.kbc.java17.practice.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CollectionsTest14 {
    public static void main(String[] args){
        Set<String> list = new CopyOnWriteArraySet<>();
        list.add("DDD");
        list.add("BBB");
        list.add("CCC");
        list.add("AAA");
        list.add("CCC");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //list.remove("BBB");
        }
        System.out.println(list);
    }
}
