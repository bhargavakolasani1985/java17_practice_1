package com.kbc.java17.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsTest12 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            list.remove("BBB");
        }
        System.out.println(list);
    }
}
