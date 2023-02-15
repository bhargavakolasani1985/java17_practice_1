package com.kbc.java17.practice.streams;

import java.util.stream.Stream;

public class StreamTest22 {
    public static void main(String[] args) {
        var spliterator = Stream.generate(() -> "x")
                .spliterator();

        spliterator.tryAdvance(System.out::print);
        var split = spliterator.trySplit();
        split.tryAdvance(System.out::print);
    }
}