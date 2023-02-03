package com.kbc.java17.practice.collections;

import java.util.LinkedList;

public class CollectionsTest1 {
    public static void main(String[] args){
        var q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.print(q);
    }
}
