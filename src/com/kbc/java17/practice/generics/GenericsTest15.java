package com.kbc.java17.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest15 {
    public static void main(String[] args){
        List<String> x1 = new ArrayList<>();
        x1.add("abc");
        List<?> x2 = x1;
        System.out.println(x2.get(0));
    }
}
