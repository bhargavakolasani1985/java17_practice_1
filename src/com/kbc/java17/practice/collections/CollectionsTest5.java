package com.kbc.java17.practice.collections;

import java.util.HashMap;

public class CollectionsTest5 {
    public static void main(String[] args){
        var map = new HashMap<Integer, Integer>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        map.put(4, 5);
        map.merge(1, 3, (a,b) -> b / a);
        map.merge(3, 3, (a,b) -> a + b);
        map.merge(4, null, (a,b) -> 4);
        System.out.println(map);
    }
}
