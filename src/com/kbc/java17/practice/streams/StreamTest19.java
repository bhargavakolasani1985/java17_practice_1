package com.kbc.java17.practice.streams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest19 {
    public static void main(String[] args) {
        var spliterator = Stream.of("x")
                .spliterator();

        spliterator.tryAdvance(System.out::println);
        var split = spliterator.trySplit();
        System.out.println(split);
        split.tryAdvance(System.out::println);
    }
}