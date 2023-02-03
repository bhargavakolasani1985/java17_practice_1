package com.kbc.java17.practice.generics;

import java.util.List;

public class GenericsTest1 {
    public static void main(String[] args){
        List<?> q = List.of("mouse", "parrot");
        q.removeIf(String::isEmpty);
        q.removeIf(s -> s.length() == 4);
    }
}
