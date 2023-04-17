package com.kbc.java17.practice.generics;

import java.util.List;

public class GenericsTest4 {
    public static void main(String[] args){
        List<CharSequence> p = List.of("mouse", "parrot");
        List<String> q = List.of("mouse", "parrot");
        p = q;
        System.out.println(p);
    }
}
