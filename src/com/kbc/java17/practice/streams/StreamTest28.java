package com.kbc.java17.practice.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest28 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> n < 3;
        var stream = Stream.iterate(4, (n) -> n = n+2);
        var b1 = stream.noneMatch(predicate);
        System.out.println(b1);
    }
}