package com.kbc.java17.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest10 {
    public static void main(String[] args){
        List<?> p = List.of("mouse", "parrot");
        List<?> q = new ArrayList<String>();
        q.add("green");
        q.add("red");
        System.out.println(p);
        System.out.println(q);
    }
}
