package com.kbc.java17.practice.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionsTest9 {
    public static void main(String[] args){
        List<?> p = List.of("mouse", "parrot");
        List<Object> q = new ArrayList<String>();
        q.add("green");
        q.add("red");
        System.out.println(p);
        System.out.println(q);
    }
}
