package com.kbc.java17.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class CollectionsTest13 {
    public static void main(String[] args){
        Set<String> list = new ConcurrentSkipListSet<>();
        list.add("DDD");
        list.add("BBB");
        list.add("AAA");
        list.add("CCC");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            list.remove("BBB");
        }
        System.out.println(list);
    }
}
