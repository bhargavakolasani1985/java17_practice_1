package com.kbc.java17.practice.streams;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectTest1 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 0, 9, 8, 7, 5, 0, 3);
        TreeSet<Integer> set =
                stream.filter((a, b) -> {
                    boolean res = (a*b == 0 ? true : false);
                    return res;
                }).
                        collect
                                (Collectors.
                                        toCollection
                                                (TreeSet::new));
        System.out.println(set); // [f, l, o, w]
    }
}