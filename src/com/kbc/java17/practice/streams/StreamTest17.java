package com.kbc.java17.practice.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest17 {
    public static void main(String[] args) {
        List<Integer> x1 = List.of(1, 2, 3);
        List<Integer> x2 = List.of(4, 5, 6);
        List<List<Integer>> x3 = List.of(x1, x2);
        Stream.of(x3)
                .flatMap(x -> x.stream())
                .flatMap(x -> x.stream())
                .forEach(System.out::print);
    }
}