package com.kbc.java17.practice.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CollectionsTest15 {
    public static void main(String[] args){
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("DDD");
        list.add("BBB");
        list.add("CCC");
        list.add("AAA");
        list.add("CCC");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            list.add("123");
        }
        System.out.println(list.size());
        System.out.println(list);
    }
}
