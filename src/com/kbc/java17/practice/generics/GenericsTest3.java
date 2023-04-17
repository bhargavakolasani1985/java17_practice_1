package com.kbc.java17.practice.generics;

import java.util.List;

public class GenericsTest3 {
    public static void main(String[] args){
        List<CharSequence> q = List.of("mouse", "parrot");
        q.removeIf(s -> s.length() == 4);
    }
}
