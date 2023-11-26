package com.kbc.java17.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest14 {
    public static void main(String[] args){
        List<?> x1 = new ArrayList<String>();
        x1.add("abc");
        System.out.println(x1.get(0));
    }
}
