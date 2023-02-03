package com.kbc.java17.practice.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionsTest8 {
    public static void main(String[] args){
        HashMap<String, String> hm = new HashMap<>();
        hm.put("abc", "AAA");
        hm.put("bbb", "BBB");
        hm.put("abc", "CCC");
        System.out.println(hm);
    }
}
