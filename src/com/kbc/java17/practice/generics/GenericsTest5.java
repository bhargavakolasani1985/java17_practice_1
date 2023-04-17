package com.kbc.java17.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest5 {
    public static void main(String[] args){
        List<CharSequence> p = new ArrayList<CharSequence>();
        p.add("test");
        System.out.println(p);
    }
}
