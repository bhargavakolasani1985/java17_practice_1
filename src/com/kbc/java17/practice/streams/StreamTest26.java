package com.kbc.java17.practice.streams;

import java.util.List;
import java.util.Optional;

public class StreamTest26 {
    public static void main(String[] args) {
        Optional<Integer> x1 = List.of(10, 20, 30, 40, 50).stream().peek(e -> System.out.println(e)).min((a, b) -> a-b);
        System.out.println(x1);
        Optional<Integer> x2 = List.of(10, 20, 30, 40, 50).stream().peek(e -> System.out.println(e)).min((a, b) -> b-a);
        System.out.println(x2);
    }
}