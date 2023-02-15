package com.kbc.java17.practice.streams;

import java.util.stream.Stream;

public class StreamTest21 {
    public static void main(String[] args) {
        var spliterator = Stream.of("x", "y", "z")
                .spliterator();

        var split = spliterator.trySplit();
        split.tryAdvance(System.out::println);
        split.tryAdvance(System.out::println);
    }
}