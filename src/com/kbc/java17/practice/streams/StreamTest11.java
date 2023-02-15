package com.kbc.java17.practice.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest11 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = s -> s%2 == 0;
        var stream = Stream.iterate(1, (s) -> s+2);
        var b1 = stream.noneMatch(predicate);
        System.out.println(b1);
    }
}