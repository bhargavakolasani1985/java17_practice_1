package com.kbc.java17.practice.streams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest18 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        int sum = intStream.sum();
        System.out.println(sum);
        System.out.println(avg);
    }
}