package com.kbc.java17.practice.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1, 2, 3);
        IntStream is = s1.mapToInt(x -> x);
        Stream<Integer> s2 = is.boxed();
        s2.forEach(x -> System.out.println(x));
    }
}